package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* renamed from: com.google.android.gms.internal.lx */
public interface C1871lx extends IInterface {

    /* renamed from: com.google.android.gms.internal.lx$a */
    public static abstract class C1872a extends Binder implements C1871lx {

        /* renamed from: com.google.android.gms.internal.lx$a$a */
        private static class C1873a implements C1871lx {

            /* renamed from: le */
            private IBinder f4052le;

            C1873a(IBinder iBinder) {
                this.f4052le = iBinder;
            }

            /* renamed from: a */
            public void mo16085a(DataSourcesResult dataSourcesResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    if (dataSourcesResult != null) {
                        obtain.writeInt(1);
                        dataSourcesResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4052le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4052le;
            }
        }

        public C1872a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
        }

        /* renamed from: at */
        public static C1871lx m5574at(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1871lx)) ? new C1873a(iBinder) : (C1871lx) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                mo16085a(parcel.readInt() != 0 ? DataSourcesResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16085a(DataSourcesResult dataSourcesResult) throws RemoteException;
}
