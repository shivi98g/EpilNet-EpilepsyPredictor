package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.C1438dk;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.dl */
public class C1441dl {
    private final Context mContext;

    /* renamed from: mR */
    private final WindowManager f2925mR;

    /* renamed from: mo */
    private final C1610gu f2926mo;

    /* renamed from: rA */
    int f2927rA = -1;

    /* renamed from: rB */
    int f2928rB = -1;

    /* renamed from: rC */
    private int f2929rC;

    /* renamed from: rD */
    private int f2930rD = -1;

    /* renamed from: rE */
    private int f2931rE = -1;

    /* renamed from: rF */
    private int[] f2932rF = new int[2];

    /* renamed from: rx */
    private final C1329bl f2933rx;

    /* renamed from: ry */
    DisplayMetrics f2934ry;

    /* renamed from: rz */
    private float f2935rz;

    public C1441dl(C1610gu guVar, Context context, C1329bl blVar) {
        this.f2926mo = guVar;
        this.mContext = context;
        this.f2933rx = blVar;
        this.f2925mR = (WindowManager) context.getSystemService("window");
        m4274bV();
        mo15105bW();
        m4275bX();
    }

    /* renamed from: bV */
    private void m4274bV() {
        this.f2934ry = new DisplayMetrics();
        Display defaultDisplay = this.f2925mR.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f2934ry);
        this.f2935rz = this.f2934ry.density;
        this.f2929rC = defaultDisplay.getRotation();
    }

    /* renamed from: bX */
    private void m4275bX() {
        this.f2926mo.getLocationOnScreen(this.f2932rF);
        this.f2926mo.measure(0, 0);
        float f = 160.0f / ((float) this.f2934ry.densityDpi);
        this.f2930rD = Math.round(((float) this.f2926mo.getMeasuredWidth()) * f);
        this.f2931rE = Math.round(((float) this.f2926mo.getMeasuredHeight()) * f);
    }

    /* renamed from: cd */
    private C1438dk m4276cd() {
        return new C1438dk.C1440a().mo15101l(this.f2933rx.mo14927bo()).mo15100k(this.f2933rx.mo14928bp()).mo15102m(this.f2933rx.mo14931bt()).mo15103n(this.f2933rx.mo14929bq()).mo15104o(this.f2933rx.mo14930br()).mo15099bU();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bW */
    public void mo15105bW() {
        int s = C1591gi.m4671s(this.mContext);
        float f = 160.0f / ((float) this.f2934ry.densityDpi);
        this.f2927rA = Math.round(((float) this.f2934ry.widthPixels) * f);
        this.f2928rB = Math.round(((float) (this.f2934ry.heightPixels - s)) * f);
    }

    /* renamed from: bY */
    public void mo15106bY() {
        mo15109cb();
        mo15110cc();
        mo15108ca();
        mo15107bZ();
    }

    /* renamed from: bZ */
    public void mo15107bZ() {
        if (C1607gr.m4714v(2)) {
            C1607gr.m4707U("Dispatching Ready Event.");
        }
        this.f2926mo.mo15421b("onReadyEventReceived", new JSONObject());
    }

    /* renamed from: ca */
    public void mo15108ca() {
        try {
            this.f2926mo.mo15421b("onDefaultPositionReceived", new JSONObject().put("x", this.f2932rF[0]).put("y", this.f2932rF[1]).put("width", this.f2930rD).put("height", this.f2931rE));
        } catch (JSONException e) {
            C1607gr.m4711b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: cb */
    public void mo15109cb() {
        try {
            this.f2926mo.mo15421b("onScreenInfoChanged", new JSONObject().put("width", this.f2927rA).put("height", this.f2928rB).put("density", (double) this.f2935rz).put("rotation", this.f2929rC));
        } catch (JSONException e) {
            C1607gr.m4711b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: cc */
    public void mo15110cc() {
        this.f2926mo.mo15421b("onDeviceFeaturesReceived", m4276cd().toJson());
    }
}
