package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.internal.C1681ic;

/* renamed from: com.google.android.gms.internal.id */
public interface C1684id extends IInterface {

    /* renamed from: com.google.android.gms.internal.id$a */
    public static abstract class C1685a extends Binder implements C1684id {

        /* renamed from: com.google.android.gms.internal.id$a$a */
        private static class C1686a implements C1684id {

            /* renamed from: le */
            private IBinder f3698le;

            C1686a(IBinder iBinder) {
                this.f3698le = iBinder;
            }

            /* renamed from: a */
            public void mo15608a(C1681ic icVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    this.f3698le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15609a(C1681ic icVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f3698le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15610a(C1681ic icVar, int i, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f3698le.transact(FitnessStatusCodes.MISSING_BLE_PERMISSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15611a(C1681ic icVar, int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    this.f3698le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3698le;
            }

            /* renamed from: b */
            public void mo15612b(C1681ic icVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    this.f3698le.transact(FitnessStatusCodes.TRANSIENT_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo15613b(C1681ic icVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f3698le.transact(FitnessStatusCodes.UNSUPPORTED_PLATFORM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo15614c(C1681ic icVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(icVar != null ? icVar.asBinder() : null);
                    this.f3698le.transact(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fL */
            public int mo15615fL() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.f3698le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fM */
            public int mo15616fM() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.f3698le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: J */
        public static C1684id m4940J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1684id)) ? new C1686a(iBinder) : (C1684id) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case FitnessStatusCodes.CONFLICTING_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        int fL = mo15615fL();
                        parcel2.writeNoException();
                        parcel2.writeInt(fL);
                        return true;
                    case FitnessStatusCodes.INCONSISTENT_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        int fM = mo15616fM();
                        parcel2.writeNoException();
                        parcel2.writeInt(fM);
                        return true;
                    case FitnessStatusCodes.DATA_TYPE_NOT_FOUND:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15611a(C1681ic.C1682a.m4925I(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.APP_MISMATCH:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15609a(C1681ic.C1682a.m4925I(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.UNKNOWN_AUTH_ERROR:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15608a(C1681ic.C1682a.m4925I(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.MISSING_BLE_PERMISSION:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15610a(C1681ic.C1682a.m4925I(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.UNSUPPORTED_PLATFORM:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15613b(C1681ic.C1682a.m4925I(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.TRANSIENT_ERROR:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15612b(C1681ic.C1682a.m4925I(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.EQUIVALENT_SESSION_ENDED:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                        mo15614c(C1681ic.C1682a.m4925I(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15608a(C1681ic icVar) throws RemoteException;

    /* renamed from: a */
    void mo15609a(C1681ic icVar, int i) throws RemoteException;

    /* renamed from: a */
    void mo15610a(C1681ic icVar, int i, String str, byte[] bArr) throws RemoteException;

    /* renamed from: a */
    void mo15611a(C1681ic icVar, int i, byte[] bArr) throws RemoteException;

    /* renamed from: b */
    void mo15612b(C1681ic icVar) throws RemoteException;

    /* renamed from: b */
    void mo15613b(C1681ic icVar, int i) throws RemoteException;

    /* renamed from: c */
    void mo15614c(C1681ic icVar) throws RemoteException;

    /* renamed from: fL */
    int mo15615fL() throws RemoteException;

    /* renamed from: fM */
    int mo15616fM() throws RemoteException;
}
