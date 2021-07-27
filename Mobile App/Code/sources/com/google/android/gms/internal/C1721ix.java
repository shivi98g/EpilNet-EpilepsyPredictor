package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ix */
public class C1721ix {

    /* renamed from: Hh */
    private static final C1714is f3836Hh = new C1714is("MetadataUtils");

    /* renamed from: Iq */
    private static final String[] f3837Iq = {"Z", "+hh", "+hhmm", "+hh:mm"};

    /* renamed from: Ir */
    private static final String f3838Ir = ("yyyyMMdd'T'HHmmss" + f3837Iq[0]);

    /* renamed from: a */
    public static String m5122a(Calendar calendar) {
        if (calendar == null) {
            f3836Hh.mo15717b("Calendar object cannot be null", new Object[0]);
            return null;
        }
        String str = f3838Ir;
        if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        String format = simpleDateFormat.format(calendar.getTime());
        return format.endsWith("+0000") ? format.replace("+0000", f3837Iq[0]) : format;
    }

    /* renamed from: a */
    public static void m5123a(List<WebImage> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* renamed from: a */
    public static void m5124a(JSONObject jSONObject, List<WebImage> list) {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (WebImage json : list) {
                jSONArray.put(json.toJson());
            }
            try {
                jSONObject.put("images", jSONArray);
            } catch (JSONException e) {
            }
        }
    }

    /* renamed from: aL */
    public static Calendar m5125aL(String str) {
        if (TextUtils.isEmpty(str)) {
            f3836Hh.mo15717b("Input string is empty or null", new Object[0]);
            return null;
        }
        String aM = m5126aM(str);
        if (TextUtils.isEmpty(aM)) {
            f3836Hh.mo15717b("Invalid date format", new Object[0]);
            return null;
        }
        String aN = m5127aN(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(aN)) {
            aM = aM + "T" + aN;
            str2 = aN.length() == "HHmmss".length() ? "yyyyMMdd'T'HHmmss" : f3838Ir;
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(aM));
            return instance;
        } catch (ParseException e) {
            f3836Hh.mo15717b("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: aM */
    private static String m5126aM(String str) {
        if (TextUtils.isEmpty(str)) {
            f3836Hh.mo15717b("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, "yyyyMMdd".length());
        } catch (IndexOutOfBoundsException e) {
            f3836Hh.mo15718c("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: aN */
    private static String m5127aN(String str) {
        if (TextUtils.isEmpty(str)) {
            f3836Hh.mo15717b("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != "yyyyMMdd".length()) {
            f3836Hh.mo15717b("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == "HHmmss".length()) {
                return substring;
            }
            char charAt = substring.charAt("HHmmss".length());
            if (charAt == '+' || charAt == '-') {
                if (m5128aO(substring)) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
                return null;
            } else if (charAt != 'Z' || substring.length() != "HHmmss".length() + f3837Iq[0].length()) {
                return null;
            } else {
                return substring.substring(0, substring.length() - 1) + "+0000";
            }
        } catch (IndexOutOfBoundsException e) {
            f3836Hh.mo15717b("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: aO */
    private static boolean m5128aO(String str) {
        int length = str.length();
        int length2 = "HHmmss".length();
        return length == f3837Iq[1].length() + length2 || length == f3837Iq[2].length() + length2 || length == length2 + f3837Iq[3].length();
    }
}
