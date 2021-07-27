package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.dynamic.C0963b;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0971f;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C2119qa;
import com.google.android.gms.internal.C2122qb;
import com.google.android.gms.internal.C2147qi;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragment extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: TG */
    public final Fragment f4504TG = this;
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
    public C2658b awn;
    /* access modifiers changed from: private */
    public final C0963b awo = C0963b.m1591a(this);
    private final C2659c awp = new C2659c();
    /* access modifiers changed from: private */
    public C2657a awq = new C2657a(this);
    /* access modifiers changed from: private */
    public boolean mCreated = false;

    public interface OnStateChangedListener {
        void onStateChanged(WalletFragment walletFragment, int i, int i2, Bundle bundle);
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$a */
    static class C2657a extends C2122qb.C2123a {
        private OnStateChangedListener awr;
        private final WalletFragment aws;

        C2657a(WalletFragment walletFragment) {
            this.aws = walletFragment;
        }

        /* renamed from: a */
        public void mo16946a(int i, int i2, Bundle bundle) {
            if (this.awr != null) {
                this.awr.onStateChanged(this.aws, i, i2, bundle);
            }
        }

        /* renamed from: a */
        public void mo19101a(OnStateChangedListener onStateChangedListener) {
            this.awr = onStateChangedListener;
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$b */
    private static class C2658b implements LifecycleDelegate {
        private final C2119qa awl;

        private C2658b(C2119qa qaVar) {
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

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$c */
    private class C2659c extends C0954a<C2658b> implements View.OnClickListener {
        private C2659c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12141a(FrameLayout frameLayout) {
            WalletFragmentStyle fragmentStyle;
            Button button = new Button(WalletFragment.this.f4504TG.getActivity());
            button.setText(C0530R.string.wallet_buy_button_place_holder);
            int i = -1;
            int i2 = -2;
            if (!(WalletFragment.this.awe == null || (fragmentStyle = WalletFragment.this.awe.getFragmentStyle()) == null)) {
                DisplayMetrics displayMetrics = WalletFragment.this.f4504TG.getResources().getDisplayMetrics();
                i = fragmentStyle.mo19127a("buyButtonWidth", displayMetrics, -1);
                i2 = fragmentStyle.mo19127a("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12142a(C0971f<C2658b> fVar) {
            Activity activity = WalletFragment.this.f4504TG.getActivity();
            if (WalletFragment.this.awn == null && WalletFragment.this.mCreated && activity != null) {
                try {
                    C2658b unused = WalletFragment.this.awn = new C2658b(C2147qi.m6315a(activity, WalletFragment.this.awo, WalletFragment.this.awe, WalletFragment.this.awq));
                    WalletFragmentOptions unused2 = WalletFragment.this.awe = null;
                    fVar.mo12155a(WalletFragment.this.awn);
                    if (WalletFragment.this.awf != null) {
                        WalletFragment.this.awn.initialize(WalletFragment.this.awf);
                        WalletFragmentInitParams unused3 = WalletFragment.this.awf = null;
                    }
                    if (WalletFragment.this.awg != null) {
                        WalletFragment.this.awn.updateMaskedWalletRequest(WalletFragment.this.awg);
                        MaskedWalletRequest unused4 = WalletFragment.this.awg = null;
                    }
                    if (WalletFragment.this.awh != null) {
                        WalletFragment.this.awn.updateMaskedWallet(WalletFragment.this.awh);
                        MaskedWallet unused5 = WalletFragment.this.awh = null;
                    }
                    if (WalletFragment.this.awi != null) {
                        WalletFragment.this.awn.setEnabled(WalletFragment.this.awi.booleanValue());
                        Boolean unused6 = WalletFragment.this.awi = null;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                }
            }
        }

        public void onClick(View view) {
            Activity activity = WalletFragment.this.f4504TG.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity), activity, -1);
        }
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.f4504TG.setArguments(bundle);
        return walletFragment;
    }

    public int getState() {
        if (this.awn != null) {
            return this.awn.getState();
        }
        return 0;
    }

    public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        String str;
        String str2;
        if (this.awn != null) {
            this.awn.initialize(walletFragmentInitParams);
            this.awf = null;
            return;
        }
        if (this.awf == null) {
            this.awf = walletFragmentInitParams;
            if (this.awg != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.awh != null) {
                str2 = "WalletFragment";
                str = "updateMaskedWallet() was called before initialize()";
            } else {
                return;
            }
        } else {
            str2 = "WalletFragment";
            str = "initialize(WalletFragmentInitParams) was called more than once. Ignoring.";
        }
        Log.w(str2, str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.awn != null) {
            this.awn.onActivityResult(i, i2, intent);
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
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        } else if (!(this.f4504TG.getArguments() == null || (walletFragmentOptions = (WalletFragmentOptions) this.f4504TG.getArguments().getParcelable("extraWalletFragmentOptions")) == null)) {
            walletFragmentOptions.mo19114ab(this.f4504TG.getActivity());
            this.awe = walletFragmentOptions;
        }
        this.mCreated = true;
        this.awp.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.awp.onCreateView(layoutInflater, viewGroup, bundle);
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
        this.awp.onInflate(activity, bundle2, bundle);
    }

    public void onPause() {
        super.onPause();
        this.awp.onPause();
    }

    public void onResume() {
        super.onResume();
        this.awp.onResume();
        FragmentManager fragmentManager = this.f4504TG.getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f4504TG.getActivity()), this.f4504TG.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.awp.onSaveInstanceState(bundle);
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
        this.awp.onStart();
    }

    public void onStop() {
        super.onStop();
        this.awp.onStop();
    }

    public void setEnabled(boolean z) {
        Boolean valueOf;
        if (this.awn != null) {
            this.awn.setEnabled(z);
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(z);
        }
        this.awi = valueOf;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.awq.mo19101a(onStateChangedListener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if (this.awn != null) {
            this.awn.updateMaskedWallet(maskedWallet);
            this.awh = null;
            return;
        }
        this.awh = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        if (this.awn != null) {
            this.awn.updateMaskedWalletRequest(maskedWalletRequest);
            this.awg = null;
            return;
        }
        this.awg = maskedWalletRequest;
    }
}
