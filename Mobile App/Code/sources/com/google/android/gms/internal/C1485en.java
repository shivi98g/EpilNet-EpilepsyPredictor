package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1482em;

/* renamed from: com.google.android.gms.internal.en */
public interface C1485en extends IInterface {

    /* renamed from: com.google.android.gms.internal.en$a */
    public static abstract class C1486a extends Binder implements C1485en {

        /* renamed from: com.google.android.gms.internal.en$a$a */
        private static class C1487a implements C1485en {

            /* renamed from: le */
            private IBinder f3034le;

            C1487a(IBinder iBinder) {
                this.f3034le = iBinder;
            }

            /* renamed from: a */
            public void mo15234a(C1482em emVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    obtain.writeStrongBinder(emVar != null ? emVar.asBinder() : null);
                    this.f3034le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3034le;
            }
        }

        public C1486a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        }

        /* renamed from: v */
        public static C1485en m4389v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1485en)) ? new C1487a(iBinder) : (C1485en) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                mo15234a(C1482em.C1483a.m4387u(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15234a(C1482em emVar) throws RemoteException;
}
