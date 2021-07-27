package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.c */
public interface C0903c extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.c$a */
    public static abstract class C0904a extends Binder implements C0903c {

        /* renamed from: com.google.android.gms.drive.realtime.internal.c$a$a */
        private static class C0905a implements C0903c {

            /* renamed from: le */
            private IBinder f1227le;

            C0905a(IBinder iBinder) {
                this.f1227le = iBinder;
            }

            /* renamed from: N */
            public void mo11950N(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1227le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1227le;
            }

            /* renamed from: n */
            public void mo11951n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1227le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ab */
        public static C0903c m1402ab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0903c)) ? new C0905a(iBinder) : (C0903c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                        mo11950N(parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                        mo11951n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                return true;
            }
        }
    }

    /* renamed from: N */
    void mo11950N(boolean z) throws RemoteException;

    /* renamed from: n */
    void mo11951n(Status status) throws RemoteException;
}
