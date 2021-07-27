package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1334bq;

/* renamed from: com.google.android.gms.internal.br */
public interface C1337br extends IInterface {

    /* renamed from: com.google.android.gms.internal.br$a */
    public static abstract class C1338a extends Binder implements C1337br {

        /* renamed from: com.google.android.gms.internal.br$a$a */
        private static class C1339a implements C1337br {

            /* renamed from: le */
            private IBinder f2703le;

            C1339a(IBinder iBinder) {
                this.f2703le = iBinder;
            }

            /* renamed from: a */
            public void mo14944a(C1334bq bqVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    obtain.writeStrongBinder(bqVar != null ? bqVar.asBinder() : null);
                    this.f2703le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2703le;
            }
        }

        public C1338a() {
            attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        }

        /* renamed from: j */
        public static C1337br m4052j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1337br)) ? new C1339a(iBinder) : (C1337br) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                mo14944a(C1334bq.C1335a.m4045i(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo14944a(C1334bq bqVar) throws RemoteException;
}
