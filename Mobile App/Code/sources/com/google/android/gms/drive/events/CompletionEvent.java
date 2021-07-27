package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.C0763ah;
import com.google.android.gms.drive.internal.C0849w;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1836lh;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent implements SafeParcelable, ResourceEvent {
    public static final Parcelable.Creator<CompletionEvent> CREATOR = new C0740b();
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;

    /* renamed from: CK */
    final int f892CK;

    /* renamed from: DZ */
    final String f893DZ;

    /* renamed from: FP */
    final int f894FP;

    /* renamed from: OY */
    final ParcelFileDescriptor f895OY;

    /* renamed from: OZ */
    final ParcelFileDescriptor f896OZ;

    /* renamed from: Oj */
    final DriveId f897Oj;

    /* renamed from: Pa */
    final MetadataBundle f898Pa;

    /* renamed from: Pb */
    final List<String> f899Pb;

    /* renamed from: Pc */
    final IBinder f900Pc;

    /* renamed from: Pd */
    private boolean f901Pd = false;

    /* renamed from: Pe */
    private boolean f902Pe = false;

    /* renamed from: Pf */
    private boolean f903Pf = false;

    CompletionEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List<String> list, int i2, IBinder iBinder) {
        this.f892CK = i;
        this.f897Oj = driveId;
        this.f893DZ = str;
        this.f895OY = parcelFileDescriptor;
        this.f896OZ = parcelFileDescriptor2;
        this.f898Pa = metadataBundle;
        this.f899Pb = list;
        this.f894FP = i2;
        this.f900Pc = iBinder;
    }

    /* renamed from: M */
    private void m822M(boolean z) {
        m823iC();
        this.f903Pf = true;
        C1836lh.m5529a(this.f895OY);
        C1836lh.m5529a(this.f896OZ);
        if (this.f900Pc == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No callback on ");
            sb.append(z ? "snooze" : "dismiss");
            C0849w.m1209p("CompletionEvent", sb.toString());
            return;
        }
        try {
            C0763ah.C0764a.m988aa(this.f900Pc).mo11540M(z);
        } catch (RemoteException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RemoteException on ");
            sb2.append(z ? "snooze" : "dismiss");
            sb2.append(": ");
            sb2.append(e);
            C0849w.m1209p("CompletionEvent", sb2.toString());
        }
    }

    /* renamed from: iC */
    private void m823iC() {
        if (this.f903Pf) {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void dismiss() {
        m822M(false);
    }

    public String getAccountName() {
        m823iC();
        return this.f893DZ;
    }

    public InputStream getBaseContentsInputStream() {
        m823iC();
        if (this.f895OY == null) {
            return null;
        }
        if (this.f901Pd) {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.f901Pd = true;
        return new FileInputStream(this.f895OY.getFileDescriptor());
    }

    public DriveId getDriveId() {
        m823iC();
        return this.f897Oj;
    }

    public InputStream getModifiedContentsInputStream() {
        m823iC();
        if (this.f896OZ == null) {
            return null;
        }
        if (this.f902Pe) {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.f902Pe = true;
        return new FileInputStream(this.f896OZ.getFileDescriptor());
    }

    public MetadataChangeSet getModifiedMetadataChangeSet() {
        m823iC();
        if (this.f898Pa != null) {
            return new MetadataChangeSet(this.f898Pa);
        }
        return null;
    }

    public int getStatus() {
        m823iC();
        return this.f894FP;
    }

    public List<String> getTrackingTags() {
        m823iC();
        return new ArrayList(this.f899Pb);
    }

    public int getType() {
        return 2;
    }

    public void snooze() {
        m822M(true);
    }

    public String toString() {
        String str;
        if (this.f899Pb == null) {
            str = "<null>";
        } else {
            str = "'" + TextUtils.join("','", this.f899Pb) + "'";
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[]{this.f897Oj, Integer.valueOf(this.f894FP), str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0740b.m838a(this, parcel, i);
    }
}
