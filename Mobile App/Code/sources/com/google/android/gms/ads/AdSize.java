package com.google.android.gms.ads;

import android.content.Context;
import android.support.p003v7.widget.helper.ItemTouchHelper;
import com.google.android.gms.internal.C1306ay;
import com.google.android.gms.internal.C1606gq;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    /* renamed from: li */
    private final int f74li;

    /* renamed from: lj */
    private final int f75lj;

    /* renamed from: lk */
    private final String f76lk;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdSize(int r3, int r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            if (r3 != r1) goto L_0x000b
            java.lang.String r1 = "FULL"
            goto L_0x000f
        L_0x000b:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L_0x000f:
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            r1 = -2
            if (r4 != r1) goto L_0x001d
            java.lang.String r1 = "AUTO"
            goto L_0x0021
        L_0x001d:
            java.lang.String r1 = java.lang.String.valueOf(r4)
        L_0x0021:
            r0.append(r1)
            java.lang.String r1 = "_as"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2) {
            this.f74li = i;
            this.f75lj = i2;
            this.f76lk = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f74li == adSize.f74li && this.f75lj == adSize.f75lj && this.f76lk.equals(adSize.f76lk);
    }

    public int getHeight() {
        return this.f75lj;
    }

    public int getHeightInPixels(Context context) {
        return this.f75lj == -2 ? C1306ay.m3949b(context.getResources().getDisplayMetrics()) : C1606gq.m4697a(context, this.f75lj);
    }

    public int getWidth() {
        return this.f74li;
    }

    public int getWidthInPixels(Context context) {
        return this.f74li == -1 ? C1306ay.m3948a(context.getResources().getDisplayMetrics()) : C1606gq.m4697a(context, this.f74li);
    }

    public int hashCode() {
        return this.f76lk.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f75lj == -2;
    }

    public boolean isFullWidth() {
        return this.f74li == -1;
    }

    public String toString() {
        return this.f76lk;
    }
}
