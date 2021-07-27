package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.maps.model.internal.o */
public interface C2383o extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.internal.o$a */
    public static abstract class C2384a extends Binder implements C2383o {

        /* renamed from: com.google.android.gms.maps.model.internal.o$a$a */
        private static class C2385a implements C2383o {

            /* renamed from: le */
            private IBinder f4364le;

            C2385a(IBinder iBinder) {
                this.f4364le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4364le;
            }

            public Tile getTile(int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f4364le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Tile.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2384a() {
            attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        /* renamed from: bE */
        public static C2383o m6902bE(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2383o)) ? new C2385a(iBinder) : (C2383o) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                Tile tile = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (tile != null) {
                    parcel2.writeInt(1);
                    tile.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                return true;
            }
        }
    }

    Tile getTile(int i, int i2, int i3) throws RemoteException;
}
