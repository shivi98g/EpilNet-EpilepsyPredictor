package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: Eo */
    private final int f612Eo;

    GooglePlayServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f612Eo = i;
    }

    public int getConnectionStatusCode() {
        return this.f612Eo;
    }
}
