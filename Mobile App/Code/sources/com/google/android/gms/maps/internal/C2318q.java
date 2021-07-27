package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.maps.internal.q */
public interface C2318q extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.q$a */
    public static abstract class C2319a extends Binder implements C2318q {

        /* renamed from: com.google.android.gms.maps.internal.q$a$a */
        private static class C2320a implements C2318q {

            /* renamed from: le */
            private IBinder f4328le;

            C2320a(IBinder iBinder) {
                this.f4328le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4328le;
            }

            /* renamed from: c */
            public void mo17305c(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4328le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo17306g(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4328le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2319a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        }

        /* renamed from: bk */
        public static C2318q m6781bk(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2318q)) ? new C2320a(iBinder) : (C2318q) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                        mo17306g(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                        mo17305c(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                return true;
            }
        }
    }

    /* renamed from: c */
    void mo17305c(Location location) throws RemoteException;

    /* renamed from: g */
    void mo17306g(C0967d dVar) throws RemoteException;
}
