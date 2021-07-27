package com.google.android.gms.common.data;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.g */
public abstract class C0708g<T> extends DataBuffer<T> {

    /* renamed from: Lr */
    private boolean f795Lr = false;

    /* renamed from: Ls */
    private ArrayList<Integer> f796Ls;

    protected C0708g(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: hb */
    private void m662hb() {
        synchronized (this) {
            if (!this.f795Lr) {
                int count = this.f763JG.getCount();
                this.f796Ls = new ArrayList<>();
                if (count > 0) {
                    this.f796Ls.add(0);
                    String ha = mo11100ha();
                    String c = this.f763JG.mo11049c(ha, 0, this.f763JG.mo11047au(0));
                    for (int i = 1; i < count; i++) {
                        int au = this.f763JG.mo11047au(i);
                        String c2 = this.f763JG.mo11049c(ha, i, au);
                        if (c2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + ha + ", at row: " + i + ", for window: " + au);
                        }
                        if (!c2.equals(c)) {
                            this.f796Ls.add(Integer.valueOf(i));
                            c = c2;
                        }
                    }
                }
                this.f795Lr = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ax */
    public int mo11097ax(int i) {
        if (i >= 0 && i < this.f796Ls.size()) {
            return this.f796Ls.get(i).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public int mo11098ay(int i) {
        if (i < 0 || i == this.f796Ls.size()) {
            return 0;
        }
        int count = (i == this.f796Ls.size() - 1 ? this.f763JG.getCount() : this.f796Ls.get(i + 1).intValue()) - this.f796Ls.get(i).intValue();
        if (count == 1) {
            int ax = mo11097ax(i);
            int au = this.f763JG.mo11047au(ax);
            String hc = mo11101hc();
            if (hc == null || this.f763JG.mo11049c(hc, ax, au) != null) {
                return count;
            }
            return 0;
        }
        return count;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo11099f(int i, int i2);

    public final T get(int i) {
        m662hb();
        return mo11099f(mo11097ax(i), mo11098ay(i));
    }

    public int getCount() {
        m662hb();
        return this.f796Ls.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public abstract String mo11100ha();

    /* access modifiers changed from: protected */
    /* renamed from: hc */
    public String mo11101hc() {
        return null;
    }
}
