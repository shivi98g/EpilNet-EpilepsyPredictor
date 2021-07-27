package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0964c;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.internal.C2119qa;
import com.google.android.gms.internal.C2122qb;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: com.google.android.gms.internal.qd */
public interface C2128qd extends IInterface {

    /* renamed from: com.google.android.gms.internal.qd$a */
    public static abstract class C2129a extends Binder implements C2128qd {

        /* renamed from: com.google.android.gms.internal.qd$a$a */
        private static class C2130a implements C2128qd {

            /* renamed from: le */
            private IBinder f4215le;

            C2130a(IBinder iBinder) {
                this.f4215le = iBinder;
            }

            /* renamed from: a */
            public C2119qa mo16962a(C0967d dVar, C0964c cVar, WalletFragmentOptions walletFragmentOptions, C2122qb qbVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (walletFragmentOptions != null) {
                        obtain.writeInt(1);
                        walletFragmentOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (qbVar != null) {
                        iBinder = qbVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4215le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2119qa.C2120a.m6240bP(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4215le;
            }
        }

        /* renamed from: bS */
        public static C2128qd m6267bS(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2128qd)) ? new C2130a(iBinder) : (C2128qd) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                IBinder iBinder = null;
                C2119qa a = mo16962a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), C0964c.C0965a.m1604ao(parcel.readStrongBinder()), parcel.readInt() != 0 ? WalletFragmentOptions.CREATOR.createFromParcel(parcel) : null, C2122qb.C2123a.m6243bQ(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                return true;
            }
        }
    }

    /* renamed from: a */
    C2119qa mo16962a(C0967d dVar, C0964c cVar, WalletFragmentOptions walletFragmentOptions, C2122qb qbVar) throws RemoteException;
}
