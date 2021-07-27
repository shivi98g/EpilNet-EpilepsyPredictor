package com.google.android.gms.appstate;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.appstate.b */
public final class C0627b extends C0705d implements AppState {
    C0627b(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public boolean equals(Object obj) {
        return C0626a.m365a(this, obj);
    }

    /* renamed from: fJ */
    public AppState freeze() {
        return new C0626a(this);
    }

    public byte[] getConflictData() {
        return getByteArray("conflict_data");
    }

    public String getConflictVersion() {
        return getString("conflict_version");
    }

    public int getKey() {
        return getInteger("key");
    }

    public byte[] getLocalData() {
        return getByteArray("local_data");
    }

    public String getLocalVersion() {
        return getString("local_version");
    }

    public boolean hasConflict() {
        return !mo11082aS("conflict_version");
    }

    public int hashCode() {
        return C0626a.m364a(this);
    }

    public String toString() {
        return C0626a.m366b(this);
    }
}
