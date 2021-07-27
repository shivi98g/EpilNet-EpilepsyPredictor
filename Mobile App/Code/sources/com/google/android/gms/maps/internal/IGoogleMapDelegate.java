package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.C2355c;
import com.google.android.gms.maps.model.internal.C2357e;
import com.google.android.gms.maps.model.internal.C2362h;
import com.google.android.gms.maps.model.internal.C2365i;
import com.google.android.gms.maps.model.internal.C2368j;
import com.google.android.gms.maps.model.internal.C2374l;
import com.google.android.gms.maps.model.internal.C2377m;
import com.google.android.gms.maps.model.internal.C2380n;
import com.google.android.gms.maps.model.internal.C2386p;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;

public interface IGoogleMapDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IGoogleMapDelegate$a */
    public static abstract class C2253a extends Binder implements IGoogleMapDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IGoogleMapDelegate$a$a */
        private static class C2254a implements IGoogleMapDelegate {

            /* renamed from: le */
            private IBinder f4304le;

            C2254a(IBinder iBinder) {
                this.f4304le = iBinder;
            }

            public C2362h addCircle(CircleOptions circleOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (circleOptions != null) {
                        obtain.writeInt(1);
                        circleOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2362h.C2363a.m6872bw(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2365i addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (groundOverlayOptions != null) {
                        obtain.writeInt(1);
                        groundOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2365i.C2366a.m6878bx(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2365i addGroundOverlay2(GroundOverlayOptions groundOverlayOptions, C2357e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (groundOverlayOptions != null) {
                        obtain.writeInt(1);
                        groundOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (eVar != null) {
                        obtain.writeInt(1);
                        eVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(70, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2365i.C2366a.m6878bx(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2374l addMarker(MarkerOptions markerOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (markerOptions != null) {
                        obtain.writeInt(1);
                        markerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2374l.C2375a.m6892bA(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2374l addMarker2(MarkerOptions markerOptions, C2386p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (markerOptions != null) {
                        obtain.writeInt(1);
                        markerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pVar != null) {
                        obtain.writeInt(1);
                        pVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(68, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2374l.C2375a.m6892bA(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2377m addPolygon(PolygonOptions polygonOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (polygonOptions != null) {
                        obtain.writeInt(1);
                        polygonOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2377m.C2378a.m6897bB(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IPolylineDelegate addPolyline(PolylineOptions polylineOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (polylineOptions != null) {
                        obtain.writeInt(1);
                        polylineOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return IPolylineDelegate.C2351a.m6842bC(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2380n addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (tileOverlayOptions != null) {
                        obtain.writeInt(1);
                        tileOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2380n.C2381a.m6900bD(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCamera(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4304le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCamera2(C2355c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithCallback(C0967d dVar, C2273b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4304le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithCallback2(C2355c cVar, C2273b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4304le.transact(66, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithDurationAndCallback(C0967d dVar, int i, C2273b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4304le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void animateCameraWithDurationAndCallback2(C2355c cVar, int i, C2273b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4304le.transact(67, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4304le;
            }

            public void clear() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CameraPosition getCameraPosition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2368j getFocusedBuilding() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2368j.C2369a.m6884by(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getMapAsync(C2306m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    this.f4304le.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getMapType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getMaxZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getMinZoomLevel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Location getMyLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IProjectionDelegate getProjection() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return IProjectionDelegate.C2261a.m6716bp(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IUiSettingsDelegate getUiSettings() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return IUiSettingsDelegate.C2269a.m6720bu(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isBuildingsEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f4304le.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isIndoorEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f4304le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isMyLocationEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f4304le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isTrafficEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f4304le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void moveCamera(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4304le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void moveCamera2(C2355c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLowMemory() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSaveInstanceState(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4304le.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setBuildingsEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4304le.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setContentDescription(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeString(str);
                    this.f4304le.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setIndoorEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f4304le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setInfoWindowAdapter(C2279d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4304le.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setInfoWindowRenderer(C2282e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f4304le.transact(69, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(iLocationSourceDelegate != null ? iLocationSourceDelegate.asBinder() : null);
                    this.f4304le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMapType(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    this.f4304le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMyLocationEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4304le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnCameraChangeListener(C2285f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f4304le.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnIndoorStateChangeListener(C2288g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f4304le.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnInfoWindowClickListener(C2291h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f4304le.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapClickListener(C2297j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f4304le.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapLoadedCallback(C2300k kVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    this.f4304le.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMapLongClickListener(C2303l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4304le.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMarkerClickListener(C2309n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f4304le.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMarkerDragListener(C2312o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f4304le.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMyLocationButtonClickListener(C2315p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    this.f4304le.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnMyLocationChangeListener(C2318q qVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    this.f4304le.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f4304le.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTrafficEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4304le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void snapshot(C2333v vVar, C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(vVar != null ? vVar.asBinder() : null);
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4304le.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stopAnimation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f4304le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean useViewLifecycleWhenInFragment() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z = false;
                    this.f4304le.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: aT */
        public static IGoogleMapDelegate m6712aT(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGoogleMapDelegate)) ? new C2254a(iBinder) : (IGoogleMapDelegate) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.google.android.gms.maps.model.internal.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: com.google.android.gms.maps.model.internal.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: com.google.android.gms.maps.model.internal.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: com.google.android.gms.maps.model.internal.c} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v8, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v10, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v12, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v14, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v24, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v26, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v28, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v35, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v52, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v54, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v56 */
        /* JADX WARNING: type inference failed for: r2v57 */
        /* JADX WARNING: type inference failed for: r2v58 */
        /* JADX WARNING: type inference failed for: r2v59 */
        /* JADX WARNING: type inference failed for: r2v60 */
        /* JADX WARNING: type inference failed for: r2v61 */
        /* JADX WARNING: type inference failed for: r2v62 */
        /* JADX WARNING: type inference failed for: r2v63 */
        /* JADX WARNING: type inference failed for: r2v64 */
        /* JADX WARNING: type inference failed for: r2v65 */
        /* JADX WARNING: type inference failed for: r2v66 */
        /* JADX WARNING: type inference failed for: r2v67 */
        /* JADX WARNING: type inference failed for: r2v68 */
        /* JADX WARNING: type inference failed for: r2v69 */
        /* JADX WARNING: type inference failed for: r2v70 */
        /* JADX WARNING: type inference failed for: r2v71 */
        /* JADX WARNING: type inference failed for: r2v72 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x056d
                r0 = 0
                r2 = 0
                switch(r6) {
                    case 1: goto L_0x0554;
                    case 2: goto L_0x0544;
                    case 3: goto L_0x0534;
                    case 4: goto L_0x0520;
                    case 5: goto L_0x050c;
                    case 6: goto L_0x04f0;
                    case 7: goto L_0x04d0;
                    case 8: goto L_0x04c4;
                    case 9: goto L_0x04a0;
                    case 10: goto L_0x047c;
                    case 11: goto L_0x0458;
                    case 12: goto L_0x0434;
                    case 13: goto L_0x0410;
                    case 14: goto L_0x0404;
                    case 15: goto L_0x03f4;
                    case 16: goto L_0x03e4;
                    case 17: goto L_0x03d4;
                    case 18: goto L_0x03c1;
                    case 19: goto L_0x03b1;
                    case 20: goto L_0x039a;
                    case 21: goto L_0x038a;
                    case 22: goto L_0x0377;
                    case 23: goto L_0x035e;
                    case 24: goto L_0x034a;
                    case 25: goto L_0x0334;
                    case 26: goto L_0x031e;
                    case 27: goto L_0x030a;
                    case 28: goto L_0x02f6;
                    case 29: goto L_0x02e2;
                    case 30: goto L_0x02ce;
                    case 31: goto L_0x02ba;
                    case 32: goto L_0x02a6;
                    case 33: goto L_0x0292;
                    default: goto L_0x000b;
                }
            L_0x000b:
                switch(r6) {
                    case 35: goto L_0x026e;
                    case 36: goto L_0x025a;
                    case 37: goto L_0x0246;
                    case 38: goto L_0x022a;
                    case 39: goto L_0x020e;
                    case 40: goto L_0x01fe;
                    case 41: goto L_0x01eb;
                    case 42: goto L_0x01d7;
                    default: goto L_0x000e;
                }
            L_0x000e:
                switch(r6) {
                    case 44: goto L_0x01c1;
                    case 45: goto L_0x01ad;
                    default: goto L_0x0011;
                }
            L_0x0011:
                switch(r6) {
                    case 53: goto L_0x0199;
                    case 54: goto L_0x017e;
                    case 55: goto L_0x0172;
                    case 56: goto L_0x0166;
                    case 57: goto L_0x015a;
                    case 58: goto L_0x014e;
                    case 59: goto L_0x013e;
                    case 60: goto L_0x0118;
                    case 61: goto L_0x0108;
                    default: goto L_0x0014;
                }
            L_0x0014:
                switch(r6) {
                    case 64: goto L_0x00f0;
                    case 65: goto L_0x00d8;
                    case 66: goto L_0x00b8;
                    case 67: goto L_0x0094;
                    case 68: goto L_0x0062;
                    case 69: goto L_0x004e;
                    case 70: goto L_0x001c;
                    default: goto L_0x0017;
                }
            L_0x0017:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x001c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x002e
                com.google.android.gms.maps.model.e r0 = com.google.android.gms.maps.model.GroundOverlayOptions.CREATOR
                com.google.android.gms.maps.model.GroundOverlayOptions r0 = r0.createFromParcel(r7)
                goto L_0x002f
            L_0x002e:
                r0 = r2
            L_0x002f:
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x003c
                com.google.android.gms.maps.model.internal.f r3 = com.google.android.gms.maps.model.internal.C2357e.CREATOR
                com.google.android.gms.maps.model.internal.e r3 = r3.createFromParcel(r7)
                goto L_0x003d
            L_0x003c:
                r3 = r2
            L_0x003d:
                com.google.android.gms.maps.model.internal.i r0 = r5.addGroundOverlay2(r0, r3)
                r8.writeNoException()
                if (r0 == 0) goto L_0x004a
                android.os.IBinder r2 = r0.asBinder()
            L_0x004a:
                r8.writeStrongBinder(r2)
                return r1
            L_0x004e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.e r0 = com.google.android.gms.maps.internal.C2282e.C2283a.m6748aV(r0)
                r5.setInfoWindowRenderer(r0)
                r8.writeNoException()
                return r1
            L_0x0062:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0074
                com.google.android.gms.maps.model.k r0 = com.google.android.gms.maps.model.MarkerOptions.CREATOR
                com.google.android.gms.maps.model.MarkerOptions r0 = r0.createFromParcel(r7)
                goto L_0x0075
            L_0x0074:
                r0 = r2
            L_0x0075:
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0082
                com.google.android.gms.maps.model.internal.q r3 = com.google.android.gms.maps.model.internal.C2386p.CREATOR
                com.google.android.gms.maps.model.internal.p r3 = r3.createFromParcel(r7)
                goto L_0x0083
            L_0x0082:
                r3 = r2
            L_0x0083:
                com.google.android.gms.maps.model.internal.l r0 = r5.addMarker2(r0, r3)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0090
                android.os.IBinder r2 = r0.asBinder()
            L_0x0090:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0094:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00a5
                com.google.android.gms.maps.model.internal.d r0 = com.google.android.gms.maps.model.internal.C2355c.CREATOR
                com.google.android.gms.maps.model.internal.c r2 = r0.createFromParcel(r7)
            L_0x00a5:
                int r0 = r7.readInt()
                android.os.IBinder r3 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.b r3 = com.google.android.gms.maps.internal.C2273b.C2274a.m6724aR(r3)
                r5.animateCameraWithDurationAndCallback2(r2, r0, r3)
                r8.writeNoException()
                return r1
            L_0x00b8:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00c9
                com.google.android.gms.maps.model.internal.d r0 = com.google.android.gms.maps.model.internal.C2355c.CREATOR
                com.google.android.gms.maps.model.internal.c r2 = r0.createFromParcel(r7)
            L_0x00c9:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.b r0 = com.google.android.gms.maps.internal.C2273b.C2274a.m6724aR(r0)
                r5.animateCameraWithCallback2(r2, r0)
                r8.writeNoException()
                return r1
            L_0x00d8:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00e9
                com.google.android.gms.maps.model.internal.d r0 = com.google.android.gms.maps.model.internal.C2355c.CREATOR
                com.google.android.gms.maps.model.internal.c r2 = r0.createFromParcel(r7)
            L_0x00e9:
                r5.animateCamera2(r2)
                r8.writeNoException()
                return r1
            L_0x00f0:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0101
                com.google.android.gms.maps.model.internal.d r0 = com.google.android.gms.maps.model.internal.C2355c.CREATOR
                com.google.android.gms.maps.model.internal.c r2 = r0.createFromParcel(r7)
            L_0x0101:
                r5.moveCamera2(r2)
                r8.writeNoException()
                return r1
            L_0x0108:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.setContentDescription(r0)
                r8.writeNoException()
                return r1
            L_0x0118:
                java.lang.String r3 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x012b
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x012b:
                r5.onSaveInstanceState(r2)
                r8.writeNoException()
                if (r2 == 0) goto L_0x013a
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x013a:
                r8.writeInt(r0)
                return r1
            L_0x013e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.useViewLifecycleWhenInFragment()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x014e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.onLowMemory()
                r8.writeNoException()
                return r1
            L_0x015a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.onDestroy()
                r8.writeNoException()
                return r1
            L_0x0166:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.onPause()
                r8.writeNoException()
                return r1
            L_0x0172:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.onResume()
                r8.writeNoException()
                return r1
            L_0x017e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0192
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0192:
                r5.onCreate(r2)
                r8.writeNoException()
                return r1
            L_0x0199:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.m r0 = com.google.android.gms.maps.internal.C2306m.C2307a.m6766bg(r0)
                r5.getMapAsync(r0)
                r8.writeNoException()
                return r1
            L_0x01ad:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.g r0 = com.google.android.gms.maps.internal.C2288g.C2289a.m6752ba(r0)
                r5.setOnIndoorStateChangeListener(r0)
                r8.writeNoException()
                return r1
            L_0x01c1:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                com.google.android.gms.maps.model.internal.j r0 = r5.getFocusedBuilding()
                r8.writeNoException()
                if (r0 == 0) goto L_0x01d3
                android.os.IBinder r2 = r0.asBinder()
            L_0x01d3:
                r8.writeStrongBinder(r2)
                return r1
            L_0x01d7:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.k r0 = com.google.android.gms.maps.internal.C2300k.C2301a.m6763be(r0)
                r5.setOnMapLoadedCallback(r0)
                r8.writeNoException()
                return r1
            L_0x01eb:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x01f7
                r0 = r1
            L_0x01f7:
                r5.setBuildingsEnabled(r0)
                r8.writeNoException()
                return r1
            L_0x01fe:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.isBuildingsEnabled()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x020e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                int r4 = r7.readInt()
                r5.setPadding(r0, r2, r3, r4)
                r8.writeNoException()
                return r1
            L_0x022a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.v r0 = com.google.android.gms.maps.internal.C2333v.C2334a.m6791bq(r0)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                r5.snapshot(r0, r2)
                r8.writeNoException()
                return r1
            L_0x0246:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.p r0 = com.google.android.gms.maps.internal.C2315p.C2316a.m6778bj(r0)
                r5.setOnMyLocationButtonClickListener(r0)
                r8.writeNoException()
                return r1
            L_0x025a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.q r0 = com.google.android.gms.maps.internal.C2318q.C2319a.m6781bk(r0)
                r5.setOnMyLocationChangeListener(r0)
                r8.writeNoException()
                return r1
            L_0x026e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0280
                com.google.android.gms.maps.model.c r0 = com.google.android.gms.maps.model.CircleOptions.CREATOR
                com.google.android.gms.maps.model.CircleOptions r0 = r0.createFromParcel(r7)
                goto L_0x0281
            L_0x0280:
                r0 = r2
            L_0x0281:
                com.google.android.gms.maps.model.internal.h r0 = r5.addCircle(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x028e
                android.os.IBinder r2 = r0.asBinder()
            L_0x028e:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0292:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.d r0 = com.google.android.gms.maps.internal.C2279d.C2280a.m6744aU(r0)
                r5.setInfoWindowAdapter(r0)
                r8.writeNoException()
                return r1
            L_0x02a6:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.h r0 = com.google.android.gms.maps.internal.C2291h.C2292a.m6755bb(r0)
                r5.setOnInfoWindowClickListener(r0)
                r8.writeNoException()
                return r1
            L_0x02ba:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.o r0 = com.google.android.gms.maps.internal.C2312o.C2313a.m6774bi(r0)
                r5.setOnMarkerDragListener(r0)
                r8.writeNoException()
                return r1
            L_0x02ce:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.n r0 = com.google.android.gms.maps.internal.C2309n.C2310a.m6769bh(r0)
                r5.setOnMarkerClickListener(r0)
                r8.writeNoException()
                return r1
            L_0x02e2:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.l r0 = com.google.android.gms.maps.internal.C2303l.C2304a.m6764bf(r0)
                r5.setOnMapLongClickListener(r0)
                r8.writeNoException()
                return r1
            L_0x02f6:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.j r0 = com.google.android.gms.maps.internal.C2297j.C2298a.m6762bd(r0)
                r5.setOnMapClickListener(r0)
                r8.writeNoException()
                return r1
            L_0x030a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.f r0 = com.google.android.gms.maps.internal.C2285f.C2286a.m6750aZ(r0)
                r5.setOnCameraChangeListener(r0)
                r8.writeNoException()
                return r1
            L_0x031e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                com.google.android.gms.maps.internal.IProjectionDelegate r0 = r5.getProjection()
                r8.writeNoException()
                if (r0 == 0) goto L_0x0330
                android.os.IBinder r2 = r0.asBinder()
            L_0x0330:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0334:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                com.google.android.gms.maps.internal.IUiSettingsDelegate r0 = r5.getUiSettings()
                r8.writeNoException()
                if (r0 == 0) goto L_0x0346
                android.os.IBinder r2 = r0.asBinder()
            L_0x0346:
                r8.writeStrongBinder(r2)
                return r1
            L_0x034a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.ILocationSourceDelegate r0 = com.google.android.gms.maps.internal.ILocationSourceDelegate.C2255a.m6713aW(r0)
                r5.setLocationSource(r0)
                r8.writeNoException()
                return r1
            L_0x035e:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                android.location.Location r2 = r5.getMyLocation()
                r8.writeNoException()
                if (r2 == 0) goto L_0x0373
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x0373:
                r8.writeInt(r0)
                return r1
            L_0x0377:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0383
                r0 = r1
            L_0x0383:
                r5.setMyLocationEnabled(r0)
                r8.writeNoException()
                return r1
            L_0x038a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.isMyLocationEnabled()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x039a:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x03a6
                r0 = r1
            L_0x03a6:
                boolean r0 = r5.setIndoorEnabled(r0)
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x03b1:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.isIndoorEnabled()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x03c1:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x03cd
                r0 = r1
            L_0x03cd:
                r5.setTrafficEnabled(r0)
                r8.writeNoException()
                return r1
            L_0x03d4:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.isTrafficEnabled()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x03e4:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                r5.setMapType(r0)
                r8.writeNoException()
                return r1
            L_0x03f4:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r5.getMapType()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x0404:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.clear()
                r8.writeNoException()
                return r1
            L_0x0410:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0422
                com.google.android.gms.maps.model.w r0 = com.google.android.gms.maps.model.TileOverlayOptions.CREATOR
                com.google.android.gms.maps.model.TileOverlayOptions r0 = r0.createFromParcel(r7)
                goto L_0x0423
            L_0x0422:
                r0 = r2
            L_0x0423:
                com.google.android.gms.maps.model.internal.n r0 = r5.addTileOverlay(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0430
                android.os.IBinder r2 = r0.asBinder()
            L_0x0430:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0434:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0446
                com.google.android.gms.maps.model.e r0 = com.google.android.gms.maps.model.GroundOverlayOptions.CREATOR
                com.google.android.gms.maps.model.GroundOverlayOptions r0 = r0.createFromParcel(r7)
                goto L_0x0447
            L_0x0446:
                r0 = r2
            L_0x0447:
                com.google.android.gms.maps.model.internal.i r0 = r5.addGroundOverlay(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0454
                android.os.IBinder r2 = r0.asBinder()
            L_0x0454:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0458:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x046a
                com.google.android.gms.maps.model.k r0 = com.google.android.gms.maps.model.MarkerOptions.CREATOR
                com.google.android.gms.maps.model.MarkerOptions r0 = r0.createFromParcel(r7)
                goto L_0x046b
            L_0x046a:
                r0 = r2
            L_0x046b:
                com.google.android.gms.maps.model.internal.l r0 = r5.addMarker(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0478
                android.os.IBinder r2 = r0.asBinder()
            L_0x0478:
                r8.writeStrongBinder(r2)
                return r1
            L_0x047c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x048e
                com.google.android.gms.maps.model.m r0 = com.google.android.gms.maps.model.PolygonOptions.CREATOR
                com.google.android.gms.maps.model.PolygonOptions r0 = r0.createFromParcel(r7)
                goto L_0x048f
            L_0x048e:
                r0 = r2
            L_0x048f:
                com.google.android.gms.maps.model.internal.m r0 = r5.addPolygon(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x049c
                android.os.IBinder r2 = r0.asBinder()
            L_0x049c:
                r8.writeStrongBinder(r2)
                return r1
            L_0x04a0:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x04b2
                com.google.android.gms.maps.model.o r0 = com.google.android.gms.maps.model.PolylineOptions.CREATOR
                com.google.android.gms.maps.model.PolylineOptions r0 = r0.createFromParcel(r7)
                goto L_0x04b3
            L_0x04b2:
                r0 = r2
            L_0x04b3:
                com.google.android.gms.maps.model.internal.IPolylineDelegate r0 = r5.addPolyline(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x04c0
                android.os.IBinder r2 = r0.asBinder()
            L_0x04c0:
                r8.writeStrongBinder(r2)
                return r1
            L_0x04c4:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                r5.stopAnimation()
                r8.writeNoException()
                return r1
            L_0x04d0:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                int r2 = r7.readInt()
                android.os.IBinder r3 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.b r3 = com.google.android.gms.maps.internal.C2273b.C2274a.m6724aR(r3)
                r5.animateCameraWithDurationAndCallback(r0, r2, r3)
                r8.writeNoException()
                return r1
            L_0x04f0:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.b r2 = com.google.android.gms.maps.internal.C2273b.C2274a.m6724aR(r2)
                r5.animateCameraWithCallback(r0, r2)
                r8.writeNoException()
                return r1
            L_0x050c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                r5.animateCamera(r0)
                r8.writeNoException()
                return r1
            L_0x0520:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                r5.moveCamera(r0)
                r8.writeNoException()
                return r1
            L_0x0534:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                float r0 = r5.getMinZoomLevel()
                r8.writeNoException()
                r8.writeFloat(r0)
                return r1
            L_0x0544:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r0)
                float r0 = r5.getMaxZoomLevel()
                r8.writeNoException()
                r8.writeFloat(r0)
                return r1
            L_0x0554:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r7.enforceInterface(r2)
                com.google.android.gms.maps.model.CameraPosition r2 = r5.getCameraPosition()
                r8.writeNoException()
                if (r2 == 0) goto L_0x0569
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x0569:
                r8.writeInt(r0)
                return r1
            L_0x056d:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IGoogleMapDelegate.C2253a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    C2362h addCircle(CircleOptions circleOptions) throws RemoteException;

    C2365i addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    C2365i addGroundOverlay2(GroundOverlayOptions groundOverlayOptions, C2357e eVar) throws RemoteException;

    C2374l addMarker(MarkerOptions markerOptions) throws RemoteException;

    C2374l addMarker2(MarkerOptions markerOptions, C2386p pVar) throws RemoteException;

    C2377m addPolygon(PolygonOptions polygonOptions) throws RemoteException;

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions) throws RemoteException;

    C2380n addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    void animateCamera(C0967d dVar) throws RemoteException;

    void animateCamera2(C2355c cVar) throws RemoteException;

    void animateCameraWithCallback(C0967d dVar, C2273b bVar) throws RemoteException;

    void animateCameraWithCallback2(C2355c cVar, C2273b bVar) throws RemoteException;

    void animateCameraWithDurationAndCallback(C0967d dVar, int i, C2273b bVar) throws RemoteException;

    void animateCameraWithDurationAndCallback2(C2355c cVar, int i, C2273b bVar) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    C2368j getFocusedBuilding() throws RemoteException;

    void getMapAsync(C2306m mVar) throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    Location getMyLocation() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(C0967d dVar) throws RemoteException;

    void moveCamera2(C2355c cVar) throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;

    void setBuildingsEnabled(boolean z) throws RemoteException;

    void setContentDescription(String str) throws RemoteException;

    boolean setIndoorEnabled(boolean z) throws RemoteException;

    void setInfoWindowAdapter(C2279d dVar) throws RemoteException;

    void setInfoWindowRenderer(C2282e eVar) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    void setMapType(int i) throws RemoteException;

    void setMyLocationEnabled(boolean z) throws RemoteException;

    void setOnCameraChangeListener(C2285f fVar) throws RemoteException;

    void setOnIndoorStateChangeListener(C2288g gVar) throws RemoteException;

    void setOnInfoWindowClickListener(C2291h hVar) throws RemoteException;

    void setOnMapClickListener(C2297j jVar) throws RemoteException;

    void setOnMapLoadedCallback(C2300k kVar) throws RemoteException;

    void setOnMapLongClickListener(C2303l lVar) throws RemoteException;

    void setOnMarkerClickListener(C2309n nVar) throws RemoteException;

    void setOnMarkerDragListener(C2312o oVar) throws RemoteException;

    void setOnMyLocationButtonClickListener(C2315p pVar) throws RemoteException;

    void setOnMyLocationChangeListener(C2318q qVar) throws RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws RemoteException;

    void setTrafficEnabled(boolean z) throws RemoteException;

    void snapshot(C2333v vVar, C0967d dVar) throws RemoteException;

    void stopAnimation() throws RemoteException;

    boolean useViewLifecycleWhenInFragment() throws RemoteException;
}
