package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.internal.C2726ah;
import com.google.android.gms.wearable.internal.C2733ak;
import com.google.android.gms.wearable.internal.C2772f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.wearable.internal.az */
final class C2754az {

    /* renamed from: com.google.android.gms.wearable.internal.az$a */
    static abstract class C2755a<T> extends C2707a {

        /* renamed from: DA */
        private BaseImplementation.C0670b<T> f4551DA;

        public C2755a(BaseImplementation.C0670b<T> bVar) {
            this.f4551DA = bVar;
        }

        /* renamed from: A */
        public void mo19547A(T t) {
            BaseImplementation.C0670b<T> bVar = this.f4551DA;
            if (bVar != null) {
                bVar.mo10914b(t);
                this.f4551DA = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$b */
    static final class C2756b extends C2755a<DataApi.DeleteDataItemsResult> {
        public C2756b(BaseImplementation.C0670b<DataApi.DeleteDataItemsResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19429a(C2794p pVar) {
            mo19547A(new C2772f.C2783c(C2750av.m8080gN(pVar.statusCode), pVar.axI));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$c */
    static final class C2757c extends C2755a<NodeApi.GetConnectedNodesResult> {
        public C2757c(BaseImplementation.C0670b<NodeApi.GetConnectedNodesResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19432a(C2800v vVar) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(vVar.axL);
            mo19547A(new C2733ak.C2738b(C2750av.m8080gN(vVar.statusCode), arrayList));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$d */
    static final class C2758d extends C2755a<DataApi.DataItemResult> {
        public C2758d(BaseImplementation.C0670b<DataApi.DataItemResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19433a(C2802x xVar) {
            mo19547A(new C2772f.C2782b(C2750av.m8080gN(xVar.statusCode), xVar.axM));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$e */
    static final class C2759e extends C2755a<DataItemBuffer> {
        public C2759e(BaseImplementation.C0670b<DataItemBuffer> bVar) {
            super(bVar);
        }

        /* renamed from: ab */
        public void mo19435ab(DataHolder dataHolder) {
            mo19547A(new DataItemBuffer(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$f */
    static final class C2760f extends C2755a<DataApi.GetFdForAssetResult> {
        public C2760f(BaseImplementation.C0670b<DataApi.GetFdForAssetResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19434a(C2804z zVar) {
            mo19547A(new C2772f.C2784d(C2750av.m8080gN(zVar.statusCode), zVar.axN));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$g */
    static final class C2761g extends C2755a<NodeApi.GetLocalNodeResult> {
        public C2761g(BaseImplementation.C0670b<NodeApi.GetLocalNodeResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19425a(C2709ab abVar) {
            mo19547A(new C2733ak.C2739c(C2750av.m8080gN(abVar.statusCode), abVar.axO));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$h */
    static final class C2762h extends C2707a {
        C2762h() {
        }

        /* renamed from: a */
        public void mo19424a(Status status) {
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$i */
    static final class C2763i extends C2755a<DataApi.DataItemResult> {
        private final List<FutureTask<Boolean>> ayf;

        C2763i(BaseImplementation.C0670b<DataApi.DataItemResult> bVar, List<FutureTask<Boolean>> list) {
            super(bVar);
            this.ayf = list;
        }

        /* renamed from: a */
        public void mo19426a(C2744ap apVar) {
            mo19547A(new C2772f.C2782b(C2750av.m8080gN(apVar.statusCode), apVar.axM));
            if (apVar.statusCode != 0) {
                for (FutureTask<Boolean> cancel : this.ayf) {
                    cancel.cancel(true);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.az$j */
    static final class C2764j extends C2755a<MessageApi.SendMessageResult> {
        public C2764j(BaseImplementation.C0670b<MessageApi.SendMessageResult> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo19427a(C2748at atVar) {
            mo19547A(new C2726ah.C2730b(C2750av.m8080gN(atVar.statusCode), atVar.ayd));
        }
    }
}
