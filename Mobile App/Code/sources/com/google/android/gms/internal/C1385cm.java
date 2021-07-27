package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cm */
public interface C1385cm extends IInterface {

    /* renamed from: com.google.android.gms.internal.cm$a */
    public static abstract class C1386a extends Binder implements C1385cm {

        /* renamed from: com.google.android.gms.internal.cm$a$a */
        private static class C1387a implements C1385cm {

            /* renamed from: le */
            private IBinder f2804le;

            C1387a(IBinder iBinder) {
                this.f2804le = iBinder;
            }

            public IBinder asBinder() {
                return this.f2804le;
            }

            /* renamed from: bN */
            public Bundle mo15021bN() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.gservice.IGservicesValueService");
                    this.f2804le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: m */
        public static C1385cm m4180m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.gservice.IGservicesValueService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1385cm)) ? new C1387a(iBinder) : (C1385cm) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.gservice.IGservicesValueService");
                Bundle bN = mo15021bN();
                parcel2.writeNoException();
                if (bN != null) {
                    parcel2.writeInt(1);
                    bN.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.gservice.IGservicesValueService");
                return true;
            }
        }
    }

    /* renamed from: bN */
    Bundle mo15021bN() throws RemoteException;
}
