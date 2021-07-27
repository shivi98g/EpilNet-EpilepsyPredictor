package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0530R;

/* renamed from: com.google.android.gms.internal.jz */
public final class C1787jz extends Button {
    public C1787jz(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1787jz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: b */
    private int m5369b(int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* renamed from: b */
    private void m5370b(Resources resources, int i, int i2) {
        int i3;
        int i4;
        switch (i) {
            case 0:
            case 1:
                i3 = C0530R.C0531drawable.common_signin_btn_text_dark;
                i4 = C0530R.C0531drawable.common_signin_btn_text_light;
                break;
            case 2:
                i3 = C0530R.C0531drawable.common_signin_btn_icon_dark;
                i4 = C0530R.C0531drawable.common_signin_btn_icon_light;
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        int b = m5369b(i2, i3, i4);
        if (b == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(b));
    }

    /* renamed from: c */
    private void m5371c(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i);
        setMinWidth(i);
    }

    /* renamed from: c */
    private void m5372c(Resources resources, int i, int i2) {
        String str;
        int i3;
        setTextColor(resources.getColorStateList(m5369b(i2, C0530R.color.common_signin_btn_text_dark, C0530R.color.common_signin_btn_text_light)));
        switch (i) {
            case 0:
                i3 = C0530R.string.common_signin_button_text;
                break;
            case 1:
                i3 = C0530R.string.common_signin_button_text_long;
                break;
            case 2:
                str = null;
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        str = resources.getString(i3);
        setText(str);
    }

    /* renamed from: a */
    public void mo15942a(Resources resources, int i, int i2) {
        C1785jx.m5356a(i >= 0 && i < 3, "Unknown button size %d", Integer.valueOf(i));
        C1785jx.m5356a(i2 >= 0 && i2 < 2, "Unknown color scheme %s", Integer.valueOf(i2));
        m5371c(resources);
        m5370b(resources, i, i2);
        m5372c(resources, i, i2);
    }
}
