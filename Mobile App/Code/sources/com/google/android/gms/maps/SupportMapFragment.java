package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p000v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C0954a;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0971f;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2306m;
import com.google.android.gms.maps.internal.C2336w;
import com.google.android.gms.maps.internal.C2337x;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {
    private GoogleMap akS;
    private final C2244b alD = new C2244b(this);

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    static class C2242a implements MapLifecycleDelegate {

        /* renamed from: Mx */
        private final Fragment f4297Mx;
        private final IMapFragmentDelegate akT;

        public C2242a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.akT = (IMapFragmentDelegate) C1785jx.m5364i(iMapFragmentDelegate);
            this.f4297Mx = (Fragment) C1785jx.m5364i(fragment);
        }

        public void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.akT.getMapAsync(new C2306m.C2307a() {
                    /* renamed from: a */
                    public void mo17393a(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
                        onMapReadyCallback.onMapReady(new GoogleMap(iGoogleMapDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: nN */
        public IMapFragmentDelegate mo17498nN() {
            return this.akT;
        }

        public void onCreate(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f4297Mx.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C2336w.m6793a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.akT.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C0970e.m1612f(this.akT.onCreateView(C0970e.m1613k(layoutInflater), C0970e.m1613k(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.akT.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.akT.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.akT.onInflate(C0970e.m1613k(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.akT.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.akT.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.akT.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.akT.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    static class C2244b extends C0954a<C2242a> {

        /* renamed from: Mx */
        private final Fragment f4298Mx;
        protected C0971f<C2242a> akW;
        private final List<OnMapReadyCallback> akX = new ArrayList();

        /* renamed from: nB */
        private Activity f4299nB;

        C2244b(Fragment fragment) {
            this.f4298Mx = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f4299nB = activity;
            mo17500nO();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2242a> fVar) {
            this.akW = fVar;
            mo17500nO();
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (mo12143je() != null) {
                ((C2242a) mo12143je()).getMapAsync(onMapReadyCallback);
            } else {
                this.akX.add(onMapReadyCallback);
            }
        }

        /* renamed from: nO */
        public void mo17500nO() {
            if (this.f4299nB != null && this.akW != null && mo12143je() == null) {
                try {
                    MapsInitializer.initialize(this.f4299nB);
                    this.akW.mo12155a(new C2242a(this.f4298Mx, C2337x.m6794S(this.f4299nB).mo17717j(C0970e.m1613k(this.f4299nB))));
                    for (OnMapReadyCallback mapAsync : this.akX) {
                        ((C2242a) mo12143je()).getMapAsync(mapAsync);
                    }
                    this.akX.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    @Deprecated
    public final GoogleMap getMap() {
        IMapFragmentDelegate nN = mo17497nN();
        if (nN == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = nN.getMap();
            if (map == null) {
                return null;
            }
            if (this.akS == null || this.akS.mo17273nC().asBinder() != map.asBinder()) {
                this.akS = new GoogleMap(map);
            }
            return this.akS;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        C1785jx.m5357aU("getMapAsync must be called on the main thread.");
        this.alD.getMapAsync(onMapReadyCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: nN */
    public IMapFragmentDelegate mo17497nN() {
        this.alD.mo17500nO();
        if (this.alD.mo12143je() == null) {
            return null;
        }
        return ((C2242a) this.alD.mo12143je()).mo17498nN();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.alD.setActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.alD.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.alD.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.alD.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.alD.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.alD.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.alD.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.alD.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.alD.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.alD.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.alD.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
