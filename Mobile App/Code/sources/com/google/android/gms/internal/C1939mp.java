package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: com.google.android.gms.internal.mp */
public interface C1939mp extends IInterface {

    /* renamed from: com.google.android.gms.internal.mp$a */
    public static abstract class C1940a extends Binder implements C1939mp {

        /* renamed from: com.google.android.gms.internal.mp$a$a */
        private static class C1941a implements C1939mp {

            /* renamed from: le */
            private IBinder f4122le;

            C1941a(IBinder iBinder) {
                this.f4122le = iBinder;
            }

            /* renamed from: a */
            public void mo16141a(BleDevicesResult bleDevicesResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                    if (bleDevicesResult != null) {
                        obtain.writeInt(1);
                        bleDevicesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4122le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4122le;
            }
        }

        public C1940a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        }

        /* renamed from: aA */
        public static C1939mp m5732aA(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1939mp)) ? new C1941a(iBinder) : (C1939mp) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                mo16141a(parcel.readInt() != 0 ? BleDevicesResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16141a(BleDevicesResult bleDevicesResult) throws RemoteException;
}
