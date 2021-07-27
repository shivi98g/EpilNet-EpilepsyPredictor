package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

/* renamed from: com.google.android.gms.internal.mu */
public interface C1946mu extends IInterface {

    /* renamed from: com.google.android.gms.internal.mu$a */
    public static abstract class C1947a extends Binder implements C1946mu {
        public C1947a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.internal.mq} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.fitness.service.FitnessSensorServiceRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ms} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x006c
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x004d;
                    case 2: goto L_0x002e;
                    case 3: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0022
                android.os.Parcelable$Creator<com.google.android.gms.internal.ms> r0 = com.google.android.gms.internal.C1944ms.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.internal.ms r0 = (com.google.android.gms.internal.C1944ms) r0
            L_0x0022:
                android.os.IBinder r2 = r5.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                r3.mo12973a((com.google.android.gms.internal.C1944ms) r0, (com.google.android.gms.internal.C1890md) r2)
                return r1
            L_0x002e:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0041
                android.os.Parcelable$Creator<com.google.android.gms.fitness.service.FitnessSensorServiceRequest> r0 = com.google.android.gms.fitness.service.FitnessSensorServiceRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.fitness.service.FitnessSensorServiceRequest r0 = (com.google.android.gms.fitness.service.FitnessSensorServiceRequest) r0
            L_0x0041:
                android.os.IBinder r2 = r5.readStrongBinder()
                com.google.android.gms.internal.md r2 = com.google.android.gms.internal.C1890md.C1891a.m5640az(r2)
                r3.mo12971a((com.google.android.gms.fitness.service.FitnessSensorServiceRequest) r0, (com.google.android.gms.internal.C1890md) r2)
                return r1
            L_0x004d:
                java.lang.String r2 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0060
                android.os.Parcelable$Creator<com.google.android.gms.internal.mq> r0 = com.google.android.gms.internal.C1942mq.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.internal.mq r0 = (com.google.android.gms.internal.C1942mq) r0
            L_0x0060:
                android.os.IBinder r2 = r5.readStrongBinder()
                com.google.android.gms.internal.lx r2 = com.google.android.gms.internal.C1871lx.C1872a.m5574at(r2)
                r3.mo12972a((com.google.android.gms.internal.C1942mq) r0, (com.google.android.gms.internal.C1871lx) r2)
                return r1
            L_0x006c:
                java.lang.String r0 = "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1946mu.C1947a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo12971a(FitnessSensorServiceRequest fitnessSensorServiceRequest, C1890md mdVar) throws RemoteException;

    /* renamed from: a */
    void mo12972a(C1942mq mqVar, C1871lx lxVar) throws RemoteException;

    /* renamed from: a */
    void mo12973a(C1944ms msVar, C1890md mdVar) throws RemoteException;
}
