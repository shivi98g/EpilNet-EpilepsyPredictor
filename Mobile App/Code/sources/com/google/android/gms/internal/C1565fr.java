package com.google.android.gms.internal;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.support.p000v4.view.ViewCompat;
import android.text.TextUtils;
import com.google.android.gms.plus.PlusShare;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

@C1507ey
/* renamed from: com.google.android.gms.internal.fr */
public final class C1565fr {

    /* renamed from: uD */
    private static final SimpleDateFormat f3383uD = new SimpleDateFormat("yyyyMMdd");

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0136 A[Catch:{ JSONException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0140 A[Catch:{ JSONException -> 0x0168 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.C1548fj m4526a(android.content.Context r34, com.google.android.gms.internal.C1545fh r35, java.lang.String r36) {
        /*
            r1 = r35
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0168 }
            r4 = r36
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r4 = "ad_base_url"
            r5 = 0
            java.lang.String r4 = r3.optString(r4, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r6 = "ad_url"
            java.lang.String r6 = r3.optString(r6, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r7 = "ad_size"
            java.lang.String r22 = r3.optString(r7, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r7 = "ad_html"
            java.lang.String r7 = r3.optString(r7, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r8 = "debug_dialog"
            java.lang.String r25 = r3.optString(r8, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r8 = "interstitial_timeout"
            boolean r8 = r3.has(r8)     // Catch:{ JSONException -> 0x0168 }
            r9 = -1
            if (r8 == 0) goto L_0x0041
            java.lang.String r8 = "interstitial_timeout"
            double r11 = r3.getDouble(r8)     // Catch:{ JSONException -> 0x0168 }
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r11 = r11 * r13
            long r11 = (long) r11     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0042
        L_0x0041:
            r11 = r9
        L_0x0042:
            java.lang.String r8 = "orientation"
            java.lang.String r8 = r3.optString(r8, r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r13 = "portrait"
            boolean r13 = r13.equals(r8)     // Catch:{ JSONException -> 0x0168 }
            r14 = -1
            if (r13 == 0) goto L_0x0056
            int r8 = com.google.android.gms.internal.C1591gi.m4664dv()     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0064
        L_0x0056:
            java.lang.String r13 = "landscape"
            boolean r8 = r13.equals(r8)     // Catch:{ JSONException -> 0x0168 }
            if (r8 == 0) goto L_0x0063
            int r8 = com.google.android.gms.internal.C1591gi.m4663du()     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0064
        L_0x0063:
            r8 = r14
        L_0x0064:
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0168 }
            if (r13 != 0) goto L_0x0081
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0168 }
            if (r6 == 0) goto L_0x007b
            java.lang.String r1 = "Could not parse the mediation config: Missing required ad_base_url field"
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ JSONException -> 0x0168 }
            com.google.android.gms.internal.fj r1 = new com.google.android.gms.internal.fj     // Catch:{ JSONException -> 0x0168 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0168 }
            return r1
        L_0x007b:
            r23 = r9
            r9 = r4
            r4 = r5
        L_0x007f:
            r10 = r7
            goto L_0x009b
        L_0x0081:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0168 }
            if (r4 != 0) goto L_0x015c
            com.google.android.gms.internal.gs r4 = r1.f3304lO     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r4 = r4.f3554wS     // Catch:{ JSONException -> 0x0168 }
            r7 = r34
            com.google.android.gms.internal.fj r4 = com.google.android.gms.internal.C1561fq.m4521a((android.content.Context) r7, (java.lang.String) r4, (java.lang.String) r6, (java.lang.String) r5, (com.google.android.gms.internal.C1570fu) r5)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r6 = r4.f3333sg     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r7 = r4.f3335tU     // Catch:{ JSONException -> 0x0168 }
            long r9 = r4.f3341ua     // Catch:{ JSONException -> 0x0168 }
            r23 = r9
            r9 = r6
            goto L_0x007f
        L_0x009b:
            java.lang.String r6 = "click_urls"
            org.json.JSONArray r6 = r3.optJSONArray(r6)     // Catch:{ JSONException -> 0x0168 }
            if (r4 != 0) goto L_0x00a5
            r7 = r5
            goto L_0x00a7
        L_0x00a5:
            java.util.List<java.lang.String> r7 = r4.f3331qw     // Catch:{ JSONException -> 0x0168 }
        L_0x00a7:
            if (r6 == 0) goto L_0x00c1
            if (r7 != 0) goto L_0x00b0
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ JSONException -> 0x0168 }
            r7.<init>()     // Catch:{ JSONException -> 0x0168 }
        L_0x00b0:
            r13 = r2
        L_0x00b1:
            int r15 = r6.length()     // Catch:{ JSONException -> 0x0168 }
            if (r13 >= r15) goto L_0x00c1
            java.lang.String r15 = r6.getString(r13)     // Catch:{ JSONException -> 0x0168 }
            r7.add(r15)     // Catch:{ JSONException -> 0x0168 }
            int r13 = r13 + 1
            goto L_0x00b1
        L_0x00c1:
            java.lang.String r6 = "impression_urls"
            org.json.JSONArray r6 = r3.optJSONArray(r6)     // Catch:{ JSONException -> 0x0168 }
            if (r4 != 0) goto L_0x00cb
            r13 = r5
            goto L_0x00cd
        L_0x00cb:
            java.util.List<java.lang.String> r13 = r4.f3332qx     // Catch:{ JSONException -> 0x0168 }
        L_0x00cd:
            if (r6 == 0) goto L_0x00e7
            if (r13 != 0) goto L_0x00d6
            java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ JSONException -> 0x0168 }
            r13.<init>()     // Catch:{ JSONException -> 0x0168 }
        L_0x00d6:
            r15 = r2
        L_0x00d7:
            int r5 = r6.length()     // Catch:{ JSONException -> 0x0168 }
            if (r15 >= r5) goto L_0x00e7
            java.lang.String r5 = r6.getString(r15)     // Catch:{ JSONException -> 0x0168 }
            r13.add(r5)     // Catch:{ JSONException -> 0x0168 }
            int r15 = r15 + 1
            goto L_0x00d7
        L_0x00e7:
            java.lang.String r5 = "manual_impression_urls"
            org.json.JSONArray r5 = r3.optJSONArray(r5)     // Catch:{ JSONException -> 0x0168 }
            if (r4 != 0) goto L_0x00f1
            r6 = 0
            goto L_0x00f3
        L_0x00f1:
            java.util.List<java.lang.String> r6 = r4.f3339tY     // Catch:{ JSONException -> 0x0168 }
        L_0x00f3:
            if (r5 == 0) goto L_0x010d
            if (r6 != 0) goto L_0x00fc
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ JSONException -> 0x0168 }
            r6.<init>()     // Catch:{ JSONException -> 0x0168 }
        L_0x00fc:
            r15 = r2
        L_0x00fd:
            int r2 = r5.length()     // Catch:{ JSONException -> 0x0168 }
            if (r15 >= r2) goto L_0x010d
            java.lang.String r2 = r5.getString(r15)     // Catch:{ JSONException -> 0x0168 }
            r6.add(r2)     // Catch:{ JSONException -> 0x0168 }
            int r15 = r15 + 1
            goto L_0x00fd
        L_0x010d:
            r18 = r6
            if (r4 == 0) goto L_0x0124
            int r2 = r4.orientation     // Catch:{ JSONException -> 0x0168 }
            if (r2 == r14) goto L_0x0117
            int r8 = r4.orientation     // Catch:{ JSONException -> 0x0168 }
        L_0x0117:
            long r5 = r4.f3336tV     // Catch:{ JSONException -> 0x0168 }
            r14 = 0
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0124
            long r4 = r4.f3336tV     // Catch:{ JSONException -> 0x0168 }
            r21 = r8
            goto L_0x0127
        L_0x0124:
            r21 = r8
            r4 = r11
        L_0x0127:
            java.lang.String r2 = "active_view"
            java.lang.String r28 = r3.optString(r2)     // Catch:{ JSONException -> 0x0168 }
            java.lang.String r2 = "ad_is_javascript"
            r6 = 0
            boolean r26 = r3.optBoolean(r2, r6)     // Catch:{ JSONException -> 0x0168 }
            if (r26 == 0) goto L_0x0140
            java.lang.String r2 = "ad_passback_url"
            r6 = 0
            java.lang.String r2 = r3.optString(r2, r6)     // Catch:{ JSONException -> 0x0168 }
            r27 = r2
            goto L_0x0143
        L_0x0140:
            r6 = 0
            r27 = r6
        L_0x0143:
            com.google.android.gms.internal.fj r2 = new com.google.android.gms.internal.fj     // Catch:{ JSONException -> 0x0168 }
            r15 = 0
            r16 = -1
            r19 = -1
            r29 = 0
            r30 = 0
            boolean r1 = r1.f3316tT     // Catch:{ JSONException -> 0x0168 }
            r32 = 0
            r8 = r2
            r11 = r7
            r12 = r13
            r13 = r4
            r31 = r1
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ JSONException -> 0x0168 }
            return r2
        L_0x015c:
            java.lang.String r1 = "Could not parse the mediation config: Missing required ad_html or ad_url field."
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ JSONException -> 0x0168 }
            com.google.android.gms.internal.fj r1 = new com.google.android.gms.internal.fj     // Catch:{ JSONException -> 0x0168 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0168 }
            return r1
        L_0x0168:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not parse the mediation config: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.C1607gr.m4709W(r1)
            com.google.android.gms.internal.fj r1 = new com.google.android.gms.internal.fj
            r2 = 0
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1565fr.m4526a(android.content.Context, com.google.android.gms.internal.fh, java.lang.String):com.google.android.gms.internal.fj");
    }

    /* renamed from: a */
    public static String m4527a(C1545fh fhVar, C1571fv fvVar, Location location, String str, String str2, String str3) {
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
            if (arrayList.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", arrayList));
            }
            if (fhVar.f3307tK != null) {
                hashMap.put("ad_pos", fhVar.f3307tK);
            }
            m4529a((HashMap<String, Object>) hashMap, fhVar.f3308tL);
            hashMap.put("format", fhVar.f3305lS.f2397op);
            if (fhVar.f3305lS.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (fhVar.f3305lS.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (fhVar.f3305lS.f2399or != null) {
                StringBuilder sb = new StringBuilder();
                for (C1306ay ayVar : fhVar.f3305lS.f2399or) {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append(ayVar.width == -1 ? (int) (((float) ayVar.widthPixels) / fvVar.f3437vw) : ayVar.width);
                    sb.append("x");
                    sb.append(ayVar.height == -2 ? (int) (((float) ayVar.heightPixels) / fvVar.f3437vw) : ayVar.height);
                }
                hashMap.put("sz", sb);
            }
            if (fhVar.f3314tR != 0) {
                hashMap.put("native_version", Integer.valueOf(fhVar.f3314tR));
                hashMap.put("native_templates", fhVar.f3306mc);
            }
            hashMap.put("slotname", fhVar.f3303lL);
            hashMap.put("pn", fhVar.applicationInfo.packageName);
            if (fhVar.f3309tM != null) {
                hashMap.put("vc", Integer.valueOf(fhVar.f3309tM.versionCode));
            }
            hashMap.put("ms", fhVar.f3310tN);
            hashMap.put("seq_num", fhVar.f3311tO);
            hashMap.put("session_id", fhVar.f3312tP);
            hashMap.put("js", fhVar.f3304lO.f3554wS);
            m4531a((HashMap<String, Object>) hashMap, fvVar);
            if (fhVar.f3308tL.versionCode >= 2 && fhVar.f3308tL.f2393ol != null) {
                m4528a((HashMap<String, Object>) hashMap, fhVar.f3308tL.f2393ol);
            }
            if (fhVar.versionCode >= 2) {
                hashMap.put("quality_signals", fhVar.f3313tQ);
            }
            if (fhVar.versionCode >= 4 && fhVar.f3316tT) {
                hashMap.put("forceHttps", Boolean.valueOf(fhVar.f3316tT));
            }
            if (fhVar.versionCode >= 3 && fhVar.f3315tS != null) {
                hashMap.put("content_info", fhVar.f3315tS);
            }
            if (C1607gr.m4714v(2)) {
                C1607gr.m4708V("Ad Request JSON: " + C1591gi.m4672t((Map<String, ?>) hashMap).toString(2));
            }
            return C1591gi.m4672t((Map<String, ?>) hashMap).toString();
        } catch (JSONException e) {
            C1607gr.m4709W("Problem serializing ad request to JSON: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static void m4528a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static void m4529a(HashMap<String, Object> hashMap, C1303av avVar) {
        String dr = C1583ge.m4630dr();
        if (dr != null) {
            hashMap.put("abf", dr);
        }
        if (avVar.f2385od != -1) {
            hashMap.put("cust_age", f3383uD.format(new Date(avVar.f2385od)));
        }
        if (avVar.extras != null) {
            hashMap.put("extras", avVar.extras);
        }
        if (avVar.f2386oe != -1) {
            hashMap.put("cust_gender", Integer.valueOf(avVar.f2386oe));
        }
        if (avVar.f2387of != null) {
            hashMap.put("kw", avVar.f2387of);
        }
        if (avVar.f2389oh != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(avVar.f2389oh));
        }
        if (avVar.f2388og) {
            hashMap.put("adtest", "on");
        }
        if (avVar.versionCode >= 2) {
            if (avVar.f2390oi) {
                hashMap.put("d_imp_hdr", 1);
            }
            if (!TextUtils.isEmpty(avVar.f2391oj)) {
                hashMap.put("ppid", avVar.f2391oj);
            }
            if (avVar.f2392ok != null) {
                m4530a(hashMap, avVar.f2392ok);
            }
        }
        if (avVar.versionCode >= 3 && avVar.f2394om != null) {
            hashMap.put(PlusShare.KEY_CALL_TO_ACTION_URL, avVar.f2394om);
        }
    }

    /* renamed from: a */
    private static void m4530a(HashMap<String, Object> hashMap, C1327bj bjVar) {
        String str;
        if (Color.alpha(bjVar.f2665oQ) != 0) {
            hashMap.put("acolor", m4533u(bjVar.f2665oQ));
        }
        if (Color.alpha(bjVar.backgroundColor) != 0) {
            hashMap.put("bgcolor", m4533u(bjVar.backgroundColor));
        }
        if (!(Color.alpha(bjVar.f2666oR) == 0 || Color.alpha(bjVar.f2667oS) == 0)) {
            hashMap.put("gradientto", m4533u(bjVar.f2666oR));
            hashMap.put("gradientfrom", m4533u(bjVar.f2667oS));
        }
        if (Color.alpha(bjVar.f2668oT) != 0) {
            hashMap.put("bcolor", m4533u(bjVar.f2668oT));
        }
        hashMap.put("bthick", Integer.toString(bjVar.f2669oU));
        String str2 = null;
        switch (bjVar.f2670oV) {
            case 0:
                str = "none";
                break;
            case 1:
                str = "dashed";
                break;
            case 2:
                str = "dotted";
                break;
            case 3:
                str = "solid";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            hashMap.put("btype", str);
        }
        switch (bjVar.f2671oW) {
            case 0:
                str2 = "light";
                break;
            case 1:
                str2 = "medium";
                break;
            case 2:
                str2 = "dark";
                break;
        }
        if (str2 != null) {
            hashMap.put("callbuttoncolor", str2);
        }
        if (bjVar.f2672oX != null) {
            hashMap.put("channel", bjVar.f2672oX);
        }
        if (Color.alpha(bjVar.f2673oY) != 0) {
            hashMap.put("dcolor", m4533u(bjVar.f2673oY));
        }
        if (bjVar.f2674oZ != null) {
            hashMap.put("font", bjVar.f2674oZ);
        }
        if (Color.alpha(bjVar.f2675pa) != 0) {
            hashMap.put("hcolor", m4533u(bjVar.f2675pa));
        }
        hashMap.put("headersize", Integer.toString(bjVar.f2676pb));
        if (bjVar.f2677pc != null) {
            hashMap.put("q", bjVar.f2677pc);
        }
    }

    /* renamed from: a */
    private static void m4531a(HashMap<String, Object> hashMap, C1571fv fvVar) {
        hashMap.put("am", Integer.valueOf(fvVar.f3421vg));
        hashMap.put("cog", m4532u(fvVar.f3422vh));
        hashMap.put("coh", m4532u(fvVar.f3423vi));
        if (!TextUtils.isEmpty(fvVar.f3424vj)) {
            hashMap.put("carrier", fvVar.f3424vj);
        }
        hashMap.put("gl", fvVar.f3425vk);
        if (fvVar.f3426vl) {
            hashMap.put("simulator", 1);
        }
        hashMap.put("ma", m4532u(fvVar.f3427vm));
        hashMap.put("sp", m4532u(fvVar.f3428vn));
        hashMap.put("hl", fvVar.f3429vo);
        if (!TextUtils.isEmpty(fvVar.f3430vp)) {
            hashMap.put("mv", fvVar.f3430vp);
        }
        hashMap.put("muv", Integer.valueOf(fvVar.f3431vq));
        if (fvVar.f3432vr != -2) {
            hashMap.put("cnt", Integer.valueOf(fvVar.f3432vr));
        }
        hashMap.put("gnt", Integer.valueOf(fvVar.f3433vs));
        hashMap.put("pt", Integer.valueOf(fvVar.f3434vt));
        hashMap.put("rm", Integer.valueOf(fvVar.f3435vu));
        hashMap.put("riv", Integer.valueOf(fvVar.f3436vv));
        hashMap.put("u_sd", Float.valueOf(fvVar.f3437vw));
        hashMap.put("sh", Integer.valueOf(fvVar.f3439vy));
        hashMap.put("sw", Integer.valueOf(fvVar.f3438vx));
        Bundle bundle = new Bundle();
        bundle.putInt("active_network_state", fvVar.f3420vC);
        bundle.putBoolean("active_network_metered", fvVar.f3419vB);
        hashMap.put("connectivity", bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_charging", fvVar.f3418vA);
        bundle2.putDouble("battery_level", fvVar.f3440vz);
        hashMap.put("battery", bundle2);
    }

    /* renamed from: u */
    private static Integer m4532u(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* renamed from: u */
    private static String m4533u(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK)});
    }
}
