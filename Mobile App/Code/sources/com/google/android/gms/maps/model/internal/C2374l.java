package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.model.internal.l */
public interface C2374l extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.internal.l$a */
    public static abstract class C2375a extends Binder implements C2374l {

        /* renamed from: com.google.android.gms.maps.model.internal.l$a$a */
        private static class C2376a implements C2374l {

            /* renamed from: le */
            private IBinder f4361le;

            C2376a(IBinder iBinder) {
                this.f4361le = iBinder;
            }

            public IBinder asBinder() {
                return this.f4361le;
            }

            /* renamed from: b */
            public void mo18242b(C2353a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (aVar != null) {
                        obtain.writeInt(1);
                        aVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4361le.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getAlpha() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public LatLng getPosition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getRotation() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getSnippet() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getTitle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public boolean mo18249h(C2374l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    boolean z = false;
                    this.f4361le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int hashCodeRemote() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void hideInfoWindow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isDraggable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z = false;
                    this.f4361le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isFlat() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z = false;
                    this.f4361le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isInfoWindowShown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z = false;
                    this.f4361le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isVisible() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z = false;
                    this.f4361le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo18256n(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f4361le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void remove() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setAlpha(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeFloat(f);
                    this.f4361le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setAnchor(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f4361le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setDraggable(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4361le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setFlat(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4361le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setInfoWindowAnchor(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f4361le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPosition(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4361le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setRotation(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeFloat(f);
                    this.f4361le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setSnippet(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeString(str);
                    this.f4361le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTitle(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeString(str);
                    this.f4361le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setVisible(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f4361le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showInfoWindow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.f4361le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bA */
        public static C2374l m6892bA(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2374l)) ? new C2376a(iBinder) : (C2374l) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.maps.model.internal.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.maps.model.LatLng} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 28
                r1 = 0
                r2 = 1
                if (r4 == r0) goto L_0x01dc
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r0) goto L_0x01d6
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x01ca;
                    case 2: goto L_0x01ba;
                    case 3: goto L_0x01a2;
                    case 4: goto L_0x0189;
                    case 5: goto L_0x0179;
                    case 6: goto L_0x0169;
                    case 7: goto L_0x0159;
                    case 8: goto L_0x0149;
                    case 9: goto L_0x0136;
                    case 10: goto L_0x0126;
                    case 11: goto L_0x011a;
                    case 12: goto L_0x010e;
                    case 13: goto L_0x00fe;
                    case 14: goto L_0x00eb;
                    case 15: goto L_0x00db;
                    case 16: goto L_0x00c3;
                    case 17: goto L_0x00b3;
                    case 18: goto L_0x009f;
                    case 19: goto L_0x008b;
                    case 20: goto L_0x0078;
                    case 21: goto L_0x0068;
                    case 22: goto L_0x0058;
                    case 23: goto L_0x0048;
                    case 24: goto L_0x0034;
                    case 25: goto L_0x0024;
                    case 26: goto L_0x0014;
                    default: goto L_0x000f;
                }
            L_0x000f:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x0014:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r3.getAlpha()
                r6.writeNoException()
                r6.writeFloat(r0)
                return r2
            L_0x0024:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r5.readFloat()
                r3.setAlpha(r0)
                r6.writeNoException()
                return r2
            L_0x0034:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r5.readFloat()
                float r1 = r5.readFloat()
                r3.setInfoWindowAnchor(r0, r1)
                r6.writeNoException()
                return r2
            L_0x0048:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r3.getRotation()
                r6.writeNoException()
                r6.writeFloat(r0)
                return r2
            L_0x0058:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r5.readFloat()
                r3.setRotation(r0)
                r6.writeNoException()
                return r2
            L_0x0068:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                boolean r0 = r3.isFlat()
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x0078:
                java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r1)
                int r1 = r5.readInt()
                if (r1 == 0) goto L_0x0084
                r0 = r2
            L_0x0084:
                r3.setFlat(r0)
                r6.writeNoException()
                return r2
            L_0x008b:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                float r0 = r5.readFloat()
                float r1 = r5.readFloat()
                r3.setAnchor(r0, r1)
                r6.writeNoException()
                return r2
            L_0x009f:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                r3.mo18256n(r0)
                r6.writeNoException()
                return r2
            L_0x00b3:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                int r0 = r3.hashCodeRemote()
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x00c3:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.maps.model.internal.l r0 = m6892bA(r0)
                boolean r0 = r3.mo18249h(r0)
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x00db:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                boolean r0 = r3.isVisible()
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x00eb:
                java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r1)
                int r1 = r5.readInt()
                if (r1 == 0) goto L_0x00f7
                r0 = r2
            L_0x00f7:
                r3.setVisible(r0)
                r6.writeNoException()
                return r2
            L_0x00fe:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                boolean r0 = r3.isInfoWindowShown()
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x010e:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                r3.hideInfoWindow()
                r6.writeNoException()
                return r2
            L_0x011a:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                r3.showInfoWindow()
                r6.writeNoException()
                return r2
            L_0x0126:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                boolean r0 = r3.isDraggable()
                r6.writeNoException()
                r6.writeInt(r0)
                return r2
            L_0x0136:
                java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r1)
                int r1 = r5.readInt()
                if (r1 == 0) goto L_0x0142
                r0 = r2
            L_0x0142:
                r3.setDraggable(r0)
                r6.writeNoException()
                return r2
            L_0x0149:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                java.lang.String r0 = r3.getSnippet()
                r6.writeNoException()
                r6.writeString(r0)
                return r2
            L_0x0159:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                java.lang.String r0 = r5.readString()
                r3.setSnippet(r0)
                r6.writeNoException()
                return r2
            L_0x0169:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                java.lang.String r0 = r3.getTitle()
                r6.writeNoException()
                r6.writeString(r0)
                return r2
            L_0x0179:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                java.lang.String r0 = r5.readString()
                r3.setTitle(r0)
                r6.writeNoException()
                return r2
            L_0x0189:
                java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r1)
                com.google.android.gms.maps.model.LatLng r1 = r3.getPosition()
                r6.writeNoException()
                if (r1 == 0) goto L_0x019e
                r6.writeInt(r2)
                r1.writeToParcel(r6, r2)
                return r2
            L_0x019e:
                r6.writeInt(r0)
                return r2
            L_0x01a2:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x01b3
                com.google.android.gms.maps.model.i r0 = com.google.android.gms.maps.model.LatLng.CREATOR
                com.google.android.gms.maps.model.LatLng r1 = r0.createFromParcel(r5)
            L_0x01b3:
                r3.setPosition(r1)
                r6.writeNoException()
                return r2
            L_0x01ba:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                java.lang.String r0 = r3.getId()
                r6.writeNoException()
                r6.writeString(r0)
                return r2
            L_0x01ca:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                r3.remove()
                r6.writeNoException()
                return r2
            L_0x01d6:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r6.writeString(r0)
                return r2
            L_0x01dc:
                java.lang.String r0 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
                r5.enforceInterface(r0)
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x01ed
                com.google.android.gms.maps.model.internal.b r0 = com.google.android.gms.maps.model.internal.C2353a.CREATOR
                com.google.android.gms.maps.model.internal.a r1 = r0.createFromParcel(r5)
            L_0x01ed:
                r3.mo18242b(r1)
                r6.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.internal.C2374l.C2375a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: b */
    void mo18242b(C2353a aVar) throws RemoteException;

    float getAlpha() throws RemoteException;

    String getId() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getRotation() throws RemoteException;

    String getSnippet() throws RemoteException;

    String getTitle() throws RemoteException;

    /* renamed from: h */
    boolean mo18249h(C2374l lVar) throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    void hideInfoWindow() throws RemoteException;

    boolean isDraggable() throws RemoteException;

    boolean isFlat() throws RemoteException;

    boolean isInfoWindowShown() throws RemoteException;

    boolean isVisible() throws RemoteException;

    /* renamed from: n */
    void mo18256n(C0967d dVar) throws RemoteException;

    void remove() throws RemoteException;

    void setAlpha(float f) throws RemoteException;

    void setAnchor(float f, float f2) throws RemoteException;

    void setDraggable(boolean z) throws RemoteException;

    void setFlat(boolean z) throws RemoteException;

    void setInfoWindowAnchor(float f, float f2) throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setRotation(float f) throws RemoteException;

    void setSnippet(String str) throws RemoteException;

    void setTitle(String str) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void showInfoWindow() throws RemoteException;
}
