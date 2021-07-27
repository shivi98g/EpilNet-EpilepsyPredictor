package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.C1840ll;
import java.lang.ref.WeakReference;

public class PopupManager {

    /* renamed from: ZQ */
    protected GamesClientImpl f1970ZQ;

    /* renamed from: ZR */
    protected PopupLocationInfo f1971ZR;

    public static final class PopupLocationInfo {

        /* renamed from: ZS */
        public IBinder f1972ZS;

        /* renamed from: ZT */
        public int f1973ZT;
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;

        private PopupLocationInfo(int i, IBinder iBinder) {
            this.f1973ZT = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = i;
            this.f1972ZS = iBinder;
        }

        /* renamed from: lW */
        public Bundle mo13858lW() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.gravity);
            bundle.putInt("popupLocationInfo.displayId", this.f1973ZT);
            bundle.putInt("popupLocationInfo.left", this.left);
            bundle.putInt("popupLocationInfo.top", this.top);
            bundle.putInt("popupLocationInfo.right", this.right);
            bundle.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle;
        }
    }

    private static final class PopupManagerHCMR1 extends PopupManager implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Yq */
        private boolean f1974Yq = false;

        /* renamed from: ZU */
        private WeakReference<View> f1975ZU;

        protected PopupManagerHCMR1(GamesClientImpl gamesClientImpl, int i) {
            super(gamesClientImpl, i);
        }

        /* renamed from: m */
        private void m3214m(View view) {
            Display display;
            int i = -1;
            if (C1840ll.m5543il() && (display = view.getDisplay()) != null) {
                i = display.getDisplayId();
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.f1971ZR.f1973ZT = i;
            this.f1971ZR.f1972ZS = windowToken;
            this.f1971ZR.left = iArr[0];
            this.f1971ZR.top = iArr[1];
            this.f1971ZR.right = iArr[0] + width;
            this.f1971ZR.bottom = iArr[1] + height;
            if (this.f1974Yq) {
                mo13854lT();
                this.f1974Yq = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: dY */
        public void mo13852dY(int i) {
            this.f1971ZR = new PopupLocationInfo(i, (IBinder) null);
        }

        /* renamed from: l */
        public void mo13853l(View view) {
            this.f1970ZQ.mo13510lE();
            if (this.f1975ZU != null) {
                View view2 = (View) this.f1975ZU.get();
                Context context = this.f1970ZQ.getContext();
                if (view2 == null && (context instanceof Activity)) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (C1840ll.m5542ik()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.f1975ZU = null;
            Context context2 = this.f1970ZQ.getContext();
            if (view == null && (context2 instanceof Activity)) {
                Activity activity = (Activity) context2;
                view = activity.findViewById(16908290);
                if (view == null) {
                    view = activity.getWindow().getDecorView();
                }
                GamesLog.m2569o("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            }
            if (view != null) {
                m3214m(view);
                this.f1975ZU = new WeakReference<>(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            GamesLog.m2570p("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        /* renamed from: lT */
        public void mo13854lT() {
            if (this.f1971ZR.f1972ZS != null) {
                PopupManager.super.mo13854lT();
            } else {
                this.f1974Yq = this.f1975ZU != null;
            }
        }

        public void onGlobalLayout() {
            View view;
            if (this.f1975ZU != null && (view = (View) this.f1975ZU.get()) != null) {
                m3214m(view);
            }
        }

        public void onViewAttachedToWindow(View view) {
            m3214m(view);
        }

        public void onViewDetachedFromWindow(View view) {
            this.f1970ZQ.mo13510lE();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private PopupManager(GamesClientImpl gamesClientImpl, int i) {
        this.f1970ZQ = gamesClientImpl;
        mo13852dY(i);
    }

    /* renamed from: a */
    public static PopupManager m3207a(GamesClientImpl gamesClientImpl, int i) {
        return C1840ll.m5539ih() ? new PopupManagerHCMR1(gamesClientImpl, i) : new PopupManager(gamesClientImpl, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: dY */
    public void mo13852dY(int i) {
        this.f1971ZR = new PopupLocationInfo(i, new Binder());
    }

    /* renamed from: l */
    public void mo13853l(View view) {
    }

    /* renamed from: lT */
    public void mo13854lT() {
        this.f1970ZQ.mo13401a(this.f1971ZR.f1972ZS, this.f1971ZR.mo13858lW());
    }

    /* renamed from: lU */
    public Bundle mo13855lU() {
        return this.f1971ZR.mo13858lW();
    }

    /* renamed from: lV */
    public IBinder mo13856lV() {
        return this.f1971ZR.f1972ZS;
    }

    public void setGravity(int i) {
        this.f1971ZR.gravity = i;
    }
}
