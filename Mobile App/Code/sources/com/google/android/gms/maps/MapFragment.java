package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
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

public class MapFragment extends Fragment {
    private final C2229b akR = new C2229b(this);
    private GoogleMap akS;

    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    static class C2227a implements MapLifecycleDelegate {

        /* renamed from: TG */
        private final Fragment f4290TG;
        private final IMapFragmentDelegate akT;

        public C2227a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.akT = (IMapFragmentDelegate) C1785jx.m5364i(iMapFragmentDelegate);
            this.f4290TG = (Fragment) C1785jx.m5364i(fragment);
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
        public IMapFragmentDelegate mo17392nN() {
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
            Bundle arguments = this.f4290TG.getArguments();
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

    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    static class C2229b extends C0954a<C2227a> {

        /* renamed from: TG */
        private final Fragment f4291TG;
        protected C0971f<C2227a> akW;
        private final List<OnMapReadyCallback> akX = new ArrayList();

        /* renamed from: nB */
        private Activity f4292nB;

        C2229b(Fragment fragment) {
            this.f4291TG = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f4292nB = activity;
            mo17395nO();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2227a> fVar) {
            this.akW = fVar;
            mo17395nO();
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (mo12143je() != null) {
                ((C2227a) mo12143je()).getMapAsync(onMapReadyCallback);
            } else {
                this.akX.add(onMapReadyCallback);
            }
        }

        /* renamed from: nO */
        public void mo17395nO() {
            if (this.f4292nB != null && this.akW != null && mo12143je() == null) {
                try {
                    MapsInitializer.initialize(this.f4292nB);
                    this.akW.mo12155a(new C2227a(this.f4291TG, C2337x.m6794S(this.f4292nB).mo17717j(C0970e.m1613k(this.f4292nB))));
                    for (OnMapReadyCallback mapAsync : this.akX) {
                        ((C2227a) mo12143je()).getMapAsync(mapAsync);
                    }
                    this.akX.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Deprecated
    public final GoogleMap getMap() {
        IMapFragmentDelegate nN = mo17378nN();
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
        this.akR.getMapAsync(onMapReadyCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: nN */
    public IMapFragmentDelegate mo17378nN() {
        this.akR.mo17395nO();
        if (this.akR.mo12143je() == null) {
            return null;
        }
        return ((C2227a) this.akR.mo12143je()).mo17392nN();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.akR.setActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.akR.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.akR.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.akR.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.akR.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.akR.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.akR.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.akR.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.akR.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.akR.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.akR.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
