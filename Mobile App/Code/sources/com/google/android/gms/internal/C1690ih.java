package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ih */
public interface C1690ih extends IInterface {

    /* renamed from: com.google.android.gms.internal.ih$a */
    public static abstract class C1691a extends Binder implements C1690ih {

        /* renamed from: com.google.android.gms.internal.ih$a$a */
        private static class C1692a implements C1690ih {

            /* renamed from: le */
            private IBinder f3702le;

            C1692a(IBinder iBinder) {
                this.f3702le = iBinder;
            }

            /* renamed from: a */
            public void mo15625a(int i, String str, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3702le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15626a(C1688if ifVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
                    if (ifVar != null) {
                        obtain.writeInt(1);
                        ifVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3702le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3702le;
            }
        }

        public C1691a() {
            attachInterface(this, "com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
        }

        /* renamed from: K */
        public static C1690ih m4956K(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1690ih)) ? new C1692a(iBinder) : (C1690ih) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.internal.if} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v11 */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x0049
                r0 = 0
                switch(r6) {
                    case 1: goto L_0x0031;
                    case 2: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.auth.api.IGoogleAuthApiCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                java.lang.String r3 = r7.readString()
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x002a
                android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            L_0x002a:
                r5.mo15625a(r2, r3, r0)
                r8.writeNoException()
                return r1
            L_0x0031:
                java.lang.String r2 = "com.google.android.gms.auth.api.IGoogleAuthApiCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0042
                com.google.android.gms.internal.ig r0 = com.google.android.gms.internal.C1688if.CREATOR
                com.google.android.gms.internal.if r0 = r0.createFromParcel(r7)
            L_0x0042:
                r5.mo15626a(r0)
                r8.writeNoException()
                return r1
            L_0x0049:
                java.lang.String r0 = "com.google.android.gms.auth.api.IGoogleAuthApiCallbacks"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1690ih.C1691a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo15625a(int i, String str, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo15626a(C1688if ifVar) throws RemoteException;
}
