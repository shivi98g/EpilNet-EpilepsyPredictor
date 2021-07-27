package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C0954a;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0971f;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2330u;
import com.google.android.gms.maps.internal.C2337x;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    private StreetViewPanorama alm;
    private final C2241b aly;

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    static class C2239a implements StreetViewLifecycleDelegate {
        private final ViewGroup akZ;
        private View alA;
        private final IStreetViewPanoramaViewDelegate alz;

        public C2239a(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.alz = (IStreetViewPanoramaViewDelegate) C1785jx.m5364i(iStreetViewPanoramaViewDelegate);
            this.akZ = (ViewGroup) C1785jx.m5364i(viewGroup);
        }

        public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.alz.getStreetViewPanoramaAsync(new C2330u.C2331a() {
                    /* renamed from: a */
                    public void mo17455a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: nV */
        public IStreetViewPanoramaViewDelegate mo17492nV() {
            return this.alz;
        }

        public void onCreate(Bundle bundle) {
            try {
                this.alz.onCreate(bundle);
                this.alA = (View) C0970e.m1612f(this.alz.getView());
                this.akZ.removeAllViews();
                this.akZ.addView(this.alA);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy() {
            try {
                this.alz.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.alz.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.alz.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.alz.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.alz.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    static class C2241b extends C0954a<C2239a> {
        protected C0971f<C2239a> akW;
        private final StreetViewPanoramaOptions alC;
        private final ViewGroup ald;
        private final List<OnStreetViewPanoramaReadyCallback> alq = new ArrayList();
        private final Context mContext;

        C2241b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.ald = viewGroup;
            this.mContext = context;
            this.alC = streetViewPanoramaOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2239a> fVar) {
            this.akW = fVar;
            mo17494nO();
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (mo12143je() != null) {
                ((C2239a) mo12143je()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.alq.add(onStreetViewPanoramaReadyCallback);
            }
        }

        /* renamed from: nO */
        public void mo17494nO() {
            if (this.akW != null && mo12143je() == null) {
                try {
                    this.akW.mo12155a(new C2239a(this.ald, C2337x.m6794S(this.mContext).mo17714a(C0970e.m1613k(this.mContext), this.alC)));
                    for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.alq) {
                        ((C2239a) mo12143je()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                    }
                    this.alq.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.aly = new C2241b(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aly = new C2241b(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aly = new C2241b(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.aly = new C2241b(this, context, streetViewPanoramaOptions);
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        if (this.alm != null) {
            return this.alm;
        }
        this.aly.mo17494nO();
        if (this.aly.mo12143je() == null) {
            return null;
        }
        try {
            this.alm = new StreetViewPanorama(((C2239a) this.aly.mo12143je()).mo17492nV().getStreetViewPanorama());
            return this.alm;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        C1785jx.m5357aU("getStreetViewPanoramaAsync() must be called on the main thread");
        this.aly.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        this.aly.onCreate(bundle);
        if (this.aly.mo12143je() == null) {
            C0954a.m1579b((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.aly.onDestroy();
    }

    public final void onLowMemory() {
        this.aly.onLowMemory();
    }

    public final void onPause() {
        this.aly.onPause();
    }

    public final void onResume() {
        this.aly.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.aly.onSaveInstanceState(bundle);
    }
}
