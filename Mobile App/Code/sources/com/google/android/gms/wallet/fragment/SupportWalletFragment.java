package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.app.FragmentManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.C0530R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0954a;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0971f;
import com.google.android.gms.dynamic.C0974h;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C2119qa;
import com.google.android.gms.internal.C2122qb;
import com.google.android.gms.internal.C2147qi;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: Mx */
    public final Fragment f4503Mx = this;
    /* access modifiers changed from: private */
    public C2654b awa;
    /* access modifiers changed from: private */
    public final C0974h awb = C0974h.m1617a(this);
    private final C2655c awc = new C2655c();
    /* access modifiers changed from: private */
    public C2653a awd = new C2653a(this);
    /* access modifiers changed from: private */
    public WalletFragmentOptions awe;
    /* access modifiers changed from: private */
    public WalletFragmentInitParams awf;
    /* access modifiers changed from: private */
    public MaskedWalletRequest awg;
    /* access modifiers changed from: private */
    public MaskedWallet awh;
    /* access modifiers changed from: private */
    public Boolean awi;
    /* access modifiers changed from: private */
    public boolean mCreated = false;

    public interface OnStateChangedListener {
        void onStateChanged(SupportWalletFragment supportWalletFragment, int i, int i2, Bundle bundle);
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$a */
    static class C2653a extends C2122qb.C2123a {
        private OnStateChangedListener awj;
        private final SupportWalletFragment awk;

        C2653a(SupportWalletFragment supportWalletFragment) {
            this.awk = supportWalletFragment;
        }

        /* renamed from: a */
        public void mo16946a(int i, int i2, Bundle bundle) {
            if (this.awj != null) {
                this.awj.onStateChanged(this.awk, i, i2, bundle);
            }
        }

        /* renamed from: a */
        public void mo19082a(OnStateChangedListener onStateChangedListener) {
            this.awj = onStateChangedListener;
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$b */
    private static class C2654b implements LifecycleDelegate {
        private final C2119qa awl;

        private C2654b(C2119qa qaVar) {
            this.awl = qaVar;
        }

        /* access modifiers changed from: private */
        public int getState() {
            try {
                return this.awl.getState();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.awl.initialize(walletFragmentInitParams);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        public void onActivityResult(int i, int i2, Intent intent) {
            try {
                this.awl.onActivityResult(i, i2, intent);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        public void setEnabled(boolean z) {
            try {
                this.awl.setEnabled(z);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        public void updateMaskedWallet(MaskedWallet maskedWallet) {
            try {
                this.awl.updateMaskedWallet(maskedWallet);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.awl.updateMaskedWalletRequest(maskedWalletRequest);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.awl.onCreate(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C0970e.m1612f(this.awl.onCreateView(C0970e.m1613k(layoutInflater), C0970e.m1613k(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onDestroy() {
        }

        public void onDestroyView() {
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.awl.mo16930a(C0970e.m1613k(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onLowMemory() {
        }

        public void onPause() {
            try {
                this.awl.onPause();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onResume() {
            try {
                this.awl.onResume();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.awl.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onStart() {
            try {
                this.awl.onStart();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public void onStop() {
            try {
                this.awl.onStop();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$c */
    private class C2655c extends C0954a<C2654b> implements View.OnClickListener {
        private C2655c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12141a(FrameLayout frameLayout) {
            WalletFragmentStyle fragmentStyle;
            Button button = new Button(SupportWalletFragment.this.f4503Mx.getActivity());
            button.setText(C0530R.string.wallet_buy_button_place_holder);
            int i = -1;
            int i2 = -2;
            if (!(SupportWalletFragment.this.awe == null || (fragmentStyle = SupportWalletFragment.this.awe.getFragmentStyle()) == null)) {
                DisplayMetrics displayMetrics = SupportWalletFragment.this.f4503Mx.getResources().getDisplayMetrics();
                i = fragmentStyle.mo19127a("buyButtonWidth", displayMetrics, -1);
                i2 = fragmentStyle.mo19127a("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2654b> fVar) {
            FragmentActivity activity = SupportWalletFragment.this.f4503Mx.getActivity();
            if (SupportWalletFragment.this.awa == null && SupportWalletFragment.this.mCreated && activity != null) {
                try {
                    C2654b unused = SupportWalletFragment.this.awa = new C2654b(C2147qi.m6315a(activity, SupportWalletFragment.this.awb, SupportWalletFragment.this.awe, SupportWalletFragment.this.awd));
                    WalletFragmentOptions unused2 = SupportWalletFragment.this.awe = null;
                    fVar.mo12155a(SupportWalletFragment.this.awa);
                    if (SupportWalletFragment.this.awf != null) {
                        SupportWalletFragment.this.awa.initialize(SupportWalletFragment.this.awf);
                        WalletFragmentInitParams unused3 = SupportWalletFragment.this.awf = null;
                    }
                    if (SupportWalletFragment.this.awg != null) {
                        SupportWalletFragment.this.awa.updateMaskedWalletRequest(SupportWalletFragment.this.awg);
                        MaskedWalletRequest unused4 = SupportWalletFragment.this.awg = null;
                    }
                    if (SupportWalletFragment.this.awh != null) {
                        SupportWalletFragment.this.awa.updateMaskedWallet(SupportWalletFragment.this.awh);
                        MaskedWallet unused5 = SupportWalletFragment.this.awh = null;
                    }
                    if (SupportWalletFragment.this.awi != null) {
                        SupportWalletFragment.this.awa.setEnabled(SupportWalletFragment.this.awi.booleanValue());
                        Boolean unused6 = SupportWalletFragment.this.awi = null;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                }
            }
        }

        public void onClick(View view) {
            FragmentActivity activity = SupportWalletFragment.this.f4503Mx.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity), activity, -1);
        }
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        SupportWalletFragment supportWalletFragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        supportWalletFragment.f4503Mx.setArguments(bundle);
        return supportWalletFragment;
    }

    public int getState() {
        if (this.awa != null) {
            return this.awa.getState();
        }
        return 0;
    }

    public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        String str;
        String str2;
        if (this.awa != null) {
            this.awa.initialize(walletFragmentInitParams);
            this.awf = null;
            return;
        }
        if (this.awf == null) {
            this.awf = walletFragmentInitParams;
            if (this.awg != null) {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.awh != null) {
                str2 = "SupportWalletFragment";
                str = "updateMaskedWallet() was called before initialize()";
            } else {
                return;
            }
        } else {
            str2 = "SupportWalletFragment";
            str = "initialize(WalletFragmentInitParams) was called more than once. Ignoring.";
        }
        Log.w(str2, str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.awa != null) {
            this.awa.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        WalletFragmentOptions walletFragmentOptions;
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.awf != null) {
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.awf = walletFragmentInitParams;
            }
            if (this.awg == null) {
                this.awg = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.awh == null) {
                this.awh = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.awe = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.awi = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (!(this.f4503Mx.getArguments() == null || (walletFragmentOptions = (WalletFragmentOptions) this.f4503Mx.getArguments().getParcelable("extraWalletFragmentOptions")) == null)) {
            walletFragmentOptions.mo19114ab(this.f4503Mx.getActivity());
            this.awe = walletFragmentOptions;
        }
        this.mCreated = true;
        this.awc.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.awc.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.awe == null) {
            this.awe = WalletFragmentOptions.m7801a((Context) activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.awe);
        this.awc.onInflate(activity, bundle2, bundle);
    }

    public void onPause() {
        super.onPause();
        this.awc.onPause();
    }

    public void onResume() {
        super.onResume();
        this.awc.onResume();
        FragmentManager supportFragmentManager = this.f4503Mx.getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f4503Mx.getActivity()), this.f4503Mx.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.awc.onSaveInstanceState(bundle);
        if (this.awf != null) {
            bundle.putParcelable("walletFragmentInitParams", this.awf);
            this.awf = null;
        }
        if (this.awg != null) {
            bundle.putParcelable("maskedWalletRequest", this.awg);
            this.awg = null;
        }
        if (this.awh != null) {
            bundle.putParcelable("maskedWallet", this.awh);
            this.awh = null;
        }
        if (this.awe != null) {
            bundle.putParcelable("walletFragmentOptions", this.awe);
            this.awe = null;
        }
        if (this.awi != null) {
            bundle.putBoolean("enabled", this.awi.booleanValue());
            this.awi = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.awc.onStart();
    }

    public void onStop() {
        super.onStop();
        this.awc.onStop();
    }

    public void setEnabled(boolean z) {
        Boolean valueOf;
        if (this.awa != null) {
            this.awa.setEnabled(z);
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(z);
        }
        this.awi = valueOf;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.awd.mo19082a(onStateChangedListener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if (this.awa != null) {
            this.awa.updateMaskedWallet(maskedWallet);
            this.awh = null;
            return;
        }
        this.awh = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        if (this.awa != null) {
            this.awa.updateMaskedWalletRequest(maskedWalletRequest);
            this.awg = null;
            return;
        }
        this.awg = maskedWalletRequest;
    }
}
