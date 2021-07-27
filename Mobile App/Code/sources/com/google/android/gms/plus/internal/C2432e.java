package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1741jd;
import com.google.android.gms.internal.C1748jj;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1767jq;
import com.google.android.gms.internal.C1769jr;
import com.google.android.gms.internal.C1772js;
import com.google.android.gms.internal.C1775jt;
import com.google.android.gms.internal.C1826ky;
import com.google.android.gms.internal.C1841lm;
import com.google.android.gms.internal.C2086pf;
import com.google.android.gms.internal.C2089pi;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.internal.C2429d;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.plus.internal.e */
public class C2432e extends C1750jl<C2429d> {
    private Person anG;
    private final C2443h anH;

    /* renamed from: com.google.android.gms.plus.internal.e$a */
    final class C2433a extends C2422a {
        private final BaseImplementation.C0670b<Status> anI;

        public C2433a(BaseImplementation.C0670b<Status> bVar) {
            this.anI = bVar;
        }

        /* renamed from: aA */
        public void mo18422aA(Status status) {
            C2432e.this.mo15814a((C1750jl<T>.b<?>) new C2436d(this.anI, status));
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$b */
    final class C2434b extends C2422a {
        private final BaseImplementation.C0670b<Moments.LoadMomentsResult> anI;

        public C2434b(BaseImplementation.C0670b<Moments.LoadMomentsResult> bVar) {
            this.anI = bVar;
        }

        /* renamed from: a */
        public void mo18421a(DataHolder dataHolder, String str, String str2) {
            DataHolder dataHolder2;
            Status status = new Status(dataHolder.getStatusCode(), (String) null, dataHolder.mo11058gV() != null ? (PendingIntent) dataHolder.mo11058gV().getParcelable("pendingIntent") : null);
            if (status.isSuccess() || dataHolder == null) {
                dataHolder2 = dataHolder;
            } else {
                if (!dataHolder.isClosed()) {
                    dataHolder.close();
                }
                dataHolder2 = null;
            }
            C2432e.this.mo15814a((C1750jl<T>.b<?>) new C2435c(this.anI, status, dataHolder2, str, str2));
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$c */
    final class C2435c extends C1750jl<C2429d>.d<BaseImplementation.C0670b<Moments.LoadMomentsResult>> implements Moments.LoadMomentsResult {

        /* renamed from: Eb */
        private final Status f4375Eb;

        /* renamed from: OB */
        private final String f4376OB;
        private final String anK;
        private MomentBuffer anL;

        public C2435c(BaseImplementation.C0670b<Moments.LoadMomentsResult> bVar, Status status, DataHolder dataHolder, String str, String str2) {
            super(bVar, dataHolder);
            this.f4375Eb = status;
            this.f4376OB = str;
            this.anK = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15837b(BaseImplementation.C0670b<Moments.LoadMomentsResult> bVar, DataHolder dataHolder) {
            this.anL = dataHolder != null ? new MomentBuffer(dataHolder) : null;
            bVar.mo10914b(this);
        }

        public MomentBuffer getMomentBuffer() {
            return this.anL;
        }

        public String getNextPageToken() {
            return this.f4376OB;
        }

        public Status getStatus() {
            return this.f4375Eb;
        }

        public String getUpdated() {
            return this.anK;
        }

        public void release() {
            if (this.anL != null) {
                this.anL.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$d */
    final class C2436d extends C1750jl<C2429d>.b<BaseImplementation.C0670b<Status>> {

        /* renamed from: Eb */
        private final Status f4377Eb;

        public C2436d(BaseImplementation.C0670b<Status> bVar, Status status) {
            super(bVar);
            this.f4377Eb = status;
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo15831g(BaseImplementation.C0670b<Status> bVar) {
            if (bVar != null) {
                bVar.mo10914b(this.f4377Eb);
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$e */
    final class C2437e extends C2422a {
        private final BaseImplementation.C0670b<People.LoadPeopleResult> anI;

        public C2437e(BaseImplementation.C0670b<People.LoadPeopleResult> bVar) {
            this.anI = bVar;
        }

        /* renamed from: a */
        public void mo18420a(DataHolder dataHolder, String str) {
            DataHolder dataHolder2;
            Status status = new Status(dataHolder.getStatusCode(), (String) null, dataHolder.mo11058gV() != null ? (PendingIntent) dataHolder.mo11058gV().getParcelable("pendingIntent") : null);
            if (status.isSuccess() || dataHolder == null) {
                dataHolder2 = dataHolder;
            } else {
                if (!dataHolder.isClosed()) {
                    dataHolder.close();
                }
                dataHolder2 = null;
            }
            C2432e.this.mo15814a((C1750jl<T>.b<?>) new C2438f(this.anI, status, dataHolder2, str));
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$f */
    final class C2438f extends C1750jl<C2429d>.d<BaseImplementation.C0670b<People.LoadPeopleResult>> implements People.LoadPeopleResult {

        /* renamed from: Eb */
        private final Status f4378Eb;

        /* renamed from: OB */
        private final String f4379OB;
        private PersonBuffer anM;

        public C2438f(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, Status status, DataHolder dataHolder, String str) {
            super(bVar, dataHolder);
            this.f4378Eb = status;
            this.f4379OB = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15837b(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, DataHolder dataHolder) {
            this.anM = dataHolder != null ? new PersonBuffer(dataHolder) : null;
            bVar.mo10914b(this);
        }

        public String getNextPageToken() {
            return this.f4379OB;
        }

        public PersonBuffer getPersonBuffer() {
            return this.anM;
        }

        public Status getStatus() {
            return this.f4378Eb;
        }

        public void release() {
            if (this.anM != null) {
                this.anM.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$g */
    final class C2439g extends C2422a {
        private final BaseImplementation.C0670b<Status> anI;

        public C2439g(BaseImplementation.C0670b<Status> bVar) {
            this.anI = bVar;
        }

        /* renamed from: h */
        public void mo18425h(int i, Bundle bundle) {
            C2432e.this.mo15814a((C1750jl<T>.b<?>) new C2440h(this.anI, new Status(i, (String) null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null)));
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.e$h */
    final class C2440h extends C1750jl<C2429d>.b<BaseImplementation.C0670b<Status>> {

        /* renamed from: Eb */
        private final Status f4380Eb;

        public C2440h(BaseImplementation.C0670b<Status> bVar, Status status) {
            super(bVar);
            this.f4380Eb = status;
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo15831g(BaseImplementation.C0670b<Status> bVar) {
            C2432e.this.disconnect();
            if (bVar != null) {
                bVar.mo10914b(this.f4380Eb);
            }
        }
    }

    public C2432e(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, C2443h hVar) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, hVar.mo18493oz());
        this.anH = hVar;
    }

    /* renamed from: a */
    public C1769jr mo18456a(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, int i, String str) {
        mo15816dS();
        C2437e eVar = new C2437e(bVar);
        try {
            return ((C2429d) mo15820hw()).mo18433a(eVar, 1, i, -1, str);
        } catch (RemoteException e) {
            eVar.mo18420a(DataHolder.m625av(8), (String) null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.anG = C2089pi.m6131i(bundle.getByteArray("loaded_person"));
        }
        super.mo11710a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo18457a(BaseImplementation.C0670b<Moments.LoadMomentsResult> bVar, int i, String str, Uri uri, String str2, String str3) {
        mo15816dS();
        C2434b bVar2 = bVar != null ? new C2434b(bVar) : null;
        try {
            ((C2429d) mo15820hw()).mo18436a(bVar2, i, str, uri, str2, str3);
        } catch (RemoteException e) {
            bVar2.mo18421a(DataHolder.m625av(8), (String) null, (String) null);
        }
    }

    /* renamed from: a */
    public void mo18458a(BaseImplementation.C0670b<Status> bVar, Moment moment) {
        mo15816dS();
        C2433a aVar = bVar != null ? new C2433a(bVar) : null;
        try {
            ((C2429d) mo15820hw()).mo18438a((C2423b) aVar, C1826ky.m5486a((C2086pf) moment));
        } catch (RemoteException e) {
            if (aVar == null) {
                throw new IllegalStateException(e);
            }
            aVar.mo18422aA(new Status(8, (String) null, (PendingIntent) null));
        }
    }

    /* renamed from: a */
    public void mo18459a(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, Collection<String> collection) {
        mo15816dS();
        C2437e eVar = new C2437e(bVar);
        try {
            ((C2429d) mo15820hw()).mo18441a((C2423b) eVar, (List<String>) new ArrayList(collection));
        } catch (RemoteException e) {
            eVar.mo18420a(DataHolder.m625av(8), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        Bundle oH = this.anH.mo18492oH();
        oH.putStringArray("request_visible_actions", this.anH.mo18485oA());
        oH.putString("auth_package", this.anH.mo18487oC());
        jtVar.mo15898a((C1772js) eVar, new C1748jj(2).mo15805aX(this.anH.mo18488oD()).mo15803a((C1767jq) C1741jd.m5150aT(this.anH.getAccountName())).mo15804a(C1841lm.m5547d(mo15819hv())).mo15807e(oH));
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bN */
    public C2429d mo11721l(IBinder iBinder) {
        return C2429d.C2430a.m7028bM(iBinder);
    }

    /* renamed from: cj */
    public boolean mo18461cj(String str) {
        return Arrays.asList(mo15819hv()).contains(str);
    }

    public void clearDefaultAccount() {
        mo15816dS();
        try {
            this.anG = null;
            ((C2429d) mo15820hw()).clearDefaultAccount();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public void mo18463d(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, String[] strArr) {
        mo18459a(bVar, (Collection<String>) Arrays.asList(strArr));
    }

    public String getAccountName() {
        mo15816dS();
        try {
            return ((C2429d) mo15820hw()).getAccountName();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public Person getCurrentPerson() {
        mo15816dS();
        return this.anG;
    }

    /* renamed from: j */
    public void mo18466j(BaseImplementation.C0670b<Moments.LoadMomentsResult> bVar) {
        mo18457a(bVar, 20, (String) null, (Uri) null, (String) null, "me");
    }

    /* renamed from: k */
    public void mo18467k(BaseImplementation.C0670b<People.LoadPeopleResult> bVar) {
        mo15816dS();
        C2437e eVar = new C2437e(bVar);
        try {
            ((C2429d) mo15820hw()).mo18433a(eVar, 2, 1, -1, (String) null);
        } catch (RemoteException e) {
            eVar.mo18420a(DataHolder.m625av(8), (String) null);
        }
    }

    /* renamed from: l */
    public void mo18468l(BaseImplementation.C0670b<Status> bVar) {
        mo15816dS();
        clearDefaultAccount();
        C2439g gVar = new C2439g(bVar);
        try {
            ((C2429d) mo15820hw()).mo18443b(gVar);
        } catch (RemoteException e) {
            gVar.mo18425h(8, (Bundle) null);
        }
    }

    /* renamed from: q */
    public C1769jr mo18469q(BaseImplementation.C0670b<People.LoadPeopleResult> bVar, String str) {
        return mo18456a(bVar, 0, str);
    }

    public void removeMoment(String str) {
        mo15816dS();
        try {
            ((C2429d) mo15820hw()).removeMoment(str);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
