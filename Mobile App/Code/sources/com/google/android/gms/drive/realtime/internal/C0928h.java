package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.drive.realtime.internal.h */
public interface C0928h extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.h$a */
    public static abstract class C0929a extends Binder implements C0928h {

        /* renamed from: com.google.android.gms.drive.realtime.internal.h$a$a */
        private static class C0930a implements C0928h {

            /* renamed from: le */
            private IBinder f1279le;

            C0930a(IBinder iBinder) {
                this.f1279le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1279le;
            }

            /* renamed from: c */
            public void mo12035c(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f1279le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ag */
        public static C0928h m1456ag(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0928h)) ? new C0930a(iBinder) : (C0928h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo12035c(z2, z);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                return true;
            }
        }
    }

    /* renamed from: c */
    void mo12035c(boolean z, boolean z2) throws RemoteException;
}
