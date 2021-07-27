package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.internal.C1634hd;
import com.google.android.gms.internal.C1649hp;
import com.google.android.gms.internal.C1948mv;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hy */
public class C1663hy {
    /* renamed from: a */
    private static C1639hh m4866a(String str, C1948mv.C1952c cVar) {
        return new C1639hh(C2166qw.m6480f(cVar), new C1649hp.C1650a(str).mo15554G(true).mo15558au(str).mo15557at("blob").mo15559fG());
    }

    /* renamed from: a */
    public static C1652hr m4867a(Action action, String str, long j, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putAll(action.mo10522fI());
        Bundle bundle2 = bundle.getBundle("object");
        Uri parse = bundle2.containsKey("id") ? Uri.parse(bundle2.getString("id")) : null;
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("type");
        Intent a = C1664hz.m4870a(str2, Uri.parse(bundle2.getString(PlusShare.KEY_CALL_TO_ACTION_URL)));
        C1634hd.C1635a a2 = C1652hr.m4825a(a, string, parse, string2, (List<AppIndexApi.AppIndexingLink>) null);
        a2.mo15512a(m4866a(".private:action", m4869d(action.mo10522fI())));
        a2.mo15512a(m4868aw(str));
        return new C1652hr(C1652hr.m4826a(str2, a), j, i, (String) null, a2.mo15514fD());
    }

    /* renamed from: aw */
    private static C1639hh m4868aw(String str) {
        return new C1639hh(str, new C1649hp.C1650a(".private:actionId").mo15554G(true).mo15558au(".private:actionId").mo15557at("blob").mo15559fG());
    }

    /* renamed from: d */
    static C1948mv.C1952c m4869d(Bundle bundle) {
        C1948mv.C1952c cVar = new C1948mv.C1952c();
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            C1948mv.C1951b bVar = new C1948mv.C1951b();
            bVar.name = str;
            bVar.afz = new C1948mv.C1953d();
            if (obj instanceof String) {
                bVar.afz.f4127NJ = (String) obj;
            } else if (obj instanceof Bundle) {
                bVar.afz.afE = m4869d((Bundle) obj);
            } else {
                Log.e("AppDataSearchClient", "Unsupported value: " + obj);
            }
            arrayList.add(bVar);
        }
        if (bundle.containsKey("type")) {
            cVar.type = bundle.getString("type");
        }
        cVar.afA = (C1948mv.C1951b[]) arrayList.toArray(new C1948mv.C1951b[arrayList.size()]);
        return cVar;
    }
}
