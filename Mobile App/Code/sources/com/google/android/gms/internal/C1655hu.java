package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1643hl;
import com.google.android.gms.internal.C1658hv;

/* renamed from: com.google.android.gms.internal.hu */
public interface C1655hu extends IInterface {

    /* renamed from: com.google.android.gms.internal.hu$a */
    public static abstract class C1656a extends Binder implements C1655hu {

        /* renamed from: com.google.android.gms.internal.hu$a$a */
        private static class C1657a implements C1655hu {

            /* renamed from: le */
            private IBinder f3663le;

            C1657a(IBinder iBinder) {
                this.f3663le = iBinder;
            }

            /* renamed from: a */
            public void mo15571a(C1643hl.C1644a aVar, C1658hv hvVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    if (aVar != null) {
                        obtain.writeInt(1);
                        aVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(hvVar != null ? hvVar.asBinder() : null);
                    this.f3663le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15572a(C1658hv hvVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(hvVar != null ? hvVar.asBinder() : null);
                    this.f3663le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15573a(C1658hv hvVar, String str, C1652hr[] hrVarArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(hvVar != null ? hvVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeTypedArray(hrVarArr, 0);
                    this.f3663le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15574a(C1658hv hvVar, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(hvVar != null ? hvVar.asBinder() : null);
                    obtain.writeInt(z ? 1 : 0);
                    this.f3663le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3663le;
            }

            /* renamed from: b */
            public void mo15575b(C1658hv hvVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    obtain.writeStrongBinder(hvVar != null ? hvVar.asBinder() : null);
                    this.f3663le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: E */
        public static C1655hu m4841E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1655hu)) ? new C1657a(iBinder) : (C1655hu) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                        mo15573a(C1658hv.C1659a.m4851F(parcel.readStrongBinder()), parcel.readString(), (C1652hr[]) parcel.createTypedArray(C1652hr.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                        mo15572a(C1658hv.C1659a.m4851F(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                        mo15575b(C1658hv.C1659a.m4851F(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                        mo15574a(C1658hv.C1659a.m4851F(parcel.readStrongBinder()), parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                        mo15571a(parcel.readInt() != 0 ? C1643hl.C1644a.CREATOR.createFromParcel(parcel) : null, C1658hv.C1659a.m4851F(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15571a(C1643hl.C1644a aVar, C1658hv hvVar) throws RemoteException;

    /* renamed from: a */
    void mo15572a(C1658hv hvVar) throws RemoteException;

    /* renamed from: a */
    void mo15573a(C1658hv hvVar, String str, C1652hr[] hrVarArr) throws RemoteException;

    /* renamed from: a */
    void mo15574a(C1658hv hvVar, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo15575b(C1658hv hvVar) throws RemoteException;
}
