package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.internal.j */
public interface C2297j extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.j$a */
    public static abstract class C2298a extends Binder implements C2297j {

        /* renamed from: com.google.android.gms.maps.internal.j$a$a */
        private static class C2299a implements C2297j {

            /* renamed from: le */
            private IBinder f4321le;

            C2299a(IBinder iBinder) {
                this.f4321le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4321le;
            }

            public void onMapClick(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4321le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2298a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapClickListener");
        }

        /* renamed from: bd */
        public static C2297j m6762bd(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2297j)) ? new C2299a(iBinder) : (C2297j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                onMapClick(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
                return true;
            }
        }
    }

    void onMapClick(LatLng latLng) throws RemoteException;
}
