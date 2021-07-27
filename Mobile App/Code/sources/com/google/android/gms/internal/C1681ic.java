package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.FitnessStatusCodes;

/* renamed from: com.google.android.gms.internal.ic */
public interface C1681ic extends IInterface {

    /* renamed from: com.google.android.gms.internal.ic$a */
    public static abstract class C1682a extends Binder implements C1681ic {

        /* renamed from: com.google.android.gms.internal.ic$a$a */
        private static class C1683a implements C1681ic {

            /* renamed from: le */
            private IBinder f3697le;

            C1683a(IBinder iBinder) {
                this.f3697le = iBinder;
            }

            /* renamed from: T */
            public void mo15591T(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    this.f3697le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15592a(int i, DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3697le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15593a(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3697le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3697le;
            }

            /* renamed from: e */
            public void mo15594e(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f3697le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: fK */
            public void mo15595fK() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.f3697le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1682a() {
            attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
        }

        /* renamed from: I */
        public static C1681ic m4925I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1681ic)) ? new C1683a(iBinder) : (C1681ic) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                DataHolder dataHolder = null;
                switch (i) {
                    case FitnessStatusCodes.CONFLICTING_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                        }
                        mo15592a(readInt, dataHolder);
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.INCONSISTENT_DATA_TYPE:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                        if (parcel.readInt() != 0) {
                            dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                        }
                        mo15593a(dataHolder);
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.DATA_TYPE_NOT_FOUND:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                        mo15594e(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.APP_MISMATCH:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                        mo15595fK();
                        parcel2.writeNoException();
                        return true;
                    case FitnessStatusCodes.UNKNOWN_AUTH_ERROR:
                        parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                        mo15591T(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;
            }
        }
    }

    /* renamed from: T */
    void mo15591T(int i) throws RemoteException;

    /* renamed from: a */
    void mo15592a(int i, DataHolder dataHolder) throws RemoteException;

    /* renamed from: a */
    void mo15593a(DataHolder dataHolder) throws RemoteException;

    /* renamed from: e */
    void mo15594e(int i, int i2) throws RemoteException;

    /* renamed from: fK */
    void mo15595fK() throws RemoteException;
}
