package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.model.internal.C2371k;

public final class IndoorLevel {
    private final C2371k amj;

    public IndoorLevel(C2371k kVar) {
        this.amj = (C2371k) C1785jx.m5364i(kVar);
    }

    public void activate() {
        try {
            this.amj.activate();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.amj.mo18235a(((IndoorLevel) obj).amj);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getName() {
        try {
            return this.amj.getName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getShortName() {
        try {
            return this.amj.getShortName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.amj.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
