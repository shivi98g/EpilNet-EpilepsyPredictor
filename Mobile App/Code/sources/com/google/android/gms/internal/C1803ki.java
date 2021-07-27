package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1800kh;

/* renamed from: com.google.android.gms.internal.ki */
public interface C1803ki extends IInterface {

    /* renamed from: com.google.android.gms.internal.ki$a */
    public static abstract class C1804a extends Binder implements C1803ki {

        /* renamed from: com.google.android.gms.internal.ki$a$a */
        private static class C1805a implements C1803ki {

            /* renamed from: le */
            private IBinder f3960le;

            C1805a(IBinder iBinder) {
                this.f3960le = iBinder;
            }

            /* renamed from: a */
            public void mo15957a(C1800kh khVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
                    obtain.writeStrongBinder(khVar != null ? khVar.asBinder() : null);
                    this.f3960le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3960le;
            }
        }

        /* renamed from: V */
        public static C1803ki m5402V(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1803ki)) ? new C1805a(iBinder) : (C1803ki) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                mo15957a(C1800kh.C1801a.m5399U(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo15957a(C1800kh khVar) throws RemoteException;
}
