package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.m */
public final class C0804m extends Metadata {

    /* renamed from: PD */
    private final MetadataBundle f1045PD;

    public C0804m(MetadataBundle metadataBundle) {
        this.f1045PD = metadataBundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> T mo11246a(MetadataField<T> metadataField) {
        return this.f1045PD.mo11778a(metadataField);
    }

    public boolean isDataValid() {
        return this.f1045PD != null;
    }

    /* renamed from: iy */
    public Metadata freeze() {
        return new C0804m(MetadataBundle.m1254a(this.f1045PD));
    }

    public String toString() {
        return "Metadata [mImpl=" + this.f1045PD + "]";
    }
}
