package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.C0992k;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.internal.C1785jx;
import java.util.List;

/* renamed from: com.google.android.gms.fitness.service.b */
class C1078b implements SensorEventDispatcher {

    /* renamed from: VW */
    private final C0992k f1635VW;

    C1078b(C0992k kVar) {
        this.f1635VW = (C0992k) C1785jx.m5364i(kVar);
    }

    public void publish(DataPoint dataPoint) throws RemoteException {
        this.f1635VW.mo12476c(dataPoint);
    }

    public void publish(List<DataPoint> list) throws RemoteException {
        for (DataPoint publish : list) {
            publish(publish);
        }
    }
}
