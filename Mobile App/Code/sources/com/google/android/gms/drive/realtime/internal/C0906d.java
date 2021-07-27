package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.drive.realtime.internal.d */
public interface C0906d extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.d$a */
    public static abstract class C0907a extends Binder implements C0906d {

        /* renamed from: com.google.android.gms.drive.realtime.internal.d$a$a */
        private static class C0908a implements C0906d {

            /* renamed from: le */
            private IBinder f1228le;

            C0908a(IBinder iBinder) {
                this.f1228le = iBinder;
            }

            /* renamed from: a */
            public void mo11955a(ParcelableCollaborator parcelableCollaborator) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcelableCollaborator != null) {
                        obtain.writeInt(1);
                        parcelableCollaborator.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1228le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1228le;
            }

            /* renamed from: b */
            public void mo11956b(ParcelableCollaborator parcelableCollaborator) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (parcelableCollaborator != null) {
                        obtain.writeInt(1);
                        parcelableCollaborator.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1228le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ac */
        public static C0906d m1407ac(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0906d)) ? new C0908a(iBinder) : (C0906d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                ParcelableCollaborator parcelableCollaborator = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                        if (parcel.readInt() != 0) {
                            parcelableCollaborator = ParcelableCollaborator.CREATOR.createFromParcel(parcel);
                        }
                        mo11955a(parcelableCollaborator);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                        if (parcel.readInt() != 0) {
                            parcelableCollaborator = ParcelableCollaborator.CREATOR.createFromParcel(parcel);
                        }
                        mo11956b(parcelableCollaborator);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo11955a(ParcelableCollaborator parcelableCollaborator) throws RemoteException;

    /* renamed from: b */
    void mo11956b(ParcelableCollaborator parcelableCollaborator) throws RemoteException;
}
