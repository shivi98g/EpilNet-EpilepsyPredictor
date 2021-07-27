package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public class Asset implements SafeParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new C2701a();

    /* renamed from: CK */
    final int f4522CK;
    private byte[] aeA;
    private String axa;
    public ParcelFileDescriptor axb;
    public Uri uri;

    Asset(int i, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri2) {
        this.f4522CK = i;
        this.aeA = bArr;
        this.axa = str;
        this.axb = parcelFileDescriptor;
        this.uri = uri2;
    }

    public static Asset createFromBytes(byte[] bArr) {
        if (bArr != null) {
            return new Asset(1, bArr, (String) null, (ParcelFileDescriptor) null, (Uri) null);
        }
        throw new IllegalArgumentException("Asset data cannot be null");
    }

    public static Asset createFromFd(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(1, (byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    public static Asset createFromRef(String str) {
        if (str != null) {
            return new Asset(1, (byte[]) null, str, (ParcelFileDescriptor) null, (Uri) null);
        }
        throw new IllegalArgumentException("Asset digest cannot be null");
    }

    public static Asset createFromUri(Uri uri2) {
        if (uri2 != null) {
            return new Asset(1, (byte[]) null, (String) null, (ParcelFileDescriptor) null, uri2);
        }
        throw new IllegalArgumentException("Asset uri cannot be null");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return C1781jv.equal(this.aeA, asset.aeA) && C1781jv.equal(this.axa, asset.axa) && C1781jv.equal(this.axb, asset.axb) && C1781jv.equal(this.uri, asset.uri);
    }

    public byte[] getData() {
        return this.aeA;
    }

    public String getDigest() {
        return this.axa;
    }

    public ParcelFileDescriptor getFd() {
        return this.axb;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.aeA, this.axa, this.axb, this.uri);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.axa == null) {
            str = ", nodigest";
        } else {
            sb.append(", ");
            str = this.axa;
        }
        sb.append(str);
        if (this.aeA != null) {
            sb.append(", size=");
            sb.append(this.aeA.length);
        }
        if (this.axb != null) {
            sb.append(", fd=");
            sb.append(this.axb);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2701a.m7907a(this, parcel, i | 1);
    }
}
