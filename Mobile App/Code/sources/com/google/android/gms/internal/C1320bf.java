package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.bf */
public interface C1320bf extends IInterface {

    /* renamed from: com.google.android.gms.internal.bf$a */
    public static abstract class C1321a extends Binder implements C1320bf {

        /* renamed from: com.google.android.gms.internal.bf$a$a */
        private static class C1322a implements C1320bf {

            /* renamed from: le */
            private IBinder f2618le;

            C1322a(IBinder iBinder) {
                this.f2618le = iBinder;
            }

            public IBinder asBinder() {
                return this.f2618le;
            }

            public void onAppEvent(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2618le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1321a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
        }

        /* renamed from: h */
        public static C1320bf m3982h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1320bf)) ? new C1322a(iBinder) : (C1320bf) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                onAppEvent(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
                return true;
            }
        }
    }

    void onAppEvent(String str, String str2) throws RemoteException;
}
