package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.dy */
public interface C1463dy extends IInterface {

    /* renamed from: com.google.android.gms.internal.dy$a */
    public static abstract class C1464a extends Binder implements C1463dy {

        /* renamed from: com.google.android.gms.internal.dy$a$a */
        private static class C1465a implements C1463dy {

            /* renamed from: le */
            private IBinder f2990le;

            C1465a(IBinder iBinder) {
                this.f2990le = iBinder;
            }

            public IBinder asBinder() {
                return this.f2990le;
            }

            /* renamed from: b */
            public IBinder mo15177b(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f2990le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: s */
        public static C1463dy m4338s(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1463dy)) ? new C1465a(iBinder) : (C1463dy) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                IBinder b = mo15177b(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return true;
            }
        }
    }

    /* renamed from: b */
    IBinder mo15177b(C0967d dVar) throws RemoteException;
}
