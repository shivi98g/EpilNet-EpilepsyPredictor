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
import com.google.android.gms.maps.internal.C2330u;
import com.google.android.gms.maps.internal.C2336w;
import com.google.android.gms.maps.internal.C2337x;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {
    private final C2238b all = new C2238b(this);
    private StreetViewPanorama alm;

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$a */
    static class C2236a implements StreetViewLifecycleDelegate {

        /* renamed from: TG */
        private final Fragment f4293TG;
        private final IStreetViewPanoramaFragmentDelegate aln;

        public C2236a(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.aln = (IStreetViewPanoramaFragmentDelegate) C1785jx.m5364i(iStreetViewPanoramaFragmentDelegate);
            this.f4293TG = (Fragment) C1785jx.m5364i(fragment);
        }

        public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.aln.getStreetViewPanoramaAsync(new C2330u.C2331a() {
                    /* renamed from: a */
                    public void mo17455a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: nR */
        public IStreetViewPanoramaFragmentDelegate mo17454nR() {
            return this.aln;
        }

        public void onCreate(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f4293TG.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                C2336w.m6793a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.aln.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C0970e.m1612f(this.aln.onCreateView(C0970e.m1613k(layoutInflater), C0970e.m1613k(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.aln.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.aln.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.aln.onInflate(C0970e.m1613k(activity), (StreetViewPanoramaOptions) null, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.aln.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.aln.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.aln.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.aln.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$b */
    static class C2238b extends C0954a<C2236a> {

        /* renamed from: TG */
        private final Fragment f4294TG;
        protected C0971f<C2236a> akW;
        private final List<OnStreetViewPanoramaReadyCallback> alq = new ArrayList();

        /* renamed from: nB */
        private Activity f4295nB;

        C2238b(Fragment fragment) {
            this.f4294TG = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f4295nB = activity;
            mo17457nO();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2236a> fVar) {
            this.akW = fVar;
            mo17457nO();
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (mo12143je() != null) {
                ((C2236a) mo12143je()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.alq.add(onStreetViewPanoramaReadyCallback);
            }
        }

        /* renamed from: nO */
        public void mo17457nO() {
            if (this.f4295nB != null && this.akW != null && mo12143je() == null) {
                try {
                    MapsInitializer.initialize(this.f4295nB);
                    this.akW.mo12155a(new C2236a(this.f4294TG, C2337x.m6794S(this.f4295nB).mo17718k(C0970e.m1613k(this.f4295nB))));
                    for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.alq) {
                        ((C2236a) mo12143je()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                    }
                    this.alq.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        IStreetViewPanoramaFragmentDelegate nR = mo17440nR();
        if (nR == null) {
            return null;
        }
        try {
            IStreetViewPanoramaDelegate streetViewPanorama = nR.getStreetViewPanorama();
            if (streetViewPanorama == null) {
                return null;
            }
            if (this.alm == null || this.alm.mo17419nQ().asBinder() != streetViewPanorama.asBinder()) {
                this.alm = new StreetViewPanorama(streetViewPanorama);
            }
            return this.alm;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        C1785jx.m5357aU("getStreetViewPanoramaAsync() must be called on the main thread");
        this.all.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: nR */
    public IStreetViewPanoramaFragmentDelegate mo17440nR() {
        this.all.mo17457nO();
        if (this.all.mo12143je() == null) {
            return null;
        }
        return ((C2236a) this.all.mo12143je()).mo17454nR();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.all.setActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.all.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.all.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.all.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.all.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.all.setActivity(activity);
        this.all.onInflate(activity, new Bundle(), bundle);
    }

    public void onLowMemory() {
        this.all.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.all.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.all.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.all.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
