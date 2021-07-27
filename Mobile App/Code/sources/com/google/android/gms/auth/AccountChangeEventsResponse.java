package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import java.util.List;

public class AccountChangeEventsResponse implements SafeParcelable {
    public static final AccountChangeEventsResponseCreator CREATOR = new AccountChangeEventsResponseCreator();

    /* renamed from: Ef */
    final int f450Ef;

    /* renamed from: mp */
    final List<AccountChangeEvent> f451mp;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f450Ef = i;
        this.f451mp = (List) C1785jx.m5364i(list);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.f450Ef = 1;
        this.f451mp = (List) C1785jx.m5364i(list);
    }

    public int describeContents() {
        return 0;
    }

    public List<AccountChangeEvent> getEvents() {
        return this.f451mp;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AccountChangeEventsResponseCreator.m371a(this, parcel, i);
    }
}
