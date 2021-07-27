package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.C1325bh;

public final class SearchAdView extends ViewGroup {

    /* renamed from: ll */
    private final C1325bh f135ll;

    public SearchAdView(Context context) {
        super(context);
        this.f135ll = new C1325bh(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f135ll = new C1325bh(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f135ll = new C1325bh(this, attributeSet, false);
    }

    public void destroy() {
        this.f135ll.destroy();
    }

    public AdListener getAdListener() {
        return this.f135ll.getAdListener();
    }

    public AdSize getAdSize() {
        return this.f135ll.getAdSize();
    }

    public String getAdUnitId() {
        return this.f135ll.getAdUnitId();
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.f135ll.mo14888a(searchAdRequest.mo10157Y());
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
        this.f135ll.pause();
    }

    public void resume() {
        this.f135ll.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.f135ll.setAdListener(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f135ll.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.f135ll.setAdUnitId(str);
    }
}
