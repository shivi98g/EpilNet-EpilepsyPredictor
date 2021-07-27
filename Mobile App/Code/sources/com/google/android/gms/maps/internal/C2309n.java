package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C2374l;

/* renamed from: com.google.android.gms.maps.internal.n */
public interface C2309n extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.n$a */
    public static abstract class C2310a extends Binder implements C2309n {

        /* renamed from: com.google.android.gms.maps.internal.n$a$a */
        private static class C2311a implements C2309n {

            /* renamed from: le */
            private IBinder f4325le;

            C2311a(IBinder iBinder) {
                this.f4325le = iBinder;
            }

            /* renamed from: a */
            public boolean mo17298a(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    boolean z = false;
                    this.f4325le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4325le;
            }
        }

        public C2310a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }

        /* renamed from: bh */
        public static C2309n m6769bh(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2309n)) ? new C2311a(iBinder) : (C2309n) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                boolean a = mo17298a(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo17298a(C2374l lVar) throws RemoteException;
}
