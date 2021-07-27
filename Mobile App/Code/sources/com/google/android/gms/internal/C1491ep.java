package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.ep */
public interface C1491ep extends IInterface {

    /* renamed from: com.google.android.gms.internal.ep$a */
    public static abstract class C1492a extends Binder implements C1491ep {

        /* renamed from: com.google.android.gms.internal.ep$a$a */
        private static class C1493a implements C1491ep {

            /* renamed from: le */
            private IBinder f3036le;

            C1493a(IBinder iBinder) {
                this.f3036le = iBinder;
            }

            public IBinder asBinder() {
                return this.f3036le;
            }

            /* renamed from: c */
            public IBinder mo15241c(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f3036le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: x */
        public static C1491ep m4393x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1491ep)) ? new C1493a(iBinder) : (C1491ep) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                IBinder c = mo15241c(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(c);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
                return true;
            }
        }
    }

    /* renamed from: c */
    IBinder mo15241c(C0967d dVar) throws RemoteException;
}
