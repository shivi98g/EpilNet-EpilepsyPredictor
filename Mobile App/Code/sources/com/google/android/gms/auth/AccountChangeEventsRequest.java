package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest implements SafeParcelable {
    public static final AccountChangeEventsRequestCreator CREATOR = new AccountChangeEventsRequestCreator();

    /* renamed from: DZ */
    String f447DZ;

    /* renamed from: Ef */
    final int f448Ef;

    /* renamed from: Ei */
    int f449Ei;

    public AccountChangeEventsRequest() {
        this.f448Ef = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str) {
        this.f448Ef = i;
        this.f449Ei = i2;
        this.f447DZ = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountName() {
        return this.f447DZ;
    }

    public int getEventIndex() {
        return this.f449Ei;
    }

    public AccountChangeEventsRequest setAccountName(String str) {
        this.f447DZ = str;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i) {
        this.f449Ei = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AccountChangeEventsRequestCreator.m370a(this, parcel, i);
    }
}
