package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.cc */
public final class C1364cc {

    /* renamed from: pQ */
    public static final C1374cd f2786pQ = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
        }
    };

    /* renamed from: pR */
    public static final C1374cd f2787pR = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            String str = map.get("urls");
            if (TextUtils.isEmpty(str)) {
                C1607gr.m4709W("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = guVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                hashMap.put(str2, Boolean.valueOf(z));
            }
            guVar.mo15418a("openableURLs", (Map<String, ?>) hashMap);
        }
    };

    /* renamed from: pS */
    public static final C1374cd f2788pS = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            String str;
            PackageManager packageManager = guVar.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject(map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            String optString2 = jSONObject2.optString("u");
                            String optString3 = jSONObject2.optString("i");
                            String optString4 = jSONObject2.optString("m");
                            String optString5 = jSONObject2.optString("p");
                            String optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            boolean z = true;
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            if (packageManager.resolveActivity(intent, 65536) == null) {
                                z = false;
                            }
                            try {
                                jSONObject.put(optString, z);
                            } catch (JSONException e) {
                                e = e;
                                str = "Error constructing openable urls response.";
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            str = "Error parsing the intent data.";
                            C1607gr.m4711b(str, e);
                        }
                    }
                    guVar.mo15421b("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    guVar.mo15421b("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                guVar.mo15421b("openableIntents", new JSONObject());
            }
        }
    };

    /* renamed from: pT */
    public static final C1374cd f2789pT = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            String str = map.get("u");
            if (str == null) {
                C1607gr.m4709W("URL missing from click GMSG.");
                return;
            }
            Uri parse = Uri.parse(str);
            try {
                C1788k dF = guVar.mo15428dF();
                if (dF != null && dF.mo15947b(parse)) {
                    parse = dF.mo15944a(parse, guVar.getContext());
                }
            } catch (C1828l e) {
                C1607gr.m4709W("Unable to append parameter to URL: " + str);
            }
            new C1605gp(guVar.getContext(), guVar.mo15429dG().f3554wS, parse.toString()).start();
        }
    };

    /* renamed from: pU */
    public static final C1374cd f2790pU = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            C1445dp dC = guVar.mo15425dC();
            if (dC == null) {
                C1607gr.m4709W("A GMSG tried to close something that wasn't an overlay.");
            } else {
                dC.close();
            }
        }
    };

    /* renamed from: pV */
    public static final C1374cd f2791pV = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            guVar.mo15438q("1".equals(map.get("custom_close")));
        }
    };

    /* renamed from: pW */
    public static final C1374cd f2792pW = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            String str = map.get("u");
            if (str == null) {
                C1607gr.m4709W("URL missing from httpTrack GMSG.");
            } else {
                new C1605gp(guVar.getContext(), guVar.mo15429dG().f3554wS, str).start();
            }
        }
    };

    /* renamed from: pX */
    public static final C1374cd f2793pX = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            C1607gr.m4707U("Received log message: " + map.get("string"));
        }
    };

    /* renamed from: pY */
    public static final C1374cd f2794pY = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            String str = map.get("tx");
            String str2 = map.get("ty");
            String str3 = map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                C1788k dF = guVar.mo15428dF();
                if (dF != null) {
                    dF.mo15943C().mo15351a(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                C1607gr.m4709W("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: pZ */
    public static final C1374cd f2795pZ = new C1380cj();
}
