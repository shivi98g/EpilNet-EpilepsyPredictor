package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.C1815kr;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pi */
public final class C2089pi extends C1818ks implements Person {
    public static final C2100pj CREATOR = new C2100pj();
    private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

    /* renamed from: CE */
    String f4185CE;

    /* renamed from: CK */
    final int f4186CK;

    /* renamed from: FR */
    String f4187FR;

    /* renamed from: OS */
    String f4188OS;
    final Set<Integer> aon;
    int apA;
    String apB;
    List<C2099h> apC;
    boolean apD;
    String apl;
    C2090a apm;
    String apn;
    String apo;
    int app;
    C2091b apq;
    String apr;
    C2094c aps;
    boolean apt;
    C2095d apu;
    String apv;
    int apw;
    List<C2097f> apx;
    List<C2098g> apy;
    int apz;

    /* renamed from: ow */
    int f4189ow;

    /* renamed from: vf */
    String f4190vf;

    /* renamed from: com.google.android.gms.internal.pi$a */
    public static final class C2090a extends C1818ks implements Person.AgeRange {
        public static final C2101pk CREATOR = new C2101pk();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4191CK;
        final Set<Integer> aon;
        int apE;
        int apF;

        static {
            aom.put("max", C1815kr.C1816a.m5442i("max", 2));
            aom.put("min", C1815kr.C1816a.m5442i("min", 3));
        }

        public C2090a() {
            this.f4191CK = 1;
            this.aon = new HashSet();
        }

        C2090a(Set<Integer> set, int i, int i2, int i3) {
            this.aon = set;
            this.f4191CK = i;
            this.apE = i2;
            this.apF = i3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            int i;
            switch (aVar.mo16022hR()) {
                case 2:
                    i = this.apE;
                    break;
                case 3:
                    i = this.apF;
                    break;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
            return Integer.valueOf(i);
        }

        public int describeContents() {
            C2101pk pkVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2090a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2090a aVar = (C2090a) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!aVar.mo16002a(next) || !mo16003b(next).equals(aVar.mo16003b(next))) {
                        return false;
                    }
                } else if (aVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public int getMax() {
            return this.apE;
        }

        public int getMin() {
            return this.apF;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasMax() {
            return this.aon.contains(2);
        }

        public boolean hasMin() {
            return this.aon.contains(3);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        /* renamed from: oM */
        public C2090a freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2101pk pkVar = CREATOR;
            C2101pk.m6177a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$b */
    public static final class C2091b extends C1818ks implements Person.Cover {
        public static final C2102pl CREATOR = new C2102pl();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4192CK;
        final Set<Integer> aon;
        C2092a apG;
        C2093b apH;
        int apI;

        /* renamed from: com.google.android.gms.internal.pi$b$a */
        public static final class C2092a extends C1818ks implements Person.Cover.CoverInfo {
            public static final C2103pm CREATOR = new C2103pm();
            private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

            /* renamed from: CK */
            final int f4193CK;
            final Set<Integer> aon;
            int apJ;
            int apK;

            static {
                aom.put("leftImageOffset", C1815kr.C1816a.m5442i("leftImageOffset", 2));
                aom.put("topImageOffset", C1815kr.C1816a.m5442i("topImageOffset", 3));
            }

            public C2092a() {
                this.f4193CK = 1;
                this.aon = new HashSet();
            }

            C2092a(Set<Integer> set, int i, int i2, int i3) {
                this.aon = set;
                this.f4193CK = i;
                this.apJ = i2;
                this.apK = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo16002a(C1815kr.C1816a aVar) {
                return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo16003b(C1815kr.C1816a aVar) {
                int i;
                switch (aVar.mo16022hR()) {
                    case 2:
                        i = this.apJ;
                        break;
                    case 3:
                        i = this.apK;
                        break;
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
                }
                return Integer.valueOf(i);
            }

            public int describeContents() {
                C2103pm pmVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C2092a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C2092a aVar = (C2092a) obj;
                for (C1815kr.C1816a next : aom.values()) {
                    if (mo16002a(next)) {
                        if (!aVar.mo16002a(next) || !mo16003b(next).equals(aVar.mo16003b(next))) {
                            return false;
                        }
                    } else if (aVar.mo16002a(next)) {
                        return false;
                    }
                }
                return true;
            }

            public int getLeftImageOffset() {
                return this.apJ;
            }

            public int getTopImageOffset() {
                return this.apK;
            }

            /* renamed from: hK */
            public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
                return aom;
            }

            public boolean hasLeftImageOffset() {
                return this.aon.contains(2);
            }

            public boolean hasTopImageOffset() {
                return this.aon.contains(3);
            }

            public int hashCode() {
                int i = 0;
                for (C1815kr.C1816a next : aom.values()) {
                    if (mo16002a(next)) {
                        i = i + next.mo16022hR() + mo16003b(next).hashCode();
                    }
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            /* renamed from: oO */
            public C2092a freeze() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C2103pm pmVar = CREATOR;
                C2103pm.m6183a(this, parcel, i);
            }
        }

        /* renamed from: com.google.android.gms.internal.pi$b$b */
        public static final class C2093b extends C1818ks implements Person.Cover.CoverPhoto {
            public static final C2104pn CREATOR = new C2104pn();
            private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

            /* renamed from: CK */
            final int f4194CK;
            final Set<Integer> aon;

            /* renamed from: li */
            int f4195li;

            /* renamed from: lj */
            int f4196lj;

            /* renamed from: vf */
            String f4197vf;

            static {
                aom.put("height", C1815kr.C1816a.m5442i("height", 2));
                aom.put(PlusShare.KEY_CALL_TO_ACTION_URL, C1815kr.C1816a.m5445l(PlusShare.KEY_CALL_TO_ACTION_URL, 3));
                aom.put("width", C1815kr.C1816a.m5442i("width", 4));
            }

            public C2093b() {
                this.f4194CK = 1;
                this.aon = new HashSet();
            }

            C2093b(Set<Integer> set, int i, int i2, String str, int i3) {
                this.aon = set;
                this.f4194CK = i;
                this.f4196lj = i2;
                this.f4197vf = str;
                this.f4195li = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo16002a(C1815kr.C1816a aVar) {
                return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo16003b(C1815kr.C1816a aVar) {
                int i;
                switch (aVar.mo16022hR()) {
                    case 2:
                        i = this.f4196lj;
                        break;
                    case 3:
                        return this.f4197vf;
                    case 4:
                        i = this.f4195li;
                        break;
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
                }
                return Integer.valueOf(i);
            }

            public int describeContents() {
                C2104pn pnVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C2093b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C2093b bVar = (C2093b) obj;
                for (C1815kr.C1816a next : aom.values()) {
                    if (mo16002a(next)) {
                        if (!bVar.mo16002a(next) || !mo16003b(next).equals(bVar.mo16003b(next))) {
                            return false;
                        }
                    } else if (bVar.mo16002a(next)) {
                        return false;
                    }
                }
                return true;
            }

            public int getHeight() {
                return this.f4196lj;
            }

            public String getUrl() {
                return this.f4197vf;
            }

            public int getWidth() {
                return this.f4195li;
            }

            /* renamed from: hK */
            public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
                return aom;
            }

            public boolean hasHeight() {
                return this.aon.contains(2);
            }

            public boolean hasUrl() {
                return this.aon.contains(3);
            }

            public boolean hasWidth() {
                return this.aon.contains(4);
            }

            public int hashCode() {
                int i = 0;
                for (C1815kr.C1816a next : aom.values()) {
                    if (mo16002a(next)) {
                        i = i + next.mo16022hR() + mo16003b(next).hashCode();
                    }
                }
                return i;
            }

            public boolean isDataValid() {
                return true;
            }

            /* renamed from: oP */
            public C2093b freeze() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C2104pn pnVar = CREATOR;
                C2104pn.m6186a(this, parcel, i);
            }
        }

        static {
            aom.put("coverInfo", C1815kr.C1816a.m5439a("coverInfo", 2, C2092a.class));
            aom.put("coverPhoto", C1815kr.C1816a.m5439a("coverPhoto", 3, C2093b.class));
            aom.put("layout", C1815kr.C1816a.m5438a("layout", 4, new C1811ko().mo15986h("banner", 0), false));
        }

        public C2091b() {
            this.f4192CK = 1;
            this.aon = new HashSet();
        }

        C2091b(Set<Integer> set, int i, C2092a aVar, C2093b bVar, int i2) {
            this.aon = set;
            this.f4192CK = i;
            this.apG = aVar;
            this.apH = bVar;
            this.apI = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            switch (aVar.mo16022hR()) {
                case 2:
                    return this.apG;
                case 3:
                    return this.apH;
                case 4:
                    return Integer.valueOf(this.apI);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
        }

        public int describeContents() {
            C2102pl plVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2091b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2091b bVar = (C2091b) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!bVar.mo16002a(next) || !mo16003b(next).equals(bVar.mo16003b(next))) {
                        return false;
                    }
                } else if (bVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public Person.Cover.CoverInfo getCoverInfo() {
            return this.apG;
        }

        public Person.Cover.CoverPhoto getCoverPhoto() {
            return this.apH;
        }

        public int getLayout() {
            return this.apI;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasCoverInfo() {
            return this.aon.contains(2);
        }

        public boolean hasCoverPhoto() {
            return this.aon.contains(3);
        }

        public boolean hasLayout() {
            return this.aon.contains(4);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        /* renamed from: oN */
        public C2091b freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2102pl plVar = CREATOR;
            C2102pl.m6180a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$c */
    public static final class C2094c extends C1818ks implements Person.Image {
        public static final C2105po CREATOR = new C2105po();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4198CK;
        final Set<Integer> aon;

        /* renamed from: vf */
        String f4199vf;

        static {
            aom.put(PlusShare.KEY_CALL_TO_ACTION_URL, C1815kr.C1816a.m5445l(PlusShare.KEY_CALL_TO_ACTION_URL, 2));
        }

        public C2094c() {
            this.f4198CK = 1;
            this.aon = new HashSet();
        }

        public C2094c(String str) {
            this.aon = new HashSet();
            this.f4198CK = 1;
            this.f4199vf = str;
            this.aon.add(2);
        }

        C2094c(Set<Integer> set, int i, String str) {
            this.aon = set;
            this.f4198CK = i;
            this.f4199vf = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            if (aVar.mo16022hR() == 2) {
                return this.f4199vf;
            }
            throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
        }

        public int describeContents() {
            C2105po poVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2094c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2094c cVar = (C2094c) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!cVar.mo16002a(next) || !mo16003b(next).equals(cVar.mo16003b(next))) {
                        return false;
                    }
                } else if (cVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getUrl() {
            return this.f4199vf;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasUrl() {
            return this.aon.contains(2);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        /* renamed from: oQ */
        public C2094c freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2105po poVar = CREATOR;
            C2105po.m6189a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$d */
    public static final class C2095d extends C1818ks implements Person.Name {
        public static final C2106pp CREATOR = new C2106pp();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4200CK;
        String aoL;
        String aoO;
        final Set<Integer> aon;
        String apL;
        String apM;
        String apN;
        String apO;

        static {
            aom.put("familyName", C1815kr.C1816a.m5445l("familyName", 2));
            aom.put("formatted", C1815kr.C1816a.m5445l("formatted", 3));
            aom.put("givenName", C1815kr.C1816a.m5445l("givenName", 4));
            aom.put("honorificPrefix", C1815kr.C1816a.m5445l("honorificPrefix", 5));
            aom.put("honorificSuffix", C1815kr.C1816a.m5445l("honorificSuffix", 6));
            aom.put("middleName", C1815kr.C1816a.m5445l("middleName", 7));
        }

        public C2095d() {
            this.f4200CK = 1;
            this.aon = new HashSet();
        }

        C2095d(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.aon = set;
            this.f4200CK = i;
            this.aoL = str;
            this.apL = str2;
            this.aoO = str3;
            this.apM = str4;
            this.apN = str5;
            this.apO = str6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            switch (aVar.mo16022hR()) {
                case 2:
                    return this.aoL;
                case 3:
                    return this.apL;
                case 4:
                    return this.aoO;
                case 5:
                    return this.apM;
                case 6:
                    return this.apN;
                case 7:
                    return this.apO;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
        }

        public int describeContents() {
            C2106pp ppVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2095d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2095d dVar = (C2095d) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!dVar.mo16002a(next) || !mo16003b(next).equals(dVar.mo16003b(next))) {
                        return false;
                    }
                } else if (dVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getFamilyName() {
            return this.aoL;
        }

        public String getFormatted() {
            return this.apL;
        }

        public String getGivenName() {
            return this.aoO;
        }

        public String getHonorificPrefix() {
            return this.apM;
        }

        public String getHonorificSuffix() {
            return this.apN;
        }

        public String getMiddleName() {
            return this.apO;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasFamilyName() {
            return this.aon.contains(2);
        }

        public boolean hasFormatted() {
            return this.aon.contains(3);
        }

        public boolean hasGivenName() {
            return this.aon.contains(4);
        }

        public boolean hasHonorificPrefix() {
            return this.aon.contains(5);
        }

        public boolean hasHonorificSuffix() {
            return this.aon.contains(6);
        }

        public boolean hasMiddleName() {
            return this.aon.contains(7);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        /* renamed from: oR */
        public C2095d freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2106pp ppVar = CREATOR;
            C2106pp.m6192a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$e */
    public static class C2096e {
        /* renamed from: ck */
        public static int m6160ck(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown objectType string: " + str);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$f */
    public static final class C2097f extends C1818ks implements Person.Organizations {
        public static final C2107pq CREATOR = new C2107pq();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4201CK;

        /* renamed from: Gt */
        int f4202Gt;

        /* renamed from: OH */
        String f4203OH;

        /* renamed from: UO */
        String f4204UO;
        String aoK;
        final Set<Integer> aon;
        String apP;
        String apQ;
        boolean apR;
        String apa;
        String mName;

        static {
            aom.put("department", C1815kr.C1816a.m5445l("department", 2));
            aom.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, C1815kr.C1816a.m5445l(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 3));
            aom.put("endDate", C1815kr.C1816a.m5445l("endDate", 4));
            aom.put("location", C1815kr.C1816a.m5445l("location", 5));
            aom.put("name", C1815kr.C1816a.m5445l("name", 6));
            aom.put("primary", C1815kr.C1816a.m5444k("primary", 7));
            aom.put("startDate", C1815kr.C1816a.m5445l("startDate", 8));
            aom.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, C1815kr.C1816a.m5445l(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 9));
            aom.put("type", C1815kr.C1816a.m5438a("type", 10, new C1811ko().mo15986h("work", 0).mo15986h("school", 1), false));
        }

        public C2097f() {
            this.f4201CK = 1;
            this.aon = new HashSet();
        }

        C2097f(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.aon = set;
            this.f4201CK = i;
            this.apP = str;
            this.f4204UO = str2;
            this.aoK = str3;
            this.apQ = str4;
            this.mName = str5;
            this.apR = z;
            this.apa = str6;
            this.f4203OH = str7;
            this.f4202Gt = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            switch (aVar.mo16022hR()) {
                case 2:
                    return this.apP;
                case 3:
                    return this.f4204UO;
                case 4:
                    return this.aoK;
                case 5:
                    return this.apQ;
                case 6:
                    return this.mName;
                case 7:
                    return Boolean.valueOf(this.apR);
                case 8:
                    return this.apa;
                case 9:
                    return this.f4203OH;
                case 10:
                    return Integer.valueOf(this.f4202Gt);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
        }

        public int describeContents() {
            C2107pq pqVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2097f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2097f fVar = (C2097f) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!fVar.mo16002a(next) || !mo16003b(next).equals(fVar.mo16003b(next))) {
                        return false;
                    }
                } else if (fVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getDepartment() {
            return this.apP;
        }

        public String getDescription() {
            return this.f4204UO;
        }

        public String getEndDate() {
            return this.aoK;
        }

        public String getLocation() {
            return this.apQ;
        }

        public String getName() {
            return this.mName;
        }

        public String getStartDate() {
            return this.apa;
        }

        public String getTitle() {
            return this.f4203OH;
        }

        public int getType() {
            return this.f4202Gt;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasDepartment() {
            return this.aon.contains(2);
        }

        public boolean hasDescription() {
            return this.aon.contains(3);
        }

        public boolean hasEndDate() {
            return this.aon.contains(4);
        }

        public boolean hasLocation() {
            return this.aon.contains(5);
        }

        public boolean hasName() {
            return this.aon.contains(6);
        }

        public boolean hasPrimary() {
            return this.aon.contains(7);
        }

        public boolean hasStartDate() {
            return this.aon.contains(8);
        }

        public boolean hasTitle() {
            return this.aon.contains(9);
        }

        public boolean hasType() {
            return this.aon.contains(10);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.apR;
        }

        /* renamed from: oS */
        public C2097f freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2107pq pqVar = CREATOR;
            C2107pq.m6195a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$g */
    public static final class C2098g extends C1818ks implements Person.PlacesLived {
        public static final C2108pr CREATOR = new C2108pr();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4205CK;
        final Set<Integer> aon;
        boolean apR;
        String mValue;

        static {
            aom.put("primary", C1815kr.C1816a.m5444k("primary", 2));
            aom.put("value", C1815kr.C1816a.m5445l("value", 3));
        }

        public C2098g() {
            this.f4205CK = 1;
            this.aon = new HashSet();
        }

        C2098g(Set<Integer> set, int i, boolean z, String str) {
            this.aon = set;
            this.f4205CK = i;
            this.apR = z;
            this.mValue = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            switch (aVar.mo16022hR()) {
                case 2:
                    return Boolean.valueOf(this.apR);
                case 3:
                    return this.mValue;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
        }

        public int describeContents() {
            C2108pr prVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2098g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2098g gVar = (C2098g) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!gVar.mo16002a(next) || !mo16003b(next).equals(gVar.mo16003b(next))) {
                        return false;
                    }
                } else if (gVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getValue() {
            return this.mValue;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasPrimary() {
            return this.aon.contains(2);
        }

        public boolean hasValue() {
            return this.aon.contains(3);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.apR;
        }

        /* renamed from: oT */
        public C2098g freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2108pr prVar = CREATOR;
            C2108pr.m6198a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.pi$h */
    public static final class C2099h extends C1818ks implements Person.Urls {
        public static final C2109ps CREATOR = new C2109ps();
        private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

        /* renamed from: CK */
        final int f4206CK;

        /* renamed from: Gt */
        int f4207Gt;

        /* renamed from: XL */
        String f4208XL;
        final Set<Integer> aon;
        private final int apS;
        String mValue;

        static {
            aom.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, C1815kr.C1816a.m5445l(PlusShare.KEY_CALL_TO_ACTION_LABEL, 5));
            aom.put("type", C1815kr.C1816a.m5438a("type", 6, new C1811ko().mo15986h("home", 0).mo15986h("work", 1).mo15986h("blog", 2).mo15986h(Scopes.PROFILE, 3).mo15986h(FitnessActivities.OTHER, 4).mo15986h("otherProfile", 5).mo15986h("contributor", 6).mo15986h("website", 7), false));
            aom.put("value", C1815kr.C1816a.m5445l("value", 4));
        }

        public C2099h() {
            this.apS = 4;
            this.f4206CK = 1;
            this.aon = new HashSet();
        }

        C2099h(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.apS = 4;
            this.aon = set;
            this.f4206CK = i;
            this.f4208XL = str;
            this.f4207Gt = i2;
            this.mValue = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo16002a(C1815kr.C1816a aVar) {
            return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo16003b(C1815kr.C1816a aVar) {
            switch (aVar.mo16022hR()) {
                case 4:
                    return this.mValue;
                case 5:
                    return this.f4208XL;
                case 6:
                    return Integer.valueOf(this.f4207Gt);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
            }
        }

        public int describeContents() {
            C2109ps psVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2099h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C2099h hVar = (C2099h) obj;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    if (!hVar.mo16002a(next) || !mo16003b(next).equals(hVar.mo16003b(next))) {
                        return false;
                    }
                } else if (hVar.mo16002a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getLabel() {
            return this.f4208XL;
        }

        public int getType() {
            return this.f4207Gt;
        }

        public String getValue() {
            return this.mValue;
        }

        /* renamed from: hK */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
            return aom;
        }

        public boolean hasLabel() {
            return this.aon.contains(5);
        }

        public boolean hasType() {
            return this.aon.contains(6);
        }

        public boolean hasValue() {
            return this.aon.contains(4);
        }

        public int hashCode() {
            int i = 0;
            for (C1815kr.C1816a next : aom.values()) {
                if (mo16002a(next)) {
                    i = i + next.mo16022hR() + mo16003b(next).hashCode();
                }
            }
            return i;
        }

        public boolean isDataValid() {
            return true;
        }

        @Deprecated
        /* renamed from: oU */
        public int mo16865oU() {
            return 4;
        }

        /* renamed from: oV */
        public C2099h freeze() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C2109ps psVar = CREATOR;
            C2109ps.m6201a(this, parcel, i);
        }
    }

    static {
        aom.put("aboutMe", C1815kr.C1816a.m5445l("aboutMe", 2));
        aom.put("ageRange", C1815kr.C1816a.m5439a("ageRange", 3, C2090a.class));
        aom.put("birthday", C1815kr.C1816a.m5445l("birthday", 4));
        aom.put("braggingRights", C1815kr.C1816a.m5445l("braggingRights", 5));
        aom.put("circledByCount", C1815kr.C1816a.m5442i("circledByCount", 6));
        aom.put("cover", C1815kr.C1816a.m5439a("cover", 7, C2091b.class));
        aom.put("currentLocation", C1815kr.C1816a.m5445l("currentLocation", 8));
        aom.put("displayName", C1815kr.C1816a.m5445l("displayName", 9));
        aom.put("gender", C1815kr.C1816a.m5438a("gender", 12, new C1811ko().mo15986h("male", 0).mo15986h("female", 1).mo15986h(FitnessActivities.OTHER, 2), false));
        aom.put("id", C1815kr.C1816a.m5445l("id", 14));
        aom.put("image", C1815kr.C1816a.m5439a("image", 15, C2094c.class));
        aom.put("isPlusUser", C1815kr.C1816a.m5444k("isPlusUser", 16));
        aom.put("language", C1815kr.C1816a.m5445l("language", 18));
        aom.put("name", C1815kr.C1816a.m5439a("name", 19, C2095d.class));
        aom.put("nickname", C1815kr.C1816a.m5445l("nickname", 20));
        aom.put("objectType", C1815kr.C1816a.m5438a("objectType", 21, new C1811ko().mo15986h("person", 0).mo15986h("page", 1), false));
        aom.put("organizations", C1815kr.C1816a.m5440b("organizations", 22, C2097f.class));
        aom.put("placesLived", C1815kr.C1816a.m5440b("placesLived", 23, C2098g.class));
        aom.put("plusOneCount", C1815kr.C1816a.m5442i("plusOneCount", 24));
        aom.put("relationshipStatus", C1815kr.C1816a.m5438a("relationshipStatus", 25, new C1811ko().mo15986h("single", 0).mo15986h("in_a_relationship", 1).mo15986h("engaged", 2).mo15986h("married", 3).mo15986h("its_complicated", 4).mo15986h("open_relationship", 5).mo15986h("widowed", 6).mo15986h("in_domestic_partnership", 7).mo15986h("in_civil_union", 8), false));
        aom.put("tagline", C1815kr.C1816a.m5445l("tagline", 26));
        aom.put(PlusShare.KEY_CALL_TO_ACTION_URL, C1815kr.C1816a.m5445l(PlusShare.KEY_CALL_TO_ACTION_URL, 27));
        aom.put("urls", C1815kr.C1816a.m5440b("urls", 28, C2099h.class));
        aom.put("verified", C1815kr.C1816a.m5444k("verified", 29));
    }

    public C2089pi() {
        this.f4186CK = 1;
        this.aon = new HashSet();
    }

    public C2089pi(String str, String str2, C2094c cVar, int i, String str3) {
        this.f4186CK = 1;
        this.aon = new HashSet();
        this.f4188OS = str;
        this.aon.add(9);
        this.f4185CE = str2;
        this.aon.add(14);
        this.aps = cVar;
        this.aon.add(15);
        this.apw = i;
        this.aon.add(21);
        this.f4190vf = str3;
        this.aon.add(27);
    }

    C2089pi(Set<Integer> set, int i, String str, C2090a aVar, String str2, String str3, int i2, C2091b bVar, String str4, String str5, int i3, String str6, C2094c cVar, boolean z, String str7, C2095d dVar, String str8, int i4, List<C2097f> list, List<C2098g> list2, int i5, int i6, String str9, String str10, List<C2099h> list3, boolean z2) {
        this.aon = set;
        this.f4186CK = i;
        this.apl = str;
        this.apm = aVar;
        this.apn = str2;
        this.apo = str3;
        this.app = i2;
        this.apq = bVar;
        this.apr = str4;
        this.f4188OS = str5;
        this.f4189ow = i3;
        this.f4185CE = str6;
        this.aps = cVar;
        this.apt = z;
        this.f4187FR = str7;
        this.apu = dVar;
        this.apv = str8;
        this.apw = i4;
        this.apx = list;
        this.apy = list2;
        this.apz = i5;
        this.apA = i6;
        this.apB = str9;
        this.f4190vf = str10;
        this.apC = list3;
        this.apD = z2;
    }

    /* renamed from: i */
    public static C2089pi m6131i(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C2089pi dz = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return dz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16002a(C1815kr.C1816a aVar) {
        return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo16003b(C1815kr.C1816a aVar) {
        switch (aVar.mo16022hR()) {
            case 2:
                return this.apl;
            case 3:
                return this.apm;
            case 4:
                return this.apn;
            case 5:
                return this.apo;
            case 6:
                return Integer.valueOf(this.app);
            case 7:
                return this.apq;
            case 8:
                return this.apr;
            case 9:
                return this.f4188OS;
            case 12:
                return Integer.valueOf(this.f4189ow);
            case 14:
                return this.f4185CE;
            case 15:
                return this.aps;
            case 16:
                return Boolean.valueOf(this.apt);
            case 18:
                return this.f4187FR;
            case 19:
                return this.apu;
            case 20:
                return this.apv;
            case 21:
                return Integer.valueOf(this.apw);
            case 22:
                return this.apx;
            case 23:
                return this.apy;
            case 24:
                return Integer.valueOf(this.apz);
            case 25:
                return Integer.valueOf(this.apA);
            case 26:
                return this.apB;
            case 27:
                return this.f4190vf;
            case 28:
                return this.apC;
            case 29:
                return Boolean.valueOf(this.apD);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
        }
    }

    public int describeContents() {
        C2100pj pjVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2089pi)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2089pi piVar = (C2089pi) obj;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                if (!piVar.mo16002a(next) || !mo16003b(next).equals(piVar.mo16003b(next))) {
                    return false;
                }
            } else if (piVar.mo16002a(next)) {
                return false;
            }
        }
        return true;
    }

    public String getAboutMe() {
        return this.apl;
    }

    public Person.AgeRange getAgeRange() {
        return this.apm;
    }

    public String getBirthday() {
        return this.apn;
    }

    public String getBraggingRights() {
        return this.apo;
    }

    public int getCircledByCount() {
        return this.app;
    }

    public Person.Cover getCover() {
        return this.apq;
    }

    public String getCurrentLocation() {
        return this.apr;
    }

    public String getDisplayName() {
        return this.f4188OS;
    }

    public int getGender() {
        return this.f4189ow;
    }

    public String getId() {
        return this.f4185CE;
    }

    public Person.Image getImage() {
        return this.aps;
    }

    public String getLanguage() {
        return this.f4187FR;
    }

    public Person.Name getName() {
        return this.apu;
    }

    public String getNickname() {
        return this.apv;
    }

    public int getObjectType() {
        return this.apw;
    }

    public List<Person.Organizations> getOrganizations() {
        return (ArrayList) this.apx;
    }

    public List<Person.PlacesLived> getPlacesLived() {
        return (ArrayList) this.apy;
    }

    public int getPlusOneCount() {
        return this.apz;
    }

    public int getRelationshipStatus() {
        return this.apA;
    }

    public String getTagline() {
        return this.apB;
    }

    public String getUrl() {
        return this.f4190vf;
    }

    public List<Person.Urls> getUrls() {
        return (ArrayList) this.apC;
    }

    /* renamed from: hK */
    public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
        return aom;
    }

    public boolean hasAboutMe() {
        return this.aon.contains(2);
    }

    public boolean hasAgeRange() {
        return this.aon.contains(3);
    }

    public boolean hasBirthday() {
        return this.aon.contains(4);
    }

    public boolean hasBraggingRights() {
        return this.aon.contains(5);
    }

    public boolean hasCircledByCount() {
        return this.aon.contains(6);
    }

    public boolean hasCover() {
        return this.aon.contains(7);
    }

    public boolean hasCurrentLocation() {
        return this.aon.contains(8);
    }

    public boolean hasDisplayName() {
        return this.aon.contains(9);
    }

    public boolean hasGender() {
        return this.aon.contains(12);
    }

    public boolean hasId() {
        return this.aon.contains(14);
    }

    public boolean hasImage() {
        return this.aon.contains(15);
    }

    public boolean hasIsPlusUser() {
        return this.aon.contains(16);
    }

    public boolean hasLanguage() {
        return this.aon.contains(18);
    }

    public boolean hasName() {
        return this.aon.contains(19);
    }

    public boolean hasNickname() {
        return this.aon.contains(20);
    }

    public boolean hasObjectType() {
        return this.aon.contains(21);
    }

    public boolean hasOrganizations() {
        return this.aon.contains(22);
    }

    public boolean hasPlacesLived() {
        return this.aon.contains(23);
    }

    public boolean hasPlusOneCount() {
        return this.aon.contains(24);
    }

    public boolean hasRelationshipStatus() {
        return this.aon.contains(25);
    }

    public boolean hasTagline() {
        return this.aon.contains(26);
    }

    public boolean hasUrl() {
        return this.aon.contains(27);
    }

    public boolean hasUrls() {
        return this.aon.contains(28);
    }

    public boolean hasVerified() {
        return this.aon.contains(29);
    }

    public int hashCode() {
        int i = 0;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                i = i + next.mo16022hR() + mo16003b(next).hashCode();
            }
        }
        return i;
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isPlusUser() {
        return this.apt;
    }

    public boolean isVerified() {
        return this.apD;
    }

    /* renamed from: oL */
    public C2089pi freeze() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2100pj pjVar = CREATOR;
        C2100pj.m6174a(this, parcel, i);
    }
}
