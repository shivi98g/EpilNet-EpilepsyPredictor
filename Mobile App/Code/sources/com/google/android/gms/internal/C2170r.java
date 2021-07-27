package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: com.google.android.gms.internal.r */
public interface C2170r extends IInterface {

    /* renamed from: com.google.android.gms.internal.r$a */
    public static abstract class C2171a extends Binder implements C2170r {

        /* renamed from: com.google.android.gms.internal.r$a$a */
        private static class C2172a implements C2170r {

            /* renamed from: le */
            private IBinder f4221le;

            C2172a(IBinder iBinder) {
                this.f4221le = iBinder;
            }

            /* renamed from: a */
            public Bundle mo17104a(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4221le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo17105a(String str, String str2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4221le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public AccountChangeEventsResponse mo17106a(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    if (accountChangeEventsRequest != null) {
                        obtain.writeInt(1);
                        accountChangeEventsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4221le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? AccountChangeEventsResponse.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4221le;
            }
        }

        /* renamed from: a */
        public static C2170r m6501a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2170r)) ? new C2172a(iBinder) : (C2170r) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.auth.AccountChangeEventsRequest} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            /*
                r6 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r7 == r0) goto L_0x008f
                r0 = 0
                r2 = 0
                switch(r7) {
                    case 1: goto L_0x0060;
                    case 2: goto L_0x0035;
                    case 3: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r7, r8, r9, r10)
                return r0
            L_0x0010:
                java.lang.String r3 = "com.google.android.auth.IAuthManagerService"
                r8.enforceInterface(r3)
                int r3 = r8.readInt()
                if (r3 == 0) goto L_0x0021
                com.google.android.gms.auth.AccountChangeEventsRequestCreator r2 = com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR
                com.google.android.gms.auth.AccountChangeEventsRequest r2 = r2.createFromParcel((android.os.Parcel) r8)
            L_0x0021:
                com.google.android.gms.auth.AccountChangeEventsResponse r2 = r6.mo17106a(r2)
                r9.writeNoException()
                if (r2 == 0) goto L_0x0031
                r9.writeInt(r1)
                r2.writeToParcel(r9, r1)
                return r1
            L_0x0031:
                r9.writeInt(r0)
                return r1
            L_0x0035:
                java.lang.String r3 = "com.google.android.auth.IAuthManagerService"
                r8.enforceInterface(r3)
                java.lang.String r3 = r8.readString()
                int r4 = r8.readInt()
                if (r4 == 0) goto L_0x004c
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r8)
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x004c:
                android.os.Bundle r2 = r6.mo17104a(r3, r2)
                r9.writeNoException()
                if (r2 == 0) goto L_0x005c
                r9.writeInt(r1)
                r2.writeToParcel(r9, r1)
                return r1
            L_0x005c:
                r9.writeInt(r0)
                return r1
            L_0x0060:
                java.lang.String r3 = "com.google.android.auth.IAuthManagerService"
                r8.enforceInterface(r3)
                java.lang.String r3 = r8.readString()
                java.lang.String r4 = r8.readString()
                int r5 = r8.readInt()
                if (r5 == 0) goto L_0x007b
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r8)
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x007b:
                android.os.Bundle r2 = r6.mo17105a(r3, r4, r2)
                r9.writeNoException()
                if (r2 == 0) goto L_0x008b
                r9.writeInt(r1)
                r2.writeToParcel(r9, r1)
                return r1
            L_0x008b:
                r9.writeInt(r0)
                return r1
            L_0x008f:
                java.lang.String r0 = "com.google.android.auth.IAuthManagerService"
                r9.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2170r.C2171a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    Bundle mo17104a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    Bundle mo17105a(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    AccountChangeEventsResponse mo17106a(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;
}
