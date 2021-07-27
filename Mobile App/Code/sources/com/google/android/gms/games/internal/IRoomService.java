package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p000v4.view.PointerIconCompat;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;

public interface IRoomService extends IInterface {

    public static abstract class Stub extends Binder implements IRoomService {

        private static class Proxy implements IRoomService {

            /* renamed from: le */
            private IBinder f1964le;

            /* renamed from: R */
            public void mo13803R(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1964le.transact(PointerIconCompat.TYPE_TEXT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13804a(IBinder iBinder, IRoomServiceCallbacks iRoomServiceCallbacks) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeStrongBinder(iRoomServiceCallbacks != null ? iRoomServiceCallbacks.asBinder() : null);
                    this.f1964le.transact(1001, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13805a(DataHolder dataHolder, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    this.f1964le.transact(PointerIconCompat.TYPE_CELL, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13806a(byte[] bArr, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1964le.transact(PointerIconCompat.TYPE_VERTICAL_TEXT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13807a(byte[] bArr, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeByteArray(bArr);
                    obtain.writeStringArray(strArr);
                    this.f1964le.transact(PointerIconCompat.TYPE_ALIAS, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1964le;
            }

            /* renamed from: bQ */
            public void mo13808bQ(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeString(str);
                    this.f1964le.transact(PointerIconCompat.TYPE_ALL_SCROLL, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bR */
            public void mo13809bR(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeString(str);
                    this.f1964le.transact(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13810c(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f1964le.transact(PointerIconCompat.TYPE_WAIT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lN */
            public void mo13811lN() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    this.f1964le.transact(1002, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lO */
            public void mo13812lO() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    this.f1964le.transact(PointerIconCompat.TYPE_HELP, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lP */
            public void mo13813lP() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    this.f1964le.transact(1005, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lQ */
            public void mo13814lQ() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    this.f1964le.transact(PointerIconCompat.TYPE_CROSSHAIR, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo13815v(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1964le.transact(PointerIconCompat.TYPE_COPY, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo13816w(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1964le.transact(PointerIconCompat.TYPE_NO_DROP, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IRoomService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1001:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13804a(parcel.readStrongBinder(), IRoomServiceCallbacks.Stub.m3182aH(parcel.readStrongBinder()));
                        return true;
                    case 1002:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13811lN();
                        return true;
                    case PointerIconCompat.TYPE_HELP:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13812lO();
                        return true;
                    case PointerIconCompat.TYPE_WAIT:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13810c(parcel.readString(), parcel.readString(), parcel.readString());
                        return true;
                    case 1005:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13813lP();
                        return true;
                    case PointerIconCompat.TYPE_CELL:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        DataHolder B = parcel.readInt() != 0 ? DataHolder.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo13805a(B, z);
                        return true;
                    case PointerIconCompat.TYPE_CROSSHAIR:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13814lQ();
                        return true;
                    case PointerIconCompat.TYPE_TEXT:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo13803R(z);
                        return true;
                    case PointerIconCompat.TYPE_VERTICAL_TEXT:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13806a(parcel.createByteArray(), parcel.readString(), parcel.readInt());
                        return true;
                    case PointerIconCompat.TYPE_ALIAS:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13807a(parcel.createByteArray(), parcel.createStringArray());
                        return true;
                    case PointerIconCompat.TYPE_COPY:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13815v(parcel.readString(), parcel.readInt());
                        return true;
                    case PointerIconCompat.TYPE_NO_DROP:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13816w(parcel.readString(), parcel.readInt());
                        return true;
                    case PointerIconCompat.TYPE_ALL_SCROLL:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13808bQ(parcel.readString());
                        return true;
                    case PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW:
                        parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                        mo13809bR(parcel.readString());
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.games.internal.IRoomService");
                return true;
            }
        }
    }

    /* renamed from: R */
    void mo13803R(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13804a(IBinder iBinder, IRoomServiceCallbacks iRoomServiceCallbacks) throws RemoteException;

    /* renamed from: a */
    void mo13805a(DataHolder dataHolder, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo13806a(byte[] bArr, String str, int i) throws RemoteException;

    /* renamed from: a */
    void mo13807a(byte[] bArr, String[] strArr) throws RemoteException;

    /* renamed from: bQ */
    void mo13808bQ(String str) throws RemoteException;

    /* renamed from: bR */
    void mo13809bR(String str) throws RemoteException;

    /* renamed from: c */
    void mo13810c(String str, String str2, String str3) throws RemoteException;

    /* renamed from: lN */
    void mo13811lN() throws RemoteException;

    /* renamed from: lO */
    void mo13812lO() throws RemoteException;

    /* renamed from: lP */
    void mo13813lP() throws RemoteException;

    /* renamed from: lQ */
    void mo13814lQ() throws RemoteException;

    /* renamed from: v */
    void mo13815v(String str, int i) throws RemoteException;

    /* renamed from: w */
    void mo13816w(String str, int i) throws RemoteException;
}
