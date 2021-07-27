package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.C1721ix;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata {

    /* renamed from: Gc */
    private static final String[] f515Gc = {null, "String", "int", "double", "ISO-8601 date String"};

    /* renamed from: Gd */
    private static final C0643a f516Gd = new C0643a().mo10737a(KEY_CREATION_DATE, "creationDateTime", 4).mo10737a(KEY_RELEASE_DATE, "releaseDate", 4).mo10737a(KEY_BROADCAST_DATE, "originalAirdate", 4).mo10737a(KEY_TITLE, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, 1).mo10737a(KEY_SUBTITLE, "subtitle", 1).mo10737a(KEY_ARTIST, "artist", 1).mo10737a(KEY_ALBUM_ARTIST, "albumArtist", 1).mo10737a(KEY_ALBUM_TITLE, "albumName", 1).mo10737a(KEY_COMPOSER, "composer", 1).mo10737a(KEY_DISC_NUMBER, "discNumber", 2).mo10737a(KEY_TRACK_NUMBER, "trackNumber", 2).mo10737a(KEY_SEASON_NUMBER, "season", 2).mo10737a(KEY_EPISODE_NUMBER, "episode", 2).mo10737a(KEY_SERIES_TITLE, "seriesTitle", 1).mo10737a(KEY_STUDIO, "studio", 1).mo10737a(KEY_WIDTH, "width", 2).mo10737a(KEY_HEIGHT, "height", 2).mo10737a(KEY_LOCATION_NAME, "location", 1).mo10737a(KEY_LOCATION_LATITUDE, "latitude", 3).mo10737a(KEY_LOCATION_LONGITUDE, "longitude", 3);
    public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
    public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
    public static final int MEDIA_TYPE_GENERIC = 0;
    public static final int MEDIA_TYPE_MOVIE = 1;
    public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
    public static final int MEDIA_TYPE_PHOTO = 4;
    public static final int MEDIA_TYPE_TV_SHOW = 2;
    public static final int MEDIA_TYPE_USER = 100;

    /* renamed from: Fp */
    private final List<WebImage> f517Fp;

    /* renamed from: Ge */
    private final Bundle f518Ge;

    /* renamed from: Gf */
    private int f519Gf;

    /* renamed from: com.google.android.gms.cast.MediaMetadata$a */
    private static class C0643a {

        /* renamed from: Gg */
        private final Map<String, String> f520Gg = new HashMap();

        /* renamed from: Gh */
        private final Map<String, String> f521Gh = new HashMap();

        /* renamed from: Gi */
        private final Map<String, Integer> f522Gi = new HashMap();

        /* renamed from: a */
        public C0643a mo10737a(String str, String str2, int i) {
            this.f520Gg.put(str, str2);
            this.f521Gh.put(str2, str);
            this.f522Gi.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: aA */
        public String mo10738aA(String str) {
            return this.f521Gh.get(str);
        }

        /* renamed from: aB */
        public int mo10739aB(String str) {
            Integer num = this.f522Gi.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        /* renamed from: az */
        public String mo10740az(String str) {
            return this.f520Gg.get(str);
        }
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i) {
        this.f517Fp = new ArrayList();
        this.f518Ge = new Bundle();
        this.f519Gf = i;
    }

    /* renamed from: a */
    private void m413a(JSONObject jSONObject, String... strArr) {
        try {
            for (String str : strArr) {
                if (this.f518Ge.containsKey(str)) {
                    switch (f516Gd.mo10739aB(str)) {
                        case 1:
                        case 4:
                            jSONObject.put(f516Gd.mo10740az(str), this.f518Ge.getString(str));
                            break;
                        case 2:
                            jSONObject.put(f516Gd.mo10740az(str), this.f518Ge.getInt(str));
                            break;
                        case 3:
                            jSONObject.put(f516Gd.mo10740az(str), this.f518Ge.getDouble(str));
                            break;
                    }
                }
            }
            for (String str2 : this.f518Ge.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.f518Ge.get(str2);
                    if (!(obj instanceof String)) {
                        if (!(obj instanceof Integer)) {
                            if (!(obj instanceof Double)) {
                            }
                        }
                    }
                    jSONObject.put(str2, obj);
                }
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: a */
    private boolean m414a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m414a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r3.putString(r2, (java.lang.String) r1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m415b(org.json.JSONObject r7, java.lang.String... r8) {
        /*
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r8 = java.util.Arrays.asList(r8)
            r0.<init>(r8)
            java.util.Iterator r8 = r7.keys()     // Catch:{ JSONException -> 0x00b4 }
        L_0x000d:
            boolean r1 = r8.hasNext()     // Catch:{ JSONException -> 0x00b4 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r8.next()     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r2 = "metadataType"
            boolean r2 = r2.equals(r1)     // Catch:{ JSONException -> 0x00b4 }
            if (r2 == 0) goto L_0x0022
            goto L_0x000d
        L_0x0022:
            com.google.android.gms.cast.MediaMetadata$a r2 = f516Gd     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r2 = r2.mo10738aA(r1)     // Catch:{ JSONException -> 0x00b4 }
            if (r2 == 0) goto L_0x0081
            boolean r3 = r0.contains(r2)     // Catch:{ JSONException -> 0x00b4 }
            if (r3 == 0) goto L_0x000d
            java.lang.Object r1 = r7.get(r1)     // Catch:{ JSONException -> 0x007f }
            if (r1 != 0) goto L_0x0037
            goto L_0x000d
        L_0x0037:
            com.google.android.gms.cast.MediaMetadata$a r3 = f516Gd     // Catch:{ JSONException -> 0x007f }
            int r3 = r3.mo10739aB(r2)     // Catch:{ JSONException -> 0x007f }
            switch(r3) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0066;
                case 3: goto L_0x0056;
                case 4: goto L_0x0041;
                default: goto L_0x0040;
            }     // Catch:{ JSONException -> 0x007f }
        L_0x0040:
            goto L_0x000d
        L_0x0041:
            boolean r3 = r1 instanceof java.lang.String     // Catch:{ JSONException -> 0x007f }
            if (r3 == 0) goto L_0x000d
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x007f }
            java.util.Calendar r3 = com.google.android.gms.internal.C1721ix.m5125aL(r3)     // Catch:{ JSONException -> 0x007f }
            if (r3 == 0) goto L_0x000d
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x007f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x007f }
        L_0x0052:
            r3.putString(r2, r1)     // Catch:{ JSONException -> 0x007f }
            goto L_0x000d
        L_0x0056:
            boolean r3 = r1 instanceof java.lang.Double     // Catch:{ JSONException -> 0x007f }
            if (r3 == 0) goto L_0x000d
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x007f }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ JSONException -> 0x007f }
            double r4 = r1.doubleValue()     // Catch:{ JSONException -> 0x007f }
            r3.putDouble(r2, r4)     // Catch:{ JSONException -> 0x007f }
            goto L_0x000d
        L_0x0066:
            boolean r3 = r1 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x007f }
            if (r3 == 0) goto L_0x000d
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x007f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x007f }
            int r1 = r1.intValue()     // Catch:{ JSONException -> 0x007f }
            r3.putInt(r2, r1)     // Catch:{ JSONException -> 0x007f }
            goto L_0x000d
        L_0x0076:
            boolean r3 = r1 instanceof java.lang.String     // Catch:{ JSONException -> 0x007f }
            if (r3 == 0) goto L_0x000d
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x007f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x007f }
            goto L_0x0052
        L_0x007f:
            r1 = move-exception
            goto L_0x000d
        L_0x0081:
            java.lang.Object r2 = r7.get(r1)     // Catch:{ JSONException -> 0x00b4 }
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ JSONException -> 0x00b4 }
            if (r3 == 0) goto L_0x0092
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x00b4 }
            r3.putString(r1, r2)     // Catch:{ JSONException -> 0x00b4 }
            goto L_0x000d
        L_0x0092:
            boolean r3 = r2 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x00b4 }
            if (r3 == 0) goto L_0x00a3
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x00b4 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ JSONException -> 0x00b4 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x00b4 }
            r3.putInt(r1, r2)     // Catch:{ JSONException -> 0x00b4 }
            goto L_0x000d
        L_0x00a3:
            boolean r3 = r2 instanceof java.lang.Double     // Catch:{ JSONException -> 0x00b4 }
            if (r3 == 0) goto L_0x000d
            android.os.Bundle r3 = r6.f518Ge     // Catch:{ JSONException -> 0x00b4 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00b4 }
            double r4 = r2.doubleValue()     // Catch:{ JSONException -> 0x00b4 }
            r3.putDouble(r1, r4)     // Catch:{ JSONException -> 0x00b4 }
            goto L_0x000d
        L_0x00b4:
            r7 = move-exception
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaMetadata.m415b(org.json.JSONObject, java.lang.String[]):void");
    }

    /* renamed from: f */
    private void m416f(String str, int i) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int aB = f516Gd.mo10739aB(str);
        if (aB != i && aB != 0) {
            throw new IllegalArgumentException("Value for " + str + " must be a " + f515Gc[i]);
        }
    }

    public void addImage(WebImage webImage) {
        this.f517Fp.add(webImage);
    }

    /* renamed from: c */
    public void mo10717c(JSONObject jSONObject) {
        String str;
        String str2;
        String[] strArr;
        clear();
        this.f519Gf = 0;
        try {
            this.f519Gf = jSONObject.getInt("metadataType");
        } catch (JSONException e) {
        }
        C1721ix.m5123a(this.f517Fp, jSONObject);
        switch (this.f519Gf) {
            case 0:
                str2 = KEY_TITLE;
                str = KEY_ARTIST;
                break;
            case 1:
                str2 = KEY_TITLE;
                str = KEY_STUDIO;
                break;
            case 2:
                strArr = new String[]{KEY_TITLE, KEY_SERIES_TITLE, KEY_SEASON_NUMBER, KEY_EPISODE_NUMBER, KEY_BROADCAST_DATE};
                break;
            case 3:
                strArr = new String[]{KEY_TITLE, KEY_ALBUM_TITLE, KEY_ARTIST, KEY_ALBUM_ARTIST, KEY_COMPOSER, KEY_TRACK_NUMBER, KEY_DISC_NUMBER, KEY_RELEASE_DATE};
                break;
            case 4:
                strArr = new String[]{KEY_TITLE, KEY_ARTIST, KEY_LOCATION_NAME, KEY_LOCATION_LATITUDE, KEY_LOCATION_LONGITUDE, KEY_WIDTH, KEY_HEIGHT, KEY_CREATION_DATE};
                break;
            default:
                strArr = new String[0];
                break;
        }
        strArr = new String[]{str2, str, KEY_SUBTITLE, KEY_RELEASE_DATE};
        m415b(jSONObject, strArr);
    }

    public void clear() {
        this.f518Ge.clear();
        this.f517Fp.clear();
    }

    public void clearImages() {
        this.f517Fp.clear();
    }

    public boolean containsKey(String str) {
        return this.f518Ge.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return m414a(this.f518Ge, mediaMetadata.f518Ge) && this.f517Fp.equals(mediaMetadata.f517Fp);
    }

    public Calendar getDate(String str) {
        m416f(str, 4);
        String string = this.f518Ge.getString(str);
        if (string != null) {
            return C1721ix.m5125aL(string);
        }
        return null;
    }

    public String getDateAsString(String str) {
        m416f(str, 4);
        return this.f518Ge.getString(str);
    }

    public double getDouble(String str) {
        m416f(str, 3);
        return this.f518Ge.getDouble(str);
    }

    public List<WebImage> getImages() {
        return this.f517Fp;
    }

    public int getInt(String str) {
        m416f(str, 2);
        return this.f518Ge.getInt(str);
    }

    public int getMediaType() {
        return this.f519Gf;
    }

    public String getString(String str) {
        m416f(str, 1);
        return this.f518Ge.getString(str);
    }

    public boolean hasImages() {
        return this.f517Fp != null && !this.f517Fp.isEmpty();
    }

    public int hashCode() {
        int i = 17;
        for (String str : this.f518Ge.keySet()) {
            i = this.f518Ge.get(str).hashCode() + (31 * i);
        }
        return (31 * i) + this.f517Fp.hashCode();
    }

    public Set<String> keySet() {
        return this.f518Ge.keySet();
    }

    public void putDate(String str, Calendar calendar) {
        m416f(str, 4);
        this.f518Ge.putString(str, C1721ix.m5122a(calendar));
    }

    public void putDouble(String str, double d) {
        m416f(str, 3);
        this.f518Ge.putDouble(str, d);
    }

    public void putInt(String str, int i) {
        m416f(str, 2);
        this.f518Ge.putInt(str, i);
    }

    public void putString(String str, String str2) {
        m416f(str, 1);
        this.f518Ge.putString(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r1 = new java.lang.String[]{r1, r2, KEY_SUBTITLE, KEY_RELEASE_DATE};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        m413a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJson() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "metadataType"
            int r2 = r10.f519Gf     // Catch:{ JSONException -> 0x000d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r1 = move-exception
        L_0x000e:
            java.util.List<com.google.android.gms.common.images.WebImage> r1 = r10.f517Fp
            com.google.android.gms.internal.C1721ix.m5124a((org.json.JSONObject) r0, (java.util.List<com.google.android.gms.common.images.WebImage>) r1)
            int r1 = r10.f519Gf
            switch(r1) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0054;
                case 2: goto L_0x0045;
                case 3: goto L_0x0030;
                case 4: goto L_0x001f;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
        L_0x001b:
            r10.m413a((org.json.JSONObject) r0, (java.lang.String[]) r1)
            return r0
        L_0x001f:
            java.lang.String r2 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.LOCATION_NAME"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"
            java.lang.String r6 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"
            java.lang.String r7 = "com.google.android.gms.cast.metadata.WIDTH"
            java.lang.String r8 = "com.google.android.gms.cast.metadata.HEIGHT"
            java.lang.String r9 = "com.google.android.gms.cast.metadata.CREATION_DATE"
            goto L_0x0040
        L_0x0030:
            java.lang.String r2 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r6 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r7 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            java.lang.String r8 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            java.lang.String r9 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
        L_0x0040:
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            goto L_0x001b
        L_0x0045:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r2 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SEASON_NUMBER"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}
            goto L_0x001b
        L_0x0054:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r2 = "com.google.android.gms.cast.metadata.STUDIO"
            goto L_0x005d
        L_0x0059:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r2 = "com.google.android.gms.cast.metadata.ARTIST"
        L_0x005d:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            goto L_0x001b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaMetadata.toJson():org.json.JSONObject");
    }
}
