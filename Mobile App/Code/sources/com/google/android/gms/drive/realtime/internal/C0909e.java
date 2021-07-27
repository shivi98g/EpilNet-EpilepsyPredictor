package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.e */
public interface C0909e extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.e$a */
    public static abstract class C0910a extends Binder implements C0909e {

        /* renamed from: com.google.android.gms.drive.realtime.internal.e$a$a */
        private static class C0911a implements C0909e {

            /* renamed from: le */
            private IBinder f1229le;

            C0911a(IBinder iBinder) {
                this.f1229le = iBinder;
            }

            /* renamed from: a */
            public void mo11960a(ParcelableCollaborator[] parcelableCollaboratorArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    obtain.writeTypedArray(parcelableCollaboratorArr, 0);
                    this.f1229le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1229le;
            }

            /* renamed from: n */
            public void mo11961n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1229le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ad */
        public static C0909e m1412ad(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0909e)) ? new C0911a(iBinder) : (C0909e) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                        mo11960a((ParcelableCollaborator[]) parcel.createTypedArray(ParcelableCollaborator.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                        mo11961n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo11960a(ParcelableCollaborator[] parcelableCollaboratorArr) throws RemoteException;

    /* renamed from: n */
    void mo11961n(Status status) throws RemoteException;
}
