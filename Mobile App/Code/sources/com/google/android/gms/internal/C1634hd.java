package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hd */
public class C1634hd implements SafeParcelable {
    public static final C1636he CREATOR = new C1636he();

    /* renamed from: CK */
    final int f3612CK;

    /* renamed from: CL */
    final C1639hh[] f3613CL;

    /* renamed from: CM */
    public final String f3614CM;

    /* renamed from: CN */
    public final boolean f3615CN;
    public final Account account;

    /* renamed from: com.google.android.gms.internal.hd$a */
    public static class C1635a {

        /* renamed from: CO */
        private List<C1639hh> f3616CO;

        /* renamed from: CP */
        private String f3617CP;

        /* renamed from: CQ */
        private boolean f3618CQ;

        /* renamed from: CR */
        private Account f3619CR;

        /* renamed from: F */
        public C1635a mo15511F(boolean z) {
            this.f3618CQ = z;
            return this;
        }

        /* renamed from: a */
        public C1635a mo15512a(C1639hh hhVar) {
            if (this.f3616CO == null) {
                this.f3616CO = new ArrayList();
            }
            this.f3616CO.add(hhVar);
            return this;
        }

        /* renamed from: ar */
        public C1635a mo15513ar(String str) {
            this.f3617CP = str;
            return this;
        }

        /* renamed from: fD */
        public C1634hd mo15514fD() {
            return new C1634hd(this.f3617CP, this.f3618CQ, this.f3619CR, this.f3616CO != null ? (C1639hh[]) this.f3616CO.toArray(new C1639hh[this.f3616CO.size()]) : null);
        }
    }

    C1634hd(int i, C1639hh[] hhVarArr, String str, boolean z, Account account2) {
        this.f3612CK = i;
        this.f3613CL = hhVarArr;
        this.f3614CM = str;
        this.f3615CN = z;
        this.account = account2;
    }

    C1634hd(String str, boolean z, Account account2, C1639hh... hhVarArr) {
        this(1, hhVarArr, str, z, account2);
        BitSet bitSet = new BitSet(C1648ho.m4815fF());
        for (C1639hh hhVar : hhVarArr) {
            int i = hhVar.f3629CZ;
            if (i != -1) {
                if (bitSet.get(i)) {
                    throw new IllegalArgumentException("Duplicate global search section type " + C1648ho.m4813P(i));
                }
                bitSet.set(i);
            }
        }
    }

    public int describeContents() {
        C1636he heVar = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1636he heVar = CREATOR;
        C1636he.m4794a(this, parcel, i);
    }
}
