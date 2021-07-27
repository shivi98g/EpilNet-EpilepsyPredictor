package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.C1015a;
import com.google.android.gms.fitness.request.C1045l;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1829la;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest implements SafeParcelable {
    public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new C1020ac();

    /* renamed from: CK */
    private final int f1544CK;

    /* renamed from: TY */
    private final List<DataType> f1545TY;

    /* renamed from: Wm */
    private final C1045l f1546Wm;

    /* renamed from: Wn */
    private final int f1547Wn;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: VU */
        public DataType[] f1548VU = new DataType[0];
        /* access modifiers changed from: private */

        /* renamed from: Wm */
        public C1045l f1549Wm;
        /* access modifiers changed from: private */

        /* renamed from: Wn */
        public int f1550Wn = 10;

        /* renamed from: a */
        public Builder mo12667a(C1045l lVar) {
            this.f1549Wm = lVar;
            return this;
        }

        public StartBleScanRequest build() {
            C1785jx.m5355a(this.f1549Wm != null, "Must set BleScanCallback");
            return new StartBleScanRequest(this);
        }

        public Builder setBleScanCallback(BleScanCallback bleScanCallback) {
            mo12667a((C1045l) C1015a.C1017a.m1852jP().mo12674a(bleScanCallback));
            return this;
        }

        public Builder setDataTypes(DataType... dataTypeArr) {
            this.f1548VU = dataTypeArr;
            return this;
        }

        public Builder setTimeoutSecs(int i) {
            boolean z = false;
            C1785jx.m5361b(i > 0, (Object) "Stop time must be greater than zero");
            if (i <= 60) {
                z = true;
            }
            C1785jx.m5361b(z, (Object) "Stop time must be less than 1 minute");
            this.f1550Wn = i;
            return this;
        }
    }

    StartBleScanRequest(int i, List<DataType> list, IBinder iBinder, int i2) {
        this.f1544CK = i;
        this.f1545TY = list;
        this.f1546Wm = C1045l.C1046a.m1916aB(iBinder);
        this.f1547Wn = i2;
    }

    private StartBleScanRequest(Builder builder) {
        this.f1544CK = 2;
        this.f1545TY = C1829la.m5515b(builder.f1548VU);
        this.f1546Wm = builder.f1549Wm;
        this.f1547Wn = builder.f1550Wn;
    }

    public int describeContents() {
        return 0;
    }

    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.f1545TY);
    }

    public int getTimeoutSecs() {
        return this.f1547Wn;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1544CK;
    }

    /* renamed from: km */
    public IBinder mo12664km() {
        return this.f1546Wm.asBinder();
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("dataTypes", this.f1545TY).mo15935a("timeoutSecs", Integer.valueOf(this.f1547Wn)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1020ac.m1860a(this, parcel, i);
    }
}
