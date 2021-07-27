package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1634hd;
import com.google.android.gms.internal.C1649hp;
import com.google.android.gms.internal.C1948mv;
import com.google.android.gms.plus.PlusShare;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: com.google.android.gms.internal.hr */
public class C1652hr implements SafeParcelable {
    public static final C1653hs CREATOR = new C1653hs();

    /* renamed from: CK */
    final int f3657CK;

    /* renamed from: Dw */
    final C1637hf f3658Dw;

    /* renamed from: Dx */
    final long f3659Dx;

    /* renamed from: Dy */
    final int f3660Dy;

    /* renamed from: Dz */
    final C1634hd f3661Dz;

    /* renamed from: pc */
    public final String f3662pc;

    C1652hr(int i, C1637hf hfVar, long j, int i2, String str, C1634hd hdVar) {
        this.f3657CK = i;
        this.f3658Dw = hfVar;
        this.f3659Dx = j;
        this.f3660Dy = i2;
        this.f3662pc = str;
        this.f3661Dz = hdVar;
    }

    public C1652hr(C1637hf hfVar, long j, int i) {
        this(1, hfVar, j, i, (String) null, (C1634hd) null);
    }

    public C1652hr(C1637hf hfVar, long j, int i, String str, C1634hd hdVar) {
        this(1, hfVar, j, i, str, hdVar);
    }

    public C1652hr(String str, Intent intent, String str2, Uri uri, String str3, List<AppIndexApi.AppIndexingLink> list) {
        this(1, m4826a(str, intent), System.currentTimeMillis(), 0, (String) null, m4825a(intent, str2, uri, str3, list).mo15514fD());
    }

    /* renamed from: a */
    public static C1634hd.C1635a m4825a(Intent intent, String str, Uri uri, String str2, List<AppIndexApi.AppIndexingLink> list) {
        String string;
        C1634hd.C1635a aVar = new C1634hd.C1635a();
        aVar.mo15512a(m4827av(str));
        if (uri != null) {
            aVar.mo15512a(m4829f(uri));
        }
        if (list != null) {
            aVar.mo15512a(m4828b(list));
        }
        String action = intent.getAction();
        if (action != null) {
            aVar.mo15512a(m4832i("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            aVar.mo15512a(m4832i("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            aVar.mo15512a(m4832i("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (!(extras == null || (string = extras.getString("intent_extra_data_key")) == null)) {
            aVar.mo15512a(m4832i("intent_extra_data", string));
        }
        return aVar.mo15513ar(str2).mo15511F(true);
    }

    /* renamed from: a */
    public static C1637hf m4826a(String str, Intent intent) {
        return m4831h(str, m4830g(intent));
    }

    /* renamed from: av */
    private static C1639hh m4827av(String str) {
        return new C1639hh(str, new C1649hp.C1650a(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE).mo15556Q(1).mo15555H(true).mo15558au("name").mo15559fG(), "text1");
    }

    /* renamed from: b */
    private static C1639hh m4828b(List<AppIndexApi.AppIndexingLink> list) {
        C1948mv.C1949a aVar = new C1948mv.C1949a();
        C1948mv.C1949a.C1950a[] aVarArr = new C1948mv.C1949a.C1950a[list.size()];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = new C1948mv.C1949a.C1950a();
            AppIndexApi.AppIndexingLink appIndexingLink = list.get(i);
            aVarArr[i].afw = appIndexingLink.appIndexingUrl.toString();
            aVarArr[i].viewId = appIndexingLink.viewId;
            if (appIndexingLink.webUrl != null) {
                aVarArr[i].afx = appIndexingLink.webUrl.toString();
            }
        }
        aVar.afu = aVarArr;
        return new C1639hh(C2166qw.m6480f(aVar), new C1649hp.C1650a("outlinks").mo15554G(true).mo15558au(".private:outLinks").mo15557at("blob").mo15559fG());
    }

    /* renamed from: f */
    private static C1639hh m4829f(Uri uri) {
        return new C1639hh(uri.toString(), new C1649hp.C1650a("web_url").mo15556Q(4).mo15554G(true).mo15558au(PlusShare.KEY_CALL_TO_ACTION_URL).mo15559fG());
    }

    /* renamed from: g */
    private static String m4830g(Intent intent) {
        String uri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            return Long.toHexString(crc32.getValue());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    private static C1637hf m4831h(String str, String str2) {
        return new C1637hf(str, "", str2);
    }

    /* renamed from: i */
    private static C1639hh m4832i(String str, String str2) {
        return new C1639hh(str2, new C1649hp.C1650a(str).mo15554G(true).mo15559fG(), str);
    }

    public int describeContents() {
        C1653hs hsVar = CREATOR;
        return 0;
    }

    public String toString() {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d]", new Object[]{this.f3658Dw, Long.valueOf(this.f3659Dx), Integer.valueOf(this.f3660Dy)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1653hs hsVar = CREATOR;
        C1653hs.m4833a(this, parcel, i);
    }
}
