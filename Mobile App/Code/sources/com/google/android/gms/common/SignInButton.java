package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1786jy;
import com.google.android.gms.internal.C1787jz;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;

    /* renamed from: Jk */
    private View f618Jk;

    /* renamed from: Jl */
    private View.OnClickListener f619Jl;
    private int mColor;
    private int mSize;

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f619Jl = null;
        setStyle(0, 0);
    }

    /* renamed from: G */
    private void m496G(Context context) {
        if (this.f618Jk != null) {
            removeView(this.f618Jk);
        }
        try {
            this.f618Jk = C1786jy.m5365b(context, this.mSize, this.mColor);
        } catch (C0972g.C0973a e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f618Jk = m497a(context, this.mSize, this.mColor);
        }
        addView(this.f618Jk);
        this.f618Jk.setEnabled(isEnabled());
        this.f618Jk.setOnClickListener(this);
    }

    /* renamed from: a */
    private static Button m497a(Context context, int i, int i2) {
        C1787jz jzVar = new C1787jz(context);
        jzVar.mo15942a(context.getResources(), i, i2);
        return jzVar;
    }

    public void onClick(View view) {
        if (this.f619Jl != null && view == this.f618Jk) {
            this.f619Jl.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.mSize, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f618Jk.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f619Jl = onClickListener;
        if (this.f618Jk != null) {
            this.f618Jk.setOnClickListener(this);
        }
    }

    public void setSize(int i) {
        setStyle(i, this.mColor);
    }

    public void setStyle(int i, int i2) {
        C1785jx.m5356a(i >= 0 && i < 3, "Unknown button size %d", Integer.valueOf(i));
        C1785jx.m5356a(i2 >= 0 && i2 < 2, "Unknown color scheme %s", Integer.valueOf(i2));
        this.mSize = i;
        this.mColor = i2;
        m496G(getContext());
    }
}
