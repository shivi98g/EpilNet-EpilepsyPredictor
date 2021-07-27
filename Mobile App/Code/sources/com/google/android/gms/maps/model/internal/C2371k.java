package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.maps.model.internal.k */
public interface C2371k extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.internal.k$a */
    public static abstract class C2372a extends Binder implements C2371k {

        /* renamed from: com.google.android.gms.maps.model.internal.k$a$a */
        private static class C2373a implements C2371k {

            /* renamed from: le */
            private IBinder f4360le;

            C2373a(IBinder iBinder) {
                this.f4360le = iBinder;
            }

            /* renamed from: a */
            public boolean mo18235a(C2371k kVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    boolean z = false;
                    this.f4360le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void activate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f4360le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4360le;
            }

            public String getName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f4360le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getShortName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f4360le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int hashCodeRemote() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.f4360le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bz */
        public static C2371k m6887bz(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2371k)) ? new C2373a(iBinder) : (C2371k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                        String name = getName();
                        parcel2.writeNoException();
                        parcel2.writeString(name);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                        String shortName = getShortName();
                        parcel2.writeNoException();
                        parcel2.writeString(shortName);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                        activate();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                        boolean a = mo18235a(m6887bz(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                        int hashCodeRemote = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(hashCodeRemote);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo18235a(C2371k kVar) throws RemoteException;

    void activate() throws RemoteException;

    String getName() throws RemoteException;

    String getShortName() throws RemoteException;

    int hashCodeRemote() throws RemoteException;
}
