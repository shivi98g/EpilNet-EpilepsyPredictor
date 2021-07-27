package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.C1325bh;

public final class AdView extends ViewGroup {

    /* renamed from: ll */
    private final C1325bh f77ll;

    public AdView(Context context) {
        super(context);
        this.f77ll = new C1325bh(this);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77ll = new C1325bh(this, attributeSet, false);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77ll = new C1325bh(this, attributeSet, false);
    }

    public void destroy() {
        this.f77ll.destroy();
    }

    public AdListener getAdListener() {
        return this.f77ll.getAdListener();
    }

    public AdSize getAdSize() {
        return this.f77ll.getAdSize();
    }

    public String getAdUnitId() {
        return this.f77ll.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f77ll.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName() {
        return this.f77ll.getMediationAdapterClassName();
    }

    public void loadAd(AdRequest adRequest) {
        this.f77ll.mo14888a(adRequest.mo9987Y());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        AdSize adSize = getAdSize();
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else if (adSize != null) {
            Context context = getContext();
            int widthInPixels = adSize.getWidthInPixels(context);
            i3 = adSize.getHeightInPixels(context);
            i4 = widthInPixels;
        } else {
            i3 = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.f77ll.pause();
    }

    public void resume() {
        this.f77ll.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.f77ll.setAdListener(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f77ll.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.f77ll.setAdUnitId(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.f77ll.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.f77ll.setPlayStorePurchaseParams(playStorePurchaseListener, str);
    }
}
