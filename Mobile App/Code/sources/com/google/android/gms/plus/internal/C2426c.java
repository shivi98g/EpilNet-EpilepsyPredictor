package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.plus.internal.c */
public interface C2426c extends IInterface {

    /* renamed from: com.google.android.gms.plus.internal.c$a */
    public static abstract class C2427a extends Binder implements C2426c {

        /* renamed from: com.google.android.gms.plus.internal.c$a$a */
        private static class C2428a implements C2426c {

            /* renamed from: le */
            private IBinder f4373le;

            C2428a(IBinder iBinder) {
                this.f4373le = iBinder;
            }

            /* renamed from: a */
            public C0967d mo18429a(C0967d dVar, int i, int i2, String str, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    this.f4373le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public C0967d mo18430a(C0967d dVar, int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f4373le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4373le;
            }
        }

        /* renamed from: bL */
        public static C2426c m7007bL(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2426c)) ? new C2428a(iBinder) : (C2426c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                        C0967d a = mo18429a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a != null) {
                            iBinder = a.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                        C0967d a2 = mo18430a(C0967d.C0968a.m1611ap(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a2 != null) {
                            iBinder = a2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                return true;
            }
        }
    }

    /* renamed from: a */
    C0967d mo18429a(C0967d dVar, int i, int i2, String str, int i3) throws RemoteException;

    /* renamed from: a */
    C0967d mo18430a(C0967d dVar, int i, int i2, String str, String str2) throws RemoteException;
}
