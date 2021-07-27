package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IUiSettingsDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.IUiSettingsDelegate$a */
    public static abstract class C2269a extends Binder implements IUiSettingsDelegate {

        /* renamed from: com.google.android.gms.maps.internal.IUiSettingsDelegate$a$a */
        private static class C2270a implements IUiSettingsDelegate {

            /* renamed from: le */
            private IBinder f4312le;

            C2270a(IBinder iBinder) {
                this.f4312le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4312le;
            }

            public boolean isCompassEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(10, obtain, obtain2, 0);
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

            public boolean isIndoorLevelPickerEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(17, obtain, obtain2, 0);
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

            public boolean isMapToolbarEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(19, obtain, obtain2, 0);
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

            public boolean isMyLocationButtonEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(11, obtain, obtain2, 0);
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

            public boolean isRotateGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(15, obtain, obtain2, 0);
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

            public boolean isScrollGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(12, obtain, obtain2, 0);
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

            public boolean isTiltGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(14, obtain, obtain2, 0);
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

            public boolean isZoomControlsEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(9, obtain, obtain2, 0);
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

            public boolean isZoomGesturesEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z = false;
                    this.f4312le.transact(13, obtain, obtain2, 0);
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

            public void setAllGesturesEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setCompassEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setIndoorLevelPickerEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMapToolbarEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMyLocationButtonEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setRotateGesturesEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setScrollGesturesEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTiltGesturesEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setZoomControlsEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setZoomGesturesEnabled(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4312le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bu */
        public static IUiSettingsDelegate m6720bu(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUiSettingsDelegate)) ? new C2270a(iBinder) : (IUiSettingsDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setZoomControlsEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setCompassEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setMyLocationButtonEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setScrollGesturesEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setZoomGesturesEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setTiltGesturesEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setRotateGesturesEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setAllGesturesEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isZoomControlsEnabled = isZoomControlsEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isZoomControlsEnabled ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isCompassEnabled = isCompassEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isCompassEnabled ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isMyLocationButtonEnabled = isMyLocationButtonEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isMyLocationButtonEnabled ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isScrollGesturesEnabled = isScrollGesturesEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isScrollGesturesEnabled ? 1 : 0);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isZoomGesturesEnabled = isZoomGesturesEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isZoomGesturesEnabled ? 1 : 0);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isTiltGesturesEnabled = isTiltGesturesEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isTiltGesturesEnabled ? 1 : 0);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isRotateGesturesEnabled = isRotateGesturesEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isRotateGesturesEnabled ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setIndoorLevelPickerEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isIndoorLevelPickerEnabled = isIndoorLevelPickerEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isIndoorLevelPickerEnabled ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setMapToolbarEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                        boolean isMapToolbarEnabled = isMapToolbarEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isMapToolbarEnabled ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            }
        }
    }

    boolean isCompassEnabled() throws RemoteException;

    boolean isIndoorLevelPickerEnabled() throws RemoteException;

    boolean isMapToolbarEnabled() throws RemoteException;

    boolean isMyLocationButtonEnabled() throws RemoteException;

    boolean isRotateGesturesEnabled() throws RemoteException;

    boolean isScrollGesturesEnabled() throws RemoteException;

    boolean isTiltGesturesEnabled() throws RemoteException;

    boolean isZoomControlsEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    void setAllGesturesEnabled(boolean z) throws RemoteException;

    void setCompassEnabled(boolean z) throws RemoteException;

    void setIndoorLevelPickerEnabled(boolean z) throws RemoteException;

    void setMapToolbarEnabled(boolean z) throws RemoteException;

    void setMyLocationButtonEnabled(boolean z) throws RemoteException;

    void setRotateGesturesEnabled(boolean z) throws RemoteException;

    void setScrollGesturesEnabled(boolean z) throws RemoteException;

    void setTiltGesturesEnabled(boolean z) throws RemoteException;

    void setZoomControlsEnabled(boolean z) throws RemoteException;

    void setZoomGesturesEnabled(boolean z) throws RemoteException;
}
