package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.iz */
public final class C1728iz extends Drawable implements Drawable.Callback {

    /* renamed from: LO */
    private boolean f3844LO;

    /* renamed from: LV */
    private int f3845LV;

    /* renamed from: LW */
    private long f3846LW;

    /* renamed from: LX */
    private int f3847LX;

    /* renamed from: LY */
    private int f3848LY;

    /* renamed from: LZ */
    private int f3849LZ;

    /* renamed from: Ma */
    private int f3850Ma;

    /* renamed from: Mb */
    private boolean f3851Mb;

    /* renamed from: Mc */
    private C1732b f3852Mc;

    /* renamed from: Md */
    private Drawable f3853Md;

    /* renamed from: Me */
    private Drawable f3854Me;

    /* renamed from: Mf */
    private boolean f3855Mf;

    /* renamed from: Mg */
    private boolean f3856Mg;

    /* renamed from: Mh */
    private boolean f3857Mh;

    /* renamed from: Mi */
    private int f3858Mi;
    private int mFrom;

    /* renamed from: com.google.android.gms.internal.iz$a */
    private static final class C1730a extends Drawable {
        /* access modifiers changed from: private */

        /* renamed from: Mj */
        public static final C1730a f3859Mj = new C1730a();

        /* renamed from: Mk */
        private static final C1731a f3860Mk = new C1731a();

        /* renamed from: com.google.android.gms.internal.iz$a$a */
        private static final class C1731a extends Drawable.ConstantState {
            private C1731a() {
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return C1730a.f3859Mj;
            }
        }

        private C1730a() {
        }

        public void draw(Canvas canvas) {
        }

        public Drawable.ConstantState getConstantState() {
            return f3860Mk;
        }

        public int getOpacity() {
            return -2;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.google.android.gms.internal.iz$b */
    static final class C1732b extends Drawable.ConstantState {

        /* renamed from: Ml */
        int f3861Ml;

        /* renamed from: Mm */
        int f3862Mm;

        C1732b(C1732b bVar) {
            if (bVar != null) {
                this.f3861Ml = bVar.f3861Ml;
                this.f3862Mm = bVar.f3862Mm;
            }
        }

        public int getChangingConfigurations() {
            return this.f3861Ml;
        }

        public Drawable newDrawable() {
            return new C1728iz(this);
        }
    }

    public C1728iz(Drawable drawable, Drawable drawable2) {
        this((C1732b) null);
        drawable = drawable == null ? C1730a.f3859Mj : drawable;
        this.f3853Md = drawable;
        drawable.setCallback(this);
        C1732b bVar = this.f3852Mc;
        bVar.f3862Mm = drawable.getChangingConfigurations() | bVar.f3862Mm;
        drawable2 = drawable2 == null ? C1730a.f3859Mj : drawable2;
        this.f3854Me = drawable2;
        drawable2.setCallback(this);
        C1732b bVar2 = this.f3852Mc;
        bVar2.f3862Mm = drawable2.getChangingConfigurations() | bVar2.f3862Mm;
    }

    C1728iz(C1732b bVar) {
        this.f3845LV = 0;
        this.f3848LY = 255;
        this.f3850Ma = 0;
        this.f3844LO = true;
        this.f3852Mc = new C1732b(bVar);
    }

    public boolean canConstantState() {
        if (!this.f3855Mf) {
            this.f3856Mg = (this.f3853Md.getConstantState() == null || this.f3854Me.getConstantState() == null) ? false : true;
            this.f3855Mf = true;
        }
        return this.f3856Mg;
    }

    public void draw(Canvas canvas) {
        boolean z = true;
        switch (this.f3845LV) {
            case 1:
                this.f3846LW = SystemClock.uptimeMillis();
                this.f3845LV = 2;
                z = false;
                break;
            case 2:
                if (this.f3846LW >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f3846LW)) / ((float) this.f3849LZ);
                    if (uptimeMillis < 1.0f) {
                        z = false;
                    }
                    if (z) {
                        this.f3845LV = 0;
                    }
                    this.f3850Ma = (int) (((float) this.mFrom) + (((float) (this.f3847LX - this.mFrom)) * Math.min(uptimeMillis, 1.0f)));
                    break;
                }
                break;
        }
        int i = this.f3850Ma;
        boolean z2 = this.f3844LO;
        Drawable drawable = this.f3853Md;
        Drawable drawable2 = this.f3854Me;
        if (z) {
            if (!z2 || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f3848LY) {
                drawable2.setAlpha(this.f3848LY);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.f3848LY - i);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.f3848LY);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f3848LY);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3852Mc.f3861Ml | this.f3852Mc.f3862Mm;
    }

    public Drawable.ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.f3852Mc.f3861Ml = getChangingConfigurations();
        return this.f3852Mc;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.f3853Md.getIntrinsicHeight(), this.f3854Me.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.f3853Md.getIntrinsicWidth(), this.f3854Me.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.f3857Mh) {
            this.f3858Mi = Drawable.resolveOpacity(this.f3853Md.getOpacity(), this.f3854Me.getOpacity());
            this.f3857Mh = true;
        }
        return this.f3858Mi;
    }

    /* renamed from: hh */
    public Drawable mo15754hh() {
        return this.f3854Me;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (C1840ll.m5538ig() && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public Drawable mutate() {
        if (!this.f3851Mb && super.mutate() == this) {
            if (!canConstantState()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f3853Md.mutate();
            this.f3854Me.mutate();
            this.f3851Mb = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3853Md.setBounds(rect);
        this.f3854Me.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (C1840ll.m5538ig() && (callback = getCallback()) != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f3850Ma == this.f3848LY) {
            this.f3850Ma = i;
        }
        this.f3848LY = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3853Md.setColorFilter(colorFilter);
        this.f3854Me.setColorFilter(colorFilter);
    }

    public void startTransition(int i) {
        this.mFrom = 0;
        this.f3847LX = this.f3848LY;
        this.f3850Ma = 0;
        this.f3849LZ = i;
        this.f3845LV = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (C1840ll.m5538ig() && (callback = getCallback()) != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
