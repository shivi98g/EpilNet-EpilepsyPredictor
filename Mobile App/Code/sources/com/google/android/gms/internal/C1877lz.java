package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.C1018aa;
import com.google.android.gms.fitness.request.C1021ad;
import com.google.android.gms.fitness.request.C1023af;
import com.google.android.gms.fitness.request.C1027ah;
import com.google.android.gms.fitness.request.C1029aj;
import com.google.android.gms.fitness.request.C1033b;
import com.google.android.gms.fitness.request.C1036e;
import com.google.android.gms.fitness.request.C1043j;
import com.google.android.gms.fitness.request.C1048m;
import com.google.android.gms.fitness.request.C1052o;
import com.google.android.gms.fitness.request.C1054q;
import com.google.android.gms.fitness.request.C1058u;
import com.google.android.gms.fitness.request.C1060w;
import com.google.android.gms.fitness.request.C1064y;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;

/* renamed from: com.google.android.gms.internal.lz */
public interface C1877lz extends IInterface {

    /* renamed from: com.google.android.gms.internal.lz$a */
    public static abstract class C1878a extends Binder implements C1877lz {

        /* renamed from: com.google.android.gms.internal.lz$a$a */
        private static class C1879a implements C1877lz {

            /* renamed from: le */
            private IBinder f4054le;

            C1879a(IBinder iBinder) {
                this.f4054le = iBinder;
            }

            /* renamed from: a */
            public void mo16093a(DataDeleteRequest dataDeleteRequest, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (dataDeleteRequest != null) {
                        obtain.writeInt(1);
                        dataDeleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16094a(DataReadRequest dataReadRequest, C1868lw lwVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (dataReadRequest != null) {
                        obtain.writeInt(1);
                        dataReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lwVar != null ? lwVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16095a(DataSourcesRequest dataSourcesRequest, C1871lx lxVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (dataSourcesRequest != null) {
                        obtain.writeInt(1);
                        dataSourcesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lxVar != null ? lxVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16096a(DataTypeCreateRequest dataTypeCreateRequest, C1874ly lyVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (dataTypeCreateRequest != null) {
                        obtain.writeInt(1);
                        dataTypeCreateRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lyVar != null ? lyVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16097a(SessionInsertRequest sessionInsertRequest, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (sessionInsertRequest != null) {
                        obtain.writeInt(1);
                        sessionInsertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16098a(SessionReadRequest sessionReadRequest, C1884mb mbVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (sessionReadRequest != null) {
                        obtain.writeInt(1);
                        sessionReadRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mbVar != null ? mbVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16099a(StartBleScanRequest startBleScanRequest, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (startBleScanRequest != null) {
                        obtain.writeInt(1);
                        startBleScanRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(15, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16100a(C1018aa aaVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (aaVar != null) {
                        obtain.writeInt(1);
                        aaVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(21, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16101a(C1021ad adVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (adVar != null) {
                        obtain.writeInt(1);
                        adVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(16, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16102a(C1023af afVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (afVar != null) {
                        obtain.writeInt(1);
                        afVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16103a(C1027ah ahVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (ahVar != null) {
                        obtain.writeInt(1);
                        ahVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(18, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16104a(C1029aj ajVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (ajVar != null) {
                        obtain.writeInt(1);
                        ajVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16105a(C1033b bVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(17, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16106a(C1036e eVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (eVar != null) {
                        obtain.writeInt(1);
                        eVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16107a(C1043j jVar, C1874ly lyVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (jVar != null) {
                        obtain.writeInt(1);
                        jVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lyVar != null ? lyVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(14, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16108a(C1048m mVar, C1881ma maVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (mVar != null) {
                        obtain.writeInt(1);
                        mVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(maVar != null ? maVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16109a(C1052o oVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (oVar != null) {
                        obtain.writeInt(1);
                        oVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16110a(C1054q qVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (qVar != null) {
                        obtain.writeInt(1);
                        qVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16111a(C1058u uVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (uVar != null) {
                        obtain.writeInt(1);
                        uVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(20, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16112a(C1060w wVar, C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (wVar != null) {
                        obtain.writeInt(1);
                        wVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16113a(C1064y yVar, C1887mc mcVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    if (yVar != null) {
                        obtain.writeInt(1);
                        yVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mcVar != null ? mcVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16114a(C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(22, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16115a(C1939mp mpVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    obtain.writeStrongBinder(mpVar != null ? mpVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(24, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4054le;
            }

            /* renamed from: b */
            public void mo16116b(C1890md mdVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                    obtain.writeStrongBinder(mdVar != null ? mdVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4054le.transact(23, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: av */
        public static C1877lz m5603av(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1877lz)) ? new C1879a(iBinder) : (C1877lz) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.fitness.request.DataSourcesRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.fitness.request.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.fitness.request.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.fitness.request.af} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.fitness.request.aj} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.google.android.gms.fitness.request.m} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.google.android.gms.fitness.request.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.google.android.gms.fitness.request.DataReadRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.google.android.gms.fitness.request.SessionInsertRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: com.google.android.gms.fitness.request.SessionReadRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: com.google.android.gms.fitness.request.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: com.google.android.gms.fitness.request.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: com.google.android.gms.fitness.request.DataTypeCreateRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: com.google.android.gms.fitness.request.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.google.android.gms.fitness.request.StartBleScanRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: com.google.android.gms.fitness.request.ad} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: com.google.android.gms.fitness.request.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: com.google.android.gms.fitness.request.ah} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: com.google.android.gms.fitness.request.DataDeleteRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: com.google.android.gms.fitness.request.u} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: com.google.android.gms.fitness.request.aa} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v97 */
        /* JADX WARNING: type inference failed for: r0v98 */
        /* JADX WARNING: type inference failed for: r0v99 */
        /* JADX WARNING: type inference failed for: r0v100 */
        /* JADX WARNING: type inference failed for: r0v101 */
        /* JADX WARNING: type inference failed for: r0v102 */
        /* JADX WARNING: type inference failed for: r0v103 */
        /* JADX WARNING: type inference failed for: r0v104 */
        /* JADX WARNING: type inference failed for: r0v105 */
        /* JADX WARNING: type inference failed for: r0v106 */
        /* JADX WARNING: type inference failed for: r0v107 */
        /* JADX WARNING: type inference failed for: r0v108 */
        /* JADX WARNING: type inference failed for: r0v109 */
        /* JADX WARNING: type inference failed for: r0v110 */
        /* JADX WARNING: type inference failed for: r0v111 */
        /* JADX WARNING: type inference failed for: r0v112 */
        /* JADX WARNING: type inference failed for: r0v113 */
        /* JADX WARNING: type inference failed for: r0v114 */
        /* JADX WARNING: type inference failed for: r0v115 */
        /* JADX WARNING: type inference failed for: r0v116 */
        /* JADX WARNING: type inference failed for: r0v117 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x0330
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x030d;
                    case 2: goto L_0x02ea;
                    case 3: goto L_0x02c7;
                    case 4: goto L_0x02a4;
                    case 5: goto L_0x0281;
                    case 6: goto L_0x025e;
                    case 7: goto L_0x023b;
                    case 8: goto L_0x0218;
                    case 9: goto L_0x01f5;
                    case 10: goto L_0x01d2;
                    case 11: goto L_0x01af;
                    case 12: goto L_0x018c;
                    case 13: goto L_0x0169;
                    case 14: goto L_0x0146;
                    case 15: goto L_0x0123;
                    case 16: goto L_0x0100;
                    case 17: goto L_0x00dd;
                    case 18: goto L_0x00ba;
                    case 19: goto L_0x0094;
                    case 20: goto L_0x0071;
                    case 21: goto L_0x004e;
                    case 22: goto L_0x0039;
                    case 23: goto L_0x0024;
                    case 24: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x000f:
                java.lang.String r0 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.internal.mp r0 = com.google.android.gms.internal.C1939mp.C1940a.m5732aA(r0)
                java.lang.String r2 = r6.readString()
                r4.mo16115a((com.google.android.gms.internal.C1939mp) r0, (java.lang.String) r2)
                return r1
            L_0x0024:
                java.lang.String r0 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.internal.md r0 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r0)
                java.lang.String r2 = r6.readString()
                r4.mo16116b(r0, r2)
                return r1
            L_0x0039:
                java.lang.String r0 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                com.google.android.gms.internal.md r0 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r0)
                java.lang.String r2 = r6.readString()
                r4.mo16114a((com.google.android.gms.internal.C1890md) r0, (java.lang.String) r2)
                return r1
            L_0x004e:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0061
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.aa> r0 = com.google.android.gms.fitness.request.C1018aa.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.aa r0 = (com.google.android.gms.fitness.request.C1018aa) r0
            L_0x0061:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16100a((com.google.android.gms.fitness.request.C1018aa) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0071:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0084
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.u> r0 = com.google.android.gms.fitness.request.C1058u.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.u r0 = (com.google.android.gms.fitness.request.C1058u) r0
            L_0x0084:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16111a((com.google.android.gms.fitness.request.C1058u) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0094:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00a7
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.DataDeleteRequest> r0 = com.google.android.gms.fitness.request.DataDeleteRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.DataDeleteRequest r0 = (com.google.android.gms.fitness.request.DataDeleteRequest) r0
            L_0x00a7:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16093a((com.google.android.gms.fitness.request.DataDeleteRequest) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                r7.writeNoException()
                return r1
            L_0x00ba:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00cd
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.ah> r0 = com.google.android.gms.fitness.request.C1027ah.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.ah r0 = (com.google.android.gms.fitness.request.C1027ah) r0
            L_0x00cd:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16103a((com.google.android.gms.fitness.request.C1027ah) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x00dd:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00f0
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.b> r0 = com.google.android.gms.fitness.request.C1033b.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.b r0 = (com.google.android.gms.fitness.request.C1033b) r0
            L_0x00f0:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16105a((com.google.android.gms.fitness.request.C1033b) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0100:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0113
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.ad> r0 = com.google.android.gms.fitness.request.C1021ad.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.ad r0 = (com.google.android.gms.fitness.request.C1021ad) r0
            L_0x0113:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16101a((com.google.android.gms.fitness.request.C1021ad) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0123:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0136
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.StartBleScanRequest> r0 = com.google.android.gms.fitness.request.StartBleScanRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.StartBleScanRequest r0 = (com.google.android.gms.fitness.request.StartBleScanRequest) r0
            L_0x0136:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16099a((com.google.android.gms.fitness.request.StartBleScanRequest) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0146:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0159
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.j> r0 = com.google.android.gms.fitness.request.C1043j.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.j r0 = (com.google.android.gms.fitness.request.C1043j) r0
            L_0x0159:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.ly r2 = com.google.android.gms.internal.C1874ly.C1875a.m5577au(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16107a((com.google.android.gms.fitness.request.C1043j) r0, (com.google.android.gms.internal.C1874ly) r2, (java.lang.String) r3)
                return r1
            L_0x0169:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x017c
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.DataTypeCreateRequest> r0 = com.google.android.gms.fitness.request.DataTypeCreateRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.DataTypeCreateRequest r0 = (com.google.android.gms.fitness.request.DataTypeCreateRequest) r0
            L_0x017c:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.ly r2 = com.google.android.gms.internal.C1874ly.C1875a.m5577au(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16096a((com.google.android.gms.fitness.request.DataTypeCreateRequest) r0, (com.google.android.gms.internal.C1874ly) r2, (java.lang.String) r3)
                return r1
            L_0x018c:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x019f
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.y> r0 = com.google.android.gms.fitness.request.C1064y.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.y r0 = (com.google.android.gms.fitness.request.C1064y) r0
            L_0x019f:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.mc r2 = com.google.android.gms.internal.C1887mc.C1888a.m5637ay(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16113a((com.google.android.gms.fitness.request.C1064y) r0, (com.google.android.gms.internal.C1887mc) r2, (java.lang.String) r3)
                return r1
            L_0x01af:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x01c2
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.w> r0 = com.google.android.gms.fitness.request.C1060w.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.w r0 = (com.google.android.gms.fitness.request.C1060w) r0
            L_0x01c2:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16112a((com.google.android.gms.fitness.request.C1060w) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x01d2:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x01e5
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.SessionReadRequest> r0 = com.google.android.gms.fitness.request.SessionReadRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.SessionReadRequest r0 = (com.google.android.gms.fitness.request.SessionReadRequest) r0
            L_0x01e5:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.mb r2 = com.google.android.gms.internal.C1884mb.C1885a.m5634ax(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16098a((com.google.android.gms.fitness.request.SessionReadRequest) r0, (com.google.android.gms.internal.C1884mb) r2, (java.lang.String) r3)
                return r1
            L_0x01f5:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0208
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.SessionInsertRequest> r0 = com.google.android.gms.fitness.request.SessionInsertRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.SessionInsertRequest r0 = (com.google.android.gms.fitness.request.SessionInsertRequest) r0
            L_0x0208:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16097a((com.google.android.gms.fitness.request.SessionInsertRequest) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x0218:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x022b
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.DataReadRequest> r0 = com.google.android.gms.fitness.request.DataReadRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.DataReadRequest r0 = (com.google.android.gms.fitness.request.DataReadRequest) r0
            L_0x022b:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.lw r2 = com.google.android.gms.internal.C1868lw.C1869a.m5571as(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16094a((com.google.android.gms.fitness.request.DataReadRequest) r0, (com.google.android.gms.internal.C1868lw) r2, (java.lang.String) r3)
                return r1
            L_0x023b:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x024e
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.e> r0 = com.google.android.gms.fitness.request.C1036e.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.e r0 = (com.google.android.gms.fitness.request.C1036e) r0
            L_0x024e:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16106a((com.google.android.gms.fitness.request.C1036e) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x025e:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0271
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.m> r0 = com.google.android.gms.fitness.request.C1048m.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.m r0 = (com.google.android.gms.fitness.request.C1048m) r0
            L_0x0271:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.ma r2 = com.google.android.gms.internal.C1881ma.C1882a.m5631aw(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16108a((com.google.android.gms.fitness.request.C1048m) r0, (com.google.android.gms.internal.C1881ma) r2, (java.lang.String) r3)
                return r1
            L_0x0281:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0294
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.aj> r0 = com.google.android.gms.fitness.request.C1029aj.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.aj r0 = (com.google.android.gms.fitness.request.C1029aj) r0
            L_0x0294:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16104a((com.google.android.gms.fitness.request.C1029aj) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x02a4:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x02b7
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.af> r0 = com.google.android.gms.fitness.request.C1023af.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.af r0 = (com.google.android.gms.fitness.request.C1023af) r0
            L_0x02b7:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16102a((com.google.android.gms.fitness.request.C1023af) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x02c7:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x02da
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.q> r0 = com.google.android.gms.fitness.request.C1054q.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.q r0 = (com.google.android.gms.fitness.request.C1054q) r0
            L_0x02da:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16110a((com.google.android.gms.fitness.request.C1054q) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x02ea:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x02fd
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.o> r0 = com.google.android.gms.fitness.request.C1052o.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.o r0 = (com.google.android.gms.fitness.request.C1052o) r0
            L_0x02fd:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16109a((com.google.android.gms.fitness.request.C1052o) r0, (com.google.android.gms.internal.C1890md) r2, (java.lang.String) r3)
                return r1
            L_0x030d:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0320
                android.os.Parcelable$Creator<com.google.android.gms.fitness.request.DataSourcesRequest> r0 = com.google.android.gms.fitness.request.DataSourcesRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.fitness.request.DataSourcesRequest r0 = (com.google.android.gms.fitness.request.DataSourcesRequest) r0
            L_0x0320:
                android.os.IBinder r2 = r6.readStrongBinder()
                com.google.android.gms.internal.lx r2 = com.google.android.gms.internal.C1871lx.C1872a.m5574at(r2)
                java.lang.String r3 = r6.readString()
                r4.mo16095a((com.google.android.gms.fitness.request.DataSourcesRequest) r0, (com.google.android.gms.internal.C1871lx) r2, (java.lang.String) r3)
                return r1
            L_0x0330:
                java.lang.String r0 = "com.google.android.gms.fitness.internal.IGoogleFitnessService"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1877lz.C1878a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo16093a(DataDeleteRequest dataDeleteRequest, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16094a(DataReadRequest dataReadRequest, C1868lw lwVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16095a(DataSourcesRequest dataSourcesRequest, C1871lx lxVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16096a(DataTypeCreateRequest dataTypeCreateRequest, C1874ly lyVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16097a(SessionInsertRequest sessionInsertRequest, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16098a(SessionReadRequest sessionReadRequest, C1884mb mbVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16099a(StartBleScanRequest startBleScanRequest, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16100a(C1018aa aaVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16101a(C1021ad adVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16102a(C1023af afVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16103a(C1027ah ahVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16104a(C1029aj ajVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16105a(C1033b bVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16106a(C1036e eVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16107a(C1043j jVar, C1874ly lyVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16108a(C1048m mVar, C1881ma maVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16109a(C1052o oVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16110a(C1054q qVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16111a(C1058u uVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16112a(C1060w wVar, C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16113a(C1064y yVar, C1887mc mcVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16114a(C1890md mdVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16115a(C1939mp mpVar, String str) throws RemoteException;

    /* renamed from: b */
    void mo16116b(C1890md mdVar, String str) throws RemoteException;
}
