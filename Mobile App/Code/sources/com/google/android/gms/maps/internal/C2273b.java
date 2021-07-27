package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.maps.internal.b */
public interface C2273b extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.b$a */
    public static abstract class C2274a extends Binder implements C2273b {

        /* renamed from: com.google.android.gms.maps.internal.b$a$a */
        private static class C2275a implements C2273b {

            /* renamed from: le */
            private IBinder f4313le;

            C2275a(IBinder iBinder) {
                this.f4313le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4313le;
            }

            public void onCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f4313le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onFinish() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
                    this.f4313le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2274a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ICancelableCallback");
        }

        /* renamed from: aR */
        public static C2273b m6724aR(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2273b)) ? new C2275a(iBinder) : (C2273b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        onFinish();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        onCancel();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.ICancelableCallback");
                return true;
            }
        }
    }

    void onCancel() throws RemoteException;

    void onFinish() throws RemoteException;
}
