package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

/* renamed from: com.google.android.gms.wearable.internal.al */
public class C2740al implements SafeParcelable, Node {
    public static final Parcelable.Creator<C2740al> CREATOR = new C2741am();

    /* renamed from: CE */
    private final String f4547CE;

    /* renamed from: CK */
    final int f4548CK;

    /* renamed from: OS */
    private final String f4549OS;

    C2740al(int i, String str, String str2) {
        this.f4548CK = i;
        this.f4547CE = str;
        this.f4549OS = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2740al)) {
            return false;
        }
        C2740al alVar = (C2740al) obj;
        return alVar.f4547CE.equals(this.f4547CE) && alVar.f4549OS.equals(this.f4549OS);
    }

    public String getDisplayName() {
        return this.f4549OS;
    }

    public String getId() {
        return this.f4547CE;
    }

    public int hashCode() {
        return (37 * (629 + this.f4547CE.hashCode())) + this.f4549OS.hashCode();
    }

    public String toString() {
        return "NodeParcelable{" + this.f4547CE + "," + this.f4549OS + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2741am.m8064a(this, parcel, i);
    }
}
