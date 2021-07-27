package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.it */
public class C1715it extends C1696il {

    /* renamed from: HR */
    private static final long f3810HR = TimeUnit.HOURS.toMillis(24);

    /* renamed from: HS */
    private static final long f3811HS = TimeUnit.HOURS.toMillis(24);

    /* renamed from: HT */
    private static final long f3812HT = TimeUnit.HOURS.toMillis(24);

    /* renamed from: HU */
    private static final long f3813HU = TimeUnit.SECONDS.toMillis(1);
    private static final String NAMESPACE = C1706in.m5033aG("com.google.cast.media");

    /* renamed from: HV */
    private long f3814HV;

    /* renamed from: HW */
    private MediaStatus f3815HW;

    /* renamed from: HX */
    private final C1720iw f3816HX;

    /* renamed from: HY */
    private final C1720iw f3817HY;

    /* renamed from: HZ */
    private final C1720iw f3818HZ;

    /* renamed from: Ia */
    private final C1720iw f3819Ia;

    /* renamed from: Ib */
    private final C1720iw f3820Ib;

    /* renamed from: Ic */
    private final C1720iw f3821Ic;

    /* renamed from: Id */
    private final C1720iw f3822Id;

    /* renamed from: Ie */
    private final C1720iw f3823Ie;

    /* renamed from: If */
    private final C1720iw f3824If;

    /* renamed from: Ig */
    private final C1720iw f3825Ig;
    /* access modifiers changed from: private */

    /* renamed from: Ih */
    public final List<C1720iw> f3826Ih;

    /* renamed from: Ii */
    private final Runnable f3827Ii;
    /* access modifiers changed from: private */

    /* renamed from: Ij */
    public boolean f3828Ij;
    private final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.it$a */
    private class C1717a implements Runnable {
        private C1717a() {
        }

        public void run() {
            boolean z = false;
            boolean unused = C1715it.this.f3828Ij = false;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (C1720iw e : C1715it.this.f3826Ih) {
                e.mo15743e(elapsedRealtime, RemoteMediaPlayer.STATUS_TIMED_OUT);
            }
            synchronized (C1720iw.f3831Ip) {
                for (C1720iw gr : C1715it.this.f3826Ih) {
                    if (gr.mo15744gr()) {
                        z = true;
                    }
                }
            }
            C1715it.this.m5091J(z);
        }
    }

    public C1715it() {
        this((String) null);
    }

    public C1715it(String str) {
        super(NAMESPACE, "MediaControlChannel", str);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.f3827Ii = new C1717a();
        this.f3826Ih = new ArrayList();
        this.f3816HX = new C1720iw(f3811HS);
        this.f3826Ih.add(this.f3816HX);
        this.f3817HY = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3817HY);
        this.f3818HZ = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3818HZ);
        this.f3819Ia = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3819Ia);
        this.f3820Ib = new C1720iw(f3812HT);
        this.f3826Ih.add(this.f3820Ib);
        this.f3821Ic = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3821Ic);
        this.f3822Id = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3822Id);
        this.f3823Ie = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3823Ie);
        this.f3824If = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3824If);
        this.f3825Ig = new C1720iw(f3810HR);
        this.f3826Ih.add(this.f3825Ig);
        m5096gp();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m5091J(boolean z) {
        if (this.f3828Ij != z) {
            this.f3828Ij = z;
            if (z) {
                this.mHandler.postDelayed(this.f3827Ii, f3813HU);
            } else {
                this.mHandler.removeCallbacks(this.f3827Ii);
            }
        }
    }

    /* renamed from: a */
    private void m5093a(long j, JSONObject jSONObject) throws JSONException {
        int i;
        boolean p = this.f3816HX.mo15745p(j);
        boolean z = true;
        boolean z2 = this.f3820Ib.mo15744gr() && !this.f3820Ib.mo15745p(j);
        if ((!this.f3821Ic.mo15744gr() || this.f3821Ic.mo15745p(j)) && (!this.f3822Id.mo15744gr() || this.f3822Id.mo15745p(j))) {
            z = false;
        }
        int i2 = z2 ? 2 : 0;
        if (z) {
            i2 |= 1;
        }
        if (p || this.f3815HW == null) {
            this.f3815HW = new MediaStatus(jSONObject);
            this.f3814HV = SystemClock.elapsedRealtime();
            i = 7;
        } else {
            i = this.f3815HW.mo10741a(jSONObject, i2);
        }
        if ((i & 1) != 0) {
            this.f3814HV = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0) {
            this.f3814HV = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0) {
            onMetadataUpdated();
        }
        for (C1720iw d : this.f3826Ih) {
            d.mo15742d(j, 0);
        }
    }

    /* renamed from: gp */
    private void m5096gp() {
        m5091J(false);
        this.f3814HV = 0;
        this.f3815HW = null;
        this.f3816HX.clear();
        this.f3820Ib.clear();
        this.f3821Ic.clear();
    }

    /* renamed from: a */
    public long mo15723a(C1719iv ivVar) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long fU = mo15645fU();
        this.f3823Ie.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject.put("requestId", fU);
            jSONObject.put("type", "GET_STATUS");
            if (this.f3815HW != null) {
                jSONObject.put("mediaSessionId", this.f3815HW.mo10742fR());
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: a */
    public long mo15724a(C1719iv ivVar, double d, JSONObject jSONObject) throws IOException, IllegalStateException, IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3821Ic.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", mo15733fR());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044 A[Catch:{ JSONException -> 0x004a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo15725a(com.google.android.gms.internal.C1719iv r7, long r8, int r10, org.json.JSONObject r11) throws java.io.IOException, java.lang.IllegalStateException {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r6.mo15645fU()
            com.google.android.gms.internal.iw r3 = r6.f3820Ib
            r3.mo15739a(r1, r7)
            r7 = 1
            r6.m5091J(r7)
            java.lang.String r3 = "requestId"
            r0.put(r3, r1)     // Catch:{ JSONException -> 0x004a }
            java.lang.String r3 = "type"
            java.lang.String r4 = "SEEK"
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x004a }
            java.lang.String r3 = "mediaSessionId"
            long r4 = r6.mo15733fR()     // Catch:{ JSONException -> 0x004a }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x004a }
            java.lang.String r3 = "currentTime"
            double r8 = com.google.android.gms.internal.C1706in.m5036o(r8)     // Catch:{ JSONException -> 0x004a }
            r0.put(r3, r8)     // Catch:{ JSONException -> 0x004a }
            if (r10 != r7) goto L_0x003a
            java.lang.String r7 = "resumeState"
            java.lang.String r8 = "PLAYBACK_START"
        L_0x0036:
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x004a }
            goto L_0x0042
        L_0x003a:
            r7 = 2
            if (r10 != r7) goto L_0x0042
            java.lang.String r7 = "resumeState"
            java.lang.String r8 = "PLAYBACK_PAUSE"
            goto L_0x0036
        L_0x0042:
            if (r11 == 0) goto L_0x004b
            java.lang.String r7 = "customData"
            r0.put(r7, r11)     // Catch:{ JSONException -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r7 = move-exception
        L_0x004b:
            java.lang.String r7 = r0.toString()
            r8 = 0
            r6.mo15642a(r7, r1, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1715it.mo15725a(com.google.android.gms.internal.iv, long, int, org.json.JSONObject):long");
    }

    /* renamed from: a */
    public long mo15726a(C1719iv ivVar, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3816HX.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.toJson());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", C1706in.m5036o(j));
            if (jArr != null && jArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject2.put("activeTrackIds", jSONArray);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: a */
    public long mo15727a(C1719iv ivVar, TextTrackStyle textTrackStyle) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long fU = mo15645fU();
        this.f3825Ig.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject.put("requestId", fU);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.toJson());
            }
            jSONObject.put("mediaSessionId", mo15733fR());
        } catch (JSONException e) {
        }
        mo15642a(jSONObject.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: a */
    public long mo15728a(C1719iv ivVar, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3817HY.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", mo15733fR());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: a */
    public long mo15729a(C1719iv ivVar, boolean z, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3822Id.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", mo15733fR());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: a */
    public long mo15730a(C1719iv ivVar, long[] jArr) throws IOException {
        JSONObject jSONObject = new JSONObject();
        long fU = mo15645fU();
        this.f3824If.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject.put("requestId", fU);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", mo15733fR());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e) {
        }
        mo15642a(jSONObject.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: aD */
    public final void mo15643aD(String str) {
        this.f3754He.mo15717b("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray(NotificationCompat.CATEGORY_STATUS);
                if (jSONArray.length() > 0) {
                    m5093a(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.f3815HW = null;
                onStatusUpdated();
                onMetadataUpdated();
                this.f3823Ie.mo15742d(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.f3754He.mo15719d("received unexpected error: Invalid Player State.", new Object[0]);
                JSONObject optJSONObject = jSONObject.optJSONObject("customData");
                for (C1720iw b : this.f3826Ih) {
                    b.mo15740b(optLong, RemoteMediaPlayer.STATUS_FAILED, optJSONObject);
                }
            } else if (string.equals("LOAD_FAILED")) {
                this.f3816HX.mo15740b(optLong, RemoteMediaPlayer.STATUS_FAILED, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.f3816HX.mo15740b(optLong, RemoteMediaPlayer.STATUS_CANCELED, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.f3754He.mo15719d("received unexpected error: Invalid Request.", new Object[0]);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("customData");
                for (C1720iw b2 : this.f3826Ih) {
                    b2.mo15740b(optLong, RemoteMediaPlayer.STATUS_FAILED, optJSONObject2);
                }
            }
        } catch (JSONException e) {
            this.f3754He.mo15719d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    /* renamed from: b */
    public long mo15731b(C1719iv ivVar, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3819Ia.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", mo15733fR());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: b */
    public void mo15644b(long j, int i) {
        for (C1720iw d : this.f3826Ih) {
            d.mo15742d(j, i);
        }
    }

    /* renamed from: c */
    public long mo15732c(C1719iv ivVar, JSONObject jSONObject) throws IOException, IllegalStateException {
        JSONObject jSONObject2 = new JSONObject();
        long fU = mo15645fU();
        this.f3818HZ.mo15739a(fU, ivVar);
        m5091J(true);
        try {
            jSONObject2.put("requestId", fU);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", mo15733fR());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        mo15642a(jSONObject2.toString(), fU, (String) null);
        return fU;
    }

    /* renamed from: fR */
    public long mo15733fR() throws IllegalStateException {
        if (this.f3815HW != null) {
            return this.f3815HW.mo10742fR();
        }
        throw new IllegalStateException("No current media session");
    }

    /* renamed from: fV */
    public void mo15646fV() {
        m5096gp();
    }

    public long getApproximateStreamPosition() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo == null || this.f3814HV == 0) {
            return 0;
        }
        double playbackRate = this.f3815HW.getPlaybackRate();
        long streamPosition = this.f3815HW.getStreamPosition();
        int playerState = this.f3815HW.getPlayerState();
        if (playbackRate == 0.0d || playerState != 2) {
            return streamPosition;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3814HV;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return streamPosition;
        }
        long streamDuration = mediaInfo.getStreamDuration();
        long j = ((long) (((double) elapsedRealtime) * playbackRate)) + streamPosition;
        if (streamDuration > 0 && j > streamDuration) {
            return streamDuration;
        }
        if (j < 0) {
            return 0;
        }
        return j;
    }

    public MediaInfo getMediaInfo() {
        if (this.f3815HW == null) {
            return null;
        }
        return this.f3815HW.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        return this.f3815HW;
    }

    public long getStreamDuration() {
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo != null) {
            return mediaInfo.getStreamDuration();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onMetadataUpdated() {
    }

    /* access modifiers changed from: protected */
    public void onStatusUpdated() {
    }
}
