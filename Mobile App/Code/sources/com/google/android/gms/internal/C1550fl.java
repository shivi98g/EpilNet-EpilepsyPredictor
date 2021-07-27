package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.fl */
public interface C1550fl extends IInterface {

    /* renamed from: com.google.android.gms.internal.fl$a */
    public static abstract class C1551a extends Binder implements C1550fl {

        /* renamed from: com.google.android.gms.internal.fl$a$a */
        private static class C1552a implements C1550fl {

            /* renamed from: le */
            private IBinder f3349le;

            C1552a(IBinder iBinder) {
                this.f3349le = iBinder;
            }

            public IBinder asBinder() {
                return this.f3349le;
            }

            /* renamed from: b */
            public C1548fj mo15301b(C1545fh fhVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (fhVar != null) {
                        obtain.writeInt(1);
                        fhVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3349le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C1548fj.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1551a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        /* renamed from: C */
        public static C1550fl m4493C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1550fl)) ? new C1552a(iBinder) : (C1550fl) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                C1548fj b = mo15301b(parcel.readInt() != 0 ? C1545fh.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (b != null) {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;
            }
        }
    }

    /* renamed from: b */
    C1548fj mo15301b(C1545fh fhVar) throws RemoteException;
}
