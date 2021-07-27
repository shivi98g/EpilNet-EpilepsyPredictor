package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentSectionBuffer extends C0708g<AppContentSection> {

    /* renamed from: XX */
    private final ArrayList<DataHolder> f1752XX;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppContentSection mo11099f(int i, int i2) {
        return new AppContentSectionRef(this.f1752XX, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "section_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: hc */
    public String mo11101hc() {
        return "card_id";
    }

    public void release() {
        super.release();
        int size = this.f1752XX.size();
        for (int i = 1; i < size; i++) {
            DataHolder dataHolder = this.f1752XX.get(i);
            if (dataHolder != null) {
                dataHolder.close();
            }
        }
    }
}
