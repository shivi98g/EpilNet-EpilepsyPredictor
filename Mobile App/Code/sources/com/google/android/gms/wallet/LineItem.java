package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new C2667i();

    /* renamed from: CK */
    private final int f4491CK;
    String auF;
    String auG;
    String auZ;
    String ava;
    int avb;
    String description;

    public final class Builder {
        private Builder() {
        }

        public LineItem build() {
            return LineItem.this;
        }

        public Builder setCurrencyCode(String str) {
            LineItem.this.auG = str;
            return this;
        }

        public Builder setDescription(String str) {
            LineItem.this.description = str;
            return this;
        }

        public Builder setQuantity(String str) {
            LineItem.this.auZ = str;
            return this;
        }

        public Builder setRole(int i) {
            LineItem.this.avb = i;
            return this;
        }

        public Builder setTotalPrice(String str) {
            LineItem.this.auF = str;
            return this;
        }

        public Builder setUnitPrice(String str) {
            LineItem.this.ava = str;
            return this;
        }
    }

    public interface Role {
        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }

    LineItem() {
        this.f4491CK = 1;
        this.avb = 0;
    }

    LineItem(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f4491CK = i;
        this.description = str;
        this.auZ = str2;
        this.ava = str3;
        this.auF = str4;
        this.avb = i2;
        this.auG = str5;
    }

    public static Builder newBuilder() {
        LineItem lineItem = new LineItem();
        lineItem.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.auG;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuantity() {
        return this.auZ;
    }

    public int getRole() {
        return this.avb;
    }

    public String getTotalPrice() {
        return this.auF;
    }

    public String getUnitPrice() {
        return this.ava;
    }

    public int getVersionCode() {
        return this.f4491CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2667i.m7826a(this, parcel, i);
    }
}
