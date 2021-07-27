package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p003v7.widget.helper.ItemTouchHelper;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.internal.C1728iz;
import com.google.android.gms.internal.C1736ja;
import com.google.android.gms.internal.C1737jb;
import com.google.android.gms.internal.C1739jc;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1781jv;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C0716a {

    /* renamed from: LJ */
    final C0717a f822LJ;

    /* renamed from: LK */
    protected int f823LK = 0;

    /* renamed from: LL */
    protected int f824LL = 0;

    /* renamed from: LM */
    protected boolean f825LM = false;

    /* renamed from: LN */
    protected ImageManager.OnImageLoadedListener f826LN;

    /* renamed from: LO */
    private boolean f827LO = true;

    /* renamed from: LP */
    private boolean f828LP = false;

    /* renamed from: LQ */
    private boolean f829LQ = true;

    /* renamed from: LR */
    protected int f830LR;

    /* renamed from: com.google.android.gms.common.images.a$a */
    static final class C0717a {
        public final Uri uri;

        public C0717a(Uri uri2) {
            this.uri = uri2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0717a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return C1781jv.equal(((C0717a) obj).uri, this.uri);
        }

        public int hashCode() {
            return C1781jv.hashCode(this.uri);
        }
    }

    /* renamed from: com.google.android.gms.common.images.a$b */
    public static final class C0718b extends C0716a {

        /* renamed from: LS */
        private WeakReference<ImageView> f831LS;

        public C0718b(ImageView imageView, int i) {
            super((Uri) null, i);
            C1742je.m5156f(imageView);
            this.f831LS = new WeakReference<>(imageView);
        }

        public C0718b(ImageView imageView, Uri uri) {
            super(uri, 0);
            C1742je.m5156f(imageView);
            this.f831LS = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        private void m702a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
            int i = 0;
            boolean z4 = !z2 && !z3;
            if (z4 && (imageView instanceof C1737jb)) {
                int hj = ((C1737jb) imageView).mo15779hj();
                if (this.f824LL != 0 && hj == this.f824LL) {
                    return;
                }
            }
            boolean b = mo11140b(z, z2);
            if (this.f825LM && drawable != null) {
                drawable = drawable.getConstantState().newDrawable();
            }
            if (b) {
                drawable = mo11134a(imageView.getDrawable(), drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof C1737jb) {
                C1737jb jbVar = (C1737jb) imageView;
                jbVar.mo15778g(z3 ? this.f822LJ.uri : null);
                if (z4) {
                    i = this.f824LL;
                }
                jbVar.mo15777aB(i);
            }
            if (b) {
                ((C1728iz) drawable).startTransition(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11138a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageView imageView = (ImageView) this.f831LS.get();
            if (imageView != null) {
                m702a(imageView, drawable, z, z2, z3);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0718b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageView imageView = (ImageView) this.f831LS.get();
            ImageView imageView2 = (ImageView) ((C0718b) obj).f831LS.get();
            return (imageView2 == null || imageView == null || !C1781jv.equal(imageView2, imageView)) ? false : true;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: com.google.android.gms.common.images.a$c */
    public static final class C0719c extends C0716a {

        /* renamed from: LT */
        private WeakReference<ImageManager.OnImageLoadedListener> f832LT;

        public C0719c(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
            super(uri, 0);
            C1742je.m5156f(onImageLoadedListener);
            this.f832LT = new WeakReference<>(onImageLoadedListener);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11138a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageManager.OnImageLoadedListener onImageLoadedListener;
            if (!z2 && (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f832LT.get()) != null) {
                onImageLoadedListener.onImageLoaded(this.f822LJ.uri, drawable, z3);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0719c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0719c cVar = (C0719c) obj;
            ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f832LT.get();
            ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) cVar.f832LT.get();
            return onImageLoadedListener2 != null && onImageLoadedListener != null && C1781jv.equal(onImageLoadedListener2, onImageLoadedListener) && C1781jv.equal(cVar.f822LJ, this.f822LJ);
        }

        public int hashCode() {
            return C1781jv.hashCode(this.f822LJ);
        }
    }

    public C0716a(Uri uri, int i) {
        this.f822LJ = new C0717a(uri);
        this.f824LL = i;
    }

    /* renamed from: a */
    private Drawable m693a(Context context, C1739jc jcVar, int i) {
        Resources resources = context.getResources();
        if (this.f830LR <= 0) {
            return resources.getDrawable(i);
        }
        C1739jc.C1740a aVar = new C1739jc.C1740a(i, this.f830LR);
        Drawable drawable = (Drawable) jcVar.get(aVar);
        if (drawable == null) {
            Drawable drawable2 = resources.getDrawable(i);
            drawable = (this.f830LR & 1) != 0 ? mo11133a(resources, drawable2) : drawable2;
            jcVar.put(aVar, drawable);
        }
        return drawable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo11133a(Resources resources, Drawable drawable) {
        return C1736ja.m5145a(resources, drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1728iz mo11134a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof C1728iz) {
            drawable = ((C1728iz) drawable).mo15754hh();
        }
        return new C1728iz(drawable, drawable2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11135a(Context context, Bitmap bitmap, boolean z) {
        C1742je.m5156f(bitmap);
        if ((this.f830LR & 1) != 0) {
            bitmap = C1736ja.m5143a(bitmap);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        if (this.f826LN != null) {
            this.f826LN.onImageLoaded(this.f822LJ.uri, bitmapDrawable, true);
        }
        mo11138a(bitmapDrawable, z, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11136a(Context context, C1739jc jcVar) {
        if (this.f829LQ) {
            Drawable drawable = null;
            if (this.f823LK != 0) {
                drawable = m693a(context, jcVar, this.f823LK);
            }
            mo11138a(drawable, false, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11137a(Context context, C1739jc jcVar, boolean z) {
        Drawable a = this.f824LL != 0 ? m693a(context, jcVar, this.f824LL) : null;
        if (this.f826LN != null) {
            this.f826LN.onImageLoaded(this.f822LJ.uri, a, false);
        }
        mo11138a(a, z, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11138a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* renamed from: az */
    public void mo11139az(int i) {
        this.f824LL = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo11140b(boolean z, boolean z2) {
        if (!this.f827LO || z2) {
            return false;
        }
        return !z || this.f828LP;
    }
}
