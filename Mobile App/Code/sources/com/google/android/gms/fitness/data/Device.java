package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1895mg;

public final class Device implements SafeParcelable {
    public static final Parcelable.Creator<Device> CREATOR = new C0990i();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;

    /* renamed from: CK */
    private final int f1379CK;

    /* renamed from: Gt */
    private final int f1380Gt;

    /* renamed from: TU */
    private final String f1381TU;

    /* renamed from: Uw */
    private final String f1382Uw;

    /* renamed from: Ux */
    private final String f1383Ux;

    /* renamed from: Uy */
    private final String f1384Uy;

    /* renamed from: Uz */
    private final int f1385Uz;

    Device(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.f1379CK = i;
        this.f1382Uw = (String) C1785jx.m5364i(str);
        this.f1383Ux = (String) C1785jx.m5364i(str2);
        this.f1381TU = "";
        this.f1384Uy = (String) C1785jx.m5364i(str4);
        this.f1380Gt = i2;
        this.f1385Uz = i3;
    }

    public Device(String str, String str2, String str3, int i) {
        this(str, str2, "", str3, i, 0);
    }

    public Device(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str4, i);
    }

    public Device(String str, String str2, String str3, String str4, int i, int i2) {
        this(1, str, str2, "", str4, i, i2);
    }

    /* renamed from: M */
    private static String m1671M(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: N */
    private static int m1672N(Context context) {
        switch (m1674P(context)) {
            case 8:
            case 9:
                return 0;
            case 10:
                return m1673O(context) ? 3 : 0;
            default:
                return m1676R(context) ? 1 : 2;
        }
    }

    /* renamed from: O */
    public static boolean m1673O(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    /* renamed from: P */
    private static int m1674P(Context context) {
        return ((m1675Q(context) % 1000) / 100) + 5;
    }

    /* renamed from: Q */
    private static int m1675Q(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
    }

    /* renamed from: R */
    private static boolean m1676R(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
    }

    /* renamed from: a */
    private boolean m1677a(Device device) {
        return C1781jv.equal(this.f1382Uw, device.f1382Uw) && C1781jv.equal(this.f1383Ux, device.f1383Ux) && C1781jv.equal(this.f1381TU, device.f1381TU) && C1781jv.equal(this.f1384Uy, device.f1384Uy) && this.f1380Gt == device.f1380Gt && this.f1385Uz == device.f1385Uz;
    }

    public static Device getLocalDevice(Context context) {
        int N = m1672N(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, m1671M(context), N, 2);
    }

    /* renamed from: jD */
    private boolean m1678jD() {
        return mo12346jC() == 1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Device) && m1677a((Device) obj);
        }
        return true;
    }

    public String getManufacturer() {
        return this.f1382Uw;
    }

    public String getModel() {
        return this.f1383Ux;
    }

    /* access modifiers changed from: package-private */
    public String getStreamIdentifier() {
        return String.format("%s:%s:%s", new Object[]{this.f1382Uw, this.f1383Ux, this.f1384Uy});
    }

    public int getType() {
        return this.f1380Gt;
    }

    public String getUid() {
        return this.f1384Uy;
    }

    public String getVersion() {
        return this.f1381TU;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1379CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1382Uw, this.f1383Ux, this.f1381TU, this.f1384Uy, Integer.valueOf(this.f1380Gt));
    }

    /* renamed from: jC */
    public int mo12346jC() {
        return this.f1385Uz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jE */
    public Device mo12347jE() {
        return new Device(C1895mg.m5643bw(this.f1382Uw), C1895mg.m5643bw(this.f1383Ux), C1895mg.m5643bw(this.f1381TU), this.f1384Uy, this.f1380Gt);
    }

    /* renamed from: jF */
    public String mo12348jF() {
        return (C1895mg.m5645jN() || m1678jD()) ? this.f1384Uy : C1895mg.m5643bw(this.f1384Uy);
    }

    public String toString() {
        return String.format("Device{%s:%s:%s:%s}", new Object[]{getStreamIdentifier(), this.f1381TU, Integer.valueOf(this.f1380Gt), Integer.valueOf(this.f1385Uz)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0990i.m1737a(this, parcel, i);
    }
}
