package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1789ka;
import com.google.android.gms.plus.internal.C2442g;

public final class PlusOneButton extends FrameLayout {
    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    /* access modifiers changed from: private */
    public int anA;
    private OnPlusOneClickListener anB;
    /* access modifiers changed from: private */
    public View any;
    private int anz;
    private int mSize;

    /* renamed from: vf */
    private String f4370vf;

    protected class DefaultOnPlusOneClickListener implements View.OnClickListener, OnPlusOneClickListener {
        private final OnPlusOneClickListener anC;

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onPlusOneClickListener) {
            this.anC = onPlusOneClickListener;
        }

        public void onClick(View view) {
            Intent intent = (Intent) PlusOneButton.this.any.getTag();
            if (this.anC != null) {
                this.anC.onPlusOneClick(intent);
            } else {
                onPlusOneClick(intent);
            }
        }

        public void onPlusOneClick(Intent intent) {
            Context context = PlusOneButton.this.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, PlusOneButton.this.anA);
            }
        }
    }

    public interface OnPlusOneClickListener {
        void onPlusOneClick(Intent intent);
    }

    public PlusOneButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSize = getSize(context, attributeSet);
        this.anz = getAnnotation(context, attributeSet);
        this.anA = -1;
        m6964G(getContext());
        if (isInEditMode()) {
        }
    }

    /* renamed from: G */
    private void m6964G(Context context) {
        if (this.any != null) {
            removeView(this.any);
        }
        this.any = C2442g.m7080a(context, this.mSize, this.anz, this.f4370vf, this.anA);
        setOnPlusOneClickListener(this.anB);
        addView(this.any);
    }

    protected static int getAnnotation(Context context, AttributeSet attributeSet) {
        String a = C1789ka.m5382a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(a)) {
            return 2;
        }
        return "NONE".equalsIgnoreCase(a) ? 0 : 1;
    }

    protected static int getSize(Context context, AttributeSet attributeSet) {
        String a = C1789ka.m5382a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    public void initialize(String str, int i) {
        C1785jx.m5355a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.f4370vf = str;
        this.anA = i;
        m6964G(getContext());
    }

    public void initialize(String str, OnPlusOneClickListener onPlusOneClickListener) {
        this.f4370vf = str;
        this.anA = 0;
        m6964G(getContext());
        setOnPlusOneClickListener(onPlusOneClickListener);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.any.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.any;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.anz = i;
        m6964G(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onPlusOneClickListener) {
        this.anB = onPlusOneClickListener;
        this.any.setOnClickListener(new DefaultOnPlusOneClickListener(onPlusOneClickListener));
    }

    public void setSize(int i) {
        this.mSize = i;
        m6964G(getContext());
    }
}
