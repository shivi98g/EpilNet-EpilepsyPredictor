package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.internal.C1402cy;

/* renamed from: com.google.android.gms.internal.be */
public interface C1317be extends IInterface {

    /* renamed from: com.google.android.gms.internal.be$a */
    public static abstract class C1318a extends Binder implements C1317be {

        /* renamed from: com.google.android.gms.internal.be$a$a */
        private static class C1319a implements C1317be {

            /* renamed from: le */
            private IBinder f2617le;

            C1319a(IBinder iBinder) {
                this.f2617le = iBinder;
            }

            /* renamed from: a */
            public IBinder mo14855a(C0967d dVar, C1306ay ayVar, String str, C1402cy cyVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (ayVar != null) {
                        obtain.writeInt(1);
                        ayVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (cyVar != null) {
                        iBinder = cyVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f2617le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2617le;
            }
        }

        /* renamed from: g */
        public static C1317be m3980g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1317be)) ? new C1319a(iBinder) : (C1317be) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                IBinder a = mo14855a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt() != 0 ? C1306ay.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1402cy.C1403a.m4215n(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            }
        }
    }

    /* renamed from: a */
    IBinder mo14855a(C0967d dVar, C1306ay ayVar, String str, C1402cy cyVar, int i) throws RemoteException;
}
