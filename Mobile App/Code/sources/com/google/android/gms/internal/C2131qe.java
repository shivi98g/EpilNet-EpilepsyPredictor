package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.qe */
public interface C2131qe extends IInterface {

    /* renamed from: com.google.android.gms.internal.qe$a */
    public static abstract class C2132a extends Binder implements C2131qe {

        /* renamed from: com.google.android.gms.internal.qe$a$a */
        private static class C2133a implements C2131qe {

            /* renamed from: le */
            private IBinder f4216le;

            C2133a(IBinder iBinder) {
                this.f4216le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4216le;
            }

            /* renamed from: b */
            public void mo16965b(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4216le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bT */
        public static C2131qe m6270bT(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2131qe)) ? new C2133a(iBinder) : (C2131qe) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                mo16965b(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo16965b(int i, int i2, Bundle bundle) throws RemoteException;
}
