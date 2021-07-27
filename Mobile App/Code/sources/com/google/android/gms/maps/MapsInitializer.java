package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2276c;
import com.google.android.gms.maps.internal.C2337x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    private MapsInitializer() {
    }

    /* renamed from: a */
    public static void m6675a(C2276c cVar) {
        try {
            CameraUpdateFactory.m6641a(cVar.mo17719nW());
            BitmapDescriptorFactory.m6806a(cVar.mo17720nX());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static int initialize(Context context) {
        C1785jx.m5364i(context);
        try {
            m6675a(C2337x.m6794S(context));
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return e.errorCode;
        }
    }
}
