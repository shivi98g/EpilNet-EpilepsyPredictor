package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* renamed from: com.google.android.gms.internal.nf */
public class C1973nf implements FusedLocationProviderApi {

    /* renamed from: com.google.android.gms.internal.nf$a */
    private static abstract class C1981a extends LocationServices.C2201a<Status> {
        public C1981a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public Location getLastLocation(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.m6620f(googleApiClient).mo16344nl();
        } catch (Exception e) {
            return null;
        }
    }

    public PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16343c(pendingIntent);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, final LocationListener locationListener) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16338a(locationListener);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16342b(locationRequest, pendingIntent);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, final LocationRequest locationRequest, final LocationListener locationListener) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16339a(locationRequest, locationListener, (Looper) null);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        final LocationRequest locationRequest2 = locationRequest;
        final LocationListener locationListener2 = locationListener;
        final Looper looper2 = looper;
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16339a(locationRequest2, locationListener2, looper2);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, final Location location) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16341b(location);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10940b(new C1981a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16333S(z);
                mo10914b(Status.f663Kw);
            }
        });
    }
}
