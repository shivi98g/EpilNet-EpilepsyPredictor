package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.dynamic.c */
public interface C0964c extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.c$a */
    public static abstract class C0965a extends Binder implements C0964c {

        /* renamed from: com.google.android.gms.dynamic.c$a$a */
        private static class C0966a implements C0964c {

            /* renamed from: le */
            private IBinder f1314le;

            C0966a(IBinder iBinder) {
                this.f1314le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1314le;
            }

            /* renamed from: d */
            public void mo12159d(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f1314le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo12160e(C0967d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f1314le.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getArguments() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getRetainInstance() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(7, obtain, obtain2, 0);
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

            public String getTag() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getTargetRequestCode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getUserVisibleHint() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(11, obtain, obtain2, 0);
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

            public C0967d getView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isAdded() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(13, obtain, obtain2, 0);
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

            public boolean isDetached() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(14, obtain, obtain2, 0);
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

            public boolean isHidden() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(15, obtain, obtain2, 0);
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

            public boolean isInLayout() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(16, obtain, obtain2, 0);
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

            public boolean isRemoving() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(17, obtain, obtain2, 0);
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

            public boolean isResumed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(18, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = false;
                    this.f1314le.transact(19, obtain, obtain2, 0);
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

            /* renamed from: jf */
            public C0967d mo12175jf() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: jg */
            public C0964c mo12176jg() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0965a.m1604ao(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: jh */
            public C0967d mo12177jh() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ji */
            public C0964c mo12178ji() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.f1314le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0965a.m1604ao(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setHasOptionsMenu(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1314le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMenuVisibility(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1314le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setRetainInstance(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1314le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setUserVisibleHint(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    obtain.writeInt(z ? 1 : 0);
                    this.f1314le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startActivity(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1314le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startActivityForResult(Intent intent, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f1314le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0965a() {
            attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* renamed from: ao */
        public static C0964c m1604ao(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0964c)) ? new C0966a(iBinder) : (C0964c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v7, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v9, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v11, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v21, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r2v24, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r2v27 */
        /* JADX WARNING: type inference failed for: r2v28 */
        /* JADX WARNING: type inference failed for: r2v29 */
        /* JADX WARNING: type inference failed for: r2v30 */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: type inference failed for: r2v32 */
        /* JADX WARNING: type inference failed for: r2v33 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0205
                r0 = 0
                r2 = 0
                switch(r4) {
                    case 2: goto L_0x01ef;
                    case 3: goto L_0x01d6;
                    case 4: goto L_0x01c6;
                    case 5: goto L_0x01b0;
                    case 6: goto L_0x019a;
                    case 7: goto L_0x018a;
                    case 8: goto L_0x017a;
                    case 9: goto L_0x0164;
                    case 10: goto L_0x0154;
                    case 11: goto L_0x0144;
                    case 12: goto L_0x012e;
                    case 13: goto L_0x011e;
                    case 14: goto L_0x010e;
                    case 15: goto L_0x00fe;
                    case 16: goto L_0x00ee;
                    case 17: goto L_0x00de;
                    case 18: goto L_0x00ce;
                    case 19: goto L_0x00be;
                    case 20: goto L_0x00aa;
                    case 21: goto L_0x0097;
                    case 22: goto L_0x0084;
                    case 23: goto L_0x0071;
                    case 24: goto L_0x005e;
                    case 25: goto L_0x0043;
                    case 26: goto L_0x0024;
                    case 27: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x0010:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                r3.mo12160e(r0)
                r6.writeNoException()
                return r1
            L_0x0024:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x0038
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                r2 = r0
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x0038:
                int r0 = r5.readInt()
                r3.startActivityForResult(r2, r0)
                r6.writeNoException()
                return r1
            L_0x0043:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x0057
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                r2 = r0
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x0057:
                r3.startActivity(r2)
                r6.writeNoException()
                return r1
            L_0x005e:
                java.lang.String r2 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x006a
                r0 = r1
            L_0x006a:
                r3.setUserVisibleHint(r0)
                r6.writeNoException()
                return r1
            L_0x0071:
                java.lang.String r2 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x007d
                r0 = r1
            L_0x007d:
                r3.setRetainInstance(r0)
                r6.writeNoException()
                return r1
            L_0x0084:
                java.lang.String r2 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0090
                r0 = r1
            L_0x0090:
                r3.setMenuVisibility(r0)
                r6.writeNoException()
                return r1
            L_0x0097:
                java.lang.String r2 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00a3
                r0 = r1
            L_0x00a3:
                r3.setHasOptionsMenu(r0)
                r6.writeNoException()
                return r1
            L_0x00aa:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r0)
                r3.mo12159d(r0)
                r6.writeNoException()
                return r1
            L_0x00be:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isVisible()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x00ce:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isResumed()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x00de:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isRemoving()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x00ee:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isInLayout()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x00fe:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isHidden()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x010e:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isDetached()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x011e:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.isAdded()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x012e:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                com.google.android.gms.dynamic.d r0 = r3.getView()
                r6.writeNoException()
                if (r0 == 0) goto L_0x0140
                android.os.IBinder r2 = r0.asBinder()
            L_0x0140:
                r6.writeStrongBinder(r2)
                return r1
            L_0x0144:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.getUserVisibleHint()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x0154:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                int r0 = r3.getTargetRequestCode()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x0164:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                com.google.android.gms.dynamic.c r0 = r3.mo12178ji()
                r6.writeNoException()
                if (r0 == 0) goto L_0x0176
                android.os.IBinder r2 = r0.asBinder()
            L_0x0176:
                r6.writeStrongBinder(r2)
                return r1
            L_0x017a:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                java.lang.String r0 = r3.getTag()
                r6.writeNoException()
                r6.writeString(r0)
                return r1
            L_0x018a:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                boolean r0 = r3.getRetainInstance()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x019a:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                com.google.android.gms.dynamic.d r0 = r3.mo12177jh()
                r6.writeNoException()
                if (r0 == 0) goto L_0x01ac
                android.os.IBinder r2 = r0.asBinder()
            L_0x01ac:
                r6.writeStrongBinder(r2)
                return r1
            L_0x01b0:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                com.google.android.gms.dynamic.c r0 = r3.mo12176jg()
                r6.writeNoException()
                if (r0 == 0) goto L_0x01c2
                android.os.IBinder r2 = r0.asBinder()
            L_0x01c2:
                r6.writeStrongBinder(r2)
                return r1
            L_0x01c6:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                int r0 = r3.getId()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x01d6:
                java.lang.String r2 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r2)
                android.os.Bundle r2 = r3.getArguments()
                r6.writeNoException()
                if (r2 == 0) goto L_0x01eb
                r6.writeInt(r1)
                r2.writeToParcel(r6, r1)
                return r1
            L_0x01eb:
                r6.writeInt(r0)
                return r1
            L_0x01ef:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r5.enforceInterface(r0)
                com.google.android.gms.dynamic.d r0 = r3.mo12175jf()
                r6.writeNoException()
                if (r0 == 0) goto L_0x0201
                android.os.IBinder r2 = r0.asBinder()
            L_0x0201:
                r6.writeStrongBinder(r2)
                return r1
            L_0x0205:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.C0964c.C0965a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: d */
    void mo12159d(C0967d dVar) throws RemoteException;

    /* renamed from: e */
    void mo12160e(C0967d dVar) throws RemoteException;

    Bundle getArguments() throws RemoteException;

    int getId() throws RemoteException;

    boolean getRetainInstance() throws RemoteException;

    String getTag() throws RemoteException;

    int getTargetRequestCode() throws RemoteException;

    boolean getUserVisibleHint() throws RemoteException;

    C0967d getView() throws RemoteException;

    boolean isAdded() throws RemoteException;

    boolean isDetached() throws RemoteException;

    boolean isHidden() throws RemoteException;

    boolean isInLayout() throws RemoteException;

    boolean isRemoving() throws RemoteException;

    boolean isResumed() throws RemoteException;

    boolean isVisible() throws RemoteException;

    /* renamed from: jf */
    C0967d mo12175jf() throws RemoteException;

    /* renamed from: jg */
    C0964c mo12176jg() throws RemoteException;

    /* renamed from: jh */
    C0967d mo12177jh() throws RemoteException;

    /* renamed from: ji */
    C0964c mo12178ji() throws RemoteException;

    void setHasOptionsMenu(boolean z) throws RemoteException;

    void setMenuVisibility(boolean z) throws RemoteException;

    void setRetainInstance(boolean z) throws RemoteException;

    void setUserVisibleHint(boolean z) throws RemoteException;

    void startActivity(Intent intent) throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;
}
