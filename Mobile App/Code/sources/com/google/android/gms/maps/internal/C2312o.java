package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C2374l;

/* renamed from: com.google.android.gms.maps.internal.o */
public interface C2312o extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.o$a */
    public static abstract class C2313a extends Binder implements C2312o {

        /* renamed from: com.google.android.gms.maps.internal.o$a$a */
        private static class C2314a implements C2312o {

            /* renamed from: le */
            private IBinder f4326le;

            C2314a(IBinder iBinder) {
                this.f4326le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4326le;
            }

            /* renamed from: b */
            public void mo17299b(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4326le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo17300c(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4326le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo17301d(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4326le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2313a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        /* renamed from: bi */
        public static C2312o m6774bi(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2312o)) ? new C2314a(iBinder) : (C2312o) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                        mo17299b(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                        mo17301d(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                        mo17300c(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo17299b(C2374l lVar) throws RemoteException;

    /* renamed from: c */
    void mo17300c(C2374l lVar) throws RemoteException;

    /* renamed from: d */
    void mo17301d(C2374l lVar) throws RemoteException;
}
