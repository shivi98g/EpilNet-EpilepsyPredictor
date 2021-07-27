package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.drive.events.C0741c;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.C0760ag;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.drive.internal.aa */
public class C0748aa extends C0760ag.C0761a {

    /* renamed from: Pm */
    private final int f1026Pm;

    /* renamed from: Qw */
    private final C0741c f1027Qw;

    /* renamed from: Qx */
    private final C0750a f1028Qx;

    /* renamed from: Qy */
    private final List<Integer> f1029Qy = new ArrayList();

    /* renamed from: com.google.android.gms.drive.internal.aa$a */
    private static class C0750a extends Handler {
        private final Context mContext;

        private C0750a(Looper looper, Context context) {
            super(looper);
            this.mContext = context;
        }

        /* renamed from: a */
        public void mo11469a(C0741c cVar, DriveEvent driveEvent) {
            sendMessage(obtainMessage(1, new Pair(cVar, driveEvent)));
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                C0849w.m1206e(this.mContext, "EventCallback", "Don't know how to handle this event");
                return;
            }
            Pair pair = (Pair) message.obj;
            C0741c cVar = (C0741c) pair.first;
            DriveEvent driveEvent = (DriveEvent) pair.second;
            switch (driveEvent.getType()) {
                case 1:
                    ((ChangeListener) cVar).onChange((ChangeEvent) driveEvent);
                    return;
                case 2:
                    ((CompletionListener) cVar).onCompletion((CompletionEvent) driveEvent);
                    return;
                default:
                    C0849w.m1208o("EventCallback", "Unexpected event: " + driveEvent);
                    return;
            }
        }
    }

    public C0748aa(Looper looper, Context context, int i, C0741c cVar) {
        this.f1026Pm = i;
        this.f1027Qw = cVar;
        this.f1028Qx = new C0750a(looper, context);
    }

    /* renamed from: bw */
    public void mo11467bw(int i) {
        this.f1029Qy.add(Integer.valueOf(i));
    }

    /* renamed from: bx */
    public boolean mo11468bx(int i) {
        return this.f1029Qy.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo11348c(OnEventResponse onEventResponse) throws RemoteException {
        DriveEvent iQ = onEventResponse.mo11425iQ();
        C1785jx.m5353K(this.f1026Pm == iQ.getType());
        C1785jx.m5353K(this.f1029Qy.contains(Integer.valueOf(iQ.getType())));
        this.f1028Qx.mo11469a(this.f1027Qw, iQ);
    }
}
