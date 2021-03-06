package com.google.android.gms.wallet.fragment;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Dimension {
    public static final int MATCH_PARENT = -1;
    public static final int UNIT_DIP = 1;
    public static final int UNIT_IN = 4;
    public static final int UNIT_MM = 5;
    public static final int UNIT_PT = 3;
    public static final int UNIT_PX = 0;
    public static final int UNIT_SP = 2;
    public static final int WRAP_CONTENT = -2;

    private Dimension() {
    }

    /* renamed from: a */
    public static int m7736a(long j, DisplayMetrics displayMetrics) {
        int i;
        int i2 = (int) (j >>> 32);
        int i3 = (int) j;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            default:
                switch (i2) {
                    case 128:
                        return TypedValue.complexToDimensionPixelSize(i3, displayMetrics);
                    case 129:
                        return i3;
                    default:
                        throw new IllegalStateException("Unexpected unit or type: " + i2);
                }
        }
        return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(i3), displayMetrics));
    }

    /* renamed from: a */
    public static long m7737a(int i, float f) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return m7740p(i, Float.floatToIntBits(f));
            default:
                throw new IllegalArgumentException("Unrecognized unit: " + i);
        }
    }

    /* renamed from: a */
    public static long m7738a(TypedValue typedValue) {
        int i = typedValue.type;
        if (i == 5) {
            return m7740p(128, typedValue.data);
        }
        if (i == 16) {
            return m7739gg(typedValue.data);
        }
        throw new IllegalArgumentException("Unexpected dimension type: " + typedValue.type);
    }

    /* renamed from: gg */
    public static long m7739gg(int i) {
        if (i >= 0) {
            return m7737a(0, (float) i);
        }
        if (i == -1 || i == -2) {
            return m7740p(129, i);
        }
        throw new IllegalArgumentException("Unexpected dimension value: " + i);
    }

    /* renamed from: p */
    private static long m7740p(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
