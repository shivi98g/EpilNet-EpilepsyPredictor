package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;

@C1507ey
/* renamed from: com.google.android.gms.internal.gl */
public final class C1596gl {
    /* access modifiers changed from: private */
    public final Context mContext;
    private int mState;

    /* renamed from: rz */
    private final float f3538rz;

    /* renamed from: wH */
    private String f3539wH;

    /* renamed from: wI */
    private float f3540wI;

    /* renamed from: wJ */
    private float f3541wJ;

    /* renamed from: wK */
    private float f3542wK;

    public C1596gl(Context context) {
        this.mState = 0;
        this.mContext = context;
        this.f3538rz = context.getResources().getDisplayMetrics().density;
    }

    public C1596gl(Context context, String str) {
        this(context);
        this.f3539wH = str;
    }

    /* renamed from: a */
    private void m4678a(int i, float f, float f2) {
        if (i == 0) {
            this.mState = 0;
            this.f3540wI = f;
            this.f3541wJ = f2;
            this.f3542wK = f2;
        } else if (this.mState != -1) {
            if (i == 2) {
                if (f2 > this.f3541wJ) {
                    this.f3541wJ = f2;
                } else if (f2 < this.f3542wK) {
                    this.f3542wK = f2;
                }
                if (this.f3541wJ - this.f3542wK > 30.0f * this.f3538rz) {
                    this.mState = -1;
                    return;
                }
                if (this.mState == 0 || this.mState == 2 ? f - this.f3540wI >= 50.0f * this.f3538rz : !(!(this.mState == 1 || this.mState == 3) || f - this.f3540wI > -50.0f * this.f3538rz)) {
                    this.f3540wI = f;
                    this.mState++;
                }
                if (this.mState == 1 || this.mState == 3) {
                    if (f <= this.f3540wI) {
                        return;
                    }
                } else if (this.mState != 2 || f >= this.f3540wI) {
                    return;
                }
                this.f3540wI = f;
            } else if (i == 1 && this.mState == 4) {
                showDialog();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0057, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showDialog() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f3539wH
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005a
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r5.f3539wH
            android.net.Uri$Builder r0 = r0.encodedQuery(r1)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Map r0 = com.google.android.gms.internal.C1591gi.m4659c((android.net.Uri) r0)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0028:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r4 = " = "
            r1.append(r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            goto L_0x0028
        L_0x004b:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "No debug information"
        L_0x005c:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r5.mContext
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            java.lang.String r2 = "Share"
            com.google.android.gms.internal.gl$1 r3 = new com.google.android.gms.internal.gl$1
            r3.<init>(r0)
            r1.setPositiveButton(r2, r3)
            java.lang.String r0 = "Close"
            com.google.android.gms.internal.gl$2 r2 = new com.google.android.gms.internal.gl$2
            r2.<init>()
            r1.setNegativeButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1596gl.showDialog():void");
    }

    /* renamed from: Q */
    public void mo15400Q(String str) {
        this.f3539wH = str;
    }

    /* renamed from: c */
    public void mo15401c(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m4678a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m4678a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
