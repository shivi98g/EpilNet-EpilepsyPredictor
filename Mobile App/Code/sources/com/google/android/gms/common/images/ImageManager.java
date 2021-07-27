package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.images.C0716a;
import com.google.android.gms.internal.C1739jc;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1806kj;
import com.google.android.gms.internal.C1840ll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: Lu */
    public static final Object f798Lu = new Object();
    /* access modifiers changed from: private */

    /* renamed from: Lv */
    public static HashSet<Uri> f799Lv = new HashSet<>();

    /* renamed from: Lw */
    private static ImageManager f800Lw;

    /* renamed from: Lx */
    private static ImageManager f801Lx;
    /* access modifiers changed from: private */

    /* renamed from: LA */
    public final C1739jc f802LA;
    /* access modifiers changed from: private */

    /* renamed from: LB */
    public final Map<C0716a, ImageReceiver> f803LB;
    /* access modifiers changed from: private */

    /* renamed from: LC */
    public final Map<Uri, ImageReceiver> f804LC;
    /* access modifiers changed from: private */

    /* renamed from: LD */
    public final Map<Uri, Long> f805LD;
    /* access modifiers changed from: private */

    /* renamed from: Ly */
    public final ExecutorService f806Ly = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: Lz */
    public final C0711b f807Lz;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    private final class ImageReceiver extends ResultReceiver {
        /* access modifiers changed from: private */

        /* renamed from: LE */
        public final ArrayList<C0716a> f808LE = new ArrayList<>();
        private final Uri mUri;

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
        }

        /* renamed from: b */
        public void mo11108b(C0716a aVar) {
            C1742je.m5154aU("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f808LE.add(aVar);
        }

        /* renamed from: c */
        public void mo11109c(C0716a aVar) {
            C1742je.m5154aU("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f808LE.remove(aVar);
        }

        /* renamed from: hg */
        public void mo11110hg() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.f806Ly.execute(new C0712c(this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    private static final class C0710a {
        /* renamed from: a */
        static int m687a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private static final class C0711b extends C1806kj<C0716a.C0717a, Bitmap> {
        public C0711b(Context context) {
            super(m688I(context));
        }

        /* renamed from: I */
        private static int m688I(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (int) (0.33f * ((float) (1048576 * ((!((context.getApplicationInfo().flags & 1048576) != 0) || !C1840ll.m5538ig()) ? activityManager.getMemoryClass() : C0710a.m687a(activityManager)))));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(C0716a.C0717a aVar, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z, C0716a.C0717a aVar, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, aVar, bitmap, bitmap2);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C0712c implements Runnable {

        /* renamed from: LG */
        private final ParcelFileDescriptor f811LG;
        private final Uri mUri;

        public C0712c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.f811LG = parcelFileDescriptor;
        }

        public void run() {
            C1742je.m5155aV("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.f811LG != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.f811LG.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, e);
                    z = true;
                }
                try {
                    this.f811LG.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler g = ImageManager.this.mHandler;
            ImageManager imageManager = ImageManager.this;
            Uri uri = this.mUri;
            g.post(new C0715f(uri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class C0713d implements Runnable {

        /* renamed from: LH */
        private final C0716a f813LH;

        public C0713d(C0716a aVar) {
            this.f813LH = aVar;
        }

        public void run() {
            C1742je.m5154aU("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f803LB.get(this.f813LH);
            if (imageReceiver != null) {
                ImageManager.this.f803LB.remove(this.f813LH);
                imageReceiver.mo11109c(this.f813LH);
            }
            C0716a.C0717a aVar = this.f813LH.f822LJ;
            if (aVar.uri == null) {
                this.f813LH.mo11137a(ImageManager.this.mContext, ImageManager.this.f802LA, true);
                return;
            }
            Bitmap a = ImageManager.this.m669a(aVar);
            if (a != null) {
                this.f813LH.mo11135a(ImageManager.this.mContext, a, true);
                return;
            }
            Long l = (Long) ImageManager.this.f805LD.get(aVar.uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.f813LH.mo11137a(ImageManager.this.mContext, ImageManager.this.f802LA, true);
                    return;
                }
                ImageManager.this.f805LD.remove(aVar.uri);
            }
            this.f813LH.mo11136a(ImageManager.this.mContext, ImageManager.this.f802LA);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.f804LC.get(aVar.uri);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(aVar.uri);
                ImageManager.this.f804LC.put(aVar.uri, imageReceiver2);
            }
            imageReceiver2.mo11108b(this.f813LH);
            if (!(this.f813LH instanceof C0716a.C0719c)) {
                ImageManager.this.f803LB.put(this.f813LH, imageReceiver2);
            }
            synchronized (ImageManager.f798Lu) {
                if (!ImageManager.f799Lv.contains(aVar.uri)) {
                    ImageManager.f799Lv.add(aVar.uri);
                    imageReceiver2.mo11110hg();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$e */
    private static final class C0714e implements ComponentCallbacks2 {

        /* renamed from: Lz */
        private final C0711b f814Lz;

        public C0714e(C0711b bVar) {
            this.f814Lz = bVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
            this.f814Lz.evictAll();
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                this.f814Lz.evictAll();
            } else if (i >= 20) {
                this.f814Lz.trimToSize(this.f814Lz.size() / 2);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$f */
    private final class C0715f implements Runnable {

        /* renamed from: LI */
        private boolean f816LI;
        private final Bitmap mBitmap;
        private final Uri mUri;

        /* renamed from: mr */
        private final CountDownLatch f817mr;

        public C0715f(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.mBitmap = bitmap;
            this.f816LI = z;
            this.f817mr = countDownLatch;
        }

        /* renamed from: a */
        private void m691a(ImageReceiver imageReceiver, boolean z) {
            ArrayList a = imageReceiver.f808LE;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C0716a aVar = (C0716a) a.get(i);
                if (z) {
                    aVar.mo11135a(ImageManager.this.mContext, this.mBitmap, false);
                } else {
                    ImageManager.this.f805LD.put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    aVar.mo11137a(ImageManager.this.mContext, ImageManager.this.f802LA, false);
                }
                if (!(aVar instanceof C0716a.C0719c)) {
                    ImageManager.this.f803LB.remove(aVar);
                }
            }
        }

        public void run() {
            C1742je.m5154aU("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.f807Lz != null) {
                if (this.f816LI) {
                    ImageManager.this.f807Lz.evictAll();
                    System.gc();
                    this.f816LI = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f807Lz.put(new C0716a.C0717a(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f804LC.remove(this.mUri);
            if (imageReceiver != null) {
                m691a(imageReceiver, z);
            }
            this.f817mr.countDown();
            synchronized (ImageManager.f798Lu) {
                ImageManager.f799Lv.remove(this.mUri);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
        if (z) {
            this.f807Lz = new C0711b(this.mContext);
            if (C1840ll.m5541ij()) {
                m679hd();
            }
        } else {
            this.f807Lz = null;
        }
        this.f802LA = new C1739jc();
        this.f803LB = new HashMap();
        this.f804LC = new HashMap();
        this.f805LD = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m669a(C0716a.C0717a aVar) {
        if (this.f807Lz == null) {
            return null;
        }
        return (Bitmap) this.f807Lz.get(aVar);
    }

    /* renamed from: c */
    public static ImageManager m672c(Context context, boolean z) {
        if (z) {
            if (f801Lx == null) {
                f801Lx = new ImageManager(context, true);
            }
            return f801Lx;
        }
        if (f800Lw == null) {
            f800Lw = new ImageManager(context, false);
        }
        return f800Lw;
    }

    public static ImageManager create(Context context) {
        return m672c(context, false);
    }

    /* renamed from: hd */
    private void m679hd() {
        this.mContext.registerComponentCallbacks(new C0714e(this.f807Lz));
    }

    /* renamed from: a */
    public void mo11102a(C0716a aVar) {
        C1742je.m5154aU("ImageManager.loadImage() must be called in the main thread");
        new C0713d(aVar).run();
    }

    public void loadImage(ImageView imageView, int i) {
        mo11102a((C0716a) new C0716a.C0718b(imageView, i));
    }

    public void loadImage(ImageView imageView, Uri uri) {
        mo11102a((C0716a) new C0716a.C0718b(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i) {
        C0716a.C0718b bVar = new C0716a.C0718b(imageView, uri);
        bVar.mo11139az(i);
        mo11102a((C0716a) bVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        mo11102a((C0716a) new C0716a.C0719c(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        C0716a.C0719c cVar = new C0716a.C0719c(onImageLoadedListener, uri);
        cVar.mo11139az(i);
        mo11102a((C0716a) cVar);
    }
}
