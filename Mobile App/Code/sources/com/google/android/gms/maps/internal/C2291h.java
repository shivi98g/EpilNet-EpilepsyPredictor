package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C2374l;

/* renamed from: com.google.android.gms.maps.internal.h */
public interface C2291h extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.h$a */
    public static abstract class C2292a extends Binder implements C2291h {

        /* renamed from: com.google.android.gms.maps.internal.h$a$a */
        private static class C2293a implements C2291h {

            /* renamed from: le */
            private IBinder f4319le;

            C2293a(IBinder iBinder) {
                this.f4319le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4319le;
            }

            /* renamed from: e */
            public void mo17302e(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4319le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2292a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        /* renamed from: bb */
        public static C2291h m6755bb(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2291h)) ? new C2293a(iBinder) : (C2291h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                mo17302e(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                return true;
            }
        }
    }

    /* renamed from: e */
    void mo17302e(C2374l lVar) throws RemoteException;
}
