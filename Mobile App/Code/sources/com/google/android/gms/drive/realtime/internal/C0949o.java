package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.o */
public interface C0949o extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.o$a */
    public static abstract class C0950a extends Binder implements C0949o {

        /* renamed from: com.google.android.gms.drive.realtime.internal.o$a$a */
        private static class C0951a implements C0949o {

            /* renamed from: le */
            private IBinder f1286le;

            C0951a(IBinder iBinder) {
                this.f1286le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1286le;
            }

            /* renamed from: n */
            public void mo12106n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1286le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    this.f1286le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: an */
        public static C0949o m1565an(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0949o)) ? new C0951a(iBinder) : (C0949o) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                        onSuccess();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                        mo12106n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                return true;
            }
        }
    }

    /* renamed from: n */
    void mo12106n(Status status) throws RemoteException;

    void onSuccess() throws RemoteException;
}
