package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1494eq;

/* renamed from: com.google.android.gms.internal.er */
public interface C1497er extends IInterface {

    /* renamed from: com.google.android.gms.internal.er$a */
    public static abstract class C1498a extends Binder implements C1497er {

        /* renamed from: com.google.android.gms.internal.er$a$a */
        private static class C1499a implements C1497er {

            /* renamed from: le */
            private IBinder f3038le;

            C1499a(IBinder iBinder) {
                this.f3038le = iBinder;
            }

            /* renamed from: a */
            public void mo15247a(C1494eq eqVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeStrongBinder(eqVar != null ? eqVar.asBinder() : null);
                    this.f3038le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3038le;
            }

            public boolean isValidPurchase(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f3038le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1498a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }

        /* renamed from: z */
        public static C1497er m4397z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1497er)) ? new C1499a(iBinder) : (C1497er) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                        boolean isValidPurchase = isValidPurchase(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isValidPurchase ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                        mo15247a(C1494eq.C1495a.m4395y(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15247a(C1494eq eqVar) throws RemoteException;

    boolean isValidPurchase(String str) throws RemoteException;
}
