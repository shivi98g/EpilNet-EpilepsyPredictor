package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

public interface IStreetViewPanoramaViewDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate$a */
    public static abstract class C2267a extends Binder implements IStreetViewPanoramaViewDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate$a$a */
        private static class C2268a implements IStreetViewPanoramaViewDelegate {

            /* renamed from: le */
            private IBinder f4311le;

            C2268a(IBinder iBinder) {
                this.f4311le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4311le;
            }

            public IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return IStreetViewPanoramaDelegate.C2263a.m6717br(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getStreetViewPanoramaAsync(C2330u uVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    obtain.writeStrongBinder(uVar != null ? uVar.asBinder() : null);
                    this.f4311le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0967d getView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4311le.transact(2, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(5, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(4, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.f4311le.transact(3, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4311le.transact(7, obtain, obtain2, 0);
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

        /* renamed from: bt */
        public static IStreetViewPanoramaViewDelegate m6719bt(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaViewDelegate)) ? new C2268a(iBinder) : (IStreetViewPanoramaViewDelegate) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v18, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x00c0
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00aa;
                    case 2: goto L_0x0090;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x0078;
                    case 5: goto L_0x006c;
                    case 6: goto L_0x0060;
                    case 7: goto L_0x0039;
                    case 8: goto L_0x0023;
                    case 9: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.maps.internal.u r0 = com.google.android.gms.maps.internal.C2330u.C2331a.m6788bo(r0)
                r3.getStreetViewPanoramaAsync(r0)
                r6.writeNoException()
                return r1
            L_0x0023:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r2)
                com.google.android.gms.dynamic.d r2 = r3.getView()
                r6.writeNoException()
                if (r2 == 0) goto L_0x0035
                android.os.IBinder r0 = r2.asBinder()
            L_0x0035:
                r6.writeStrongBinder(r0)
                return r1
            L_0x0039:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x004c
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x004c:
                r3.onSaveInstanceState(r0)
                r6.writeNoException()
                if (r0 == 0) goto L_0x005b
                r6.writeInt(r1)
                r0.writeToParcel(r6, r1)
                return r1
            L_0x005b:
                r0 = 0
                r6.writeInt(r0)
                return r1
            L_0x0060:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r0)
                r3.onLowMemory()
                r6.writeNoException()
                return r1
            L_0x006c:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r0)
                r3.onDestroy()
                r6.writeNoException()
                return r1
            L_0x0078:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r0)
                r3.onPause()
                r6.writeNoException()
                return r1
            L_0x0084:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r0)
                r3.onResume()
                r6.writeNoException()
                return r1
            L_0x0090:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00a3
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00a3:
                r3.onCreate(r0)
                r6.writeNoException()
                return r1
            L_0x00aa:
                java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r5.enforceInterface(r2)
                com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate r2 = r3.getStreetViewPanorama()
                r6.writeNoException()
                if (r2 == 0) goto L_0x00bc
                android.os.IBinder r0 = r2.asBinder()
            L_0x00bc:
                r6.writeStrongBinder(r0)
                return r1
            L_0x00c0:
                java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.C2267a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException;

    void getStreetViewPanoramaAsync(C2330u uVar) throws RemoteException;

    C0967d getView() throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;
}
