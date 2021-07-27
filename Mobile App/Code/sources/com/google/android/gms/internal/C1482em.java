package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.em */
public interface C1482em extends IInterface {

    /* renamed from: com.google.android.gms.internal.em$a */
    public static abstract class C1483a extends Binder implements C1482em {

        /* renamed from: com.google.android.gms.internal.em$a$a */
        private static class C1484a implements C1482em {

            /* renamed from: le */
            private IBinder f3033le;

            C1484a(IBinder iBinder) {
                this.f3033le = iBinder;
            }

            public IBinder asBinder() {
                return this.f3033le;
            }

            public String getProductId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                    this.f3033le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void recordPlayBillingResolution(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                    obtain.writeInt(i);
                    this.f3033le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void recordResolution(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                    obtain.writeInt(i);
                    this.f3033le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1483a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
        }

        /* renamed from: u */
        public static C1482em m4387u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1482em)) ? new C1484a(iBinder) : (C1482em) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                        String productId = getProductId();
                        parcel2.writeNoException();
                        parcel2.writeString(productId);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                        recordResolution(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                        recordPlayBillingResolution(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                return true;
            }
        }
    }

    String getProductId() throws RemoteException;

    void recordPlayBillingResolution(int i) throws RemoteException;

    void recordResolution(int i) throws RemoteException;
}
