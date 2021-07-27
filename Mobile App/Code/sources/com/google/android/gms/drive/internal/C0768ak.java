package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.C2157qo;
import com.google.android.gms.internal.C2158qp;
import com.google.android.gms.internal.C2160qq;
import com.google.android.gms.internal.C2165qv;
import com.google.android.gms.internal.C2166qw;
import java.io.IOException;

/* renamed from: com.google.android.gms.drive.internal.ak */
public final class C0768ak extends C2160qq<C0768ak> {

    /* renamed from: QG */
    public String f1034QG;

    /* renamed from: QH */
    public long f1035QH;

    /* renamed from: QI */
    public long f1036QI;
    public int versionCode;

    public C0768ak() {
        mo11556iK();
    }

    /* renamed from: g */
    public static C0768ak m996g(byte[] bArr) throws C2165qv {
        return (C0768ak) C2166qw.m6477a(new C0768ak(), bArr);
    }

    /* renamed from: a */
    public void mo11551a(C2158qp qpVar) throws IOException {
        qpVar.mo17067t(1, this.versionCode);
        qpVar.mo17050b(2, this.f1034QG);
        qpVar.mo17053c(3, this.f1035QH);
        qpVar.mo17053c(4, this.f1036QI);
        super.mo11551a(qpVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo11553c() {
        return super.mo11553c() + C2158qp.m6407v(1, this.versionCode) + C2158qp.m6404j(2, this.f1034QG) + C2158qp.m6396e(3, this.f1035QH) + C2158qp.m6396e(4, this.f1036QI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0768ak)) {
            return false;
        }
        C0768ak akVar = (C0768ak) obj;
        if (this.versionCode != akVar.versionCode) {
            return false;
        }
        if (this.f1034QG == null) {
            if (akVar.f1034QG != null) {
                return false;
            }
        } else if (!this.f1034QG.equals(akVar.f1034QG)) {
            return false;
        }
        if (this.f1035QH == akVar.f1035QH && this.f1036QI == akVar.f1036QI) {
            return mo17073a(akVar);
        }
        return false;
    }

    public int hashCode() {
        return (31 * (((((((527 + this.versionCode) * 31) + (this.f1034QG == null ? 0 : this.f1034QG.hashCode())) * 31) + ((int) (this.f1035QH ^ (this.f1035QH >>> 32)))) * 31) + ((int) (this.f1036QI ^ (this.f1036QI >>> 32))))) + mo17074rQ();
    }

    /* renamed from: iK */
    public C0768ak mo11556iK() {
        this.versionCode = 1;
        this.f1034QG = "";
        this.f1035QH = -1;
        this.f1036QI = -1;
        this.ayW = null;
        this.azh = -1;
        return this;
    }

    /* renamed from: m */
    public C0768ak mo11552b(C2157qo qoVar) throws IOException {
        while (true) {
            int rz = qoVar.mo17037rz();
            if (rz == 0) {
                return this;
            }
            if (rz == 8) {
                this.versionCode = qoVar.mo17022rC();
            } else if (rz == 18) {
                this.f1034QG = qoVar.readString();
            } else if (rz == 24) {
                this.f1035QH = qoVar.mo17025rF();
            } else if (rz == 32) {
                this.f1036QI = qoVar.mo17025rF();
            } else if (!mo17072a(qoVar, rz)) {
                return this;
            }
        }
    }
}
