package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.model.internal.C2374l;

/* renamed from: com.google.android.gms.maps.internal.d */
public interface C2279d extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.d$a */
    public static abstract class C2280a extends Binder implements C2279d {

        /* renamed from: com.google.android.gms.maps.internal.d$a$a */
        private static class C2281a implements C2279d {

            /* renamed from: le */
            private IBinder f4315le;

            C2281a(IBinder iBinder) {
                this.f4315le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4315le;
            }

            /* renamed from: f */
            public C0967d mo17303f(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4315le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public C0967d mo17304g(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f4315le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2280a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        /* renamed from: aU */
        public static C2279d m6744aU(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2279d)) ? new C2281a(iBinder) : (C2279d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                        C0967d f = mo17303f(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (f != null) {
                            iBinder = f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                        C0967d g = mo17304g(C2374l.C2375a.m6892bA(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;
            }
        }
    }

    /* renamed from: f */
    C0967d mo17303f(C2374l lVar) throws RemoteException;

    /* renamed from: g */
    C0967d mo17304g(C2374l lVar) throws RemoteException;
}
