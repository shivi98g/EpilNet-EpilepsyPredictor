package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: com.google.android.gms.internal.iq */
public interface C1709iq extends IInterface {

    /* renamed from: com.google.android.gms.internal.iq$a */
    public static abstract class C1710a extends Binder implements C1709iq {

        /* renamed from: com.google.android.gms.internal.iq$a$a */
        private static class C1711a implements C1709iq {

            /* renamed from: le */
            private IBinder f3805le;

            C1711a(IBinder iBinder) {
                this.f3805le = iBinder;
            }

            /* renamed from: a */
            public void mo15697a(double d, double d2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeDouble(d);
                    obtain.writeDouble(d2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f3805le.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15698a(String str, LaunchOptions launchOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    if (launchOptions != null) {
                        obtain.writeInt(1);
                        launchOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3805le.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15699a(String str, String str2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    this.f3805le.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15700a(String str, byte[] bArr, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    this.f3805le.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15701a(boolean z, double d, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeDouble(d);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f3805le.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: aH */
            public void mo15702aH(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f3805le.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: aI */
            public void mo15703aI(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f3805le.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: aJ */
            public void mo15704aJ(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    this.f3805le.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3805le;
            }

            public void disconnect() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f3805le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: fY */
            public void mo15706fY() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f3805le.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo15707g(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f3805le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: gl */
            public void mo15708gl() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.f3805le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo15709k(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f3805le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: M */
        public static C1709iq m5056M(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1709iq)) ? new C1711a(iBinder) : (C1709iq) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        disconnect();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo15707g(readString, z);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15709k(parcel.readString(), parcel.readString());
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15708gl();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15702aH(parcel.readString());
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15706fY();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15697a(parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        boolean z2 = parcel.readInt() != 0;
                        double readDouble = parcel.readDouble();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo15701a(z2, readDouble, z);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15699a(parcel.readString(), parcel.readString(), parcel.readLong());
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15700a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15703aI(parcel.readString());
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15704aJ(parcel.readString());
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                        mo15698a(parcel.readString(), parcel.readInt() != 0 ? LaunchOptions.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15697a(double d, double d2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo15698a(String str, LaunchOptions launchOptions) throws RemoteException;

    /* renamed from: a */
    void mo15699a(String str, String str2, long j) throws RemoteException;

    /* renamed from: a */
    void mo15700a(String str, byte[] bArr, long j) throws RemoteException;

    /* renamed from: a */
    void mo15701a(boolean z, double d, boolean z2) throws RemoteException;

    /* renamed from: aH */
    void mo15702aH(String str) throws RemoteException;

    /* renamed from: aI */
    void mo15703aI(String str) throws RemoteException;

    /* renamed from: aJ */
    void mo15704aJ(String str) throws RemoteException;

    void disconnect() throws RemoteException;

    /* renamed from: fY */
    void mo15706fY() throws RemoteException;

    /* renamed from: g */
    void mo15707g(String str, boolean z) throws RemoteException;

    /* renamed from: gl */
    void mo15708gl() throws RemoteException;

    /* renamed from: k */
    void mo15709k(String str, String str2) throws RemoteException;
}
