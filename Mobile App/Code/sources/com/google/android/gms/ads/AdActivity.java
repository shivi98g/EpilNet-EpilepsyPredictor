package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.C1458dw;
import com.google.android.gms.internal.C1460dx;
import com.google.android.gms.internal.C1607gr;

public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";

    /* renamed from: lf */
    private C1460dx f71lf;

    /* renamed from: X */
    private void m19X() {
        if (this.f71lf != null) {
            try {
                this.f71lf.mo15117X();
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f71lf = C1458dw.m4329b(this);
        if (this.f71lf == null) {
            C1607gr.m4709W("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f71lf.onCreate(bundle);
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f71lf != null) {
                this.f71lf.onDestroy();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f71lf != null) {
                this.f71lf.onPause();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f71lf != null) {
                this.f71lf.onRestart();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f71lf != null) {
                this.f71lf.onResume();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f71lf != null) {
                this.f71lf.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f71lf != null) {
                this.f71lf.onStart();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f71lf != null) {
                this.f71lf.onStop();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m19X();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m19X();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m19X();
    }
}
