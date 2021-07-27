package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomPropertyKey implements SafeParcelable {
    public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new C0868c();
    public static final int PRIVATE = 1;
    public static final int PUBLIC = 0;

    /* renamed from: Rc */
    private static final Pattern f1138Rc = Pattern.compile("[\\w.!@$%^&*()/-]+");

    /* renamed from: CK */
    final int f1139CK;

    /* renamed from: KP */
    final String f1140KP;
    final int mVisibility;

    CustomPropertyKey(int i, String str, int i2) {
        C1785jx.m5359b(str, (Object) "key");
        C1785jx.m5361b(f1138Rc.matcher(str).matches(), (Object) "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        boolean z = true;
        if (!(i2 == 0 || i2 == 1)) {
            z = false;
        }
        C1785jx.m5361b(z, (Object) "visibility must be either PUBLIC or PRIVATE");
        this.f1139CK = i;
        this.f1140KP = str;
        this.mVisibility = i2;
    }

    public CustomPropertyKey(String str, int i) {
        this(1, str, i);
    }

    public static CustomPropertyKey fromJson(JSONObject jSONObject) throws JSONException {
        return new CustomPropertyKey(jSONObject.getString("key"), jSONObject.getInt("visibility"));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomPropertyKey)) {
            return false;
        }
        CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
        return customPropertyKey.getKey().equals(this.f1140KP) && customPropertyKey.getVisibility() == this.mVisibility;
    }

    public String getKey() {
        return this.f1140KP;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int hashCode() {
        return (this.f1140KP + this.mVisibility).hashCode();
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", getKey());
        jSONObject.put("visibility", getVisibility());
        return jSONObject;
    }

    public String toString() {
        return "CustomPropertyKey(" + this.f1140KP + "," + this.mVisibility + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0868c.m1246a(this, parcel, i);
    }
}
