package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

/* renamed from: com.google.android.gms.maps.internal.u */
public interface C2330u extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.u$a */
    public static abstract class C2331a extends Binder implements C2330u {

        /* renamed from: com.google.android.gms.maps.internal.u$a$a */
        private static class C2332a implements C2330u {

            /* renamed from: le */
            private IBinder f4332le;

            C2332a(IBinder iBinder) {
                this.f4332le = iBinder;
            }

            /* renamed from: a */
            public void mo17455a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    obtain.writeStrongBinder(iStreetViewPanoramaDelegate != null ? iStreetViewPanoramaDelegate.asBinder() : null);
                    this.f4332le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4332le;
            }
        }

        public C2331a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        /* renamed from: bo */
        public static C2330u m6788bo(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2330u)) ? new C2332a(iBinder) : (C2330u) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                mo17455a(IStreetViewPanoramaDelegate.C2263a.m6717br(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo17455a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException;
}
