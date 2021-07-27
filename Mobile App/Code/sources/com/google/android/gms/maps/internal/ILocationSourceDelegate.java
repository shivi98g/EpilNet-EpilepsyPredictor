package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.C2294i;

public interface ILocationSourceDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.ILocationSourceDelegate$a */
    public static abstract class C2255a extends Binder implements ILocationSourceDelegate {

        /* renamed from: com.google.android.gms.maps.internal.ILocationSourceDelegate$a$a */
        private static class C2256a implements ILocationSourceDelegate {

            /* renamed from: le */
            private IBinder f4305le;

            C2256a(IBinder iBinder) {
                this.f4305le = iBinder;
            }

            public void activate(C2294i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f4305le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4305le;
            }

            public void deactivate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    this.f4305le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2255a() {
            attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        /* renamed from: aW */
        public static ILocationSourceDelegate m6713aW(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ILocationSourceDelegate)) ? new C2256a(iBinder) : (ILocationSourceDelegate) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                        activate(C2294i.C2295a.m6759bc(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                        deactivate();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                return true;
            }
        }
    }

    void activate(C2294i iVar) throws RemoteException;

    void deactivate() throws RemoteException;
}
