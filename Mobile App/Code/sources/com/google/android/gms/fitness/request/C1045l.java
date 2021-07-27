package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;

/* renamed from: com.google.android.gms.fitness.request.l */
public interface C1045l extends IInterface {

    /* renamed from: com.google.android.gms.fitness.request.l$a */
    public static abstract class C1046a extends Binder implements C1045l {

        /* renamed from: com.google.android.gms.fitness.request.l$a$a */
        private static class C1047a implements C1045l {

            /* renamed from: le */
            private IBinder f1576le;

            C1047a(IBinder iBinder) {
                this.f1576le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1576le;
            }

            public void onDeviceFound(BleDevice bleDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    if (bleDevice != null) {
                        obtain.writeInt(1);
                        bleDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1576le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onScanStopped() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    this.f1576le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C1046a() {
            attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
        }

        /* renamed from: aB */
        public static C1045l m1916aB(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1045l)) ? new C1047a(iBinder) : (C1045l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                        onDeviceFound(parcel.readInt() != 0 ? BleDevice.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                        onScanStopped();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
                return true;
            }
        }
    }

    void onDeviceFound(BleDevice bleDevice) throws RemoteException;

    void onScanStopped() throws RemoteException;
}
