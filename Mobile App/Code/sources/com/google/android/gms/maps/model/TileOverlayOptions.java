package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2272aa;
import com.google.android.gms.maps.model.internal.C2383o;

public final class TileOverlayOptions implements SafeParcelable {
    public static final C2401w CREATOR = new C2401w();

    /* renamed from: CK */
    private final int f4348CK;
    private float alX;
    private boolean alY;
    /* access modifiers changed from: private */
    public C2383o amD;
    private TileProvider amE;
    private boolean amF;

    public TileOverlayOptions() {
        this.alY = true;
        this.amF = true;
        this.f4348CK = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2) {
        this.alY = true;
        this.amF = true;
        this.f4348CK = i;
        this.amD = C2383o.C2384a.m6902bE(iBinder);
        this.amE = this.amD == null ? null : new TileProvider() {
            private final C2383o amG = TileOverlayOptions.this.amD;

            public Tile getTile(int i, int i2, int i3) {
                try {
                    return this.amG.getTile(i, i2, i3);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.alY = z;
        this.alX = f;
        this.amF = z2;
    }

    public int describeContents() {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.amF = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.amF;
    }

    public TileProvider getTileProvider() {
        return this.amE;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4348CK;
    }

    public float getZIndex() {
        return this.alX;
    }

    public boolean isVisible() {
        return this.alY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: og */
    public IBinder mo18095og() {
        return this.amD.asBinder();
    }

    public TileOverlayOptions tileProvider(final TileProvider tileProvider) {
        this.amE = tileProvider;
        this.amD = this.amE == null ? null : new C2383o.C2384a() {
            public Tile getTile(int i, int i2, int i3) {
                return tileProvider.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2402x.m6939a(this, parcel, i);
        } else {
            C2401w.m6936a(this, parcel, i);
        }
    }

    public TileOverlayOptions zIndex(float f) {
        this.alX = f;
        return this;
    }
}
