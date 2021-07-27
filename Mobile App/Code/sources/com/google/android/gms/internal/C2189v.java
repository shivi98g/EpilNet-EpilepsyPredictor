package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.C1574fy;

@C1507ey
/* renamed from: com.google.android.gms.internal.v */
public class C2189v {

    /* renamed from: mk */
    private C2190a f4265mk;

    /* renamed from: ml */
    private boolean f4266ml;

    /* renamed from: mm */
    private boolean f4267mm;

    /* renamed from: com.google.android.gms.internal.v$a */
    public interface C2190a {
        /* renamed from: e */
        void mo17152e(String str);
    }

    @C1507ey
    /* renamed from: com.google.android.gms.internal.v$b */
    public static class C2191b implements C2190a {

        /* renamed from: mn */
        private final C1574fy.C1575a f4268mn;

        /* renamed from: mo */
        private final C1610gu f4269mo;

        public C2191b(C1574fy.C1575a aVar, C1610gu guVar) {
            this.f4268mn = aVar;
            this.f4269mo = guVar;
        }

        /* renamed from: e */
        public void mo17152e(String str) {
            C1607gr.m4705S("An auto-clicking creative is blocked");
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter("navigationURL", str);
            }
            if (!(this.f4268mn == null || this.f4268mn.f3468vK == null || TextUtils.isEmpty(this.f4268mn.f3468vK.f3342ub))) {
                builder.appendQueryParameter("debugDialog", this.f4268mn.f3468vK.f3342ub);
            }
            C1591gi.m4661c(this.f4269mo.getContext(), this.f4269mo.mo15429dG().f3554wS, builder.toString());
        }
    }

    public C2189v() {
        Bundle bN = C1579ga.m4591bN();
        boolean z = false;
        if (bN != null && bN.getBoolean("gads:block_autoclicks", false)) {
            z = true;
        }
        this.f4267mm = z;
    }

    public C2189v(boolean z) {
        this.f4267mm = z;
    }

    /* renamed from: a */
    public void mo17148a(C2190a aVar) {
        this.f4265mk = aVar;
    }

    /* renamed from: av */
    public void mo17149av() {
        this.f4266ml = true;
    }

    /* renamed from: az */
    public boolean mo17150az() {
        return !this.f4267mm || this.f4266ml;
    }

    /* renamed from: d */
    public void mo17151d(String str) {
        C1607gr.m4705S("Action was blocked because no click was detected.");
        if (this.f4265mk != null) {
            this.f4265mk.mo17152e(str);
        }
    }
}
