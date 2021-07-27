package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C0768ak;
import com.google.android.gms.drive.internal.C0849w;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2165qv;
import com.google.android.gms.internal.C2166qw;

public class DriveId implements SafeParcelable {
    public static final Parcelable.Creator<DriveId> CREATOR = new C0733c();

    /* renamed from: CK */
    final int f849CK;

    /* renamed from: Ot */
    final String f850Ot;

    /* renamed from: Ou */
    final long f851Ou;

    /* renamed from: Ov */
    final long f852Ov;

    /* renamed from: Ow */
    private volatile String f853Ow;

    DriveId(int i, String str, long j, long j2) {
        this.f853Ow = null;
        this.f849CK = i;
        this.f850Ot = str;
        boolean z = true;
        C1785jx.m5354L(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        C1785jx.m5354L(z);
        this.f851Ou = j;
        this.f852Ov = j2;
    }

    public DriveId(String str, long j, long j2) {
        this(1, str, j, j2);
    }

    /* renamed from: bi */
    public static DriveId m794bi(String str) {
        C1785jx.m5364i(str);
        return new DriveId(str, -1, -1);
    }

    public static DriveId decodeFromString(String str) {
        boolean startsWith = str.startsWith("DriveId:");
        C1785jx.m5361b(startsWith, (Object) "Invalid DriveId: " + str);
        return m795f(Base64.decode(str.substring("DriveId:".length()), 10));
    }

    /* renamed from: f */
    static DriveId m795f(byte[] bArr) {
        try {
            C0768ak g = C0768ak.m996g(bArr);
            return new DriveId(g.versionCode, "".equals(g.f1034QG) ? null : g.f1034QG, g.f1035QH, g.f1036QI);
        } catch (C2165qv e) {
            throw new IllegalArgumentException();
        }
    }

    public int describeContents() {
        return 0;
    }

    public final String encodeToString() {
        if (this.f853Ow == null) {
            String encodeToString = Base64.encodeToString(mo11213iu(), 10);
            this.f853Ow = "DriveId:" + encodeToString;
        }
        return this.f853Ow;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.f852Ov == this.f852Ov) {
            return (driveId.f851Ou == -1 && this.f851Ou == -1) ? driveId.f850Ot.equals(this.f850Ot) : driveId.f851Ou == this.f851Ou;
        }
        C0849w.m1208o("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
        return false;
    }

    public String getResourceId() {
        return this.f850Ot;
    }

    public int hashCode() {
        String str;
        if (this.f851Ou == -1) {
            str = this.f850Ot;
        } else {
            str = String.valueOf(this.f852Ov) + String.valueOf(this.f851Ou);
        }
        return str.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: iu */
    public final byte[] mo11213iu() {
        C0768ak akVar = new C0768ak();
        akVar.versionCode = this.f849CK;
        akVar.f1034QG = this.f850Ot == null ? "" : this.f850Ot;
        akVar.f1035QH = this.f851Ou;
        akVar.f1036QI = this.f852Ov;
        return C2166qw.m6480f(akVar);
    }

    public String toString() {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0733c.m816a(this, parcel, i);
    }
}
