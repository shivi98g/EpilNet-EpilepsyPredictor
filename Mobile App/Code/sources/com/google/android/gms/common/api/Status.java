package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class Status implements Result, SafeParcelable {
    public static final StatusCreator CREATOR = new StatusCreator();

    /* renamed from: KA */
    public static final Status f662KA = new Status(16);

    /* renamed from: Kw */
    public static final Status f663Kw = new Status(0);

    /* renamed from: Kx */
    public static final Status f664Kx = new Status(14);

    /* renamed from: Ky */
    public static final Status f665Ky = new Status(8);

    /* renamed from: Kz */
    public static final Status f666Kz = new Status(15);

    /* renamed from: CK */
    private final int f667CK;

    /* renamed from: Iv */
    private final int f668Iv;

    /* renamed from: KB */
    private final String f669KB;
    private final PendingIntent mPendingIntent;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f667CK = i;
        this.f668Iv = i2;
        this.f669KB = str;
        this.mPendingIntent = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: gt */
    private String m546gt() {
        return this.f669KB != null ? this.f669KB : CommonStatusCodes.getStatusCodeString(this.f668Iv);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f667CK == status.f667CK && this.f668Iv == status.f668Iv && C1781jv.equal(this.f669KB, status.f669KB) && C1781jv.equal(this.mPendingIntent, status.mPendingIntent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gP */
    public PendingIntent mo10981gP() {
        return this.mPendingIntent;
    }

    @Deprecated
    /* renamed from: gQ */
    public ConnectionResult mo10982gQ() {
        return new ConnectionResult(this.f668Iv, this.mPendingIntent);
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.f668Iv;
    }

    public String getStatusMessage() {
        return this.f669KB;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f667CK;
    }

    public boolean hasResolution() {
        return this.mPendingIntent != null;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f667CK), Integer.valueOf(this.f668Iv), this.f669KB, this.mPendingIntent);
    }

    public boolean isCanceled() {
        return this.f668Iv == 16;
    }

    public boolean isInterrupted() {
        return this.f668Iv == 14;
    }

    public boolean isSuccess() {
        return this.f668Iv <= 0;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("statusCode", m546gt()).mo15935a("resolution", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        StatusCreator.m549a(this, parcel, i);
    }
}
