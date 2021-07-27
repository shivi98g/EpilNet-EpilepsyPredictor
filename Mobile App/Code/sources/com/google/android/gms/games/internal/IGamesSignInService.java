package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;

public interface IGamesSignInService extends IInterface {

    public static abstract class Stub extends Binder implements IGamesSignInService {

        private static class Proxy implements IGamesSignInService {

            /* renamed from: le */
            private IBinder f1963le;

            /* renamed from: a */
            public void mo13790a(IGamesSignInCallbacks iGamesSignInCallbacks, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f1963le.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13791a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1963le.transact(FitnessStatusCodes.MISSING_BLE_PERMISSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13792a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f1963le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13793a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStringArray(strArr);
                    this.f1963le.transact(FitnessStatusCodes.TRANSIENT_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13794a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f1963le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13795a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String[] strArr, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    this.f1963le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1963le;
            }

            /* renamed from: b */
            public void mo13796b(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeStrongBinder(iGamesSignInCallbacks != null ? iGamesSignInCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f1963le.transact(FitnessStatusCodes.UNSUPPORTED_PLATFORM, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bO */
            public String mo13797bO(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeString(str);
                    this.f1963le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bP */
            public String mo13798bP(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeString(str);
                    this.f1963le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public String mo13799i(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1963le.transact(FitnessStatusCodes.EQUIVALENT_SESSION_ENDED, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo13800v(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f1963le.transact(9001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesSignInService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 9001) {
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                mo13800v(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 14001) {
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                mo13790a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                switch (i) {
                    case FitnessStatusCodes.CONFLICTING_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        String bO = mo13797bO(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(bO);
                        return true;
                    case FitnessStatusCodes.INCONSISTENT_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        String bP = mo13798bP(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(bP);
                        return true;
                    case FitnessStatusCodes.DATA_TYPE_NOT_FOUND:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13795a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.APP_MISMATCH:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13794a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.UNKNOWN_AUTH_ERROR:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13792a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.MISSING_BLE_PERMISSION:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13791a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.UNSUPPORTED_PLATFORM:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13796b(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.TRANSIENT_ERROR:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        mo13793a(IGamesSignInCallbacks.Stub.m3100aF(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.EQUIVALENT_SESSION_ENDED:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
                        String i3 = mo13799i(parcel.readString(), parcel.readInt() != 0);
                        parcel2.writeNoException();
                        parcel2.writeString(i3);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.games.internal.IGamesSignInService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo13790a(IGamesSignInCallbacks iGamesSignInCallbacks, String str) throws RemoteException;

    /* renamed from: a */
    void mo13791a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo13792a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3) throws RemoteException;

    /* renamed from: a */
    void mo13793a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13794a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo13795a(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String[] strArr, String str3) throws RemoteException;

    /* renamed from: b */
    void mo13796b(IGamesSignInCallbacks iGamesSignInCallbacks, String str, String str2, String str3) throws RemoteException;

    /* renamed from: bO */
    String mo13797bO(String str) throws RemoteException;

    /* renamed from: bP */
    String mo13798bP(String str) throws RemoteException;

    /* renamed from: i */
    String mo13799i(String str, boolean z) throws RemoteException;

    /* renamed from: v */
    void mo13800v(String str, String str2) throws RemoteException;
}
