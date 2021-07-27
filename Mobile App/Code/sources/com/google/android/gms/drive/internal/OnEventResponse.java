package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;

public class OnEventResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnEventResponse> CREATOR = new C0774aq();

    /* renamed from: CK */
    final int f982CK;

    /* renamed from: Pm */
    final int f983Pm;

    /* renamed from: QO */
    final ChangeEvent f984QO;

    /* renamed from: QP */
    final CompletionEvent f985QP;

    OnEventResponse(int i, int i2, ChangeEvent changeEvent, CompletionEvent completionEvent) {
        this.f982CK = i;
        this.f983Pm = i2;
        this.f984QO = changeEvent;
        this.f985QP = completionEvent;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iQ */
    public DriveEvent mo11425iQ() {
        switch (this.f983Pm) {
            case 1:
                return this.f984QO;
            case 2:
                return this.f985QP;
            default:
                throw new IllegalStateException("Unexpected event type " + this.f983Pm);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0774aq.m1017a(this, parcel, i);
    }
}
