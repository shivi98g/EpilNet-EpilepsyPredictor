package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C2031oj;

/* renamed from: com.google.android.gms.internal.ok */
public interface C2034ok extends IInterface {

    /* renamed from: com.google.android.gms.internal.ok$a */
    public static abstract class C2035a extends Binder implements C2034ok {

        /* renamed from: com.google.android.gms.internal.ok$a$a */
        private static class C2036a implements C2034ok {

            /* renamed from: le */
            private IBinder f4164le;

            C2036a(IBinder iBinder) {
                this.f4164le = iBinder;
            }

            /* renamed from: a */
            public void mo16484a(C2031oj ojVar, Uri uri, Bundle bundle, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
                    obtain.writeStrongBinder(ojVar != null ? ojVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    this.f4164le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4164le;
            }
        }

        /* renamed from: bG */
        public static C2034ok m6022bG(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2034ok)) ? new C2036a(iBinder) : (C2034ok) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                C2031oj bF = C2031oj.C2032a.m6019bF(parcel.readStrongBinder());
                Bundle bundle = null;
                Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo16484a(bF, uri, bundle, parcel.readInt() != 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16484a(C2031oj ojVar, Uri uri, Bundle bundle, boolean z) throws RemoteException;
}
