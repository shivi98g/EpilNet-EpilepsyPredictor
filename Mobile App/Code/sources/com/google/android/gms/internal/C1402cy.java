package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1405cz;

/* renamed from: com.google.android.gms.internal.cy */
public interface C1402cy extends IInterface {

    /* renamed from: com.google.android.gms.internal.cy$a */
    public static abstract class C1403a extends Binder implements C1402cy {

        /* renamed from: com.google.android.gms.internal.cy$a$a */
        private static class C1404a implements C1402cy {

            /* renamed from: le */
            private IBinder f2850le;

            C1404a(IBinder iBinder) {
                this.f2850le = iBinder;
            }

            public IBinder asBinder() {
                return this.f2850le;
            }

            /* renamed from: x */
            public C1405cz mo15048x(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f2850le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1405cz.C1406a.m4222o(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y */
            public boolean mo15049y(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2850le.transact(2, obtain, obtain2, 0);
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
        }

        public C1403a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }

        /* renamed from: n */
        public static C1402cy m4215n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1402cy)) ? new C1404a(iBinder) : (C1402cy) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                        C1405cz x = mo15048x(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(x != null ? x.asBinder() : null);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                        boolean y = mo15049y(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(y ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                return true;
            }
        }
    }

    /* renamed from: x */
    C1405cz mo15048x(String str) throws RemoteException;

    /* renamed from: y */
    boolean mo15049y(String str) throws RemoteException;
}
