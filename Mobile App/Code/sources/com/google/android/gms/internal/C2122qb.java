package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.qb */
public interface C2122qb extends IInterface {

    /* renamed from: com.google.android.gms.internal.qb$a */
    public static abstract class C2123a extends Binder implements C2122qb {

        /* renamed from: com.google.android.gms.internal.qb$a$a */
        private static class C2124a implements C2122qb {

            /* renamed from: le */
            private IBinder f4213le;

            C2124a(IBinder iBinder) {
                this.f4213le = iBinder;
            }

            /* renamed from: a */
            public void mo16946a(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4213le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4213le;
            }
        }

        public C2123a() {
            attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
        }

        /* renamed from: bQ */
        public static C2122qb m6243bQ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2122qb)) ? new C2124a(iBinder) : (C2122qb) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                mo16946a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16946a(int i, int i2, Bundle bundle) throws RemoteException;
}
