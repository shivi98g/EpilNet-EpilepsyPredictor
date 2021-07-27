package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class MostRecentGameInfoRef extends C0705d implements MostRecentGameInfo {

    /* renamed from: Xv */
    private final PlayerColumnNames f2112Xv;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, PlayerColumnNames playerColumnNames) {
        super(dataHolder, i);
        this.f2112Xv = playerColumnNames;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.m3640a(this, obj);
    }

    public int hashCode() {
        return MostRecentGameInfoEntity.m3639a(this);
    }

    /* renamed from: mA */
    public Uri mo14212mA() {
        return mo11081aR(this.f2112Xv.adi);
    }

    /* renamed from: mB */
    public Uri mo14213mB() {
        return mo11081aR(this.f2112Xv.adj);
    }

    /* renamed from: mC */
    public MostRecentGameInfo freeze() {
        return new MostRecentGameInfoEntity(this);
    }

    /* renamed from: mw */
    public String mo14214mw() {
        return getString(this.f2112Xv.ade);
    }

    /* renamed from: mx */
    public String mo14215mx() {
        return getString(this.f2112Xv.adf);
    }

    /* renamed from: my */
    public long mo14216my() {
        return getLong(this.f2112Xv.adg);
    }

    /* renamed from: mz */
    public Uri mo14217mz() {
        return mo11081aR(this.f2112Xv.adh);
    }

    public String toString() {
        return MostRecentGameInfoEntity.m3641b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) freeze()).writeToParcel(parcel, i);
    }
}
