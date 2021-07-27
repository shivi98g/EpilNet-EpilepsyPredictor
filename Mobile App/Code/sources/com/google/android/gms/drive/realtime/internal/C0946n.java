package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.n */
public interface C0946n extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.n$a */
    public static abstract class C0947a extends Binder implements C0946n {

        /* renamed from: com.google.android.gms.drive.realtime.internal.n$a$a */
        private static class C0948a implements C0946n {

            /* renamed from: le */
            private IBinder f1285le;

            C0948a(IBinder iBinder) {
                this.f1285le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1285le;
            }

            /* renamed from: br */
            public void mo12101br(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    obtain.writeString(str);
                    this.f1285le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo12102n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1285le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: am */
        public static C0946n m1561am(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0946n)) ? new C0948a(iBinder) : (C0946n) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                        mo12101br(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                        mo12102n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.IStringCallback");
                return true;
            }
        }
    }

    /* renamed from: br */
    void mo12101br(String str) throws RemoteException;

    /* renamed from: n */
    void mo12102n(Status status) throws RemoteException;
}
