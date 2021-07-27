package com.google.android.gms.cast;

import com.google.android.gms.internal.C1706in;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus {
    public static final long COMMAND_PAUSE = 1;
    public static final long COMMAND_SEEK = 2;
    public static final long COMMAND_SET_VOLUME = 4;
    public static final long COMMAND_SKIP_BACKWARD = 32;
    public static final long COMMAND_SKIP_FORWARD = 16;
    public static final long COMMAND_TOGGLE_MUTE = 8;

    /* renamed from: Gs */
    private static final long[] f523Gs = new long[0];
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;

    /* renamed from: Ga */
    private JSONObject f524Ga;

    /* renamed from: Gb */
    private MediaInfo f525Gb;

    /* renamed from: Gj */
    private long f526Gj;

    /* renamed from: Gk */
    private double f527Gk;

    /* renamed from: Gl */
    private int f528Gl;

    /* renamed from: Gm */
    private int f529Gm;

    /* renamed from: Gn */
    private long f530Gn;

    /* renamed from: Go */
    private long f531Go;

    /* renamed from: Gp */
    private double f532Gp;

    /* renamed from: Gq */
    private boolean f533Gq;

    /* renamed from: Gr */
    private long[] f534Gr;

    public MediaStatus(JSONObject jSONObject) throws JSONException {
        mo10741a(jSONObject, 0);
    }

    /* renamed from: a */
    public int mo10741a(JSONObject jSONObject, int i) throws JSONException {
        int i2;
        long j = jSONObject.getLong("mediaSessionId");
        boolean z = false;
        if (j != this.f526Gj) {
            this.f526Gj = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i3 = 3;
            int i4 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : 0;
            if (i4 != this.f528Gl) {
                this.f528Gl = i4;
                i2 |= 2;
            }
            if (i4 == 1 && jSONObject.has("idleReason")) {
                String string2 = jSONObject.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i3 = 2;
                } else if (!string2.equals("INTERRUPTED")) {
                    i3 = string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                }
                if (i3 != this.f529Gm) {
                    this.f529Gm = i3;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.f527Gk != d) {
                this.f527Gk = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime") && (i & 2) == 0) {
            long b = C1706in.m5034b(jSONObject.getDouble("currentTime"));
            if (b != this.f530Gn) {
                this.f530Gn = b;
                i2 |= 2;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j2 = jSONObject.getLong("supportedMediaCommands");
            if (j2 != this.f531Go) {
                this.f531Go = j2;
                i2 |= 2;
            }
        }
        if (jSONObject.has("volume") && (i & 1) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("volume");
            double d2 = jSONObject2.getDouble("level");
            if (d2 != this.f532Gp) {
                this.f532Gp = d2;
                i2 |= 2;
            }
            boolean z2 = jSONObject2.getBoolean("muted");
            if (z2 != this.f533Gq) {
                this.f533Gq = z2;
                i2 |= 2;
            }
        }
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                jArr2[i5] = jSONArray.getLong(i5);
            }
            if (this.f534Gr != null && this.f534Gr.length == length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        break;
                    } else if (this.f534Gr[i6] != jArr2[i6]) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            z = true;
            if (z) {
                this.f534Gr = jArr2;
            }
            jArr = jArr2;
        } else if (this.f534Gr != null) {
            z = true;
        }
        if (z) {
            this.f534Gr = jArr;
            i2 |= 2;
        }
        if (jSONObject.has("customData")) {
            this.f524Ga = jSONObject.getJSONObject("customData");
            i2 |= 2;
        }
        if (!jSONObject.has("media")) {
            return i2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("media");
        this.f525Gb = new MediaInfo(jSONObject3);
        int i7 = i2 | 2;
        return jSONObject3.has("metadata") ? i7 | 4 : i7;
    }

    /* renamed from: fR */
    public long mo10742fR() {
        return this.f526Gj;
    }

    public long[] getActiveTrackIds() {
        return this.f534Gr != null ? this.f534Gr : f523Gs;
    }

    public JSONObject getCustomData() {
        return this.f524Ga;
    }

    public int getIdleReason() {
        return this.f529Gm;
    }

    public MediaInfo getMediaInfo() {
        return this.f525Gb;
    }

    public double getPlaybackRate() {
        return this.f527Gk;
    }

    public int getPlayerState() {
        return this.f528Gl;
    }

    public long getStreamPosition() {
        return this.f530Gn;
    }

    public double getStreamVolume() {
        return this.f532Gp;
    }

    public boolean isMediaCommandSupported(long j) {
        return (this.f531Go & j) != 0;
    }

    public boolean isMute() {
        return this.f533Gq;
    }
}
