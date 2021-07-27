package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import java.util.List;

public class RealtimeDocumentSyncRequest implements SafeParcelable {
    public static final Parcelable.Creator<RealtimeDocumentSyncRequest> CREATOR = new C0743f();

    /* renamed from: CK */
    final int f874CK;

    /* renamed from: OK */
    final List<String> f875OK;

    /* renamed from: OL */
    final List<String> f876OL;

    RealtimeDocumentSyncRequest(int i, List<String> list, List<String> list2) {
        this.f874CK = i;
        this.f875OK = (List) C1785jx.m5364i(list);
        this.f876OL = (List) C1785jx.m5364i(list2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0743f.m843a(this, parcel, i);
    }
}
