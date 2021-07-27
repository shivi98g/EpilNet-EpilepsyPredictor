package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataTypeResult;

/* renamed from: com.google.android.gms.internal.ly */
public interface C1874ly extends IInterface {

    /* renamed from: com.google.android.gms.internal.ly$a */
    public static abstract class C1875a extends Binder implements C1874ly {

        /* renamed from: com.google.android.gms.internal.ly$a$a */
        private static class C1876a implements C1874ly {

            /* renamed from: le */
            private IBinder f4053le;

            C1876a(IBinder iBinder) {
                this.f4053le = iBinder;
            }

            /* renamed from: a */
            public void mo16089a(DataTypeResult dataTypeResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    if (dataTypeResult != null) {
                        obtain.writeInt(1);
                        dataTypeResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4053le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4053le;
            }
        }

        public C1875a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
        }

        /* renamed from: au */
        public static C1874ly m5577au(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1874ly)) ? new C1876a(iBinder) : (C1874ly) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
                mo16089a(parcel.readInt() != 0 ? DataTypeResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16089a(DataTypeResult dataTypeResult) throws RemoteException;
}
