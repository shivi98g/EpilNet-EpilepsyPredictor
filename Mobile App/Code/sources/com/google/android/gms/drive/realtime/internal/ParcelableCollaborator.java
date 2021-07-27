package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableCollaborator implements SafeParcelable {
    public static final Parcelable.Creator<ParcelableCollaborator> CREATOR = new C0952p();

    /* renamed from: CK */
    final int f1216CK;

    /* renamed from: OS */
    final String f1217OS;

    /* renamed from: SH */
    final boolean f1218SH;

    /* renamed from: SI */
    final boolean f1219SI;

    /* renamed from: SJ */
    final String f1220SJ;

    /* renamed from: SK */
    final String f1221SK;

    /* renamed from: SL */
    final String f1222SL;

    /* renamed from: vZ */
    final String f1223vZ;

    ParcelableCollaborator(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.f1216CK = i;
        this.f1218SH = z;
        this.f1219SI = z2;
        this.f1223vZ = str;
        this.f1220SJ = str2;
        this.f1217OS = str3;
        this.f1221SK = str4;
        this.f1222SL = str5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator)) {
            return false;
        }
        return this.f1223vZ.equals(((ParcelableCollaborator) obj).f1223vZ);
    }

    public int hashCode() {
        return this.f1223vZ.hashCode();
    }

    public String toString() {
        return "Collaborator [isMe=" + this.f1218SH + ", isAnonymous=" + this.f1219SI + ", sessionId=" + this.f1223vZ + ", userId=" + this.f1220SJ + ", displayName=" + this.f1217OS + ", color=" + this.f1221SK + ", photoUrl=" + this.f1222SL + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0952p.m1567a(this, parcel, i);
    }
}
