package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C2374l;

/* renamed from: com.google.android.gms.maps.internal.e */
public interface C2282e extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.e$a */
    public static abstract class C2283a extends Binder implements C2282e {

        /* renamed from: com.google.android.gms.maps.internal.e$a$a */
        private static class C2284a implements C2282e {

            /* renamed from: le */
            private IBinder f4316le;

            C2284a(IBinder iBinder) {
                this.f4316le = iBinder;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.graphics.Bitmap} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.graphics.Bitmap mo17726a(com.google.android.gms.maps.model.internal.C2374l r4, int r5, int r6) throws android.os.RemoteException {
                /*
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.google.android.gms.maps.internal.IInfoWindowRenderer"
                    r0.writeInterfaceToken(r2)     // Catch:{ all -> 0x003f }
                    r2 = 0
                    if (r4 == 0) goto L_0x0015
                    android.os.IBinder r4 = r4.asBinder()     // Catch:{ all -> 0x003f }
                    goto L_0x0016
                L_0x0015:
                    r4 = r2
                L_0x0016:
                    r0.writeStrongBinder(r4)     // Catch:{ all -> 0x003f }
                    r0.writeInt(r5)     // Catch:{ all -> 0x003f }
                    r0.writeInt(r6)     // Catch:{ all -> 0x003f }
                    android.os.IBinder r4 = r3.f4316le     // Catch:{ all -> 0x003f }
                    r5 = 1
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch:{ all -> 0x003f }
                    r1.readException()     // Catch:{ all -> 0x003f }
                    int r4 = r1.readInt()     // Catch:{ all -> 0x003f }
                    if (r4 == 0) goto L_0x0038
                    android.os.Parcelable$Creator r4 = android.graphics.Bitmap.CREATOR     // Catch:{ all -> 0x003f }
                    java.lang.Object r4 = r4.createFromParcel(r1)     // Catch:{ all -> 0x003f }
                    r2 = r4
                    android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x003f }
                L_0x0038:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L_0x003f:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C2282e.C2283a.C2284a.mo17726a(com.google.android.gms.maps.model.internal.l, int, int):android.graphics.Bitmap");
            }

            public IBinder asBinder() {
                return this.f4316le;
            }
        }

        /* renamed from: aV */
        public static C2282e m6748aV(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2282e)) ? new C2284a(iBinder) : (C2282e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                Bitmap a = mo17726a(C2374l.C2375a.m6892bA(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bitmap mo17726a(C2374l lVar, int i, int i2) throws RemoteException;
}
