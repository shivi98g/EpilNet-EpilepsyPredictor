package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.mx */
public interface C1956mx extends IInterface {

    /* renamed from: com.google.android.gms.internal.mx$a */
    public static abstract class C1957a extends Binder implements C1956mx {

        /* renamed from: com.google.android.gms.internal.mx$a$a */
        private static class C1958a implements C1956mx {

            /* renamed from: le */
            private IBinder f4132le;

            C1958a(IBinder iBinder) {
                this.f4132le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4132le;
            }

            /* renamed from: g */
            public void mo16219g(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4132le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1957a() {
            attachInterface(this, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
        }

        /* renamed from: aJ */
        public static C1956mx m5781aJ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1956mx)) ? new C1958a(iBinder) : (C1956mx) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                mo16219g(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                return true;
            }
        }
    }

    /* renamed from: g */
    void mo16219g(int i, Bundle bundle) throws RemoteException;
}
