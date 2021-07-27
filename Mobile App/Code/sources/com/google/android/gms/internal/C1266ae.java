package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@C1507ey
/* renamed from: com.google.android.gms.internal.ae */
public final class C1266ae implements C1275ag {

    /* renamed from: mH */
    private final Object f2287mH = new Object();

    /* renamed from: mI */
    private final WeakHashMap<C1574fy, C1267af> f2288mI = new WeakHashMap<>();

    /* renamed from: mJ */
    private final ArrayList<C1267af> f2289mJ = new ArrayList<>();

    /* renamed from: a */
    public C1267af mo14698a(Context context, C1306ay ayVar, C1574fy fyVar, View view, C1608gs gsVar) {
        synchronized (this.f2287mH) {
            if (mo14701c(fyVar)) {
                C1267af afVar = this.f2288mI.get(fyVar);
                return afVar;
            }
            C1267af afVar2 = new C1267af(context, ayVar, fyVar, view, gsVar);
            afVar2.mo14709a((C1275ag) this);
            this.f2288mI.put(fyVar, afVar2);
            this.f2289mJ.add(afVar2);
            return afVar2;
        }
    }

    /* renamed from: a */
    public C1267af mo14699a(C1306ay ayVar, C1574fy fyVar) {
        return mo14698a(fyVar.f3448se.getContext(), ayVar, fyVar, fyVar.f3448se, fyVar.f3448se.mo15429dG());
    }

    /* renamed from: a */
    public void mo14700a(C1267af afVar) {
        synchronized (this.f2287mH) {
            if (!afVar.mo14717aM()) {
                this.f2289mJ.remove(afVar);
            }
        }
    }

    /* renamed from: c */
    public boolean mo14701c(C1574fy fyVar) {
        boolean z;
        synchronized (this.f2287mH) {
            C1267af afVar = this.f2288mI.get(fyVar);
            z = afVar != null && afVar.mo14717aM();
        }
        return z;
    }

    /* renamed from: d */
    public void mo14702d(C1574fy fyVar) {
        synchronized (this.f2287mH) {
            C1267af afVar = this.f2288mI.get(fyVar);
            if (afVar != null) {
                afVar.mo14715aK();
            }
        }
    }

    public void pause() {
        synchronized (this.f2287mH) {
            Iterator<C1267af> it = this.f2289mJ.iterator();
            while (it.hasNext()) {
                it.next().pause();
            }
        }
    }

    public void resume() {
        synchronized (this.f2287mH) {
            Iterator<C1267af> it = this.f2289mJ.iterator();
            while (it.hasNext()) {
                it.next().resume();
            }
        }
    }

    public void stop() {
        synchronized (this.f2287mH) {
            Iterator<C1267af> it = this.f2289mJ.iterator();
            while (it.hasNext()) {
                it.next().stop();
            }
        }
    }
}
