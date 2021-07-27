package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.jq */
public interface C1767jq extends IInterface {

    /* renamed from: com.google.android.gms.internal.jq$a */
    public static abstract class C1768a extends Binder implements C1767jq {
        public C1768a() {
            attachInterface(this, "com.google.android.gms.common.internal.IAccountAccessor");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Account hk = mo15785hk();
                parcel2.writeNoException();
                if (hk != null) {
                    parcel2.writeInt(1);
                    hk.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
                return true;
            }
        }
    }

    /* renamed from: hk */
    Account mo15785hk() throws RemoteException;
}
