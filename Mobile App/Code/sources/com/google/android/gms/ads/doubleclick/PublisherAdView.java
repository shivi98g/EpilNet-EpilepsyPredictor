package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.C1325bh;

public final class PublisherAdView extends ViewGroup {

    /* renamed from: ll */
    private final C1325bh f81ll;

    public PublisherAdView(Context context) {
        super(context);
        this.f81ll = new C1325bh(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81ll = new C1325bh(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81ll = new C1325bh(this, attributeSet, true);
    }

    public void destroy() {
        this.f81ll.destroy();
    }

    public AdListener getAdListener() {
        return this.f81ll.getAdListener();
    }

    public AdSize getAdSize() {
        return this.f81ll.getAdSize();
    }

    public AdSize[] getAdSizes() {
        return this.f81ll.getAdSizes();
    }

    public String getAdUnitId() {
        return this.f81ll.getAdUnitId();
    }

    public AppEventListener getAppEventListener() {
        return this.f81ll.getAppEventListener();
    }

    public String getMediationAdapterClassName() {
        return this.f81ll.getMediationAdapterClassName();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f81ll.mo14888a(publisherAdRequest.mo10045Y());
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
        this.f81ll.pause();
    }

    public void recordManualImpression() {
        this.f81ll.recordManualImpression();
    }

    public void resume() {
        this.f81ll.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.f81ll.setAdListener(adListener);
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f81ll.mo14889a(adSizeArr);
    }

    public void setAdUnitId(String str) {
        this.f81ll.setAdUnitId(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f81ll.setAppEventListener(appEventListener);
    }
}
