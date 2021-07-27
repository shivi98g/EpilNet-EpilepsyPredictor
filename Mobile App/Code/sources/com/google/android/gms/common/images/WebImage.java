package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.plus.PlusShare;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage implements SafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C0720b();

    /* renamed from: CK */
    private final int f818CK;

    /* renamed from: LU */
    private final Uri f819LU;

    /* renamed from: li */
    private final int f820li;

    /* renamed from: lj */
    private final int f821lj;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f818CK = i;
        this.f819LU = uri;
        this.f820li = i2;
        this.f821lj = i3;
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        this(m692d(jSONObject), jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    /* renamed from: d */
    private static Uri m692d(JSONObject jSONObject) {
        if (!jSONObject.has(PlusShare.KEY_CALL_TO_ACTION_URL)) {
            return null;
        }
        try {
            return Uri.parse(jSONObject.getString(PlusShare.KEY_CALL_TO_ACTION_URL));
        } catch (JSONException e) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C1781jv.equal(this.f819LU, webImage.f819LU) && this.f820li == webImage.f820li && this.f821lj == webImage.f821lj;
    }

    public int getHeight() {
        return this.f821lj;
    }

    public Uri getUrl() {
        return this.f819LU;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f818CK;
    }

    public int getWidth() {
        return this.f820li;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f819LU, Integer.valueOf(this.f820li), Integer.valueOf(this.f821lj));
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PlusShare.KEY_CALL_TO_ACTION_URL, this.f819LU.toString());
            jSONObject.put("width", this.f820li);
            jSONObject.put("height", this.f821lj);
            return jSONObject;
        } catch (JSONException e) {
            return jSONObject;
        }
    }

    public String toString() {
        return String.format("Image %dx%d %s", new Object[]{Integer.valueOf(this.f820li), Integer.valueOf(this.f821lj), this.f819LU.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0720b.m705a(this, parcel, i);
    }
}
