package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.C0706e;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C2089pi;
import com.google.android.gms.internal.C2110pt;

public final class PersonBuffer extends DataBuffer<Person> {
    private final C0706e<C2089pi> apT;

    public PersonBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.apT = (dataHolder.mo11058gV() == null || !dataHolder.mo11058gV().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) ? null : new C0706e<>(dataHolder, C2089pi.CREATOR);
    }

    public Person get(int i) {
        return this.apT != null ? this.apT.get(i) : new C2110pt(this.f763JG, i);
    }
}
