package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C0964c;

/* renamed from: com.google.android.gms.dynamic.b */
public final class C0963b extends C0964c.C0965a {

    /* renamed from: TG */
    private Fragment f1313TG;

    private C0963b(Fragment fragment) {
        this.f1313TG = fragment;
    }

    /* renamed from: a */
    public static C0963b m1591a(Fragment fragment) {
        if (fragment != null) {
            return new C0963b(fragment);
        }
        return null;
    }

    /* renamed from: d */
    public void mo12159d(C0967d dVar) {
        this.f1313TG.registerForContextMenu((View) C0970e.m1612f(dVar));
    }

    /* renamed from: e */
    public void mo12160e(C0967d dVar) {
        this.f1313TG.unregisterForContextMenu((View) C0970e.m1612f(dVar));
    }

    public Bundle getArguments() {
        return this.f1313TG.getArguments();
    }

    public int getId() {
        return this.f1313TG.getId();
    }

    public boolean getRetainInstance() {
        return this.f1313TG.getRetainInstance();
    }

    public String getTag() {
        return this.f1313TG.getTag();
    }

    public int getTargetRequestCode() {
        return this.f1313TG.getTargetRequestCode();
    }

    public boolean getUserVisibleHint() {
        return this.f1313TG.getUserVisibleHint();
    }

    public C0967d getView() {
        return C0970e.m1613k(this.f1313TG.getView());
    }

    public boolean isAdded() {
        return this.f1313TG.isAdded();
    }

    public boolean isDetached() {
        return this.f1313TG.isDetached();
    }

    public boolean isHidden() {
        return this.f1313TG.isHidden();
    }

    public boolean isInLayout() {
        return this.f1313TG.isInLayout();
    }

    public boolean isRemoving() {
        return this.f1313TG.isRemoving();
    }

    public boolean isResumed() {
        return this.f1313TG.isResumed();
    }

    public boolean isVisible() {
        return this.f1313TG.isVisible();
    }

    /* renamed from: jf */
    public C0967d mo12175jf() {
        return C0970e.m1613k(this.f1313TG.getActivity());
    }

    /* renamed from: jg */
    public C0964c mo12176jg() {
        return m1591a(this.f1313TG.getParentFragment());
    }

    /* renamed from: jh */
    public C0967d mo12177jh() {
        return C0970e.m1613k(this.f1313TG.getResources());
    }

    /* renamed from: ji */
    public C0964c mo12178ji() {
        return m1591a(this.f1313TG.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean z) {
        this.f1313TG.setHasOptionsMenu(z);
    }

    public void setMenuVisibility(boolean z) {
        this.f1313TG.setMenuVisibility(z);
    }

    public void setRetainInstance(boolean z) {
        this.f1313TG.setRetainInstance(z);
    }

    public void setUserVisibleHint(boolean z) {
        this.f1313TG.setUserVisibleHint(z);
    }

    public void startActivity(Intent intent) {
        this.f1313TG.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.f1313TG.startActivityForResult(intent, i);
    }
}
