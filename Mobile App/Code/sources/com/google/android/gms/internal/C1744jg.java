package com.google.android.gms.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.jg */
public final class C1744jg {

    /* renamed from: JJ */
    private final View f3879JJ;

    /* renamed from: Mw */
    private final C1745a f3880Mw;

    /* renamed from: com.google.android.gms.internal.jg$a */
    public static final class C1745a implements SafeParcelable {
        public static final C1784jw CREATOR = new C1784jw();

        /* renamed from: CK */
        private final int f3881CK;

        /* renamed from: DZ */
        private final String f3882DZ;

        /* renamed from: JI */
        private final int f3883JI;

        /* renamed from: JK */
        private final String f3884JK;

        /* renamed from: Kh */
        private final List<String> f3885Kh;

        C1745a(int i, String str, List<String> list, int i2, String str2) {
            this.f3885Kh = new ArrayList();
            this.f3881CK = i;
            this.f3882DZ = str;
            this.f3885Kh.addAll(list);
            this.f3883JI = i2;
            this.f3884JK = str2;
        }

        public C1745a(String str, Collection<String> collection, int i, String str2) {
            this(3, str, new ArrayList(collection), i, str2);
        }

        public int describeContents() {
            return 0;
        }

        public String getAccountName() {
            return this.f3882DZ;
        }

        public int getVersionCode() {
            return this.f3881CK;
        }

        /* renamed from: hm */
        public String mo15796hm() {
            return this.f3882DZ != null ? this.f3882DZ : "<<default account>>";
        }

        /* renamed from: hn */
        public int mo15797hn() {
            return this.f3883JI;
        }

        /* renamed from: ho */
        public List<String> mo15798ho() {
            return new ArrayList(this.f3885Kh);
        }

        /* renamed from: hq */
        public String mo15799hq() {
            return this.f3884JK;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1784jw.m5350a(this, parcel, i);
        }
    }

    public C1744jg(String str, Collection<String> collection, int i, View view, String str2) {
        this.f3880Mw = new C1745a(str, collection, i, str2);
        this.f3879JJ = view;
    }

    public String getAccountName() {
        return this.f3880Mw.getAccountName();
    }

    /* renamed from: hm */
    public String mo15787hm() {
        return this.f3880Mw.mo15796hm();
    }

    /* renamed from: hn */
    public int mo15788hn() {
        return this.f3880Mw.mo15797hn();
    }

    /* renamed from: ho */
    public List<String> mo15789ho() {
        return this.f3880Mw.mo15798ho();
    }

    /* renamed from: hp */
    public String[] mo15790hp() {
        return (String[]) this.f3880Mw.mo15798ho().toArray(new String[0]);
    }

    /* renamed from: hq */
    public String mo15791hq() {
        return this.f3880Mw.mo15799hq();
    }

    /* renamed from: hr */
    public View mo15792hr() {
        return this.f3879JJ;
    }
}
