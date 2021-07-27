package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: com.google.android.gms.internal.qa */
public interface C2119qa extends IInterface {

    /* renamed from: com.google.android.gms.internal.qa$a */
    public static abstract class C2120a extends Binder implements C2119qa {

        /* renamed from: com.google.android.gms.internal.qa$a$a */
        private static class C2121a implements C2119qa {

            /* renamed from: le */
            private IBinder f4212le;

            C2121a(IBinder iBinder) {
                this.f4212le = iBinder;
            }

            /* renamed from: a */
            public void mo16930a(C0967d dVar, WalletFragmentOptions walletFragmentOptions, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (walletFragmentOptions != null) {
                        obtain.writeInt(1);
                        walletFragmentOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4212le;
            }

            public int getState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.f4212le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void initialize(WalletFragmentInitParams walletFragmentInitParams) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if (walletFragmentInitParams != null) {
                        obtain.writeInt(1);
                        walletFragmentInitParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0967d onCreateView(C0967d dVar, C0967d dVar2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (dVar2 != null) {
                        iBinder = dVar2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.f4212le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.f4212le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSaveInstanceState(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onStart() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.f4212le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onStop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.f4212le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4212le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void updateMaskedWallet(MaskedWallet maskedWallet) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if (maskedWallet != null) {
                        obtain.writeInt(1);
                        maskedWallet.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4212le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bP */
        public static C2119qa m6240bP(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2119qa)) ? new C2121a(iBinder) : (C2119qa) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.google.android.gms.wallet.fragment.WalletFragmentInitParams} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.gms.wallet.MaskedWalletRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: com.google.android.gms.wallet.MaskedWallet} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v8, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v14, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r2v29 */
        /* JADX WARNING: type inference failed for: r2v30 */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: type inference failed for: r2v32 */
        /* JADX WARNING: type inference failed for: r2v33 */
        /* JADX WARNING: type inference failed for: r2v34 */
        /* JADX WARNING: type inference failed for: r2v35 */
        /* JADX WARNING: type inference failed for: r2v36 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x017f
                r0 = 0
                r2 = 0
                switch(r6) {
                    case 1: goto L_0x014d;
                    case 2: goto L_0x0132;
                    case 3: goto L_0x00fc;
                    case 4: goto L_0x00f0;
                    case 5: goto L_0x00e4;
                    case 6: goto L_0x00d8;
                    case 7: goto L_0x00cc;
                    case 8: goto L_0x00a6;
                    case 9: goto L_0x0084;
                    case 10: goto L_0x0069;
                    case 11: goto L_0x004e;
                    case 12: goto L_0x003b;
                    case 13: goto L_0x002b;
                    case 14: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x0010:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0024
                android.os.Parcelable$Creator<com.google.android.gms.wallet.MaskedWallet> r0 = com.google.android.gms.wallet.MaskedWallet.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.wallet.MaskedWallet r2 = (com.google.android.gms.wallet.MaskedWallet) r2
            L_0x0024:
                r5.updateMaskedWallet(r2)
                r8.writeNoException()
                return r1
            L_0x002b:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r5.getState()
                r8.writeNoException()
                r8.writeInt(r0)
                return r1
            L_0x003b:
                java.lang.String r2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0047
                r0 = r1
            L_0x0047:
                r5.setEnabled(r0)
                r8.writeNoException()
                return r1
            L_0x004e:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0062
                android.os.Parcelable$Creator<com.google.android.gms.wallet.MaskedWalletRequest> r0 = com.google.android.gms.wallet.MaskedWalletRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.wallet.MaskedWalletRequest r2 = (com.google.android.gms.wallet.MaskedWalletRequest) r2
            L_0x0062:
                r5.updateMaskedWalletRequest(r2)
                r8.writeNoException()
                return r1
            L_0x0069:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x007d
                android.os.Parcelable$Creator<com.google.android.gms.wallet.fragment.WalletFragmentInitParams> r0 = com.google.android.gms.wallet.fragment.WalletFragmentInitParams.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.wallet.fragment.WalletFragmentInitParams r2 = (com.google.android.gms.wallet.fragment.WalletFragmentInitParams) r2
            L_0x007d:
                r5.initialize(r2)
                r8.writeNoException()
                return r1
            L_0x0084:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                int r3 = r7.readInt()
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x009f
                android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x009f:
                r5.onActivityResult(r0, r3, r2)
                r8.writeNoException()
                return r1
            L_0x00a6:
                java.lang.String r3 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x00b9
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00b9:
                r5.onSaveInstanceState(r2)
                r8.writeNoException()
                if (r2 == 0) goto L_0x00c8
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x00c8:
                r8.writeInt(r0)
                return r1
            L_0x00cc:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onStop()
                r8.writeNoException()
                return r1
            L_0x00d8:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onPause()
                r8.writeNoException()
                return r1
            L_0x00e4:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onResume()
                r8.writeNoException()
                return r1
            L_0x00f0:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                r5.onStart()
                r8.writeNoException()
                return r1
            L_0x00fc:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                android.os.IBinder r3 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r3 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r3)
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x0120
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r7)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L_0x0121
            L_0x0120:
                r4 = r2
            L_0x0121:
                com.google.android.gms.dynamic.d r0 = r5.onCreateView(r0, r3, r4)
                r8.writeNoException()
                if (r0 == 0) goto L_0x012e
                android.os.IBinder r2 = r0.asBinder()
            L_0x012e:
                r8.writeStrongBinder(r2)
                return r1
            L_0x0132:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0146
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0146:
                r5.onCreate(r2)
                r8.writeNoException()
                return r1
            L_0x014d:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0169
                android.os.Parcelable$Creator<com.google.android.gms.wallet.fragment.WalletFragmentOptions> r3 = com.google.android.gms.wallet.fragment.WalletFragmentOptions.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r7)
                com.google.android.gms.wallet.fragment.WalletFragmentOptions r3 = (com.google.android.gms.wallet.fragment.WalletFragmentOptions) r3
                goto L_0x016a
            L_0x0169:
                r3 = r2
            L_0x016a:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x0178
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0178:
                r5.mo16930a(r0, r3, r2)
                r8.writeNoException()
                return r1
            L_0x017f:
                java.lang.String r0 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2119qa.C2120a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo16930a(C0967d dVar, WalletFragmentOptions walletFragmentOptions, Bundle bundle) throws RemoteException;

    int getState() throws RemoteException;

    void initialize(WalletFragmentInitParams walletFragmentInitParams) throws RemoteException;

    void onActivityResult(int i, int i2, Intent intent) throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    C0967d onCreateView(C0967d dVar, C0967d dVar2, Bundle bundle) throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void setEnabled(boolean z) throws RemoteException;

    void updateMaskedWallet(MaskedWallet maskedWallet) throws RemoteException;

    void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) throws RemoteException;
}
