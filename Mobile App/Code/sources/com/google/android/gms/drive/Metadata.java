package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.C1842ln;
import com.google.android.gms.internal.C1853lp;
import com.google.android.gms.internal.C1860lr;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata implements Freezable<Metadata> {
    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> T mo11246a(MetadataField<T> metadataField);

    public String getAlternateLink() {
        return (String) mo11246a(C1842ln.f4024Rk);
    }

    public int getContentAvailability() {
        Integer num = (Integer) mo11246a(C1860lr.f4046RW);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Date getCreatedDate() {
        return (Date) mo11246a(C1853lp.f4040RQ);
    }

    public Map<CustomPropertyKey, String> getCustomProperties() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) mo11246a(C1842ln.f4025Rl);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.mo11769iV();
    }

    public String getDescription() {
        return (String) mo11246a(C1842ln.f4026Rm);
    }

    public DriveId getDriveId() {
        return (DriveId) mo11246a(C1842ln.f4023Rj);
    }

    public String getEmbedLink() {
        return (String) mo11246a(C1842ln.f4027Rn);
    }

    public String getFileExtension() {
        return (String) mo11246a(C1842ln.f4028Ro);
    }

    public long getFileSize() {
        return ((Long) mo11246a(C1842ln.f4029Rp)).longValue();
    }

    public Date getLastViewedByMeDate() {
        return (Date) mo11246a(C1853lp.f4041RR);
    }

    public String getMimeType() {
        return (String) mo11246a(C1842ln.f4007RA);
    }

    public Date getModifiedByMeDate() {
        return (Date) mo11246a(C1853lp.f4043RT);
    }

    public Date getModifiedDate() {
        return (Date) mo11246a(C1853lp.f4042RS);
    }

    public String getOriginalFilename() {
        return (String) mo11246a(C1842ln.f4008RB);
    }

    public long getQuotaBytesUsed() {
        return ((Long) mo11246a(C1842ln.f4013RG)).longValue();
    }

    public Date getSharedWithMeDate() {
        return (Date) mo11246a(C1853lp.f4044RU);
    }

    public String getTitle() {
        return (String) mo11246a(C1842ln.f4016RJ);
    }

    public String getWebContentLink() {
        return (String) mo11246a(C1842ln.f4018RL);
    }

    public String getWebViewLink() {
        return (String) mo11246a(C1842ln.f4019RM);
    }

    public boolean isEditable() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4034Ru);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isFolder() {
        return DriveFolder.MIME_TYPE.equals(getMimeType());
    }

    public boolean isInAppFolder() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4032Rs);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPinnable() {
        Boolean bool = (Boolean) mo11246a(C1860lr.f4047RX);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPinned() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4035Rv);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isRestricted() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4036Rw);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isShared() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4037Rx);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isStarred() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4014RH);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isTrashed() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4017RK);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isViewed() {
        Boolean bool = (Boolean) mo11246a(C1842ln.f4039Rz);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
