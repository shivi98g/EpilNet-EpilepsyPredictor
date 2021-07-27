package com.google.android.gms.internal;

import com.google.android.gms.internal.C1351c;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pu */
public interface C2111pu {

    /* renamed from: com.google.android.gms.internal.pu$a */
    public static final class C2112a extends C2160qq<C2112a> {
        public long auB;
        public C1351c.C1361j auC;

        /* renamed from: gs */
        public C1351c.C1357f f4209gs;

        public C2112a() {
            mo16914rc();
        }

        /* renamed from: l */
        public static C2112a m6208l(byte[] bArr) throws C2165qv {
            return (C2112a) C2166qw.m6477a(new C2112a(), bArr);
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            qpVar.mo17049b(1, this.auB);
            if (this.f4209gs != null) {
                qpVar.mo17045a(2, (C2166qw) this.f4209gs);
            }
            if (this.auC != null) {
                qpVar.mo17045a(3, (C2166qw) this.auC);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c() + C2158qp.m6392d(1, this.auB);
            if (this.f4209gs != null) {
                c += C2158qp.m6390c(2, (C2166qw) this.f4209gs);
            }
            return this.auC != null ? c + C2158qp.m6390c(3, (C2166qw) this.auC) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2112a)) {
                return false;
            }
            C2112a aVar = (C2112a) obj;
            if (this.auB != aVar.auB) {
                return false;
            }
            if (this.f4209gs == null) {
                if (aVar.f4209gs != null) {
                    return false;
                }
            } else if (!this.f4209gs.equals(aVar.f4209gs)) {
                return false;
            }
            if (this.auC == null) {
                if (aVar.auC != null) {
                    return false;
                }
            } else if (!this.auC.equals(aVar.auC)) {
                return false;
            }
            return mo17073a(aVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((527 + ((int) (this.auB ^ (this.auB >>> 32)))) * 31) + (this.f4209gs == null ? 0 : this.f4209gs.hashCode())) * 31;
            if (this.auC != null) {
                i = this.auC.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: rc */
        public C2112a mo16914rc() {
            this.auB = 0;
            this.f4209gs = null;
            this.auC = null;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: s */
        public C2112a mo11552b(C2157qo qoVar) throws IOException {
            C2166qw qwVar;
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz != 8) {
                    if (rz == 18) {
                        if (this.f4209gs == null) {
                            this.f4209gs = new C1351c.C1357f();
                        }
                        qwVar = this.f4209gs;
                    } else if (rz == 26) {
                        if (this.auC == null) {
                            this.auC = new C1351c.C1361j();
                        }
                        qwVar = this.auC;
                    } else if (!mo17072a(qoVar, rz)) {
                        return this;
                    }
                    qoVar.mo17010a(qwVar);
                } else {
                    this.auB = qoVar.mo17021rB();
                }
            }
        }
    }
}
