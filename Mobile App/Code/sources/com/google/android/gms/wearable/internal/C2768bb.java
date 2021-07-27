package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.internal.C2714ae;

/* renamed from: com.google.android.gms.wearable.internal.bb */
public class C2768bb extends C2714ae.C2715a {
    private final IntentFilter[] axD;
    private DataApi.DataListener ayl;
    private MessageApi.MessageListener aym;
    private NodeApi.NodeListener ayn;

    private C2768bb(DataApi.DataListener dataListener, MessageApi.MessageListener messageListener, NodeApi.NodeListener nodeListener, IntentFilter[] intentFilterArr) {
        this.ayl = dataListener;
        this.aym = messageListener;
        this.ayn = nodeListener;
        this.axD = intentFilterArr;
    }

    /* renamed from: a */
    public static C2768bb m8119a(NodeApi.NodeListener nodeListener) {
        return new C2768bb((DataApi.DataListener) null, (MessageApi.MessageListener) null, nodeListener, (IntentFilter[]) null);
    }

    /* renamed from: b */
    public static C2768bb m8120b(DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) {
        return new C2768bb(dataListener, (MessageApi.MessageListener) null, (NodeApi.NodeListener) null, intentFilterArr);
    }

    /* renamed from: b */
    public static C2768bb m8121b(MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return new C2768bb((DataApi.DataListener) null, messageListener, (NodeApi.NodeListener) null, intentFilterArr);
    }

    /* renamed from: a */
    public void mo19388a(C2731ai aiVar) {
        if (this.aym != null) {
            this.aym.onMessageReceived(aiVar);
        }
    }

    /* renamed from: a */
    public void mo19389a(C2740al alVar) {
        if (this.ayn != null) {
            this.ayn.onPeerConnected(alVar);
        }
    }

    /* renamed from: aa */
    public void mo19390aa(DataHolder dataHolder) {
        if (this.ayl != null) {
            try {
                this.ayl.onDataChanged(new DataEventBuffer(dataHolder));
            } catch (Throwable th) {
                dataHolder.close();
                throw th;
            }
        }
        dataHolder.close();
    }

    /* renamed from: b */
    public void mo19391b(C2740al alVar) {
        if (this.ayn != null) {
            this.ayn.onPeerDisconnected(alVar);
        }
    }

    public void clear() {
        this.ayl = null;
        this.aym = null;
        this.ayn = null;
    }

    /* renamed from: rs */
    public IntentFilter[] mo19571rs() {
        return this.axD;
    }
}
