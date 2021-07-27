package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.cj */
public final class C1380cj implements C1374cd {
    /* renamed from: a */
    private static int m4169a(DisplayMetrics displayMetrics, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                return C1606gq.m4698a(displayMetrics, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                C1607gr.m4709W("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo14738a(C1610gu guVar, Map<String, String> map) {
        String str;
        String str2 = map.get("action");
        if (str2 == null) {
            C1607gr.m4709W("Action missing from video GMSG.");
            return;
        }
        C1445dp dC = guVar.mo15425dC();
        if (dC == null) {
            C1607gr.m4709W("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean equalsIgnoreCase = "new".equalsIgnoreCase(str2);
        boolean equalsIgnoreCase2 = "position".equalsIgnoreCase(str2);
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            DisplayMetrics displayMetrics = guVar.getContext().getResources().getDisplayMetrics();
            int a = m4169a(displayMetrics, map, "x", 0);
            int a2 = m4169a(displayMetrics, map, "y", 0);
            int a3 = m4169a(displayMetrics, map, "w", -1);
            int a4 = m4169a(displayMetrics, map, "h", -1);
            if (!equalsIgnoreCase || dC.mo15121ce() != null) {
                dC.mo15119b(a, a2, a3, a4);
            } else {
                dC.mo15120c(a, a2, a3, a4);
            }
        } else {
            C1453dt ce = dC.mo15121ce();
            if (ce == null) {
                C1453dt.m4317a(guVar, "no_video_view", (String) null);
            } else if ("click".equalsIgnoreCase(str2)) {
                DisplayMetrics displayMetrics2 = guVar.getContext().getResources().getDisplayMetrics();
                int a5 = m4169a(displayMetrics2, map, "x", 0);
                int a6 = m4169a(displayMetrics2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a6, 0);
                ce.mo15156b(obtain);
                obtain.recycle();
            } else if ("controls".equalsIgnoreCase(str2)) {
                String str3 = map.get("enabled");
                if (str3 == null) {
                    C1607gr.m4709W("Enabled parameter missing from controls video GMSG.");
                } else {
                    ce.mo15165s(Boolean.parseBoolean(str3));
                }
            } else if ("currentTime".equalsIgnoreCase(str2)) {
                String str4 = map.get("time");
                if (str4 == null) {
                    C1607gr.m4709W("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    ce.seekTo((int) (Float.parseFloat(str4) * 1000.0f));
                } catch (NumberFormatException e) {
                    str = "Could not parse time parameter from currentTime video GMSG: " + str4;
                }
            } else if ("hide".equalsIgnoreCase(str2)) {
                ce.setVisibility(4);
            } else if ("load".equalsIgnoreCase(str2)) {
                ce.mo15157cq();
            } else if ("pause".equalsIgnoreCase(str2)) {
                ce.pause();
            } else if ("play".equalsIgnoreCase(str2)) {
                ce.play();
            } else if ("show".equalsIgnoreCase(str2)) {
                ce.setVisibility(0);
            } else if ("src".equalsIgnoreCase(str2)) {
                ce.mo15155C(map.get("src"));
            } else {
                str = "Unknown video action: " + str2;
                C1607gr.m4709W(str);
            }
        }
    }
}
