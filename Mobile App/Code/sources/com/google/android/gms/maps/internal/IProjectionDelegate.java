package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IProjectionDelegate$a */
    public static abstract class C2261a extends Binder implements IProjectionDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IProjectionDelegate$a$a */
        private static class C2262a implements IProjectionDelegate {

            /* renamed from: le */
            private IBinder f4308le;

            C2262a(IBinder iBinder) {
                this.f4308le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4308le;
            }

            public LatLng fromScreenLocation(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    LatLng latLng = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4308le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        latLng = LatLng.CREATOR.createFromParcel(obtain2);
                    }
                    return latLng;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LatLng fromScreenLocation2(C2338y yVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (yVar != null) {
                        obtain.writeInt(1);
                        yVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4308le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public VisibleRegion getVisibleRegion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    this.f4308le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? VisibleRegion.CREATOR.mo18354do(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0967d toScreenLocation(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4308le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2338y toScreenLocation2(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4308le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C2338y.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bp */
        public static IProjectionDelegate m6716bp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IProjectionDelegate)) ? new C2262a(iBinder) : (IProjectionDelegate) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.maps.internal.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.google.android.gms.maps.model.LatLng} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* JADX WARNING: type inference failed for: r2v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x00b8
                r0 = 0
                r2 = 0
                switch(r5) {
                    case 1: goto L_0x0097;
                    case 2: goto L_0x0073;
                    case 3: goto L_0x005a;
                    case 4: goto L_0x0035;
                    case 5: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x0010:
                java.lang.String r3 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r6.enforceInterface(r3)
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0021
                com.google.android.gms.maps.model.i r2 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r2 = r2.createFromParcel(r6)
            L_0x0021:
                com.google.android.gms.maps.internal.y r2 = r4.toScreenLocation2(r2)
                r7.writeNoException()
                if (r2 == 0) goto L_0x0031
                r7.writeInt(r1)
                r2.writeToParcel(r7, r1)
                return r1
            L_0x0031:
                r7.writeInt(r0)
                return r1
            L_0x0035:
                java.lang.String r3 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r6.enforceInterface(r3)
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0046
                com.google.android.gms.maps.internal.z r2 = com.google.android.gms.maps.internal.C2338y.CREATOR
                com.google.android.gms.maps.internal.y r2 = r2.createFromParcel(r6)
            L_0x0046:
                com.google.android.gms.maps.model.LatLng r2 = r4.fromScreenLocation2(r2)
                r7.writeNoException()
                if (r2 == 0) goto L_0x0056
                r7.writeInt(r1)
                r2.writeToParcel(r7, r1)
                return r1
            L_0x0056:
                r7.writeInt(r0)
                return r1
            L_0x005a:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r6.enforceInterface(r2)
                com.google.android.gms.maps.model.VisibleRegion r2 = r4.getVisibleRegion()
                r7.writeNoException()
                if (r2 == 0) goto L_0x006f
                r7.writeInt(r1)
                r2.writeToParcel(r7, r1)
                return r1
            L_0x006f:
                r7.writeInt(r0)
                return r1
            L_0x0073:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0085
                com.google.android.gms.maps.model.i r0 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r0 = r0.createFromParcel(r6)
                goto L_0x0086
            L_0x0085:
                r0 = r2
            L_0x0086:
                com.google.android.gms.dynamic.d r0 = r4.toScreenLocation(r0)
                r7.writeNoException()
                if (r0 == 0) goto L_0x0093
                android.os.IBinder r2 = r0.asBinder()
            L_0x0093:
                r7.writeStrongBinder(r2)
                return r1
            L_0x0097:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r6.enforceInterface(r2)
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                com.google.android.gms.maps.model.LatLng r2 = r4.fromScreenLocation(r2)
                r7.writeNoException()
                if (r2 == 0) goto L_0x00b4
                r7.writeInt(r1)
                r2.writeToParcel(r7, r1)
                return r1
            L_0x00b4:
                r7.writeInt(r0)
                return r1
            L_0x00b8:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IProjectionDelegate"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IProjectionDelegate.C2261a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    LatLng fromScreenLocation(C0967d dVar) throws RemoteException;

    LatLng fromScreenLocation2(C2338y yVar) throws RemoteException;

    VisibleRegion getVisibleRegion() throws RemoteException;

    C0967d toScreenLocation(LatLng latLng) throws RemoteException;

    C2338y toScreenLocation2(LatLng latLng) throws RemoteException;
}
