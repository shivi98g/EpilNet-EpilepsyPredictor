package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1706in;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;

public final class ApplicationMetadata implements SafeParcelable {
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new C0661a();

    /* renamed from: CK */
    private final int f457CK;

    /* renamed from: Fo */
    String f458Fo;

    /* renamed from: Fp */
    List<WebImage> f459Fp;

    /* renamed from: Fq */
    List<String> f460Fq;

    /* renamed from: Fr */
    String f461Fr;

    /* renamed from: Fs */
    Uri f462Fs;
    String mName;

    private ApplicationMetadata() {
        this.f457CK = 1;
        this.f459Fp = new ArrayList();
        this.f460Fq = new ArrayList();
    }

    ApplicationMetadata(int i, String str, String str2, List<WebImage> list, List<String> list2, String str3, Uri uri) {
        this.f457CK = i;
        this.f458Fo = str;
        this.mName = str2;
        this.f459Fp = list;
        this.f460Fq = list2;
        this.f461Fr = str3;
        this.f462Fs = uri;
    }

    public boolean areNamespacesSupported(List<String> list) {
        return this.f460Fq != null && this.f460Fq.containsAll(list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return C1706in.m5031a(this.f458Fo, applicationMetadata.f458Fo) && C1706in.m5031a(this.f459Fp, applicationMetadata.f459Fp) && C1706in.m5031a(this.mName, applicationMetadata.mName) && C1706in.m5031a(this.f460Fq, applicationMetadata.f460Fq) && C1706in.m5031a(this.f461Fr, applicationMetadata.f461Fr) && C1706in.m5031a(this.f462Fs, applicationMetadata.f462Fs);
    }

    /* renamed from: fP */
    public Uri mo10600fP() {
        return this.f462Fs;
    }

    public String getApplicationId() {
        return this.f458Fo;
    }

    public List<WebImage> getImages() {
        return this.f459Fp;
    }

    public String getName() {
        return this.mName;
    }

    public String getSenderAppIdentifier() {
        return this.f461Fr;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f457CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f457CK), this.f458Fo, this.mName, this.f459Fp, this.f460Fq, this.f461Fr, this.f462Fs);
    }

    public boolean isNamespaceSupported(String str) {
        return this.f460Fq != null && this.f460Fq.contains(str);
    }

    public String toString() {
        return this.mName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0661a.m462a(this, parcel, i);
    }
}
