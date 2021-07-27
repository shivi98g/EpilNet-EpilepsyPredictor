package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.oj */
public interface C2031oj extends IInterface {

    /* renamed from: com.google.android.gms.internal.oj$a */
    public static abstract class C2032a extends Binder implements C2031oj {

        /* renamed from: com.google.android.gms.internal.oj$a$a */
        private static class C2033a implements C2031oj {

            /* renamed from: le */
            private IBinder f4163le;

            C2033a(IBinder iBinder) {
                this.f4163le = iBinder;
            }

            /* renamed from: a */
            public void mo16480a(int i, Bundle bundle, int i2, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4163le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4163le;
            }
        }

        public C2032a() {
            attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
        }

        /* renamed from: bF */
        public static C2031oj m6019bF(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2031oj)) ? new C2033a(iBinder) : (C2031oj) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                int readInt = parcel.readInt();
                Intent intent = null;
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                mo16480a(readInt, bundle, readInt2, intent);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16480a(int i, Bundle bundle, int i2, Intent intent) throws RemoteException;
}
