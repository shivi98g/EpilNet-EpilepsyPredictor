package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

public interface IMapFragmentDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IMapFragmentDelegate$a */
    public static abstract class C2257a extends Binder implements IMapFragmentDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IMapFragmentDelegate$a$a */
        private static class C2258a implements IMapFragmentDelegate {

            /* renamed from: le */
            private IBinder f4306le;

            C2258a(IBinder iBinder) {
                this.f4306le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4306le;
            }

            public IGoogleMapDelegate getMap() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return IGoogleMapDelegate.C2253a.m6712aT(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getMapAsync(C2306m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    this.f4306le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isReady() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    boolean z = false;
                    this.f4306le.transact(11, obtain, obtain2, 0);
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

            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4306le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0967d onCreateView(C0967d dVar, C0967d dVar2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (dVar2 != null) {
                        iBinder = dVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4306le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroyView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onInflate(C0967d dVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4306le.transact(2, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(9, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.f4306le.transact(5, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4306le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: aX */
        public static IMapFragmentDelegate m6714aX(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMapFragmentDelegate)) ? new C2258a(iBinder) : (IMapFragmentDelegate) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v13, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v31 */
        /* JADX WARNING: type inference failed for: r0v32 */
        /* JADX WARNING: type inference failed for: r0v33 */
        /* JADX WARNING: type inference failed for: r0v34 */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x012c
                r0 = 0
                switch(r6) {
                    case 1: goto L_0x0116;
                    case 2: goto L_0x00e6;
                    case 3: goto L_0x00cc;
                    case 4: goto L_0x0096;
                    case 5: goto L_0x008a;
                    case 6: goto L_0x007e;
                    case 7: goto L_0x0072;
                    case 8: goto L_0x0066;
                    case 9: goto L_0x005a;
                    case 10: goto L_0x0033;
                    case 11: goto L_0x0023;
                    case 12: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x000f:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.maps.internal.m r0 = com.google.android.gms.maps.internal.C2306m.C2307a.m6766bg(r0)
                r5.getMapAsync(r0)
                r8.writeNoException()
                return r1
            L_0x0023:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                boolean r0 = r5.isReady()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x0033:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0046
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0046:
                r5.onSaveInstanceState(r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0055
                r8.writeInt(r1)
                r0.writeToParcel(r8, r1)
                return r1
            L_0x0055:
                r0 = 0
                r8.writeInt(r0)
                return r1
            L_0x005a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onLowMemory()
                r8.writeNoException()
                return r1
            L_0x0066:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onDestroy()
                r8.writeNoException()
                return r1
            L_0x0072:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onDestroyView()
                r8.writeNoException()
                return r1
            L_0x007e:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onPause()
                r8.writeNoException()
                return r1
            L_0x008a:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onResume()
                r8.writeNoException()
                return r1
            L_0x0096:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                android.os.IBinder r3 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r3 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r3)
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x00ba
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r7)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L_0x00bb
            L_0x00ba:
                r4 = r0
            L_0x00bb:
                com.google.android.gms.dynamic.d r2 = r5.onCreateView(r2, r3, r4)
                r8.writeNoException()
                if (r2 == 0) goto L_0x00c8
                android.os.IBinder r0 = r2.asBinder()
            L_0x00c8:
                r8.writeStrongBinder(r0)
                return r1
            L_0x00cc:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x00df
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00df:
                r5.onCreate(r0)
                r8.writeNoException()
                return r1
            L_0x00e6:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0100
                com.google.android.gms.maps.a r3 = com.google.android.gms.maps.GoogleMapOptions.CREATOR
                com.google.android.gms.maps.GoogleMapOptions r3 = r3.createFromParcel(r7)
                goto L_0x0101
            L_0x0100:
                r3 = r0
            L_0x0101:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x010f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x010f:
                r5.onInflate(r2, r3, r0)
                r8.writeNoException()
                return r1
            L_0x0116:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r7.enforceInterface(r2)
                com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r5.getMap()
                r8.writeNoException()
                if (r2 == 0) goto L_0x0128
                android.os.IBinder r0 = r2.asBinder()
            L_0x0128:
                r8.writeStrongBinder(r0)
                return r1
            L_0x012c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IMapFragmentDelegate.C2257a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    IGoogleMapDelegate getMap() throws RemoteException;

    void getMapAsync(C2306m mVar) throws RemoteException;

    boolean isReady() throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    C0967d onCreateView(C0967d dVar, C0967d dVar2, Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onInflate(C0967d dVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;
}
