package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdSize;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.di */
public class C1434di {

    /* renamed from: rk */
    static final Set<String> f2900rk = new HashSet(Arrays.asList(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"}));

    /* renamed from: li */
    private int f2901li = -1;

    /* renamed from: lj */
    private int f2902lj = -1;
    private final Context mContext;

    /* renamed from: mo */
    private final C1610gu f2903mo;

    /* renamed from: rd */
    private final Map<String, String> f2904rd;

    /* renamed from: rl */
    private int f2905rl = 0;

    /* renamed from: rm */
    private int f2906rm = 0;

    /* renamed from: rn */
    private boolean f2907rn = true;

    /* renamed from: ro */
    private String f2908ro = "top-right";

    public C1434di(C1610gu guVar, Map<String, String> map) {
        this.f2903mo = guVar;
        this.f2904rd = map;
        this.mContext = guVar.mo15431dI();
    }

    /* renamed from: bQ */
    private void m4253bQ() {
        int[] t = C1591gi.m4673t(this.mContext);
        if (!TextUtils.isEmpty(this.f2904rd.get("width"))) {
            int M = C1591gi.m4639M(this.f2904rd.get("width"));
            if (mo15087b(M, t[0])) {
                this.f2901li = M;
            }
        }
        if (!TextUtils.isEmpty(this.f2904rd.get("height"))) {
            int M2 = C1591gi.m4639M(this.f2904rd.get("height"));
            if (mo15091c(M2, t[1])) {
                this.f2902lj = M2;
            }
        }
        if (!TextUtils.isEmpty(this.f2904rd.get("offsetX"))) {
            this.f2905rl = C1591gi.m4639M(this.f2904rd.get("offsetX"));
        }
        if (!TextUtils.isEmpty(this.f2904rd.get("offsetY"))) {
            this.f2906rm = C1591gi.m4639M(this.f2904rd.get("offsetY"));
        }
        if (!TextUtils.isEmpty(this.f2904rd.get("allowOffscreen"))) {
            this.f2907rn = Boolean.parseBoolean(this.f2904rd.get("allowOffscreen"));
        }
        String str = this.f2904rd.get("customClosePosition");
        if (!TextUtils.isEmpty(str) && f2900rk.contains(str)) {
            this.f2908ro = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15087b(int i, int i2) {
        return i >= 50 && i < i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bR */
    public boolean mo15088bR() {
        return this.f2901li > -1 && this.f2902lj > -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bS */
    public void mo15089bS() {
        try {
            this.f2903mo.mo15421b("onSizeChanged", new JSONObject().put("x", this.f2905rl).put("y", this.f2906rm).put("width", this.f2901li).put("height", this.f2902lj));
        } catch (JSONException e) {
            C1607gr.m4711b("Error occured while dispatching size change.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bT */
    public void mo15090bT() {
        try {
            this.f2903mo.mo15421b("onStateChanged", new JSONObject().put("state", "resized"));
        } catch (JSONException e) {
            C1607gr.m4711b("Error occured while dispatching state change.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo15091c(int i, int i2) {
        return i >= 50 && i < i2;
    }

    public void execute() {
        C1607gr.m4707U("PLEASE IMPLEMENT mraid.resize()");
        if (this.mContext == null) {
            C1607gr.m4709W("Not an activity context. Cannot resize.");
        } else if (this.f2903mo.mo15420ac().f2398oq) {
            C1607gr.m4709W("Is interstitial. Cannot resize an interstitial.");
        } else if (this.f2903mo.mo15430dH()) {
            C1607gr.m4709W("Is expanded. Cannot resize an expanded banner.");
        } else {
            m4253bQ();
            if (!mo15088bR()) {
                C1607gr.m4709W("Invalid width and height options. Cannot resize.");
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int a = C1606gq.m4698a(displayMetrics, this.f2901li) + 16;
            int a2 = C1606gq.m4698a(displayMetrics, this.f2902lj) + 16;
            ViewParent parent = this.f2903mo.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f2903mo);
            }
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setBackgroundColor(0);
            PopupWindow popupWindow = new PopupWindow(this.mContext);
            popupWindow.setHeight(a2);
            popupWindow.setWidth(a);
            popupWindow.setClippingEnabled(!this.f2907rn);
            popupWindow.setContentView(linearLayout);
            linearLayout.addView(this.f2903mo, -1, -1);
            popupWindow.showAtLocation(((Activity) this.mContext).getWindow().getDecorView(), 0, this.f2905rl, this.f2906rm);
            this.f2903mo.mo15416a(new C1306ay(this.mContext, new AdSize(this.f2901li, this.f2902lj)));
            mo15089bS();
            mo15090bT();
        }
    }
}
