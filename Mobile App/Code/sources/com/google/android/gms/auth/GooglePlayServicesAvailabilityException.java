package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: Eo */
    private final int f456Eo;

    GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.f456Eo = i;
    }

    public int getConnectionStatusCode() {
        return this.f456Eo;
    }
}
