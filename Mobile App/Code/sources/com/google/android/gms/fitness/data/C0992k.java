package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.fitness.data.k */
public interface C0992k extends IInterface {

    /* renamed from: com.google.android.gms.fitness.data.k$a */
    public static abstract class C0993a extends Binder implements C0992k {

        /* renamed from: com.google.android.gms.fitness.data.k$a$a */
        private static class C0994a implements C0992k {

            /* renamed from: le */
            private IBinder f1444le;

            C0994a(IBinder iBinder) {
                this.f1444le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1444le;
            }

            /* renamed from: c */
            public void mo12476c(DataPoint dataPoint) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
                    if (dataPoint != null) {
                        obtain.writeInt(1);
                        dataPoint.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1444le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0993a() {
            attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
        }

        /* renamed from: aq */
        public static C0992k m1744aq(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0992k)) ? new C0994a(iBinder) : (C0992k) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
                mo12476c(parcel.readInt() != 0 ? DataPoint.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
                return true;
            }
        }
    }

    /* renamed from: c */
    void mo12476c(DataPoint dataPoint) throws RemoteException;
}
