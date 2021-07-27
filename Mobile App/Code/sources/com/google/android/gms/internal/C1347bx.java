package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.bx */
public interface C1347bx extends IInterface {

    /* renamed from: com.google.android.gms.internal.bx$a */
    public static abstract class C1348a extends Binder implements C1347bx {
        public C1348a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        mo14966j(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        mo14959aw();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        String bB = mo14960bB();
                        parcel2.writeNoException();
                        parcel2.writeString(bB);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        C0967d bC = mo14961bC();
                        parcel2.writeNoException();
                        if (bC != null) {
                            iBinder = bC.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        String body = getBody();
                        parcel2.writeNoException();
                        parcel2.writeString(body);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        C0967d bI = mo14963bI();
                        parcel2.writeNoException();
                        if (bI != null) {
                            iBinder = bI.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        String bE = mo14962bE();
                        parcel2.writeNoException();
                        parcel2.writeString(bE);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                        String bJ = mo14964bJ();
                        parcel2.writeNoException();
                        parcel2.writeString(bJ);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                return true;
            }
        }
    }

    /* renamed from: aw */
    void mo14959aw() throws RemoteException;

    /* renamed from: bB */
    String mo14960bB() throws RemoteException;

    /* renamed from: bC */
    C0967d mo14961bC() throws RemoteException;

    /* renamed from: bE */
    String mo14962bE() throws RemoteException;

    /* renamed from: bI */
    C0967d mo14963bI() throws RemoteException;

    /* renamed from: bJ */
    String mo14964bJ() throws RemoteException;

    String getBody() throws RemoteException;

    /* renamed from: j */
    void mo14966j(int i) throws RemoteException;
}
