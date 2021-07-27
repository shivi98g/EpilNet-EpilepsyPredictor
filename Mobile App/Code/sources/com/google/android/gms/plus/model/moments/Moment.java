package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C2084pd;
import com.google.android.gms.internal.C2086pf;
import java.util.HashSet;
import java.util.Set;

public interface Moment extends Freezable<Moment> {

    public static class Builder {

        /* renamed from: CE */
        private String f4388CE;
        private final Set<Integer> aon = new HashSet();
        private String apa;
        private C2084pd api;
        private C2084pd apj;

        /* renamed from: vc */
        private String f4389vc;

        public Moment build() {
            return new C2086pf(this.aon, this.f4388CE, this.api, this.apa, this.apj, this.f4389vc);
        }

        public Builder setId(String str) {
            this.f4388CE = str;
            this.aon.add(2);
            return this;
        }

        public Builder setResult(ItemScope itemScope) {
            this.api = (C2084pd) itemScope;
            this.aon.add(4);
            return this;
        }

        public Builder setStartDate(String str) {
            this.apa = str;
            this.aon.add(5);
            return this;
        }

        public Builder setTarget(ItemScope itemScope) {
            this.apj = (C2084pd) itemScope;
            this.aon.add(6);
            return this;
        }

        public Builder setType(String str) {
            this.f4389vc = str;
            this.aon.add(7);
            return this;
        }
    }

    String getId();

    ItemScope getResult();

    String getStartDate();

    ItemScope getTarget();

    String getType();

    boolean hasId();

    boolean hasResult();

    boolean hasStartDate();

    boolean hasTarget();

    boolean hasType();
}
