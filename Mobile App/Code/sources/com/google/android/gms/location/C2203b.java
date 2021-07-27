package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.b */
public interface C2203b extends IInterface {

    /* renamed from: com.google.android.gms.location.b$a */
    public static abstract class C2204a extends Binder implements C2203b {

        /* renamed from: com.google.android.gms.location.b$a$a */
        private static class C2205a implements C2203b {

            /* renamed from: le */
            private IBinder f4287le;

            C2205a(IBinder iBinder) {
                this.f4287le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4287le;
            }

            public void onLocationChanged(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4287le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C2204a() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        /* renamed from: aL */
        public static C2203b m6629aL(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2203b)) ? new C2205a(iBinder) : (C2203b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                onLocationChanged(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.location.ILocationListener");
                return true;
            }
        }
    }

    void onLocationChanged(Location location) throws RemoteException;
}
