package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.internal.C2359g;

/* renamed from: com.google.android.gms.maps.internal.c */
public interface C2276c extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.c$a */
    public static abstract class C2277a extends Binder implements C2276c {

        /* renamed from: com.google.android.gms.maps.internal.c$a$a */
        private static class C2278a implements C2276c {

            /* renamed from: le */
            private IBinder f4314le;

            C2278a(IBinder iBinder) {
                this.f4314le = iBinder;
            }

            /* renamed from: a */
            public IMapViewDelegate mo17713a(C0967d dVar, GoogleMapOptions googleMapOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4314le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return IMapViewDelegate.C2259a.m6715aY(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public IStreetViewPanoramaViewDelegate mo17714a(C0967d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (streetViewPanoramaOptions != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4314le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return IStreetViewPanoramaViewDelegate.C2267a.m6719bt(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo17715a(C0967d dVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f4314le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4314le;
            }

            /* renamed from: i */
            public void mo17716i(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4314le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public IMapFragmentDelegate mo17717j(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4314le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return IMapFragmentDelegate.C2257a.m6714aX(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public IStreetViewPanoramaFragmentDelegate mo17718k(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4314le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return IStreetViewPanoramaFragmentDelegate.C2265a.m6718bs(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nW */
            public ICameraUpdateFactoryDelegate mo17719nW() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f4314le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return ICameraUpdateFactoryDelegate.C2251a.m6711aQ(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: nX */
            public C2359g mo17720nX() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f4314le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C2359g.C2360a.m6863bv(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: aS */
        public static C2276c m6733aS(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2276c)) ? new C2278a(iBinder) : (C2276c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        mo17716i(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        IMapFragmentDelegate j = mo17717j(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (j != null) {
                            iBinder = j.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        IMapViewDelegate a = mo17713a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (a != null) {
                            iBinder = a.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        ICameraUpdateFactoryDelegate nW = mo17719nW();
                        parcel2.writeNoException();
                        if (nW != null) {
                            iBinder = nW.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        C2359g nX = mo17720nX();
                        parcel2.writeNoException();
                        if (nX != null) {
                            iBinder = nX.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        mo17715a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        IStreetViewPanoramaViewDelegate a2 = mo17714a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt() != 0 ? StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (a2 != null) {
                            iBinder = a2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                        IStreetViewPanoramaFragmentDelegate k = mo17718k(C0967d.C0968a.m1611ap(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (k != null) {
                            iBinder = k.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            }
        }
    }

    /* renamed from: a */
    IMapViewDelegate mo17713a(C0967d dVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    /* renamed from: a */
    IStreetViewPanoramaViewDelegate mo17714a(C0967d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    /* renamed from: a */
    void mo17715a(C0967d dVar, int i) throws RemoteException;

    /* renamed from: i */
    void mo17716i(C0967d dVar) throws RemoteException;

    /* renamed from: j */
    IMapFragmentDelegate mo17717j(C0967d dVar) throws RemoteException;

    /* renamed from: k */
    IStreetViewPanoramaFragmentDelegate mo17718k(C0967d dVar) throws RemoteException;

    /* renamed from: nW */
    ICameraUpdateFactoryDelegate mo17719nW() throws RemoteException;

    /* renamed from: nX */
    C2359g mo17720nX() throws RemoteException;
}
