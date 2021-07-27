package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.C0992k;

/* renamed from: com.google.android.gms.fitness.request.q */
public class C1054q implements SafeParcelable {
    public static final Parcelable.Creator<C1054q> CREATOR = new C1055r();

    /* renamed from: CK */
    private final int f1593CK;

    /* renamed from: VW */
    private final C0992k f1594VW;
    private final PendingIntent mPendingIntent;

    C1054q(int i, IBinder iBinder, PendingIntent pendingIntent) {
        this.f1593CK = i;
        this.f1594VW = iBinder == null ? null : C0992k.C0993a.m1744aq(iBinder);
        this.mPendingIntent = pendingIntent;
    }

    public C1054q(C0992k kVar, PendingIntent pendingIntent) {
        this.f1593CK = 2;
        this.f1594VW = kVar;
        this.mPendingIntent = pendingIntent;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1593CK;
    }

    /* renamed from: kb */
    public PendingIntent mo12819kb() {
        return this.mPendingIntent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kg */
    public IBinder mo12820kg() {
        if (this.f1594VW == null) {
            return null;
        }
        return this.f1594VW.asBinder();
    }

    public String toString() {
        return String.format("SensorUnregistrationRequest{%s}", new Object[]{this.f1594VW});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1055r.m1936a(this, parcel, i);
    }
}
