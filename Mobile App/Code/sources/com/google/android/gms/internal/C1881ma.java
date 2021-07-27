package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* renamed from: com.google.android.gms.internal.ma */
public interface C1881ma extends IInterface {

    /* renamed from: com.google.android.gms.internal.ma$a */
    public static abstract class C1882a extends Binder implements C1881ma {

        /* renamed from: com.google.android.gms.internal.ma$a$a */
        private static class C1883a implements C1881ma {

            /* renamed from: le */
            private IBinder f4055le;

            C1883a(IBinder iBinder) {
                this.f4055le = iBinder;
            }

            /* renamed from: a */
            public void mo16119a(ListSubscriptionsResult listSubscriptionsResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                    if (listSubscriptionsResult != null) {
                        obtain.writeInt(1);
                        listSubscriptionsResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4055le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4055le;
            }
        }

        public C1882a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        }

        /* renamed from: aw */
        public static C1881ma m5631aw(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1881ma)) ? new C1883a(iBinder) : (C1881ma) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                mo16119a(parcel.readInt() != 0 ? ListSubscriptionsResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16119a(ListSubscriptionsResult listSubscriptionsResult) throws RemoteException;
}
