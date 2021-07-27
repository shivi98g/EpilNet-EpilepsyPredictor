package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi;

/* renamed from: com.google.android.gms.internal.on */
class C2045on implements PanoramaApi.PanoramaResult {

    /* renamed from: Eb */
    private final Status f4167Eb;
    private final Intent amR;

    public C2045on(Status status, Intent intent) {
        this.f4167Eb = (Status) C1785jx.m5364i(status);
        this.amR = intent;
    }

    public Status getStatus() {
        return this.f4167Eb;
    }

    public Intent getViewerIntent() {
        return this.amR;
    }
}
