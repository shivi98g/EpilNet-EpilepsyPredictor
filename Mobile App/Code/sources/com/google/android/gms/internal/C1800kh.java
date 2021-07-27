package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.kh */
public interface C1800kh extends IInterface {

    /* renamed from: com.google.android.gms.internal.kh$a */
    public static abstract class C1801a extends Binder implements C1800kh {

        /* renamed from: com.google.android.gms.internal.kh$a$a */
        private static class C1802a implements C1800kh {

            /* renamed from: le */
            private IBinder f3959le;

            C1802a(IBinder iBinder) {
                this.f3959le = iBinder;
            }

            /* renamed from: aI */
            public void mo15948aI(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    obtain.writeInt(i);
                    this.f3959le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3959le;
            }
        }

        public C1801a() {
            attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        }

        /* renamed from: U */
        public static C1800kh m5399U(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1800kh)) ? new C1802a(iBinder) : (C1800kh) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                mo15948aI(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
                return true;
            }
        }
    }

    /* renamed from: aI */
    void mo15948aI(int i) throws RemoteException;
}
