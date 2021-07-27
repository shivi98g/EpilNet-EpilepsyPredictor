package com.google.android.gms.drive;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1842ln;
import com.google.android.gms.internal.C1853lp;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet {
    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;

    /* renamed from: OE */
    public static final MetadataChangeSet f867OE = new MetadataChangeSet(MetadataBundle.m1255iZ());

    /* renamed from: OF */
    private final MetadataBundle f868OF;

    public static class Builder {

        /* renamed from: OF */
        private final MetadataBundle f869OF = MetadataBundle.m1255iZ();

        /* renamed from: OG */
        private AppVisibleCustomProperties.C0871a f870OG;

        /* renamed from: bk */
        private int m809bk(String str) {
            if (str == null) {
                return 0;
            }
            return str.getBytes().length;
        }

        /* renamed from: i */
        private String m810i(String str, int i, int i2) {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)});
        }

        /* renamed from: iA */
        private AppVisibleCustomProperties.C0871a m811iA() {
            if (this.f870OG == null) {
                this.f870OG = new AppVisibleCustomProperties.C0871a();
            }
            return this.f870OG;
        }

        /* renamed from: j */
        private void m812j(String str, int i, int i2) {
            C1785jx.m5361b(i2 <= i, (Object) m810i(str, i, i2));
        }

        public MetadataChangeSet build() {
            if (this.f870OG != null) {
                this.f869OF.mo11779b(C1842ln.f4025Rl, this.f870OG.mo11773iW());
            }
            return new MetadataChangeSet(this.f869OF);
        }

        public Builder deleteCustomProperty(CustomPropertyKey customPropertyKey) {
            C1785jx.m5359b(customPropertyKey, (Object) "key");
            m811iA().mo11772a(customPropertyKey, (String) null);
            return this;
        }

        public Builder setCustomProperty(CustomPropertyKey customPropertyKey, String str) {
            C1785jx.m5359b(customPropertyKey, (Object) "key");
            C1785jx.m5359b(str, (Object) "value");
            m812j("The total size of key string and value string of a custom property", MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES, m809bk(customPropertyKey.getKey()) + m809bk(str));
            m811iA().mo11772a(customPropertyKey, str);
            return this;
        }

        public Builder setDescription(String str) {
            this.f869OF.mo11779b(C1842ln.f4026Rm, str);
            return this;
        }

        public Builder setIndexableText(String str) {
            m812j("Indexable text size", 131072, m809bk(str));
            this.f869OF.mo11779b(C1842ln.f4031Rr, str);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date) {
            this.f869OF.mo11779b(C1853lp.f4041RR, date);
            return this;
        }

        public Builder setMimeType(String str) {
            this.f869OF.mo11779b(C1842ln.f4007RA, str);
            return this;
        }

        public Builder setPinned(boolean z) {
            this.f869OF.mo11779b(C1842ln.f4035Rv, Boolean.valueOf(z));
            return this;
        }

        public Builder setStarred(boolean z) {
            this.f869OF.mo11779b(C1842ln.f4014RH, Boolean.valueOf(z));
            return this;
        }

        public Builder setTitle(String str) {
            this.f869OF.mo11779b(C1842ln.f4016RJ, str);
            return this;
        }

        public Builder setViewed(boolean z) {
            this.f869OF.mo11779b(C1842ln.f4039Rz, Boolean.valueOf(z));
            return this;
        }
    }

    public MetadataChangeSet(MetadataBundle metadataBundle) {
        this.f868OF = MetadataBundle.m1254a(metadataBundle);
    }

    public Map<CustomPropertyKey, String> getCustomPropertyChangeMap() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.f868OF.mo11778a(C1842ln.f4025Rl);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.mo11769iV();
    }

    public String getDescription() {
        return (String) this.f868OF.mo11778a(C1842ln.f4026Rm);
    }

    public String getIndexableText() {
        return (String) this.f868OF.mo11778a(C1842ln.f4031Rr);
    }

    public Date getLastViewedByMeDate() {
        return (Date) this.f868OF.mo11778a(C1853lp.f4041RR);
    }

    public String getMimeType() {
        return (String) this.f868OF.mo11778a(C1842ln.f4007RA);
    }

    public String getTitle() {
        return (String) this.f868OF.mo11778a(C1842ln.f4016RJ);
    }

    public Boolean isPinned() {
        return (Boolean) this.f868OF.mo11778a(C1842ln.f4035Rv);
    }

    public Boolean isStarred() {
        return (Boolean) this.f868OF.mo11778a(C1842ln.f4014RH);
    }

    public Boolean isViewed() {
        return (Boolean) this.f868OF.mo11778a(C1842ln.f4039Rz);
    }

    /* renamed from: iz */
    public MetadataBundle mo11287iz() {
        return this.f868OF;
    }
}
