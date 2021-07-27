package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.app.Fragment;
import android.view.View;
import com.google.android.gms.dynamic.C0964c;

/* renamed from: com.google.android.gms.dynamic.h */
public final class C0974h extends C0964c.C0965a {

    /* renamed from: Mx */
    private Fragment f1319Mx;

    private C0974h(Fragment fragment) {
        this.f1319Mx = fragment;
    }

    /* renamed from: a */
    public static C0974h m1617a(Fragment fragment) {
        if (fragment != null) {
            return new C0974h(fragment);
        }
        return null;
    }

    /* renamed from: d */
    public void mo12159d(C0967d dVar) {
        this.f1319Mx.registerForContextMenu((View) C0970e.m1612f(dVar));
    }

    /* renamed from: e */
    public void mo12160e(C0967d dVar) {
        this.f1319Mx.unregisterForContextMenu((View) C0970e.m1612f(dVar));
    }

    public Bundle getArguments() {
        return this.f1319Mx.getArguments();
    }

    public int getId() {
        return this.f1319Mx.getId();
    }

    public boolean getRetainInstance() {
        return this.f1319Mx.getRetainInstance();
    }

    public String getTag() {
        return this.f1319Mx.getTag();
    }

    public int getTargetRequestCode() {
        return this.f1319Mx.getTargetRequestCode();
    }

    public boolean getUserVisibleHint() {
        return this.f1319Mx.getUserVisibleHint();
    }

    public C0967d getView() {
        return C0970e.m1613k(this.f1319Mx.getView());
    }

    public boolean isAdded() {
        return this.f1319Mx.isAdded();
    }

    public boolean isDetached() {
        return this.f1319Mx.isDetached();
    }

    public boolean isHidden() {
        return this.f1319Mx.isHidden();
    }

    public boolean isInLayout() {
        return this.f1319Mx.isInLayout();
    }

    public boolean isRemoving() {
        return this.f1319Mx.isRemoving();
    }

    public boolean isResumed() {
        return this.f1319Mx.isResumed();
    }

    public boolean isVisible() {
        return this.f1319Mx.isVisible();
    }

    /* renamed from: jf */
    public C0967d mo12175jf() {
        return C0970e.m1613k(this.f1319Mx.getActivity());
    }

    /* renamed from: jg */
    public C0964c mo12176jg() {
        return m1617a(this.f1319Mx.getParentFragment());
    }

    /* renamed from: jh */
    public C0967d mo12177jh() {
        return C0970e.m1613k(this.f1319Mx.getResources());
    }

    /* renamed from: ji */
    public C0964c mo12178ji() {
        return m1617a(this.f1319Mx.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean z) {
        this.f1319Mx.setHasOptionsMenu(z);
    }

    public void setMenuVisibility(boolean z) {
        this.f1319Mx.setMenuVisibility(z);
    }

    public void setRetainInstance(boolean z) {
        this.f1319Mx.setRetainInstance(z);
    }

    public void setUserVisibleHint(boolean z) {
        this.f1319Mx.setUserVisibleHint(z);
    }

    public void startActivity(Intent intent) {
        this.f1319Mx.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.f1319Mx.startActivityForResult(intent, i);
    }
}
