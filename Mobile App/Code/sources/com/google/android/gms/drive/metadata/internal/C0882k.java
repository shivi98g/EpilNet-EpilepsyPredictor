package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0867b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.drive.metadata.internal.k */
public class C0882k extends C0867b<String> {
    public C0882k(String str, int i) {
        super(str, Collections.singleton(str), Collections.emptySet(), i);
    }

    /* renamed from: bn */
    public static final Collection<String> m1303bn(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, Collection<String> collection) {
        bundle.putStringArrayList(getName(), new ArrayList(collection));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Collection<String> mo11760c(DataHolder dataHolder, int i, int i2) {
        try {
            return m1303bn(dataHolder.mo11049c(getName(), i, i2));
        } catch (JSONException e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Collection<String> mo11761i(Bundle bundle) {
        return bundle.getStringArrayList(getName());
    }
}
