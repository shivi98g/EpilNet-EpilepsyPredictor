package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.C1276ah;
import java.util.concurrent.Future;

@C1507ey
/* renamed from: com.google.android.gms.internal.ai */
public class C1278ai {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1276ah mo14748a(Context context, C1608gs gsVar, final C1594gj<C1276ah> gjVar) {
        final C1281aj ajVar = new C1281aj(context, gsVar);
        ajVar.mo14739a(new C1276ah.C1277a() {
            /* renamed from: aR */
            public void mo14734aR() {
                gjVar.mo15389a(ajVar);
            }
        });
        return ajVar;
    }

    /* renamed from: a */
    public Future<C1276ah> mo14749a(Context context, C1608gs gsVar, String str) {
        C1594gj gjVar = new C1594gj();
        final Context context2 = context;
        final C1608gs gsVar2 = gsVar;
        final C1594gj gjVar2 = gjVar;
        final String str2 = str;
        C1606gq.f3553wR.post(new Runnable() {
            public void run() {
                C1278ai.this.mo14748a(context2, gsVar2, (C1594gj<C1276ah>) gjVar2).mo14744f(str2);
            }
        });
        return gjVar;
    }
}
