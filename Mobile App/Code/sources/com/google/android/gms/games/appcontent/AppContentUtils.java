package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1829la;
import java.util.ArrayList;

public final class AppContentUtils {

    private interface AppContentRunner {
        /* renamed from: b */
        void mo13285b(ArrayList<DataHolder> arrayList, int i);
    }

    /* renamed from: a */
    public static ArrayList<AppContentAction> m2195a(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentAction> arrayList2 = new ArrayList<>();
        m2196a(dataHolder, 1, str, "action_id", i, new AppContentRunner() {
            /* renamed from: b */
            public void mo13285b(ArrayList<DataHolder> arrayList, int i) {
                arrayList2.add(new AppContentActionRef(arrayList, i));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: a */
    private static void m2196a(DataHolder dataHolder, int i, String str, String str2, int i2, AppContentRunner appContentRunner, ArrayList<DataHolder> arrayList) {
        DataHolder dataHolder2 = arrayList.get(i);
        String c = dataHolder.mo11049c(str, i2, dataHolder.mo11047au(i2));
        if (!TextUtils.isEmpty(c)) {
            int count = dataHolder2.getCount();
            String[] split = c.split(",");
            for (int i3 = 0; i3 < count; i3++) {
                String c2 = dataHolder2.mo11049c(str2, i3, dataHolder2.mo11047au(i3));
                if (!TextUtils.isEmpty(c2) && C1829la.m5516b(split, c2)) {
                    appContentRunner.mo13285b(arrayList, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public static ArrayList<AppContentAnnotation> m2197b(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentAnnotation> arrayList2 = new ArrayList<>();
        m2196a(dataHolder, 2, str, "annotation_id", i, new AppContentRunner() {
            /* renamed from: b */
            public void mo13285b(ArrayList<DataHolder> arrayList, int i) {
                arrayList2.add(new AppContentAnnotationRef(arrayList, i));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: c */
    public static ArrayList<AppContentCondition> m2198c(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentCondition> arrayList2 = new ArrayList<>();
        m2196a(dataHolder, 4, str, "condition_id", i, new AppContentRunner() {
            /* renamed from: b */
            public void mo13285b(ArrayList<DataHolder> arrayList, int i) {
                arrayList2.add(new AppContentConditionRef(arrayList, i));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: d */
    public static Bundle m2199d(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final Bundle bundle = new Bundle();
        final DataHolder dataHolder2 = arrayList.get(3);
        m2196a(dataHolder, 3, str, "tuple_id", i, new AppContentRunner() {
            /* renamed from: b */
            public void mo13285b(ArrayList<DataHolder> arrayList, int i) {
                AppContentTupleRef appContentTupleRef = new AppContentTupleRef(dataHolder2, i);
                bundle.putString(appContentTupleRef.getName(), appContentTupleRef.getValue());
            }
        }, arrayList);
        return bundle;
    }
}
