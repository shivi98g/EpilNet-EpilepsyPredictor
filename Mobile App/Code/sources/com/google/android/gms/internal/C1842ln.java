package com.google.android.gms.internal;

import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.C0867b;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.C0873b;
import com.google.android.gms.drive.metadata.internal.C0878g;
import com.google.android.gms.drive.metadata.internal.C0880i;
import com.google.android.gms.drive.metadata.internal.C0881j;
import com.google.android.gms.drive.metadata.internal.C0882k;
import com.google.android.gms.drive.metadata.internal.C0883l;
import com.google.android.gms.drive.metadata.internal.C0884m;
import com.google.android.gms.plus.PlusShare;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ln */
public class C1842ln {

    /* renamed from: RA */
    public static final C1846c f4007RA = new C1846c("mimeType", 4100000);

    /* renamed from: RB */
    public static final MetadataField<String> f4008RB = new C0883l("originalFilename", 4300000);

    /* renamed from: RC */
    public static final C0867b<String> f4009RC = new C0882k("ownerNames", 4300000);

    /* renamed from: RD */
    public static final C0884m f4010RD = new C0884m("lastModifyingUser", 6000000);

    /* renamed from: RE */
    public static final C0884m f4011RE = new C0884m("sharingUser", 6000000);

    /* renamed from: RF */
    public static final C1847d f4012RF = new C1847d("parents", 4100000);

    /* renamed from: RG */
    public static final C1848e f4013RG = new C1848e("quotaBytesUsed", 4300000);

    /* renamed from: RH */
    public static final C1849f f4014RH = new C1849f("starred", 4100000);

    /* renamed from: RI */
    public static final MetadataField<C0702a> f4015RI = new C0881j<C0702a>("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000) {
        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C0702a mo11760c(DataHolder dataHolder, int i, int i2) {
            throw new IllegalStateException("Thumbnail field is write only");
        }
    };

    /* renamed from: RJ */
    public static final C1850g f4016RJ = new C1850g(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 4100000);

    /* renamed from: RK */
    public static final C1851h f4017RK = new C1851h("trashed", 4100000);

    /* renamed from: RL */
    public static final MetadataField<String> f4018RL = new C0883l("webContentLink", 4300000);

    /* renamed from: RM */
    public static final MetadataField<String> f4019RM = new C0883l("webViewLink", 4300000);

    /* renamed from: RN */
    public static final MetadataField<String> f4020RN = new C0883l("uniqueIdentifier", 5000000);

    /* renamed from: RO */
    public static final C0873b f4021RO = new C0873b("writersCanShare", 6000000);

    /* renamed from: RP */
    public static final MetadataField<String> f4022RP = new C0883l("role", 6000000);

    /* renamed from: Rj */
    public static final MetadataField<DriveId> f4023Rj = C1859lq.f4045RV;

    /* renamed from: Rk */
    public static final MetadataField<String> f4024Rk = new C0883l("alternateLink", 4300000);

    /* renamed from: Rl */
    public static final C1844a f4025Rl = new C1844a(5000000);

    /* renamed from: Rm */
    public static final MetadataField<String> f4026Rm = new C0883l(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 4300000);

    /* renamed from: Rn */
    public static final MetadataField<String> f4027Rn = new C0883l("embedLink", 4300000);

    /* renamed from: Ro */
    public static final MetadataField<String> f4028Ro = new C0883l("fileExtension", 4300000);

    /* renamed from: Rp */
    public static final MetadataField<Long> f4029Rp = new C0878g("fileSize", 4300000);

    /* renamed from: Rq */
    public static final MetadataField<Boolean> f4030Rq = new C0873b("hasThumbnail", 4300000);

    /* renamed from: Rr */
    public static final MetadataField<String> f4031Rr = new C0883l("indexableText", 4300000);

    /* renamed from: Rs */
    public static final MetadataField<Boolean> f4032Rs = new C0873b("isAppData", 4300000);

    /* renamed from: Rt */
    public static final MetadataField<Boolean> f4033Rt = new C0873b("isCopyable", 4300000);

    /* renamed from: Ru */
    public static final MetadataField<Boolean> f4034Ru = new C0873b("isEditable", 4100000);

    /* renamed from: Rv */
    public static final C1845b f4035Rv = new C1845b("isPinned", 4100000);

    /* renamed from: Rw */
    public static final MetadataField<Boolean> f4036Rw = new C0873b("isRestricted", 4300000);

    /* renamed from: Rx */
    public static final MetadataField<Boolean> f4037Rx = new C0873b("isShared", 4300000);

    /* renamed from: Ry */
    public static final MetadataField<Boolean> f4038Ry = new C0873b("isTrashable", 4400000);

    /* renamed from: Rz */
    public static final MetadataField<Boolean> f4039Rz = new C0873b("isViewed", 4300000);

    /* renamed from: com.google.android.gms.internal.ln$a */
    public static class C1844a extends C1852lo implements SearchableMetadataField<AppVisibleCustomProperties> {
        public C1844a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$b */
    public static class C1845b extends C0873b implements SearchableMetadataField<Boolean> {
        public C1845b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$c */
    public static class C1846c extends C0883l implements SearchableMetadataField<String> {
        public C1846c(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$d */
    public static class C1847d extends C0880i<DriveId> implements SearchableCollectionMetadataField<DriveId> {
        public C1847d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$e */
    public static class C1848e extends C0878g implements SortableMetadataField<Long> {
        public C1848e(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$f */
    public static class C1849f extends C0873b implements SearchableMetadataField<Boolean> {
        public C1849f(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$g */
    public static class C1850g extends C0883l implements SearchableMetadataField<String>, SortableMetadataField<String> {
        public C1850g(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ln$h */
    public static class C1851h extends C0873b implements SearchableMetadataField<Boolean> {
        public C1851h(String str, int i) {
            super(str, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Boolean mo11760c(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.mo11048b(getName(), i, i2) != 0);
        }
    }
}
