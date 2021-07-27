package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1815kr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ko */
public final class C1811ko implements SafeParcelable, C1815kr.C1817b<String, Integer> {
    public static final C1813kp CREATOR = new C1813kp();

    /* renamed from: CK */
    private final int f3973CK;

    /* renamed from: NG */
    private final HashMap<String, Integer> f3974NG;

    /* renamed from: NH */
    private final HashMap<Integer, String> f3975NH;

    /* renamed from: NI */
    private final ArrayList<C1812a> f3976NI;

    /* renamed from: com.google.android.gms.internal.ko$a */
    public static final class C1812a implements SafeParcelable {
        public static final C1814kq CREATOR = new C1814kq();

        /* renamed from: NJ */
        final String f3977NJ;

        /* renamed from: NK */
        final int f3978NK;
        final int versionCode;

        C1812a(int i, String str, int i2) {
            this.versionCode = i;
            this.f3977NJ = str;
            this.f3978NK = i2;
        }

        C1812a(String str, int i) {
            this.versionCode = 1;
            this.f3977NJ = str;
            this.f3978NK = i;
        }

        public int describeContents() {
            C1814kq kqVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1814kq kqVar = CREATOR;
            C1814kq.m5423a(this, parcel, i);
        }
    }

    public C1811ko() {
        this.f3973CK = 1;
        this.f3974NG = new HashMap<>();
        this.f3975NH = new HashMap<>();
        this.f3976NI = null;
    }

    C1811ko(int i, ArrayList<C1812a> arrayList) {
        this.f3973CK = i;
        this.f3974NG = new HashMap<>();
        this.f3975NH = new HashMap<>();
        this.f3976NI = null;
        m5414b(arrayList);
    }

    /* renamed from: b */
    private void m5414b(ArrayList<C1812a> arrayList) {
        Iterator<C1812a> it = arrayList.iterator();
        while (it.hasNext()) {
            C1812a next = it.next();
            mo15986h(next.f3977NJ, next.f3978NK);
        }
    }

    /* renamed from: a */
    public String convertBack(Integer num) {
        String str = this.f3975NH.get(num);
        return (str != null || !this.f3974NG.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public int describeContents() {
        C1813kp kpVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f3973CK;
    }

    /* renamed from: h */
    public C1811ko mo15986h(String str, int i) {
        this.f3974NG.put(str, Integer.valueOf(i));
        this.f3975NH.put(Integer.valueOf(i), str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hH */
    public ArrayList<C1812a> mo15987hH() {
        ArrayList<C1812a> arrayList = new ArrayList<>();
        for (String next : this.f3974NG.keySet()) {
            arrayList.add(new C1812a(next, this.f3974NG.get(next).intValue()));
        }
        return arrayList;
    }

    /* renamed from: hI */
    public int mo15988hI() {
        return 7;
    }

    /* renamed from: hJ */
    public int mo15989hJ() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1813kp kpVar = CREATOR;
        C1813kp.m5420a(this, parcel, i);
    }
}
