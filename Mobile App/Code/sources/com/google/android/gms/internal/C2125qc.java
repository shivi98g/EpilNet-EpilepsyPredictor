package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C2131qe;
import com.google.android.gms.internal.C2134qf;
import com.google.android.gms.wallet.C2649d;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

/* renamed from: com.google.android.gms.internal.qc */
public interface C2125qc extends IInterface {

    /* renamed from: com.google.android.gms.internal.qc$a */
    public static abstract class C2126a extends Binder implements C2125qc {

        /* renamed from: com.google.android.gms.internal.qc$a$a */
        private static class C2127a implements C2125qc {

            /* renamed from: le */
            private IBinder f4214le;

            C2127a(IBinder iBinder) {
                this.f4214le = iBinder;
            }

            /* renamed from: a */
            public void mo16950a(Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16951a(C2114pw pwVar, Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (pwVar != null) {
                        obtain.writeInt(1);
                        pwVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16952a(FullWalletRequest fullWalletRequest, Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (fullWalletRequest != null) {
                        obtain.writeInt(1);
                        fullWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16953a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, C2131qe qeVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qeVar != null ? qeVar.asBinder() : null);
                    this.f4214le.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16954a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (maskedWalletRequest != null) {
                        obtain.writeInt(1);
                        maskedWalletRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16955a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (notifyTransactionStatusRequest != null) {
                        obtain.writeInt(1);
                        notifyTransactionStatusRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4214le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16956a(C2649d dVar, Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16957a(String str, String str2, Bundle bundle, C2134qf qfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(qfVar != null ? qfVar.asBinder() : null);
                    this.f4214le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4214le;
            }

            /* renamed from: r */
            public void mo16958r(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4214le.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo16959s(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4214le.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bR */
        public static C2125qc m6255bR(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2125qc)) ? new C2127a(iBinder) : (C2125qc) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        MaskedWalletRequest createFromParcel = parcel.readInt() != 0 ? MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16954a(createFromParcel, bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        FullWalletRequest createFromParcel2 = parcel.readInt() != 0 ? FullWalletRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16952a(createFromParcel2, bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16957a(readString, readString2, bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        NotifyTransactionStatusRequest createFromParcel3 = parcel.readInt() != 0 ? NotifyTransactionStatusRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16955a(createFromParcel3, bundle);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16950a(bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        C2649d createFromParcel4 = parcel.readInt() != 0 ? C2649d.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16956a(createFromParcel4, bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        MaskedWalletRequest createFromParcel5 = parcel.readInt() != 0 ? MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16953a(createFromParcel5, bundle, C2131qe.C2132a.m6270bT(parcel.readStrongBinder()));
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        C2114pw createFromParcel6 = parcel.readInt() != 0 ? C2114pw.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16951a(createFromParcel6, bundle, C2134qf.C2135a.m6277bU(parcel.readStrongBinder()));
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16958r(bundle);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo16959s(bundle);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16950a(Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: a */
    void mo16951a(C2114pw pwVar, Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: a */
    void mo16952a(FullWalletRequest fullWalletRequest, Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: a */
    void mo16953a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, C2131qe qeVar) throws RemoteException;

    /* renamed from: a */
    void mo16954a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: a */
    void mo16955a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo16956a(C2649d dVar, Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: a */
    void mo16957a(String str, String str2, Bundle bundle, C2134qf qfVar) throws RemoteException;

    /* renamed from: r */
    void mo16958r(Bundle bundle) throws RemoteException;

    /* renamed from: s */
    void mo16959s(Bundle bundle) throws RemoteException;
}
