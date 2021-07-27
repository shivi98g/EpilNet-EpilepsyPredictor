package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.drive.internal.ag */
public interface C0760ag extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.ag$a */
    public static abstract class C0761a extends Binder implements C0760ag {

        /* renamed from: com.google.android.gms.drive.internal.ag$a$a */
        private static class C0762a implements C0760ag {

            /* renamed from: le */
            private IBinder f1032le;

            C0762a(IBinder iBinder) {
                this.f1032le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1032le;
            }

            /* renamed from: c */
            public void mo11348c(OnEventResponse onEventResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IEventCallback");
                    if (onEventResponse != null) {
                        obtain.writeInt(1);
                        onEventResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1032le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0761a() {
            attachInterface(this, "com.google.android.gms.drive.internal.IEventCallback");
        }

        /* renamed from: Z */
        public static C0760ag m985Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0760ag)) ? new C0762a(iBinder) : (C0760ag) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.drive.internal.IEventCallback");
                mo11348c(parcel.readInt() != 0 ? OnEventResponse.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.drive.internal.IEventCallback");
                return true;
            }
        }
    }

    /* renamed from: c */
    void mo11348c(OnEventResponse onEventResponse) throws RemoteException;
}
