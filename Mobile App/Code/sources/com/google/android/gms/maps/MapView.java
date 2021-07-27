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
import com.google.android.gms.maps.internal.C2306m;
import com.google.android.gms.maps.internal.C2337x;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    private GoogleMap akS;
    private final C2232b akY;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C2230a implements MapLifecycleDelegate {
        private final ViewGroup akZ;
        private final IMapViewDelegate ala;
        private View alb;

        public C2230a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.ala = (IMapViewDelegate) C1785jx.m5364i(iMapViewDelegate);
            this.akZ = (ViewGroup) C1785jx.m5364i(viewGroup);
        }

        public void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.ala.getMapAsync(new C2306m.C2307a() {
                    /* renamed from: a */
                    public void mo17393a(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
                        onMapReadyCallback.onMapReady(new GoogleMap(iGoogleMapDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: nP */
        public IMapViewDelegate mo17404nP() {
            return this.ala;
        }

        public void onCreate(Bundle bundle) {
            try {
                this.ala.onCreate(bundle);
                this.alb = (View) C0970e.m1612f(this.ala.getView());
                this.akZ.removeAllViews();
                this.akZ.addView(this.alb);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.ala.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.ala.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.ala.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.ala.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.ala.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C2232b extends C0954a<C2230a> {
        protected C0971f<C2230a> akW;
        private final List<OnMapReadyCallback> akX = new ArrayList();
        private final ViewGroup ald;
        private final GoogleMapOptions ale;
        private final Context mContext;

        C2232b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.ald = viewGroup;
            this.mContext = context;
            this.ale = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2230a> fVar) {
            this.akW = fVar;
            mo17406nO();
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (mo12143je() != null) {
                ((C2230a) mo12143je()).getMapAsync(onMapReadyCallback);
            } else {
                this.akX.add(onMapReadyCallback);
            }
        }

        /* renamed from: nO */
        public void mo17406nO() {
            if (this.akW != null && mo12143je() == null) {
                try {
                    this.akW.mo12155a(new C2230a(this.ald, C2337x.m6794S(this.mContext).mo17713a(C0970e.m1613k(this.mContext), this.ale)));
                    for (OnMapReadyCallback mapAsync : this.akX) {
                        ((C2230a) mo12143je()).getMapAsync(mapAsync);
                    }
                    this.akX.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.akY = new C2232b(this, context, (GoogleMapOptions) null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.akY = new C2232b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.akY = new C2232b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.akY = new C2232b(this, context, googleMapOptions);
    }

    @Deprecated
    public final GoogleMap getMap() {
        if (this.akS != null) {
            return this.akS;
        }
        this.akY.mo17406nO();
        if (this.akY.mo12143je() == null) {
            return null;
        }
        try {
            this.akS = new GoogleMap(((C2230a) this.akY.mo12143je()).mo17404nP().getMap());
            return this.akS;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        C1785jx.m5357aU("getMapAsync() must be called on the main thread");
        this.akY.getMapAsync(onMapReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        this.akY.onCreate(bundle);
        if (this.akY.mo12143je() == null) {
            C0954a.m1579b((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.akY.onDestroy();
    }

    public final void onLowMemory() {
        this.akY.onLowMemory();
    }

    public final void onPause() {
        this.akY.onPause();
    }

    public final void onResume() {
        this.akY.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.akY.onSaveInstanceState(bundle);
    }
}
