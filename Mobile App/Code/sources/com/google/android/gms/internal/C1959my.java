package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.C1956mx;

/* renamed from: com.google.android.gms.internal.my */
public interface C1959my extends IInterface {

    /* renamed from: com.google.android.gms.internal.my$a */
    public static abstract class C1960a extends Binder implements C1959my {

        /* renamed from: com.google.android.gms.internal.my$a$a */
        private static class C1961a implements C1959my {

            /* renamed from: le */
            private IBinder f4133le;

            C1961a(IBinder iBinder) {
                this.f4133le = iBinder;
            }

            /* renamed from: a */
            public void mo16223a(C1956mx mxVar, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
                    obtain.writeStrongBinder(mxVar != null ? mxVar.asBinder() : null);
                    if (userAddressRequest != null) {
                        obtain.writeInt(1);
                        userAddressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4133le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4133le;
            }
        }

        /* renamed from: aK */
        public static C1959my m5784aK(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1959my)) ? new C1961a(iBinder) : (C1959my) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
                C1956mx aJ = C1956mx.C1957a.m5781aJ(parcel.readStrongBinder());
                Bundle bundle = null;
                UserAddressRequest createFromParcel = parcel.readInt() != 0 ? UserAddressRequest.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo16223a(aJ, createFromParcel, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16223a(C1956mx mxVar, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException;
}
