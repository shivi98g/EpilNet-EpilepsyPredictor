package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionReadResult;

/* renamed from: com.google.android.gms.internal.mb */
public interface C1884mb extends IInterface {

    /* renamed from: com.google.android.gms.internal.mb$a */
    public static abstract class C1885a extends Binder implements C1884mb {

        /* renamed from: com.google.android.gms.internal.mb$a$a */
        private static class C1886a implements C1884mb {

            /* renamed from: le */
            private IBinder f4056le;

            C1886a(IBinder iBinder) {
                this.f4056le = iBinder;
            }

            /* renamed from: a */
            public void mo16123a(SessionReadResult sessionReadResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionReadCallback");
                    if (sessionReadResult != null) {
                        obtain.writeInt(1);
                        sessionReadResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4056le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4056le;
            }
        }

        public C1885a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ISessionReadCallback");
        }

        /* renamed from: ax */
        public static C1884mb m5634ax(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1884mb)) ? new C1886a(iBinder) : (C1884mb) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
                mo16123a(parcel.readInt() != 0 ? SessionReadResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.ISessionReadCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16123a(SessionReadResult sessionReadResult) throws RemoteException;
}
