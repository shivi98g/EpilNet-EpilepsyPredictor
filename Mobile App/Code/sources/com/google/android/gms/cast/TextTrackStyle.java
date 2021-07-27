package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.internal.C1706in;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1837li;
import com.google.android.gms.internal.C1840ll;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle {
    public static final int COLOR_UNSPECIFIED = 0;
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;

    /* renamed from: GT */
    private float f597GT;

    /* renamed from: GU */
    private int f598GU;

    /* renamed from: GV */
    private int f599GV;

    /* renamed from: GW */
    private int f600GW;

    /* renamed from: GX */
    private int f601GX;

    /* renamed from: GY */
    private int f602GY;

    /* renamed from: GZ */
    private int f603GZ;

    /* renamed from: Ga */
    private JSONObject f604Ga;

    /* renamed from: Ha */
    private String f605Ha;

    /* renamed from: Hb */
    private int f606Hb;

    /* renamed from: Hc */
    private int f607Hc;

    /* renamed from: xB */
    private int f608xB;

    public TextTrackStyle() {
        clear();
    }

    /* renamed from: aC */
    private int m459aC(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    private void clear() {
        this.f597GT = 1.0f;
        this.f598GU = 0;
        this.f608xB = 0;
        this.f599GV = -1;
        this.f600GW = 0;
        this.f601GX = -1;
        this.f602GY = 0;
        this.f603GZ = 0;
        this.f605Ha = null;
        this.f606Hb = -1;
        this.f607Hc = -1;
        this.f604Ga = null;
    }

    public static TextTrackStyle fromSystemSettings(Context context) {
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (!C1840ll.m5544im()) {
            return textTrackStyle;
        }
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        textTrackStyle.setFontScale(captioningManager.getFontScale());
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        textTrackStyle.setBackgroundColor(userStyle.backgroundColor);
        textTrackStyle.setForegroundColor(userStyle.foregroundColor);
        switch (userStyle.edgeType) {
            case 1:
                textTrackStyle.setEdgeType(1);
                break;
            case 2:
                textTrackStyle.setEdgeType(2);
                break;
            default:
                textTrackStyle.setEdgeType(0);
                break;
        }
        textTrackStyle.setEdgeColor(userStyle.edgeColor);
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(1);
            } else if (!Typeface.SANS_SERIF.equals(typeface) && Typeface.SERIF.equals(typeface)) {
                textTrackStyle.setFontGenericFamily(2);
            } else {
                textTrackStyle.setFontGenericFamily(0);
            }
            boolean isBold = typeface.isBold();
            boolean isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                textTrackStyle.setFontStyle(3);
                return textTrackStyle;
            } else if (isBold) {
                textTrackStyle.setFontStyle(1);
                return textTrackStyle;
            } else if (isItalic) {
                textTrackStyle.setFontStyle(2);
                return textTrackStyle;
            } else {
                textTrackStyle.setFontStyle(0);
            }
        }
        return textTrackStyle;
    }

    /* renamed from: u */
    private String m460u(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    /* renamed from: c */
    public void mo10829c(JSONObject jSONObject) throws JSONException {
        int i;
        clear();
        this.f597GT = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f598GU = m459aC(jSONObject.optString("foregroundColor"));
        this.f608xB = m459aC(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f599GV = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f599GV = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f599GV = 2;
            } else if ("RAISED".equals(string)) {
                this.f599GV = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f599GV = 4;
            }
        }
        this.f600GW = m459aC(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f601GX = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f601GX = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f601GX = 2;
            }
        }
        this.f602GY = m459aC(jSONObject.optString("windowColor"));
        if (this.f601GX == 2) {
            this.f603GZ = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f605Ha = jSONObject.optString("fontFamily", (String) null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f606Hb = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f606Hb = 1;
            } else if ("SERIF".equals(string3)) {
                this.f606Hb = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f606Hb = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f606Hb = 4;
            } else {
                if ("CURSIVE".equals(string3)) {
                    i = 5;
                } else if ("SMALL_CAPITALS".equals(string3)) {
                    i = 6;
                }
                this.f606Hb = i;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f607Hc = 0;
            } else if ("BOLD".equals(string4)) {
                this.f607Hc = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f607Hc = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f607Hc = 3;
            }
        }
        this.f604Ga = jSONObject.optJSONObject("customData");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        if ((this.f604Ga == null) != (textTrackStyle.f604Ga == null)) {
            return false;
        }
        if (this.f604Ga == null || textTrackStyle.f604Ga == null || C1837li.m5534d(this.f604Ga, textTrackStyle.f604Ga)) {
            return this.f597GT == textTrackStyle.f597GT && this.f598GU == textTrackStyle.f598GU && this.f608xB == textTrackStyle.f608xB && this.f599GV == textTrackStyle.f599GV && this.f600GW == textTrackStyle.f600GW && this.f601GX == textTrackStyle.f601GX && this.f603GZ == textTrackStyle.f603GZ && C1706in.m5031a(this.f605Ha, textTrackStyle.f605Ha) && this.f606Hb == textTrackStyle.f606Hb && this.f607Hc == textTrackStyle.f607Hc;
        }
        return false;
    }

    public int getBackgroundColor() {
        return this.f608xB;
    }

    public JSONObject getCustomData() {
        return this.f604Ga;
    }

    public int getEdgeColor() {
        return this.f600GW;
    }

    public int getEdgeType() {
        return this.f599GV;
    }

    public String getFontFamily() {
        return this.f605Ha;
    }

    public int getFontGenericFamily() {
        return this.f606Hb;
    }

    public float getFontScale() {
        return this.f597GT;
    }

    public int getFontStyle() {
        return this.f607Hc;
    }

    public int getForegroundColor() {
        return this.f598GU;
    }

    public int getWindowColor() {
        return this.f602GY;
    }

    public int getWindowCornerRadius() {
        return this.f603GZ;
    }

    public int getWindowType() {
        return this.f601GX;
    }

    public int hashCode() {
        return C1781jv.hashCode(Float.valueOf(this.f597GT), Integer.valueOf(this.f598GU), Integer.valueOf(this.f608xB), Integer.valueOf(this.f599GV), Integer.valueOf(this.f600GW), Integer.valueOf(this.f601GX), Integer.valueOf(this.f602GY), Integer.valueOf(this.f603GZ), this.f605Ha, Integer.valueOf(this.f606Hb), Integer.valueOf(this.f607Hc), this.f604Ga);
    }

    public void setBackgroundColor(int i) {
        this.f608xB = i;
    }

    public void setCustomData(JSONObject jSONObject) {
        this.f604Ga = jSONObject;
    }

    public void setEdgeColor(int i) {
        this.f600GW = i;
    }

    public void setEdgeType(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.f599GV = i;
    }

    public void setFontFamily(String str) {
        this.f605Ha = str;
    }

    public void setFontGenericFamily(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.f606Hb = i;
    }

    public void setFontScale(float f) {
        this.f597GT = f;
    }

    public void setFontStyle(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.f607Hc = i;
    }

    public void setForegroundColor(int i) {
        this.f598GU = i;
    }

    public void setWindowColor(int i) {
        this.f602GY = i;
    }

    public void setWindowCornerRadius(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.f603GZ = i;
    }

    public void setWindowType(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.f601GX = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r0.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r4.f600GW == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r0.put("edgeColor", m460u(r4.f600GW));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        switch(r4.f601GX) {
            case 0: goto L_0x006f;
            case 1: goto L_0x006a;
            case 2: goto L_0x0062;
            default: goto L_0x0061;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r1 = "windowType";
        r2 = "ROUNDED_CORNERS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r1 = "windowType";
        r2 = "NORMAL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = "windowType";
        r2 = "NONE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r4.f602GY == 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r0.put("windowColor", m460u(r4.f602GY));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r4.f601GX != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r0.put("windowRoundedCornerRadius", r4.f603GZ);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r4.f605Ha == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r0.put("fontFamily", r4.f605Ha);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        switch(r4.f606Hb) {
            case 0: goto L_0x00c1;
            case 1: goto L_0x00bc;
            case 2: goto L_0x00b7;
            case 3: goto L_0x00b2;
            case 4: goto L_0x00ad;
            case 5: goto L_0x00a8;
            case 6: goto L_0x00a0;
            default: goto L_0x009f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        r1 = "fontGenericFamily";
        r2 = "SMALL_CAPITALS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        r0.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r1 = "fontGenericFamily";
        r2 = "CURSIVE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        r1 = "fontGenericFamily";
        r2 = "CASUAL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r1 = "fontGenericFamily";
        r2 = "MONOSPACED_SERIF";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r1 = "fontGenericFamily";
        r2 = "SERIF";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r1 = "fontGenericFamily";
        r2 = "MONOSPACED_SANS_SERIF";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        r1 = "fontGenericFamily";
        r2 = "SANS_SERIF";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        switch(r4.f607Hc) {
            case 0: goto L_0x00de;
            case 1: goto L_0x00d9;
            case 2: goto L_0x00d4;
            case 3: goto L_0x00cc;
            default: goto L_0x00cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        r1 = "fontStyle";
        r2 = "BOLD_ITALIC";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        r0.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        r1 = "fontStyle";
        r2 = "ITALIC";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d9, code lost:
        r1 = "fontStyle";
        r2 = "BOLD";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        r1 = "fontStyle";
        r2 = "NORMAL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        if (r4.f604Ga == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r0.put("customData", r4.f604Ga);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ee, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJson() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "fontScale"
            float r2 = r4.f597GT     // Catch:{ JSONException -> 0x00ef }
            double r2 = (double) r2     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            int r1 = r4.f598GU     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "foregroundColor"
            int r2 = r4.f598GU     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r2 = r4.m460u(r2)     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x001c:
            int r1 = r4.f608xB     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "backgroundColor"
            int r2 = r4.f608xB     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r2 = r4.m460u(r2)     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x002b:
            int r1 = r4.f599GV     // Catch:{ JSONException -> 0x00ef }
            switch(r1) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0043;
                case 2: goto L_0x003e;
                case 3: goto L_0x0039;
                case 4: goto L_0x0031;
                default: goto L_0x0030;
            }     // Catch:{ JSONException -> 0x00ef }
        L_0x0030:
            goto L_0x004d
        L_0x0031:
            java.lang.String r1 = "edgeType"
            java.lang.String r2 = "DEPRESSED"
        L_0x0035:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x004d
        L_0x0039:
            java.lang.String r1 = "edgeType"
            java.lang.String r2 = "RAISED"
            goto L_0x0035
        L_0x003e:
            java.lang.String r1 = "edgeType"
            java.lang.String r2 = "DROP_SHADOW"
            goto L_0x0035
        L_0x0043:
            java.lang.String r1 = "edgeType"
            java.lang.String r2 = "OUTLINE"
            goto L_0x0035
        L_0x0048:
            java.lang.String r1 = "edgeType"
            java.lang.String r2 = "NONE"
            goto L_0x0035
        L_0x004d:
            int r1 = r4.f600GW     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "edgeColor"
            int r2 = r4.f600GW     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r2 = r4.m460u(r2)     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x005c:
            int r1 = r4.f601GX     // Catch:{ JSONException -> 0x00ef }
            switch(r1) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006a;
                case 2: goto L_0x0062;
                default: goto L_0x0061;
            }     // Catch:{ JSONException -> 0x00ef }
        L_0x0061:
            goto L_0x0074
        L_0x0062:
            java.lang.String r1 = "windowType"
            java.lang.String r2 = "ROUNDED_CORNERS"
        L_0x0066:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x0074
        L_0x006a:
            java.lang.String r1 = "windowType"
            java.lang.String r2 = "NORMAL"
            goto L_0x0066
        L_0x006f:
            java.lang.String r1 = "windowType"
            java.lang.String r2 = "NONE"
            goto L_0x0066
        L_0x0074:
            int r1 = r4.f602GY     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "windowColor"
            int r2 = r4.f602GY     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r2 = r4.m460u(r2)     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x0083:
            int r1 = r4.f601GX     // Catch:{ JSONException -> 0x00ef }
            r2 = 2
            if (r1 != r2) goto L_0x008f
            java.lang.String r1 = "windowRoundedCornerRadius"
            int r2 = r4.f603GZ     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x008f:
            java.lang.String r1 = r4.f605Ha     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = "fontFamily"
            java.lang.String r2 = r4.f605Ha     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
        L_0x009a:
            int r1 = r4.f606Hb     // Catch:{ JSONException -> 0x00ef }
            switch(r1) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a0;
                default: goto L_0x009f;
            }     // Catch:{ JSONException -> 0x00ef }
        L_0x009f:
            goto L_0x00c6
        L_0x00a0:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "SMALL_CAPITALS"
        L_0x00a4:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x00c6
        L_0x00a8:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "CURSIVE"
            goto L_0x00a4
        L_0x00ad:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "CASUAL"
            goto L_0x00a4
        L_0x00b2:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "MONOSPACED_SERIF"
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "SERIF"
            goto L_0x00a4
        L_0x00bc:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "MONOSPACED_SANS_SERIF"
            goto L_0x00a4
        L_0x00c1:
            java.lang.String r1 = "fontGenericFamily"
            java.lang.String r2 = "SANS_SERIF"
            goto L_0x00a4
        L_0x00c6:
            int r1 = r4.f607Hc     // Catch:{ JSONException -> 0x00ef }
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d4;
                case 3: goto L_0x00cc;
                default: goto L_0x00cb;
            }     // Catch:{ JSONException -> 0x00ef }
        L_0x00cb:
            goto L_0x00e3
        L_0x00cc:
            java.lang.String r1 = "fontStyle"
            java.lang.String r2 = "BOLD_ITALIC"
        L_0x00d0:
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x00e3
        L_0x00d4:
            java.lang.String r1 = "fontStyle"
            java.lang.String r2 = "ITALIC"
            goto L_0x00d0
        L_0x00d9:
            java.lang.String r1 = "fontStyle"
            java.lang.String r2 = "BOLD"
            goto L_0x00d0
        L_0x00de:
            java.lang.String r1 = "fontStyle"
            java.lang.String r2 = "NORMAL"
            goto L_0x00d0
        L_0x00e3:
            org.json.JSONObject r1 = r4.f604Ga     // Catch:{ JSONException -> 0x00ef }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = "customData"
            org.json.JSONObject r2 = r4.f604Ga     // Catch:{ JSONException -> 0x00ef }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00ef }
            return r0
        L_0x00ef:
            r1 = move-exception
        L_0x00f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.TextTrackStyle.toJson():org.json.JSONObject");
    }
}
