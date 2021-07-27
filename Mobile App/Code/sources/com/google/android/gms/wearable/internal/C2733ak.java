package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.List;

/* renamed from: com.google.android.gms.wearable.internal.ak */
public final class C2733ak implements NodeApi {

    /* renamed from: com.google.android.gms.wearable.internal.ak$a */
    private static final class C2737a extends C2770d<Status> {
        private NodeApi.NodeListener axZ;

        private C2737a(GoogleApiClient googleApiClient, NodeApi.NodeListener nodeListener) {
            super(googleApiClient);
            this.axZ = nodeListener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(C2766ba baVar) throws RemoteException {
            baVar.mo19558a((BaseImplementation.C0670b<Status>) this, this.axZ);
            this.axZ = null;
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            this.axZ = null;
            return status;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ak$b */
    public static class C2738b implements NodeApi.GetConnectedNodesResult {

        /* renamed from: Eb */
        private final Status f4545Eb;
        private final List<Node> aya;

        public C2738b(Status status, List<Node> list) {
            this.f4545Eb = status;
            this.aya = list;
        }

        public List<Node> getNodes() {
            return this.aya;
        }

        public Status getStatus() {
            return this.f4545Eb;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ak$c */
    public static class C2739c implements NodeApi.GetLocalNodeResult {

        /* renamed from: Eb */
        private final Status f4546Eb;
        private final Node ayb;

        public C2739c(Status status, Node node) {
            this.f4546Eb = status;
            this.ayb = node;
        }

        public Node getNode() {
            return this.ayb;
        }

        public Status getStatus() {
            return this.f4546Eb;
        }
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, NodeApi.NodeListener nodeListener) {
        return googleApiClient.mo10938a(new C2737a(googleApiClient, nodeListener));
    }

    public PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C2770d<NodeApi.GetConnectedNodesResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19567p(this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aK */
            public NodeApi.GetConnectedNodesResult mo10544c(Status status) {
                return new C2738b(status, (List<Node>) null);
            }
        });
    }

    public PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C2770d<NodeApi.GetLocalNodeResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19566o(this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aJ */
            public NodeApi.GetLocalNodeResult mo10544c(Status status) {
                return new C2739c(status, (Node) null);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final NodeApi.NodeListener nodeListener) {
        return googleApiClient.mo10938a(new C2770d<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19562b((BaseImplementation.C0670b<Status>) this, nodeListener);
            }

            /* renamed from: b */
            public Status mo10544c(Status status) {
                return status;
            }
        });
    }
}
