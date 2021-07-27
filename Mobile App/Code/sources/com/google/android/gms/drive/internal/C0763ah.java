package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.drive.internal.ah */
public interface C0763ah extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.ah$a */
    public static abstract class C0764a extends Binder implements C0763ah {

        /* renamed from: com.google.android.gms.drive.internal.ah$a$a */
        private static class C0765a implements C0763ah {

            /* renamed from: le */
            private IBinder f1033le;

            C0765a(IBinder iBinder) {
                this.f1033le = iBinder;
            }

            /* renamed from: M */
            public void mo11540M(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1033le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1033le;
            }
        }

        /* renamed from: aa */
        public static C0763ah m988aa(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0763ah)) ? new C0765a(iBinder) : (C0763ah) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
                mo11540M(parcel.readInt() != 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
                return true;
            }
        }
    }

    /* renamed from: M */
    void mo11540M(boolean z) throws RemoteException;
}
