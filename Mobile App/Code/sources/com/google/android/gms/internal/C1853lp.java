package com.google.android.gms.internal;

import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.C0875d;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.lp */
public class C1853lp {

    /* renamed from: RQ */
    public static final C1854a f4040RQ = new C1854a("created", 4100000);

    /* renamed from: RR */
    public static final C1855b f4041RR = new C1855b("lastOpenedTime", 4300000);

    /* renamed from: RS */
    public static final C1857d f4042RS = new C1857d("modified", 4100000);

    /* renamed from: RT */
    public static final C1856c f4043RT = new C1856c("modifiedByMe", 4100000);

    /* renamed from: RU */
    public static final C1858e f4044RU = new C1858e("sharedWithMe", 4100000);

    /* renamed from: com.google.android.gms.internal.lp$a */
    public static class C1854a extends C0875d implements SortableMetadataField<Date> {
        public C1854a(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.lp$b */
    public static class C1855b extends C0875d implements SearchableOrderedMetadataField<Date>, SortableMetadataField<Date> {
        public C1855b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.lp$c */
    public static class C1856c extends C0875d implements SortableMetadataField<Date> {
        public C1856c(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.lp$d */
    public static class C1857d extends C0875d implements SearchableOrderedMetadataField<Date>, SortableMetadataField<Date> {
        public C1857d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.lp$e */
    public static class C1858e extends C0875d implements SearchableOrderedMetadataField<Date>, SortableMetadataField<Date> {
        public C1858e(String str, int i) {
            super(str, i);
        }
    }
}
