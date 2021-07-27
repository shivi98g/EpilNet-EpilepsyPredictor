package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

public class AccountChangeEvent implements SafeParcelable {
    public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();

    /* renamed from: DZ */
    final String f441DZ;

    /* renamed from: Ef */
    final int f442Ef;

    /* renamed from: Eg */
    final long f443Eg;

    /* renamed from: Eh */
    final int f444Eh;

    /* renamed from: Ei */
    final int f445Ei;

    /* renamed from: Ej */
    final String f446Ej;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f442Ef = i;
        this.f443Eg = j;
        this.f441DZ = (String) C1785jx.m5364i(str);
        this.f444Eh = i2;
        this.f445Ei = i3;
        this.f446Ej = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f442Ef = 1;
        this.f443Eg = j;
        this.f441DZ = (String) C1785jx.m5364i(str);
        this.f444Eh = i;
        this.f445Ei = i2;
        this.f446Ej = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f442Ef == accountChangeEvent.f442Ef && this.f443Eg == accountChangeEvent.f443Eg && C1781jv.equal(this.f441DZ, accountChangeEvent.f441DZ) && this.f444Eh == accountChangeEvent.f444Eh && this.f445Ei == accountChangeEvent.f445Ei && C1781jv.equal(this.f446Ej, accountChangeEvent.f446Ej);
    }

    public String getAccountName() {
        return this.f441DZ;
    }

    public String getChangeData() {
        return this.f446Ej;
    }

    public int getChangeType() {
        return this.f444Eh;
    }

    public int getEventIndex() {
        return this.f445Ei;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f442Ef), Long.valueOf(this.f443Eg), this.f441DZ, Integer.valueOf(this.f444Eh), Integer.valueOf(this.f445Ei), this.f446Ej);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f444Eh) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        return "AccountChangeEvent {accountName = " + this.f441DZ + ", changeType = " + str + ", changeData = " + this.f446Ej + ", eventIndex = " + this.f445Ei + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        AccountChangeEventCreator.m369a(this, parcel, i);
    }
}
