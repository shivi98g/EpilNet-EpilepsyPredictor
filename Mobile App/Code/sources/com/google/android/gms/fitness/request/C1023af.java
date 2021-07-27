package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.fitness.request.af */
public class C1023af implements SafeParcelable {
    public static final Parcelable.Creator<C1023af> CREATOR = new C1026ag();

    /* renamed from: CK */
    private final int f1557CK;

    /* renamed from: Wo */
    private final Subscription f1558Wo;

    /* renamed from: Wp */
    private final boolean f1559Wp;

    /* renamed from: com.google.android.gms.fitness.request.af$a */
    public static class C1025a {
        /* access modifiers changed from: private */

        /* renamed from: Wo */
        public Subscription f1560Wo;
        /* access modifiers changed from: private */

        /* renamed from: Wp */
        public boolean f1561Wp = false;

        /* renamed from: b */
        public C1025a mo12705b(Subscription subscription) {
            this.f1560Wo = subscription;
            return this;
        }

        /* renamed from: kp */
        public C1023af mo12706kp() {
            C1785jx.m5355a(this.f1560Wo != null, "Must call setSubscription()");
            return new C1023af(this);
        }
    }

    C1023af(int i, Subscription subscription, boolean z) {
        this.f1557CK = i;
        this.f1558Wo = subscription;
        this.f1559Wp = z;
    }

    private C1023af(C1025a aVar) {
        this.f1557CK = 1;
        this.f1558Wo = aVar.f1560Wo;
        this.f1559Wp = aVar.f1561Wp;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1557CK;
    }

    /* renamed from: kn */
    public Subscription mo12701kn() {
        return this.f1558Wo;
    }

    /* renamed from: ko */
    public boolean mo12702ko() {
        return this.f1559Wp;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("subscription", this.f1558Wo).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1026ag.m1873a(this, parcel, i);
    }
}
