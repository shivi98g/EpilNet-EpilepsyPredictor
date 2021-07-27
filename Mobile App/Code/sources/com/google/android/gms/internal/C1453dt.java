package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.dt */
public final class C1453dt extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: mo */
    private final C1610gu f2975mo;

    /* renamed from: so */
    private final MediaController f2976so;

    /* renamed from: sp */
    private final C1454a f2977sp = new C1454a(this);

    /* renamed from: sq */
    private final VideoView f2978sq;

    /* renamed from: sr */
    private long f2979sr;

    /* renamed from: ss */
    private String f2980ss;

    /* renamed from: com.google.android.gms.internal.dt$a */
    private static final class C1454a {

        /* renamed from: mv */
        private final Runnable f2981mv;
        /* access modifiers changed from: private */

        /* renamed from: st */
        public volatile boolean f2982st = false;

        public C1454a(final C1453dt dtVar) {
            this.f2981mv = new Runnable() {

                /* renamed from: su */
                private final WeakReference<C1453dt> f2983su = new WeakReference<>(dtVar);

                public void run() {
                    C1453dt dtVar = (C1453dt) this.f2983su.get();
                    if (!C1454a.this.f2982st && dtVar != null) {
                        dtVar.mo15158cr();
                        C1454a.this.mo15168cs();
                    }
                }
            };
        }

        public void cancel() {
            this.f2982st = true;
            C1606gq.f3553wR.removeCallbacks(this.f2981mv);
        }

        /* renamed from: cs */
        public void mo15168cs() {
            C1606gq.f3553wR.postDelayed(this.f2981mv, 250);
        }
    }

    public C1453dt(Context context, C1610gu guVar) {
        super(context);
        this.f2975mo = guVar;
        this.f2978sq = new VideoView(context);
        addView(this.f2978sq, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2976so = new MediaController(context);
        this.f2977sp.mo15168cs();
        this.f2978sq.setOnCompletionListener(this);
        this.f2978sq.setOnPreparedListener(this);
        this.f2978sq.setOnErrorListener(this);
    }

    /* renamed from: a */
    private static void m4316a(C1610gu guVar, String str) {
        m4319a(guVar, str, (Map<String, String>) new HashMap(1));
    }

    /* renamed from: a */
    public static void m4317a(C1610gu guVar, String str, String str2) {
        boolean z = str2 == null;
        HashMap hashMap = new HashMap(z ? 2 : 3);
        hashMap.put("what", str);
        if (!z) {
            hashMap.put("extra", str2);
        }
        m4319a(guVar, "error", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m4318a(C1610gu guVar, String str, String str2, String str3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(str2, str3);
        m4319a(guVar, str, (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m4319a(C1610gu guVar, String str, Map<String, String> map) {
        map.put("event", str);
        guVar.mo15418a("onVideoEvent", (Map<String, ?>) map);
    }

    /* renamed from: C */
    public void mo15155C(String str) {
        this.f2980ss = str;
    }

    /* renamed from: b */
    public void mo15156b(MotionEvent motionEvent) {
        this.f2978sq.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: cq */
    public void mo15157cq() {
        if (!TextUtils.isEmpty(this.f2980ss)) {
            this.f2978sq.setVideoPath(this.f2980ss);
        } else {
            m4317a(this.f2975mo, "no_src", (String) null);
        }
    }

    /* renamed from: cr */
    public void mo15158cr() {
        long currentPosition = (long) this.f2978sq.getCurrentPosition();
        if (this.f2979sr != currentPosition) {
            m4318a(this.f2975mo, "timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
            this.f2979sr = currentPosition;
        }
    }

    public void destroy() {
        this.f2977sp.cancel();
        this.f2978sq.stopPlayback();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m4316a(this.f2975mo, "ended");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m4317a(this.f2975mo, String.valueOf(i), String.valueOf(i2));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        m4318a(this.f2975mo, "canplaythrough", "duration", String.valueOf(((float) this.f2978sq.getDuration()) / 1000.0f));
    }

    public void pause() {
        this.f2978sq.pause();
    }

    public void play() {
        this.f2978sq.start();
    }

    /* renamed from: s */
    public void mo15165s(boolean z) {
        VideoView videoView;
        MediaController mediaController;
        if (z) {
            videoView = this.f2978sq;
            mediaController = this.f2976so;
        } else {
            this.f2976so.hide();
            videoView = this.f2978sq;
            mediaController = null;
        }
        videoView.setMediaController(mediaController);
    }

    public void seekTo(int i) {
        this.f2978sq.seekTo(i);
    }
}
