package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;

public final class NotifyTransactionStatusRequest implements SafeParcelable {
    public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new C2671m();

    /* renamed from: CK */
    final int f4496CK;
    String auL;
    String avL;
    int status;

    public final class Builder {
        private Builder() {
        }

        public NotifyTransactionStatusRequest build() {
            boolean z = true;
            C1785jx.m5361b(!TextUtils.isEmpty(NotifyTransactionStatusRequest.this.auL), (Object) "googleTransactionId is required");
            if (NotifyTransactionStatusRequest.this.status < 1 || NotifyTransactionStatusRequest.this.status > 8) {
                z = false;
            }
            C1785jx.m5361b(z, (Object) "status is an unrecognized value");
            return NotifyTransactionStatusRequest.this;
        }

        public Builder setDetailedReason(String str) {
            NotifyTransactionStatusRequest.this.avL = str;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            NotifyTransactionStatusRequest.this.auL = str;
            return this;
        }

        public Builder setStatus(int i) {
            NotifyTransactionStatusRequest.this.status = i;
            return this;
        }
    }

    public interface Status {
        public static final int SUCCESS = 1;

        public interface Error {
            public static final int AVS_DECLINE = 7;
            public static final int BAD_CARD = 4;
            public static final int BAD_CVC = 3;
            public static final int DECLINED = 5;
            public static final int FRAUD_DECLINE = 8;
            public static final int OTHER = 6;
            public static final int UNKNOWN = 2;
        }
    }

    NotifyTransactionStatusRequest() {
        this.f4496CK = 1;
    }

    NotifyTransactionStatusRequest(int i, String str, int i2, String str2) {
        this.f4496CK = i;
        this.auL = str;
        this.status = i2;
        this.avL = str2;
    }

    public static Builder newBuilder() {
        NotifyTransactionStatusRequest notifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
        notifyTransactionStatusRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getDetailedReason() {
        return this.avL;
    }

    public String getGoogleTransactionId() {
        return this.auL;
    }

    public int getStatus() {
        return this.status;
    }

    public int getVersionCode() {
        return this.f4496CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2671m.m7838a(this, parcel, i);
    }
}
