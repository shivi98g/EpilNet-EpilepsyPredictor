package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* renamed from: com.google.android.gms.maps.internal.m */
public interface C2306m extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.m$a */
    public static abstract class C2307a extends Binder implements C2306m {

        /* renamed from: com.google.android.gms.maps.internal.m$a$a */
        private static class C2308a implements C2306m {

            /* renamed from: le */
            private IBinder f4324le;

            C2308a(IBinder iBinder) {
                this.f4324le = iBinder;
            }

            /* renamed from: a */
            public void mo17393a(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    obtain.writeStrongBinder(iGoogleMapDelegate != null ? iGoogleMapDelegate.asBinder() : null);
                    this.f4324le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4324le;
            }
        }

        public C2307a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }

        /* renamed from: bg */
        public static C2306m m6766bg(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2306m)) ? new C2308a(iBinder) : (C2306m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                mo17393a(IGoogleMapDelegate.C2253a.m6712aT(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo17393a(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException;
}
