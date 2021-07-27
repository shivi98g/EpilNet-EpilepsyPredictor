package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.dynamic.d */
public interface C0967d extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.d$a */
    public static abstract class C0968a extends Binder implements C0967d {

        /* renamed from: com.google.android.gms.dynamic.d$a$a */
        private static class C0969a implements C0967d {

            /* renamed from: le */
            private IBinder f1315le;

            C0969a(IBinder iBinder) {
                this.f1315le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1315le;
            }
        }

        public C0968a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: ap */
        public static C0967d m1611ap(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0967d)) ? new C0969a(iBinder) : (C0967d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
            return true;
        }
    }
}
