package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.C1706in;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1837li;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo {
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1;

    /* renamed from: FT */
    private final String f506FT;

    /* renamed from: FU */
    private int f507FU;

    /* renamed from: FV */
    private String f508FV;

    /* renamed from: FW */
    private MediaMetadata f509FW;

    /* renamed from: FX */
    private long f510FX;

    /* renamed from: FY */
    private List<MediaTrack> f511FY;

    /* renamed from: FZ */
    private TextTrackStyle f512FZ;

    /* renamed from: Ga */
    private JSONObject f513Ga;

    public static class Builder {

        /* renamed from: Gb */
        private final MediaInfo f514Gb;

        public Builder(String str) throws IllegalArgumentException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.f514Gb = new MediaInfo(str);
        }

        public MediaInfo build() throws IllegalArgumentException {
            this.f514Gb.mo10692fQ();
            return this.f514Gb;
        }

        public Builder setContentType(String str) throws IllegalArgumentException {
            this.f514Gb.setContentType(str);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.f514Gb.setCustomData(jSONObject);
            return this;
        }

        public Builder setMediaTracks(List<MediaTrack> list) {
            this.f514Gb.mo10690d(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.f514Gb.mo10689a(mediaMetadata);
            return this;
        }

        public Builder setStreamDuration(long j) throws IllegalArgumentException {
            this.f514Gb.mo10702m(j);
            return this;
        }

        public Builder setStreamType(int i) throws IllegalArgumentException {
            this.f514Gb.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle textTrackStyle) {
            this.f514Gb.setTextTrackStyle(textTrackStyle);
            return this;
        }
    }

    MediaInfo(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        this.f506FT = str;
        this.f507FU = -1;
    }

    MediaInfo(JSONObject jSONObject) throws JSONException {
        this.f506FT = jSONObject.getString("contentId");
        String string = jSONObject.getString("streamType");
        if ("NONE".equals(string)) {
            this.f507FU = 0;
        } else {
            this.f507FU = "BUFFERED".equals(string) ? 1 : "LIVE".equals(string) ? 2 : -1;
        }
        this.f508FV = jSONObject.getString("contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            this.f509FW = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.f509FW.mo10717c(jSONObject2);
        }
        this.f510FX = -1;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                this.f510FX = C1706in.m5034b(optDouble);
            }
        }
        TextTrackStyle textTrackStyle = null;
        if (jSONObject.has("tracks")) {
            this.f511FY = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f511FY.add(new MediaTrack(jSONArray.getJSONObject(i)));
            }
        } else {
            this.f511FY = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("textTrackStyle");
            textTrackStyle = new TextTrackStyle();
            textTrackStyle.mo10829c(jSONObject3);
        }
        this.f512FZ = textTrackStyle;
        this.f513Ga = jSONObject.optJSONObject("customData");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10689a(MediaMetadata mediaMetadata) {
        this.f509FW = mediaMetadata;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10690d(List<MediaTrack> list) {
        this.f511FY = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.f513Ga == null) != (mediaInfo.f513Ga == null)) {
            return false;
        }
        if (this.f513Ga == null || mediaInfo.f513Ga == null || C1837li.m5534d(this.f513Ga, mediaInfo.f513Ga)) {
            return C1706in.m5031a(this.f506FT, mediaInfo.f506FT) && this.f507FU == mediaInfo.f507FU && C1706in.m5031a(this.f508FV, mediaInfo.f508FV) && C1706in.m5031a(this.f509FW, mediaInfo.f509FW) && this.f510FX == mediaInfo.f510FX;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fQ */
    public void mo10692fQ() throws IllegalArgumentException {
        if (TextUtils.isEmpty(this.f506FT)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else if (TextUtils.isEmpty(this.f508FV)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else if (this.f507FU == -1) {
            throw new IllegalArgumentException("a valid stream type must be specified");
        }
    }

    public String getContentId() {
        return this.f506FT;
    }

    public String getContentType() {
        return this.f508FV;
    }

    public JSONObject getCustomData() {
        return this.f513Ga;
    }

    public List<MediaTrack> getMediaTracks() {
        return this.f511FY;
    }

    public MediaMetadata getMetadata() {
        return this.f509FW;
    }

    public long getStreamDuration() {
        return this.f510FX;
    }

    public int getStreamType() {
        return this.f507FU;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.f512FZ;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f506FT, Integer.valueOf(this.f507FU), this.f508FV, this.f509FW, Long.valueOf(this.f510FX), String.valueOf(this.f513Ga));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10702m(long j) throws IllegalArgumentException {
        if (j < 0) {
            throw new IllegalArgumentException("Stream duration cannot be negative");
        }
        this.f510FX = j;
    }

    /* access modifiers changed from: package-private */
    public void setContentType(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.f508FV = str;
    }

    /* access modifiers changed from: package-private */
    public void setCustomData(JSONObject jSONObject) {
        this.f513Ga = jSONObject;
    }

    /* access modifiers changed from: package-private */
    public void setStreamType(int i) throws IllegalArgumentException {
        if (i < -1 || i > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.f507FU = i;
    }

    public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.f512FZ = textTrackStyle;
    }

    public JSONObject toJson() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f506FT);
            switch (this.f507FU) {
                case 1:
                    str = "BUFFERED";
                    break;
                case 2:
                    str = "LIVE";
                    break;
                default:
                    str = "NONE";
                    break;
            }
            jSONObject.put("streamType", str);
            if (this.f508FV != null) {
                jSONObject.put("contentType", this.f508FV);
            }
            if (this.f509FW != null) {
                jSONObject.put("metadata", this.f509FW.toJson());
            }
            jSONObject.put("duration", C1706in.m5036o(this.f510FX));
            if (this.f511FY != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack json : this.f511FY) {
                    jSONArray.put(json.toJson());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.f512FZ != null) {
                jSONObject.put("textTrackStyle", this.f512FZ.toJson());
            }
            if (this.f513Ga != null) {
                jSONObject.put("customData", this.f513Ga);
                return jSONObject;
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
