package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1956mx;
import com.google.android.gms.internal.C1959my;

/* renamed from: com.google.android.gms.internal.mw */
public class C1954mw extends C1750jl<C1959my> {

    /* renamed from: DZ */
    private final String f4128DZ;
    private C1955a afJ;
    private final int mTheme;

    /* renamed from: nB */
    private Activity f4129nB;

    /* renamed from: com.google.android.gms.internal.mw$a */
    public static final class C1955a extends C1956mx.C1957a {

        /* renamed from: My */
        private final int f4130My;

        /* renamed from: nB */
        private Activity f4131nB;

        public C1955a(int i, Activity activity) {
            this.f4130My = i;
            this.f4131nB = activity;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f4131nB = activity;
        }

        /* JADX WARNING: type inference failed for: r5v6, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16219g(int r4, android.os.Bundle r5) {
            /*
                r3 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                r1 = 1
                if (r4 != r1) goto L_0x0025
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                r4.putExtras(r5)
                android.app.Activity r5 = r3.f4131nB
                int r2 = r3.f4130My
                android.app.PendingIntent r4 = r5.createPendingResult(r2, r4, r0)
                if (r4 != 0) goto L_0x0018
                return
            L_0x0018:
                r4.send(r1)     // Catch:{ CanceledException -> 0x001c }
                return
            L_0x001c:
                r4 = move-exception
                java.lang.String r5 = "AddressClientImpl"
                java.lang.String r0 = "Exception settng pending result"
                android.util.Log.w(r5, r0, r4)
                return
            L_0x0025:
                r2 = 0
                if (r5 == 0) goto L_0x0031
                java.lang.String r2 = "com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT"
                android.os.Parcelable r5 = r5.getParcelable(r2)
                r2 = r5
                android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            L_0x0031:
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                r5.<init>(r4, r2)
                boolean r4 = r5.hasResolution()
                if (r4 == 0) goto L_0x004d
                android.app.Activity r4 = r3.f4131nB     // Catch:{ SendIntentException -> 0x0044 }
                int r0 = r3.f4130My     // Catch:{ SendIntentException -> 0x0044 }
                r5.startResolutionForResult(r4, r0)     // Catch:{ SendIntentException -> 0x0044 }
                return
            L_0x0044:
                r4 = move-exception
                java.lang.String r5 = "AddressClientImpl"
                java.lang.String r0 = "Exception starting pending intent"
            L_0x0049:
                android.util.Log.w(r5, r0, r4)
                return
            L_0x004d:
                android.app.Activity r4 = r3.f4131nB     // Catch:{ CanceledException -> 0x0060 }
                int r5 = r3.f4130My     // Catch:{ CanceledException -> 0x0060 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ CanceledException -> 0x0060 }
                r2.<init>()     // Catch:{ CanceledException -> 0x0060 }
                android.app.PendingIntent r4 = r4.createPendingResult(r5, r2, r0)     // Catch:{ CanceledException -> 0x0060 }
                if (r4 == 0) goto L_0x0066
                r4.send(r1)     // Catch:{ CanceledException -> 0x0060 }
                return
            L_0x0060:
                r4 = move-exception
                java.lang.String r5 = "AddressClientImpl"
                java.lang.String r0 = "Exception setting pending result"
                goto L_0x0049
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1954mw.C1955a.mo16219g(int, android.os.Bundle):void");
        }
    }

    public C1954mw(Activity activity, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, int i) {
        super(activity, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f4128DZ = str;
        this.f4129nB = activity;
        this.mTheme = i;
    }

    /* renamed from: a */
    public void mo16215a(UserAddressRequest userAddressRequest, int i) {
        mo16218ne();
        this.afJ = new C1955a(i, this.f4129nB);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.f4128DZ)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.f4128DZ, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
            mo16217nd().mo16223a(this.afJ, userAddressRequest, bundle);
        } catch (RemoteException e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(AddressConstants.Extras.EXTRA_ERROR_CODE, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
            this.afJ.mo16219g(1, bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15904d(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public C1959my mo11721l(IBinder iBinder) {
        return C1959my.C1960a.m5784aK(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.identity.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    public void disconnect() {
        super.disconnect();
        if (this.afJ != null) {
            this.afJ.setActivity((Activity) null);
            this.afJ = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: nd */
    public C1959my mo16217nd() throws DeadObjectException {
        return (C1959my) super.mo15820hw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ne */
    public void mo16218ne() {
        super.mo15816dS();
    }
}
