package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.C1842ln;
import com.google.android.gms.internal.C1853lp;
import java.util.Date;

public class SearchableField {
    public static final SearchableMetadataField<Boolean> IS_PINNED = C1842ln.f4035Rv;
    public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME = C1853lp.f4041RR;
    public static final SearchableMetadataField<String> MIME_TYPE = C1842ln.f4007RA;
    public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE = C1853lp.f4042RS;
    public static final SearchableCollectionMetadataField<DriveId> PARENTS = C1842ln.f4012RF;
    public static final SearchableMetadataField<Boolean> STARRED = C1842ln.f4014RH;

    /* renamed from: Sd */
    public static final SearchableOrderedMetadataField<Date> f1163Sd = C1853lp.f4044RU;

    /* renamed from: Se */
    public static final SearchableMetadataField<AppVisibleCustomProperties> f1164Se = C1842ln.f4025Rl;
    public static final SearchableMetadataField<String> TITLE = C1842ln.f4016RJ;
    public static final SearchableMetadataField<Boolean> TRASHED = C1842ln.f4017RK;
}
