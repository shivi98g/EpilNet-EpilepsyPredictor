package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public abstract class MultiDataBufferRef extends C0705d {

    /* renamed from: XX */
    protected final ArrayList<DataHolder> f1768XX;

    protected MultiDataBufferRef(ArrayList<DataHolder> arrayList, int i, int i2) {
        super(arrayList.get(i), i2);
        this.f1768XX = arrayList;
    }
}
