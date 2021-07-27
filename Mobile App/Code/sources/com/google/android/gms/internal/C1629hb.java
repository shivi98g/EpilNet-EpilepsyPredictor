package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.hb */
public interface C1629hb extends IInterface {

    /* renamed from: com.google.android.gms.internal.hb$a */
    public static abstract class C1630a extends Binder implements C1629hb {

        /* renamed from: com.google.android.gms.internal.hb$a$a */
        private static class C1631a implements C1629hb {

            /* renamed from: le */
            private IBinder f3607le;

            C1631a(IBinder iBinder) {
                this.f3607le = iBinder;
            }

            /* renamed from: a */
            public void mo15503a(Map map, long j, String str, List<C1627ha> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    obtain.writeMap(map);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeTypedList(list);
                    this.f3607le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3607le;
            }

            /* renamed from: dQ */
            public void mo15504dQ() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.f3607le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.f3607le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: D */
        public static C1629hb m4785D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1629hb)) ? new C1631a(iBinder) : (C1629hb) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        mo15503a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(C1627ha.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        mo15504dQ();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        String version = getVersion();
                        parcel2.writeNoException();
                        parcel2.writeString(version);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15503a(Map map, long j, String str, List<C1627ha> list) throws RemoteException;

    /* renamed from: dQ */
    void mo15504dQ() throws RemoteException;

    String getVersion() throws RemoteException;
}
