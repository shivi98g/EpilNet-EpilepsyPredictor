package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: com.google.android.gms.internal.jb */
public final class C1737jb extends ImageView {

    /* renamed from: Mn */
    private Uri f3869Mn;

    /* renamed from: Mo */
    private int f3870Mo;

    /* renamed from: Mp */
    private int f3871Mp;

    /* renamed from: Mq */
    private C1738a f3872Mq;

    /* renamed from: Mr */
    private int f3873Mr;

    /* renamed from: Ms */
    private float f3874Ms;

    /* renamed from: com.google.android.gms.internal.jb$a */
    public interface C1738a {
        /* renamed from: g */
        Path mo15782g(int i, int i2);
    }

    /* renamed from: aB */
    public void mo15777aB(int i) {
        this.f3870Mo = i;
    }

    /* renamed from: g */
    public void mo15778g(Uri uri) {
        this.f3869Mn = uri;
    }

    /* renamed from: hj */
    public int mo15779hj() {
        return this.f3870Mo;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f3872Mq != null) {
            canvas.clipPath(this.f3872Mq.mo15782g(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (this.f3871Mp != 0) {
            canvas.drawColor(this.f3871Mp);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        switch (this.f3873Mr) {
            case 1:
                i3 = getMeasuredHeight();
                i4 = (int) (((float) i3) * this.f3874Ms);
                break;
            case 2:
                i4 = getMeasuredWidth();
                i3 = (int) (((float) i4) / this.f3874Ms);
                break;
            default:
                return;
        }
        setMeasuredDimension(i4, i3);
    }
}
