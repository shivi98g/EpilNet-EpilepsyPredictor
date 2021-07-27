package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.md */
public interface C1890md extends IInterface {

    /* renamed from: com.google.android.gms.internal.md$a */
    public static abstract class C1891a extends Binder implements C1890md {

        /* renamed from: com.google.android.gms.internal.md$a$a */
        private static class C1892a implements C1890md {

            /* renamed from: le */
            private IBinder f4058le;

            C1892a(IBinder iBinder) {
                this.f4058le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4058le;
            }

            /* renamed from: j */
            public void mo16078j(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IStatusCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4058le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1891a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IStatusCallback");
        }

        /* renamed from: az */
        public static C1890md m5640az(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1890md)) ? new C1892a(iBinder) : (C1890md) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                mo16078j(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.IStatusCallback");
                return true;
            }
        }
    }

    /* renamed from: j */
    void mo16078j(Status status) throws RemoteException;
}
