package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.maps.internal.i */
public interface C2294i extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.i$a */
    public static abstract class C2295a extends Binder implements C2294i {

        /* renamed from: com.google.android.gms.maps.internal.i$a$a */
        private static class C2296a implements C2294i {

            /* renamed from: le */
            private IBinder f4320le;

            C2296a(IBinder iBinder) {
                this.f4320le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4320le;
            }

            /* renamed from: d */
            public void mo17738d(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4320le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo17739l(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4320le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bc */
        public static C2294i m6759bc(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2294i)) ? new C2296a(iBinder) : (C2294i) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                        mo17739l(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                        mo17738d(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                return true;
            }
        }
    }

    /* renamed from: d */
    void mo17738d(Location location) throws RemoteException;

    /* renamed from: l */
    void mo17739l(C0967d dVar) throws RemoteException;
}
