package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hl */
public class C1643hl {

    /* renamed from: com.google.android.gms.internal.hl$a */
    public static class C1644a implements SafeParcelable {
        public static final C1646hm CREATOR = new C1646hm();

        /* renamed from: CK */
        final int f3634CK;

        /* renamed from: Dc */
        public final Account f3635Dc;

        public C1644a() {
            this((Account) null);
        }

        C1644a(int i, Account account) {
            this.f3634CK = i;
            this.f3635Dc = account;
        }

        public C1644a(Account account) {
            this(1, account);
        }

        public int describeContents() {
            C1646hm hmVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1646hm hmVar = CREATOR;
            C1646hm.m4807a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.hl$b */
    public static class C1645b implements Result, SafeParcelable {
        public static final C1647hn CREATOR = new C1647hn();

        /* renamed from: CK */
        final int f3636CK;

        /* renamed from: Dd */
        public Status f3637Dd;

        /* renamed from: De */
        public List<C1652hr> f3638De;

        public C1645b() {
            this.f3636CK = 1;
        }

        C1645b(int i, Status status, List<C1652hr> list) {
            this.f3636CK = i;
            this.f3637Dd = status;
            this.f3638De = list;
        }

        public int describeContents() {
            C1647hn hnVar = CREATOR;
            return 0;
        }

        public Status getStatus() {
            return this.f3637Dd;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1647hn hnVar = CREATOR;
            C1647hn.m4810a(this, parcel, i);
        }
    }
}
