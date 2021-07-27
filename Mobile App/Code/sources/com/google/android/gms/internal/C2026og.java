package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.internal.og */
public interface C2026og extends IInterface {

    /* renamed from: com.google.android.gms.internal.og$a */
    public static abstract class C2027a extends Binder implements C2026og {

        /* renamed from: com.google.android.gms.internal.og$a$a */
        private static class C2028a implements C2026og {

            /* renamed from: le */
            private IBinder f4162le;

            C2028a(IBinder iBinder) {
                this.f4162le = iBinder;
            }

            /* renamed from: X */
            public void mo16465X(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4162le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Y */
            public void mo16466Y(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4162le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Z */
            public void mo16467Z(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4162le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4162le;
            }
        }

        /* renamed from: aP */
        public static C2026og m6011aP(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2026og)) ? new C2028a(iBinder) : (C2026og) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                DataHolder dataHolder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                        if (parcel.readInt() != 0) {
                            dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                        }
                        mo16465X(dataHolder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                        if (parcel.readInt() != 0) {
                            dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                        }
                        mo16466Y(dataHolder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                        if (parcel.readInt() != 0) {
                            dataHolder = DataHolder.CREATOR.createFromParcel(parcel);
                        }
                        mo16467Z(dataHolder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                return true;
            }
        }
    }

    /* renamed from: X */
    void mo16465X(DataHolder dataHolder) throws RemoteException;

    /* renamed from: Y */
    void mo16466Y(DataHolder dataHolder) throws RemoteException;

    /* renamed from: Z */
    void mo16467Z(DataHolder dataHolder) throws RemoteException;
}
