package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0964c;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C2128qd;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: com.google.android.gms.internal.qi */
public class C2147qi extends C0972g<C2128qd> {
    private static C2147qi awH;

    protected C2147qi() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    /* renamed from: a */
    public static C2119qa m6315a(Activity activity, C0964c cVar, WalletFragmentOptions walletFragmentOptions, C2122qb qbVar) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        try {
            return ((C2128qd) m6316rg().mo12191L(activity)).mo16962a(C0970e.m1613k(activity), cVar, walletFragmentOptions, qbVar);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (C0972g.C0973a e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: rg */
    private static C2147qi m6316rg() {
        if (awH == null) {
            awH = new C2147qi();
        }
        return awH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bW */
    public C2128qd mo12192d(IBinder iBinder) {
        return C2128qd.C2129a.m6267bS(iBinder);
    }
}
