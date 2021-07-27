package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C0534a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C1507ey
/* renamed from: com.google.android.gms.internal.ay */
public final class C1306ay implements SafeParcelable {
    public static final C1307az CREATOR = new C1307az();
    public final int height;
    public final int heightPixels;

    /* renamed from: op */
    public final String f2397op;

    /* renamed from: oq */
    public final boolean f2398oq;

    /* renamed from: or */
    public final C1306ay[] f2399or;
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public C1306ay() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, (C1306ay[]) null);
    }

    C1306ay(int i, String str, int i2, int i3, boolean z, int i4, int i5, C1306ay[] ayVarArr) {
        this.versionCode = i;
        this.f2397op = str;
        this.height = i2;
        this.heightPixels = i3;
        this.f2398oq = z;
        this.width = i4;
        this.widthPixels = i5;
        this.f2399or = ayVarArr;
    }

    public C1306ay(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public C1306ay(Context context, AdSize[] adSizeArr) {
        int i;
        String str;
        AdSize adSize = adSizeArr[0];
        this.versionCode = 2;
        this.f2398oq = false;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
        boolean z = this.width == -1;
        boolean z2 = this.height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            this.widthPixels = m3948a(displayMetrics);
            i = (int) (((float) this.widthPixels) / displayMetrics.density);
        } else {
            i = this.width;
            this.widthPixels = C1606gq.m4698a(displayMetrics, this.width);
        }
        int c = z2 ? m3950c(displayMetrics) : this.height;
        this.heightPixels = C1606gq.m4698a(displayMetrics, c);
        if (z || z2) {
            str = i + "x" + c + "_as";
        } else {
            str = adSize.toString();
        }
        this.f2397op = str;
        if (adSizeArr.length > 1) {
            this.f2399or = new C1306ay[adSizeArr.length];
            for (int i2 = 0; i2 < adSizeArr.length; i2++) {
                this.f2399or[i2] = new C1306ay(context, adSizeArr[i2]);
            }
            return;
        }
        this.f2399or = null;
    }

    public C1306ay(C1306ay ayVar, C1306ay[] ayVarArr) {
        this(2, ayVar.f2397op, ayVar.height, ayVar.heightPixels, ayVar.f2398oq, ayVar.width, ayVar.widthPixels, ayVarArr);
    }

    /* renamed from: a */
    public static int m3948a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m3949b(DisplayMetrics displayMetrics) {
        return (int) (((float) m3950c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m3950c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: bh */
    public AdSize mo14821bh() {
        return C0534a.m22a(this.width, this.height, this.f2397op);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1307az.m3952a(this, parcel, i);
    }
}
