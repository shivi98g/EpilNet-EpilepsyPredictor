package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class Cart implements SafeParcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new C2647b();

    /* renamed from: CK */
    private final int f4485CK;
    String auF;
    String auG;
    ArrayList<LineItem> auH;

    public final class Builder {
        private Builder() {
        }

        public Builder addLineItem(LineItem lineItem) {
            Cart.this.auH.add(lineItem);
            return this;
        }

        public Cart build() {
            return Cart.this;
        }

        public Builder setCurrencyCode(String str) {
            Cart.this.auG = str;
            return this;
        }

        public Builder setLineItems(List<LineItem> list) {
            Cart.this.auH.clear();
            Cart.this.auH.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String str) {
            Cart.this.auF = str;
            return this;
        }
    }

    Cart() {
        this.f4485CK = 1;
        this.auH = new ArrayList<>();
    }

    Cart(int i, String str, String str2, ArrayList<LineItem> arrayList) {
        this.f4485CK = i;
        this.auF = str;
        this.auG = str2;
        this.auH = arrayList;
    }

    public static Builder newBuilder() {
        Cart cart = new Cart();
        cart.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.auG;
    }

    public ArrayList<LineItem> getLineItems() {
        return this.auH;
    }

    public String getTotalPrice() {
        return this.auF;
    }

    public int getVersionCode() {
        return this.f4485CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2647b.m7724a(this, parcel, i);
    }
}
