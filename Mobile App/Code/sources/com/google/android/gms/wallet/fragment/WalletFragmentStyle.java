package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.C0530R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle implements SafeParcelable {
    public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new C2664c();

    /* renamed from: CK */
    final int f4509CK;
    Bundle awy;
    int awz;

    public WalletFragmentStyle() {
        this.f4509CK = 1;
        this.awy = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int i2) {
        this.f4509CK = i;
        this.awy = bundle;
        this.awz = i2;
    }

    /* renamed from: a */
    private void m7806a(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        if (!this.awy.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            this.awy.putLong(str, Dimension.m7738a(peekValue));
        }
    }

    /* renamed from: a */
    private void m7807a(TypedArray typedArray, int i, String str, String str2) {
        TypedValue peekValue;
        if (!this.awy.containsKey(str) && !this.awy.containsKey(str2) && (peekValue = typedArray.peekValue(i)) != null) {
            if (peekValue.type < 28 || peekValue.type > 31) {
                this.awy.putInt(str2, peekValue.resourceId);
            } else {
                this.awy.putInt(str, peekValue.data);
            }
        }
    }

    /* renamed from: b */
    private void m7808b(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        if (!this.awy.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            this.awy.putInt(str, peekValue.data);
        }
    }

    /* renamed from: a */
    public int mo19127a(String str, DisplayMetrics displayMetrics, int i) {
        return this.awy.containsKey(str) ? Dimension.m7736a(this.awy.getLong(str), displayMetrics) : i;
    }

    /* renamed from: ab */
    public void mo19128ab(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.awz <= 0 ? C0530R.style.WalletFragmentDefaultStyle : this.awz, C0530R.styleable.WalletFragmentStyle);
        m7806a(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        m7806a(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        m7807a(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        m7807a(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        m7808b(obtainStyledAttributes, C0530R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        obtainStyledAttributes.recycle();
    }

    public int describeContents() {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i) {
        this.awy.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i) {
        this.awy.putLong("buyButtonHeight", Dimension.m7739gg(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f) {
        this.awy.putLong("buyButtonHeight", Dimension.m7737a(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i) {
        this.awy.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i) {
        this.awy.putLong("buyButtonWidth", Dimension.m7739gg(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f) {
        this.awy.putLong("buyButtonWidth", Dimension.m7737a(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i) {
        this.awy.remove("maskedWalletDetailsBackgroundResource");
        this.awy.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i) {
        this.awy.remove("maskedWalletDetailsBackgroundColor");
        this.awy.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i) {
        this.awy.remove("maskedWalletDetailsButtonBackgroundResource");
        this.awy.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i) {
        this.awy.remove("maskedWalletDetailsButtonBackgroundColor");
        this.awy.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i) {
        this.awy.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i) {
        this.awy.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i) {
        this.awy.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i) {
        this.awy.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i) {
        this.awy.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i) {
        this.awz = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2664c.m7817a(this, parcel, i);
    }
}
