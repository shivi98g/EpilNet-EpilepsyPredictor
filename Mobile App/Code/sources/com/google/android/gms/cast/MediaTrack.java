package com.google.android.gms.cast;

import com.google.android.gms.internal.C1706in;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1837li;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack {
    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;

    /* renamed from: Eg */
    private long f535Eg;

    /* renamed from: FR */
    private String f536FR;

    /* renamed from: FT */
    private String f537FT;

    /* renamed from: FV */
    private String f538FV;

    /* renamed from: Ga */
    private JSONObject f539Ga;

    /* renamed from: Gt */
    private int f540Gt;

    /* renamed from: Gu */
    private int f541Gu;
    private String mName;

    public static class Builder {

        /* renamed from: Gv */
        private final MediaTrack f542Gv;

        public Builder(long j, int i) throws IllegalArgumentException {
            this.f542Gv = new MediaTrack(j, i);
        }

        public MediaTrack build() {
            return this.f542Gv;
        }

        public Builder setContentId(String str) {
            this.f542Gv.setContentId(str);
            return this;
        }

        public Builder setContentType(String str) {
            this.f542Gv.setContentType(str);
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.f542Gv.setCustomData(jSONObject);
            return this;
        }

        public Builder setLanguage(String str) {
            this.f542Gv.setLanguage(str);
            return this;
        }

        public Builder setLanguage(Locale locale) {
            this.f542Gv.setLanguage(C1706in.m5035b(locale));
            return this;
        }

        public Builder setName(String str) {
            this.f542Gv.setName(str);
            return this;
        }

        public Builder setSubtype(int i) throws IllegalArgumentException {
            this.f542Gv.mo10753ab(i);
            return this;
        }
    }

    MediaTrack(long j, int i) throws IllegalArgumentException {
        clear();
        this.f535Eg = j;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("invalid type " + i);
        }
        this.f540Gt = i;
    }

    MediaTrack(JSONObject jSONObject) throws JSONException {
        m424c(jSONObject);
    }

    /* renamed from: c */
    private void m424c(JSONObject jSONObject) throws JSONException {
        int i;
        clear();
        this.f535Eg = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.f540Gt = 1;
        } else if ("AUDIO".equals(string)) {
            this.f540Gt = 2;
        } else if ("VIDEO".equals(string)) {
            this.f540Gt = 3;
        } else {
            throw new JSONException("invalid type: " + string);
        }
        this.f537FT = jSONObject.optString("trackContentId", (String) null);
        this.f538FV = jSONObject.optString("trackContentType", (String) null);
        this.mName = jSONObject.optString("name", (String) null);
        this.f536FR = jSONObject.optString("language", (String) null);
        if (jSONObject.has("subtype")) {
            String string2 = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string2)) {
                this.f541Gu = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.f541Gu = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.f541Gu = 3;
            } else if ("CHAPTERS".equals(string2)) {
                i = 4;
            } else if ("METADATA".equals(string2)) {
                i = 5;
            } else {
                throw new JSONException("invalid subtype: " + string2);
            }
            this.f539Ga = jSONObject.optJSONObject("customData");
        }
        i = 0;
        this.f541Gu = i;
        this.f539Ga = jSONObject.optJSONObject("customData");
    }

    private void clear() {
        this.f535Eg = 0;
        this.f540Gt = 0;
        this.f537FT = null;
        this.mName = null;
        this.f536FR = null;
        this.f541Gu = -1;
        this.f539Ga = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ab */
    public void mo10753ab(int i) throws IllegalArgumentException {
        if (i <= -1 || i > 5) {
            throw new IllegalArgumentException("invalid subtype " + i);
        } else if (i == 0 || this.f540Gt == 1) {
            this.f541Gu = i;
        } else {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.f539Ga == null) != (mediaTrack.f539Ga == null)) {
            return false;
        }
        if (this.f539Ga == null || mediaTrack.f539Ga == null || C1837li.m5534d(this.f539Ga, mediaTrack.f539Ga)) {
            return this.f535Eg == mediaTrack.f535Eg && this.f540Gt == mediaTrack.f540Gt && C1706in.m5031a(this.f537FT, mediaTrack.f537FT) && C1706in.m5031a(this.f538FV, mediaTrack.f538FV) && C1706in.m5031a(this.mName, mediaTrack.mName) && C1706in.m5031a(this.f536FR, mediaTrack.f536FR) && this.f541Gu == mediaTrack.f541Gu;
        }
        return false;
    }

    public String getContentId() {
        return this.f537FT;
    }

    public String getContentType() {
        return this.f538FV;
    }

    public JSONObject getCustomData() {
        return this.f539Ga;
    }

    public long getId() {
        return this.f535Eg;
    }

    public String getLanguage() {
        return this.f536FR;
    }

    public String getName() {
        return this.mName;
    }

    public int getSubtype() {
        return this.f541Gu;
    }

    public int getType() {
        return this.f540Gt;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f535Eg), Integer.valueOf(this.f540Gt), this.f537FT, this.f538FV, this.mName, this.f536FR, Integer.valueOf(this.f541Gu), this.f539Ga);
    }

    public void setContentId(String str) {
        this.f537FT = str;
    }

    public void setContentType(String str) {
        this.f538FV = str;
    }

    /* access modifiers changed from: package-private */
    public void setCustomData(JSONObject jSONObject) {
        this.f539Ga = jSONObject;
    }

    /* access modifiers changed from: package-private */
    public void setLanguage(String str) {
        this.f536FR = str;
    }

    /* access modifiers changed from: package-private */
    public void setName(String str) {
        this.mName = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r4.f537FT == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0.put("trackContentId", r4.f537FT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r4.f538FV == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0.put("trackContentType", r4.f538FV);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r4.mName == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0.put("name", r4.mName);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (android.text.TextUtils.isEmpty(r4.f536FR) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0.put("language", r4.f536FR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        switch(r4.f541Gu) {
            case 1: goto L_0x0071;
            case 2: goto L_0x006c;
            case 3: goto L_0x0067;
            case 4: goto L_0x0062;
            case 5: goto L_0x005a;
            default: goto L_0x0059;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r1 = "subtype";
        r2 = "METADATA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r0.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r1 = "subtype";
        r2 = "CHAPTERS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r1 = "subtype";
        r2 = "DESCRIPTIONS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r1 = "subtype";
        r2 = "CAPTIONS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r1 = "subtype";
        r2 = "SUBTITLES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r4.f539Ga == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r0.put("customData", r4.f539Ga);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r0.put(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJson() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trackId"
            long r2 = r4.f535Eg     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
            int r1 = r4.f540Gt     // Catch:{ JSONException -> 0x0082 }
            switch(r1) {
                case 1: goto L_0x001f;
                case 2: goto L_0x001a;
                case 3: goto L_0x0012;
                default: goto L_0x0011;
            }     // Catch:{ JSONException -> 0x0082 }
        L_0x0011:
            goto L_0x0024
        L_0x0012:
            java.lang.String r1 = "type"
            java.lang.String r2 = "VIDEO"
        L_0x0016:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
            goto L_0x0024
        L_0x001a:
            java.lang.String r1 = "type"
            java.lang.String r2 = "AUDIO"
            goto L_0x0016
        L_0x001f:
            java.lang.String r1 = "type"
            java.lang.String r2 = "TEXT"
            goto L_0x0016
        L_0x0024:
            java.lang.String r1 = r4.f537FT     // Catch:{ JSONException -> 0x0082 }
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "trackContentId"
            java.lang.String r2 = r4.f537FT     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
        L_0x002f:
            java.lang.String r1 = r4.f538FV     // Catch:{ JSONException -> 0x0082 }
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = "trackContentType"
            java.lang.String r2 = r4.f538FV     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
        L_0x003a:
            java.lang.String r1 = r4.mName     // Catch:{ JSONException -> 0x0082 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "name"
            java.lang.String r2 = r4.mName     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
        L_0x0045:
            java.lang.String r1 = r4.f536FR     // Catch:{ JSONException -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0082 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = "language"
            java.lang.String r2 = r4.f536FR     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
        L_0x0054:
            int r1 = r4.f541Gu     // Catch:{ JSONException -> 0x0082 }
            switch(r1) {
                case 1: goto L_0x0071;
                case 2: goto L_0x006c;
                case 3: goto L_0x0067;
                case 4: goto L_0x0062;
                case 5: goto L_0x005a;
                default: goto L_0x0059;
            }     // Catch:{ JSONException -> 0x0082 }
        L_0x0059:
            goto L_0x0076
        L_0x005a:
            java.lang.String r1 = "subtype"
            java.lang.String r2 = "METADATA"
        L_0x005e:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
            goto L_0x0076
        L_0x0062:
            java.lang.String r1 = "subtype"
            java.lang.String r2 = "CHAPTERS"
            goto L_0x005e
        L_0x0067:
            java.lang.String r1 = "subtype"
            java.lang.String r2 = "DESCRIPTIONS"
            goto L_0x005e
        L_0x006c:
            java.lang.String r1 = "subtype"
            java.lang.String r2 = "CAPTIONS"
            goto L_0x005e
        L_0x0071:
            java.lang.String r1 = "subtype"
            java.lang.String r2 = "SUBTITLES"
            goto L_0x005e
        L_0x0076:
            org.json.JSONObject r1 = r4.f539Ga     // Catch:{ JSONException -> 0x0082 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "customData"
            org.json.JSONObject r2 = r4.f539Ga     // Catch:{ JSONException -> 0x0082 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0082 }
            return r0
        L_0x0082:
            r1 = move-exception
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaTrack.toJson():org.json.JSONObject");
    }
}
