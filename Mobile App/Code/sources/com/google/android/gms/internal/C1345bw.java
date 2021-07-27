package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.bw */
public interface C1345bw extends IInterface {

    /* renamed from: com.google.android.gms.internal.bw$a */
    public static abstract class C1346a extends Binder implements C1345bw {
        public C1346a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        mo14958j(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        mo14949aw();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        String bB = mo14950bB();
                        parcel2.writeNoException();
                        parcel2.writeString(bB);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        C0967d bC = mo14951bC();
                        parcel2.writeNoException();
                        if (bC != null) {
                            iBinder = bC.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        String body = getBody();
                        parcel2.writeNoException();
                        parcel2.writeString(body);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        C0967d bD = mo14952bD();
                        parcel2.writeNoException();
                        if (bD != null) {
                            iBinder = bD.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        String bE = mo14953bE();
                        parcel2.writeNoException();
                        parcel2.writeString(bE);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        double bF = mo14954bF();
                        parcel2.writeNoException();
                        parcel2.writeDouble(bF);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        String bG = mo14955bG();
                        parcel2.writeNoException();
                        parcel2.writeString(bG);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                        String bH = mo14956bH();
                        parcel2.writeNoException();
                        parcel2.writeString(bH);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                return true;
            }
        }
    }

    /* renamed from: aw */
    void mo14949aw() throws RemoteException;

    /* renamed from: bB */
    String mo14950bB() throws RemoteException;

    /* renamed from: bC */
    C0967d mo14951bC() throws RemoteException;

    /* renamed from: bD */
    C0967d mo14952bD() throws RemoteException;

    /* renamed from: bE */
    String mo14953bE() throws RemoteException;

    /* renamed from: bF */
    double mo14954bF() throws RemoteException;

    /* renamed from: bG */
    String mo14955bG() throws RemoteException;

    /* renamed from: bH */
    String mo14956bH() throws RemoteException;

    String getBody() throws RemoteException;

    /* renamed from: j */
    void mo14958j(int i) throws RemoteException;
}
