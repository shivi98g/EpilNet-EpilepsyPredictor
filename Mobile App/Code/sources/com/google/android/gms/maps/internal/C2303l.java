package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.internal.l */
public interface C2303l extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.l$a */
    public static abstract class C2304a extends Binder implements C2303l {

        /* renamed from: com.google.android.gms.maps.internal.l$a$a */
        private static class C2305a implements C2303l {

            /* renamed from: le */
            private IBinder f4323le;

            C2305a(IBinder iBinder) {
                this.f4323le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4323le;
            }

            public void onMapLongClick(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4323le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2304a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLongClickListener");
        }

        /* renamed from: bf */
        public static C2303l m6764bf(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2303l)) ? new C2305a(iBinder) : (C2303l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                onMapLongClick(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                return true;
            }
        }
    }

    void onMapLongClick(LatLng latLng) throws RemoteException;
}
