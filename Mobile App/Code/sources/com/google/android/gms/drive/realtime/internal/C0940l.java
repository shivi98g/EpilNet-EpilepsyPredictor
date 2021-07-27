package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.l */
public interface C0940l extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.l$a */
    public static abstract class C0941a extends Binder implements C0940l {

        /* renamed from: com.google.android.gms.drive.realtime.internal.l$a$a */
        private static class C0942a implements C0940l {

            /* renamed from: le */
            private IBinder f1283le;

            C0942a(IBinder iBinder) {
                this.f1283le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1283le;
            }

            /* renamed from: ct */
            public void mo12053ct(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    obtain.writeInt(i);
                    this.f1283le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo12054n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1283le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ak */
        public static C0940l m1473ak(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0940l)) ? new C0942a(iBinder) : (C0940l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                        mo12053ct(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                        mo12054n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.IIntCallback");
                return true;
            }
        }
    }

    /* renamed from: ct */
    void mo12053ct(int i) throws RemoteException;

    /* renamed from: n */
    void mo12054n(Status status) throws RemoteException;
}
