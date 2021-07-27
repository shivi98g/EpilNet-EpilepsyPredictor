package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

@C1507ey
/* renamed from: com.google.android.gms.internal.du */
public final class C1456du extends FrameLayout implements View.OnClickListener {

    /* renamed from: nB */
    private final Activity f2986nB;

    /* renamed from: sx */
    private final ImageButton f2987sx;

    public C1456du(Activity activity, int i) {
        super(activity);
        this.f2986nB = activity;
        setOnClickListener(this);
        this.f2987sx = new ImageButton(activity);
        this.f2987sx.setImageResource(17301527);
        this.f2987sx.setBackgroundColor(0);
        this.f2987sx.setOnClickListener(this);
        this.f2987sx.setPadding(0, 0, 0, 0);
        this.f2987sx.setContentDescription("Interstitial close button");
        int a = C1606gq.m4697a((Context) activity, i);
        addView(this.f2987sx, new FrameLayout.LayoutParams(a, a, 17));
    }

    public void onClick(View view) {
        this.f2986nB.finish();
    }

    /* renamed from: q */
    public void mo15171q(boolean z) {
        this.f2987sx.setVisibility(z ? 4 : 0);
    }
}
