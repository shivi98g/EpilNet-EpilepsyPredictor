package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.ju */
public interface C1778ju extends IInterface {

    /* renamed from: com.google.android.gms.internal.ju$a */
    public static abstract class C1779a extends Binder implements C1778ju {

        /* renamed from: com.google.android.gms.internal.ju$a$a */
        private static class C1780a implements C1778ju {

            /* renamed from: le */
            private IBinder f3945le;

            C1780a(IBinder iBinder) {
                this.f3945le = iBinder;
            }

            /* renamed from: a */
            public C0967d mo15932a(C0967d dVar, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f3945le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3945le;
            }
        }

        /* renamed from: R */
        public static C1778ju m5346R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1778ju)) ? new C1780a(iBinder) : (C1778ju) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                C0967d a = mo15932a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                return true;
            }
        }
    }

    /* renamed from: a */
    C0967d mo15932a(C0967d dVar, int i, int i2) throws RemoteException;
}
