package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.wearable.internal.ae */
public interface C2714ae extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.ae$a */
    public static abstract class C2715a extends Binder implements C2714ae {

        /* renamed from: com.google.android.gms.wearable.internal.ae$a$a */
        private static class C2716a implements C2714ae {

            /* renamed from: le */
            private IBinder f4538le;

            C2716a(IBinder iBinder) {
                this.f4538le = iBinder;
            }

            /* renamed from: a */
            public void mo19388a(C2731ai aiVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (aiVar != null) {
                        obtain.writeInt(1);
                        aiVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4538le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19389a(C2740al alVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (alVar != null) {
                        obtain.writeInt(1);
                        alVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4538le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: aa */
            public void mo19390aa(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4538le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4538le;
            }

            /* renamed from: b */
            public void mo19391b(C2740al alVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if (alVar != null) {
                        obtain.writeInt(1);
                        alVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4538le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C2715a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        /* renamed from: bY */
        public static C2714ae m7965bY(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2714ae)) ? new C2716a(iBinder) : (C2714ae) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.wearable.internal.ai} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.wearable.internal.al} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.gms.wearable.internal.al} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: type inference failed for: r0v21 */
        /* JADX WARNING: type inference failed for: r0v22 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0069
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x0054;
                    case 2: goto L_0x003d;
                    case 3: goto L_0x0026;
                    case 4: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableListener"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0022
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.al> r0 = com.google.android.gms.wearable.internal.C2740al.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.al r0 = (com.google.android.gms.wearable.internal.C2740al) r0
            L_0x0022:
                r3.mo19391b(r0)
                return r1
            L_0x0026:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableListener"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0039
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.al> r0 = com.google.android.gms.wearable.internal.C2740al.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.al r0 = (com.google.android.gms.wearable.internal.C2740al) r0
            L_0x0039:
                r3.mo19389a((com.google.android.gms.wearable.internal.C2740al) r0)
                return r1
            L_0x003d:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableListener"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0050
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.ai> r0 = com.google.android.gms.wearable.internal.C2731ai.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.ai r0 = (com.google.android.gms.wearable.internal.C2731ai) r0
            L_0x0050:
                r3.mo19388a((com.google.android.gms.wearable.internal.C2731ai) r0)
                return r1
            L_0x0054:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableListener"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0065
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r5)
            L_0x0065:
                r3.mo19390aa(r0)
                return r1
            L_0x0069:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableListener"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C2714ae.C2715a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo19388a(C2731ai aiVar) throws RemoteException;

    /* renamed from: a */
    void mo19389a(C2740al alVar) throws RemoteException;

    /* renamed from: aa */
    void mo19390aa(DataHolder dataHolder) throws RemoteException;

    /* renamed from: b */
    void mo19391b(C2740al alVar) throws RemoteException;
}
