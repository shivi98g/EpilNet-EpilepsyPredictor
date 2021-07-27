package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes {
    private static final String[] adl = {"requestId", "outcome"};

    /* renamed from: Iv */
    private final int f2114Iv;
    private final HashMap<String, Integer> adm;

    public static final class Builder {

        /* renamed from: Iv */
        private int f2115Iv = 0;
        private HashMap<String, Integer> adm = new HashMap<>();

        /* renamed from: ek */
        public Builder mo14257ek(int i) {
            this.f2115Iv = i;
            return this;
        }

        /* renamed from: mF */
        public RequestUpdateOutcomes mo14258mF() {
            return new RequestUpdateOutcomes(this.f2115Iv, this.adm);
        }

        /* renamed from: z */
        public Builder mo14259z(String str, int i) {
            if (RequestUpdateResultOutcome.isValid(i)) {
                this.adm.put(str, Integer.valueOf(i));
            }
            return this;
        }
    }

    private RequestUpdateOutcomes(int i, HashMap<String, Integer> hashMap) {
        this.f2114Iv = i;
        this.adm = hashMap;
    }

    /* renamed from: W */
    public static RequestUpdateOutcomes m3665W(DataHolder dataHolder) {
        Builder builder = new Builder();
        builder.mo14257ek(dataHolder.getStatusCode());
        int count = dataHolder.getCount();
        for (int i = 0; i < count; i++) {
            int au = dataHolder.mo11047au(i);
            builder.mo14259z(dataHolder.mo11049c("requestId", i, au), dataHolder.mo11048b("outcome", i, au));
        }
        return builder.mo14258mF();
    }

    public Set<String> getRequestIds() {
        return this.adm.keySet();
    }

    public int getRequestOutcome(String str) {
        boolean containsKey = this.adm.containsKey(str);
        C1785jx.m5361b(containsKey, (Object) "Request " + str + " was not part of the update operation!");
        return this.adm.get(str).intValue();
    }
}
