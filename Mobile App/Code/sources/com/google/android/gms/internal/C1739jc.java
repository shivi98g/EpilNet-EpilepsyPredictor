package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.jc */
public final class C1739jc extends C1806kj<C1740a, Drawable> {

    /* renamed from: com.google.android.gms.internal.jc$a */
    public static final class C1740a {

        /* renamed from: Mt */
        public final int f3875Mt;

        /* renamed from: Mu */
        public final int f3876Mu;

        public C1740a(int i, int i2) {
            this.f3875Mt = i;
            this.f3876Mu = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1740a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C1740a aVar = (C1740a) obj;
            return aVar.f3875Mt == this.f3875Mt && aVar.f3876Mu == this.f3876Mu;
        }

        public int hashCode() {
            return C1781jv.hashCode(Integer.valueOf(this.f3875Mt), Integer.valueOf(this.f3876Mu));
        }
    }

    public C1739jc() {
        super(10);
    }
}
