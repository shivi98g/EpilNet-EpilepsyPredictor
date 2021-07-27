package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.C0530R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions implements SafeParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new C2663b();

    /* renamed from: CK */
    final int f4507CK;
    /* access modifiers changed from: private */

    /* renamed from: Oi */
    public int f4508Oi;
    /* access modifiers changed from: private */
    public int avV;
    /* access modifiers changed from: private */
    public WalletFragmentStyle aww;
    /* access modifiers changed from: private */
    public int mTheme;

    public final class Builder {
        private Builder() {
        }

        public WalletFragmentOptions build() {
            return WalletFragmentOptions.this;
        }

        public Builder setEnvironment(int i) {
            int unused = WalletFragmentOptions.this.avV = i;
            return this;
        }

        public Builder setFragmentStyle(int i) {
            WalletFragmentStyle unused = WalletFragmentOptions.this.aww = new WalletFragmentStyle().setStyleResourceId(i);
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletFragmentStyle) {
            WalletFragmentStyle unused = WalletFragmentOptions.this.aww = walletFragmentStyle;
            return this;
        }

        public Builder setMode(int i) {
            int unused = WalletFragmentOptions.this.f4508Oi = i;
            return this;
        }

        public Builder setTheme(int i) {
            int unused = WalletFragmentOptions.this.mTheme = i;
            return this;
        }
    }

    private WalletFragmentOptions() {
        this.f4507CK = 1;
    }

    WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.f4507CK = i;
        this.avV = i2;
        this.mTheme = i3;
        this.aww = walletFragmentStyle;
        this.f4508Oi = i4;
    }

    /* renamed from: a */
    public static WalletFragmentOptions m7801a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0530R.styleable.WalletFragmentOptions);
        int i = obtainStyledAttributes.getInt(C0530R.styleable.WalletFragmentOptions_appTheme, 0);
        int i2 = obtainStyledAttributes.getInt(C0530R.styleable.WalletFragmentOptions_environment, 1);
        int resourceId = obtainStyledAttributes.getResourceId(C0530R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int i3 = obtainStyledAttributes.getInt(C0530R.styleable.WalletFragmentOptions_fragmentMode, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.mTheme = i;
        walletFragmentOptions.avV = i2;
        walletFragmentOptions.aww = new WalletFragmentStyle().setStyleResourceId(resourceId);
        walletFragmentOptions.aww.mo19128ab(context);
        walletFragmentOptions.f4508Oi = i3;
        return walletFragmentOptions;
    }

    public static Builder newBuilder() {
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.getClass();
        return new Builder();
    }

    /* renamed from: ab */
    public void mo19114ab(Context context) {
        if (this.aww != null) {
            this.aww.mo19128ab(context);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getEnvironment() {
        return this.avV;
    }

    public WalletFragmentStyle getFragmentStyle() {
        return this.aww;
    }

    public int getMode() {
        return this.f4508Oi;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2663b.m7814a(this, parcel, i);
    }
}
