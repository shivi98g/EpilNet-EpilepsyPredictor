package com.google.android.gms.drive;

import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.C0804m;
import com.google.android.gms.drive.metadata.C0867b;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.C0876e;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1842ln;

public final class MetadataBuffer extends DataBuffer<Metadata> {

    /* renamed from: OB */
    private final String f862OB;

    /* renamed from: OC */
    private C0730a f863OC;

    /* renamed from: com.google.android.gms.drive.MetadataBuffer$a */
    private static class C0730a extends Metadata {

        /* renamed from: JG */
        private final DataHolder f864JG;

        /* renamed from: La */
        private final int f865La;
        /* access modifiers changed from: private */

        /* renamed from: OD */
        public final int f866OD;

        public C0730a(DataHolder dataHolder, int i) {
            this.f864JG = dataHolder;
            this.f866OD = i;
            this.f865La = dataHolder.mo11047au(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public <T> T mo11246a(MetadataField<T> metadataField) {
            return metadataField.mo11753a(this.f864JG, this.f866OD, this.f865La);
        }

        public boolean isDataValid() {
            return !this.f864JG.isClosed();
        }

        /* renamed from: iy */
        public Metadata freeze() {
            MetadataBundle iZ = MetadataBundle.m1255iZ();
            for (MetadataField<C0702a> next : C0876e.m1279iY()) {
                if (!(next instanceof C0867b) && next != C1842ln.f4015RI) {
                    next.mo11754a(this.f864JG, iZ, this.f866OD, this.f865La);
                }
            }
            return new C0804m(iZ);
        }
    }

    public MetadataBuffer(DataHolder dataHolder, String str) {
        super(dataHolder);
        this.f862OB = str;
        dataHolder.mo11058gV().setClassLoader(MetadataBuffer.class.getClassLoader());
    }

    public Metadata get(int i) {
        C0730a aVar = this.f863OC;
        if (aVar != null && aVar.f866OD == i) {
            return aVar;
        }
        C0730a aVar2 = new C0730a(this.f763JG, i);
        this.f863OC = aVar2;
        return aVar2;
    }

    public String getNextPageToken() {
        return this.f862OB;
    }
}
