package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.dk */
public class C1438dk {

    /* renamed from: rs */
    private final boolean f2915rs;

    /* renamed from: rt */
    private final boolean f2916rt;

    /* renamed from: ru */
    private final boolean f2917ru;

    /* renamed from: rv */
    private final boolean f2918rv;

    /* renamed from: rw */
    private final boolean f2919rw;

    /* renamed from: com.google.android.gms.internal.dk$a */
    public static final class C1440a {
        /* access modifiers changed from: private */

        /* renamed from: rs */
        public boolean f2920rs;
        /* access modifiers changed from: private */

        /* renamed from: rt */
        public boolean f2921rt;
        /* access modifiers changed from: private */

        /* renamed from: ru */
        public boolean f2922ru;
        /* access modifiers changed from: private */

        /* renamed from: rv */
        public boolean f2923rv;
        /* access modifiers changed from: private */

        /* renamed from: rw */
        public boolean f2924rw;

        /* renamed from: bU */
        public C1438dk mo15099bU() {
            return new C1438dk(this);
        }

        /* renamed from: k */
        public C1440a mo15100k(boolean z) {
            this.f2920rs = z;
            return this;
        }

        /* renamed from: l */
        public C1440a mo15101l(boolean z) {
            this.f2921rt = z;
            return this;
        }

        /* renamed from: m */
        public C1440a mo15102m(boolean z) {
            this.f2922ru = z;
            return this;
        }

        /* renamed from: n */
        public C1440a mo15103n(boolean z) {
            this.f2923rv = z;
            return this;
        }

        /* renamed from: o */
        public C1440a mo15104o(boolean z) {
            this.f2924rw = z;
            return this;
        }
    }

    private C1438dk(C1440a aVar) {
        this.f2915rs = aVar.f2920rs;
        this.f2916rt = aVar.f2921rt;
        this.f2917ru = aVar.f2922ru;
        this.f2918rv = aVar.f2923rv;
        this.f2919rw = aVar.f2924rw;
    }

    public JSONObject toJson() {
        try {
            return new JSONObject().put("sms", this.f2915rs).put("tel", this.f2916rt).put("calendar", this.f2917ru).put("storePicture", this.f2918rv).put("inlineVideo", this.f2919rw);
        } catch (JSONException e) {
            C1607gr.m4711b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
