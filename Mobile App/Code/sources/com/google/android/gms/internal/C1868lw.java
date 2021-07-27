package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataReadResult;

/* renamed from: com.google.android.gms.internal.lw */
public interface C1868lw extends IInterface {

    /* renamed from: com.google.android.gms.internal.lw$a */
    public static abstract class C1869a extends Binder implements C1868lw {

        /* renamed from: com.google.android.gms.internal.lw$a$a */
        private static class C1870a implements C1868lw {

            /* renamed from: le */
            private IBinder f4051le;

            C1870a(IBinder iBinder) {
                this.f4051le = iBinder;
            }

            /* renamed from: a */
            public void mo16081a(DataReadResult dataReadResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataReadCallback");
                    if (dataReadResult != null) {
                        obtain.writeInt(1);
                        dataReadResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4051le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4051le;
            }
        }

        public C1869a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataReadCallback");
        }

        /* renamed from: as */
        public static C1868lw m5571as(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1868lw)) ? new C1870a(iBinder) : (C1868lw) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
                mo16081a(parcel.readInt() != 0 ? DataReadResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.IDataReadCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16081a(DataReadResult dataReadResult) throws RemoteException;
}
