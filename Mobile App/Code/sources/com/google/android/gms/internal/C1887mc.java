package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionStopResult;

/* renamed from: com.google.android.gms.internal.mc */
public interface C1887mc extends IInterface {

    /* renamed from: com.google.android.gms.internal.mc$a */
    public static abstract class C1888a extends Binder implements C1887mc {

        /* renamed from: com.google.android.gms.internal.mc$a$a */
        private static class C1889a implements C1887mc {

            /* renamed from: le */
            private IBinder f4057le;

            C1889a(IBinder iBinder) {
                this.f4057le = iBinder;
            }

            /* renamed from: a */
            public void mo16127a(SessionStopResult sessionStopResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionStopCallback");
                    if (sessionStopResult != null) {
                        obtain.writeInt(1);
                        sessionStopResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4057le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4057le;
            }
        }

        public C1888a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.ISessionStopCallback");
        }

        /* renamed from: ay */
        public static C1887mc m5637ay(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1887mc)) ? new C1889a(iBinder) : (C1887mc) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
                mo16127a(parcel.readInt() != 0 ? SessionStopResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.fitness.internal.ISessionStopCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16127a(SessionStopResult sessionStopResult) throws RemoteException;
}
