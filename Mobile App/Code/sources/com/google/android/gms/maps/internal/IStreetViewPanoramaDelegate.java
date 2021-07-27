package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public interface IStreetViewPanoramaDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate$a */
    public static abstract class C2263a extends Binder implements IStreetViewPanoramaDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate$a$a */
        private static class C2264a implements IStreetViewPanoramaDelegate {

            /* renamed from: le */
            private IBinder f4309le;

            C2264a(IBinder iBinder) {
                this.f4309le = iBinder;
            }

            public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaCamera != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    this.f4309le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4309le;
            }

            public void enablePanning(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4309le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void enableStreetNames(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4309le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void enableUserNavigation(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4309le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void enableZoom(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4309le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f4309le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? StreetViewPanoramaCamera.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.f4309le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? StreetViewPanoramaLocation.CREATOR.mo18338dk(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isPanningGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f4309le.transact(6, obtain, obtain2, 0);
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

            public boolean isStreetNamesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f4309le.transact(8, obtain, obtain2, 0);
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

            public boolean isUserNavigationEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f4309le.transact(7, obtain, obtain2, 0);
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

            public boolean isZoomGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z = false;
                    this.f4309le.transact(5, obtain, obtain2, 0);
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

            public C0967d orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4309le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StreetViewPanoramaOrientation pointToOrientation(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaOrientation streetViewPanoramaOrientation = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4309le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        streetViewPanoramaOrientation = StreetViewPanoramaOrientation.CREATOR.createFromParcel(obtain2);
                    }
                    return streetViewPanoramaOrientation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnStreetViewPanoramaCameraChangeListener(C2321r rVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(rVar != null ? rVar.asBinder() : null);
                    this.f4309le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnStreetViewPanoramaChangeListener(C2324s sVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
                    this.f4309le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setOnStreetViewPanoramaClickListener(C2327t tVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    this.f4309le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPosition(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4309le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPositionWithID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    obtain.writeString(str);
                    this.f4309le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPositionWithRadius(LatLng latLng, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f4309le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: br */
        public static IStreetViewPanoramaDelegate m6717br(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaDelegate)) ? new C2264a(iBinder) : (IStreetViewPanoramaDelegate) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.maps.model.StreetViewPanoramaCamera} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.google.android.gms.maps.model.LatLng} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.gms.maps.model.LatLng} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v47, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v50 */
        /* JADX WARNING: type inference failed for: r0v51 */
        /* JADX WARNING: type inference failed for: r0v52 */
        /* JADX WARNING: type inference failed for: r0v53 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x01af
                r0 = 0
                r2 = 0
                switch(r5) {
                    case 1: goto L_0x019c;
                    case 2: goto L_0x0189;
                    case 3: goto L_0x0176;
                    case 4: goto L_0x0163;
                    case 5: goto L_0x0153;
                    case 6: goto L_0x0143;
                    case 7: goto L_0x0133;
                    case 8: goto L_0x0123;
                    case 9: goto L_0x0107;
                    case 10: goto L_0x00ee;
                    case 11: goto L_0x00de;
                    case 12: goto L_0x00c6;
                    case 13: goto L_0x00aa;
                    case 14: goto L_0x0091;
                    case 15: goto L_0x007d;
                    case 16: goto L_0x0069;
                    case 17: goto L_0x0055;
                    case 18: goto L_0x0034;
                    case 19: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x0010:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0022
                com.google.android.gms.maps.model.t r2 = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation r2 = r2.createFromParcel(r6)
                goto L_0x0023
            L_0x0022:
                r2 = r0
            L_0x0023:
                com.google.android.gms.dynamic.d r2 = r4.orientationToPoint(r2)
                r7.writeNoException()
                if (r2 == 0) goto L_0x0030
                android.os.IBinder r0 = r2.asBinder()
            L_0x0030:
                r7.writeStrongBinder(r0)
                return r1
            L_0x0034:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation r0 = r4.pointToOrientation(r0)
                r7.writeNoException()
                if (r0 == 0) goto L_0x0051
                r7.writeInt(r1)
                r0.writeToParcel(r7, r1)
                return r1
            L_0x0051:
                r7.writeInt(r2)
                return r1
            L_0x0055:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.maps.internal.t r0 = com.google.android.gms.maps.internal.C2327t.C2328a.m6786bn(r0)
                r4.setOnStreetViewPanoramaClickListener(r0)
                r7.writeNoException()
                return r1
            L_0x0069:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.maps.internal.r r0 = com.google.android.gms.maps.internal.C2321r.C2322a.m6784bl(r0)
                r4.setOnStreetViewPanoramaCameraChangeListener(r0)
                r7.writeNoException()
                return r1
            L_0x007d:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.maps.internal.s r0 = com.google.android.gms.maps.internal.C2324s.C2325a.m6785bm(r0)
                r4.setOnStreetViewPanoramaChangeListener(r0)
                r7.writeNoException()
                return r1
            L_0x0091:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                com.google.android.gms.maps.model.StreetViewPanoramaLocation r0 = r4.getStreetViewPanoramaLocation()
                r7.writeNoException()
                if (r0 == 0) goto L_0x00a6
                r7.writeInt(r1)
                r0.writeToParcel(r7, r1)
                return r1
            L_0x00a6:
                r7.writeInt(r2)
                return r1
            L_0x00aa:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00bb
                com.google.android.gms.maps.model.i r0 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r0 = r0.createFromParcel(r6)
            L_0x00bb:
                int r2 = r6.readInt()
                r4.setPositionWithRadius(r0, r2)
                r7.writeNoException()
                return r1
            L_0x00c6:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00d7
                com.google.android.gms.maps.model.i r0 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r0 = r0.createFromParcel(r6)
            L_0x00d7:
                r4.setPosition(r0)
                r7.writeNoException()
                return r1
            L_0x00de:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.setPositionWithID(r0)
                r7.writeNoException()
                return r1
            L_0x00ee:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                com.google.android.gms.maps.model.StreetViewPanoramaCamera r0 = r4.getPanoramaCamera()
                r7.writeNoException()
                if (r0 == 0) goto L_0x0103
                r7.writeInt(r1)
                r0.writeToParcel(r7, r1)
                return r1
            L_0x0103:
                r7.writeInt(r2)
                return r1
            L_0x0107:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0118
                com.google.android.gms.maps.model.q r0 = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR
                com.google.android.gms.maps.model.StreetViewPanoramaCamera r0 = r0.createFromParcel(r6)
            L_0x0118:
                long r2 = r6.readLong()
                r4.animateTo(r0, r2)
                r7.writeNoException()
                return r1
            L_0x0123:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                boolean r0 = r4.isStreetNamesEnabled()
                r7.writeNoException()
                r7.writeInt(r0)
                return r1
            L_0x0133:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                boolean r0 = r4.isUserNavigationEnabled()
                r7.writeNoException()
                r7.writeInt(r0)
                return r1
            L_0x0143:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                boolean r0 = r4.isPanningGesturesEnabled()
                r7.writeNoException()
                r7.writeInt(r0)
                return r1
            L_0x0153:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                boolean r0 = r4.isZoomGesturesEnabled()
                r7.writeNoException()
                r7.writeInt(r0)
                return r1
            L_0x0163:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x016f
                r2 = r1
            L_0x016f:
                r4.enableStreetNames(r2)
                r7.writeNoException()
                return r1
            L_0x0176:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0182
                r2 = r1
            L_0x0182:
                r4.enableUserNavigation(r2)
                r7.writeNoException()
                return r1
            L_0x0189:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0195
                r2 = r1
            L_0x0195:
                r4.enablePanning(r2)
                r7.writeNoException()
                return r1
            L_0x019c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x01a8
                r2 = r1
            L_0x01a8:
                r4.enableZoom(r2)
                r7.writeNoException()
                return r1
            L_0x01af:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.C2263a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException;

    void enablePanning(boolean z) throws RemoteException;

    void enableStreetNames(boolean z) throws RemoteException;

    void enableUserNavigation(boolean z) throws RemoteException;

    void enableZoom(boolean z) throws RemoteException;

    StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException;

    StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException;

    boolean isPanningGesturesEnabled() throws RemoteException;

    boolean isStreetNamesEnabled() throws RemoteException;

    boolean isUserNavigationEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    C0967d orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;

    StreetViewPanoramaOrientation pointToOrientation(C0967d dVar) throws RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(C2321r rVar) throws RemoteException;

    void setOnStreetViewPanoramaChangeListener(C2324s sVar) throws RemoteException;

    void setOnStreetViewPanoramaClickListener(C2327t tVar) throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setPositionWithID(String str) throws RemoteException;

    void setPositionWithRadius(LatLng latLng, int i) throws RemoteException;
}
