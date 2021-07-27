package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.maps.internal.p */
public interface C2315p extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.p$a */
    public static abstract class C2316a extends Binder implements C2315p {

        /* renamed from: com.google.android.gms.maps.internal.p$a$a */
        private static class C2317a implements C2315p {

            /* renamed from: le */
            private IBinder f4327le;

            C2317a(IBinder iBinder) {
                this.f4327le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4327le;
            }

            public boolean onMyLocationButtonClick() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    boolean z = false;
                    this.f4327le.transact(1, obtain, obtain2, 0);
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

        public C2316a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        }

        /* renamed from: bj */
        public static C2315p m6778bj(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2315p)) ? new C2317a(iBinder) : (C2315p) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                boolean onMyLocationButtonClick = onMyLocationButtonClick();
                parcel2.writeNoException();
                parcel2.writeInt(onMyLocationButtonClick ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                return true;
            }
        }
    }

    boolean onMyLocationButtonClick() throws RemoteException;
}
