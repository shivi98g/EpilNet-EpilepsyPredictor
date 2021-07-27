package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C2206c;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ng */
public class C1982ng implements GeofencingApi {

    /* renamed from: com.google.android.gms.internal.ng$a */
    private static abstract class C1989a extends LocationServices.C2201a<Status> {
        public C1989a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, final GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1989a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16337a(geofencingRequest, pendingIntent, (C2206c.C2207a) new C2206c.C2207a() {
                    /* renamed from: a */
                    public void mo16270a(int i, String[] strArr) {
                        C19831.this.mo10914b(LocationStatusCodes.m6625eD(i));
                    }
                });
            }
        });
    }

    @Deprecated
    public PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return addGeofences(googleApiClient, builder.build(), pendingIntent);
    }

    public PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1989a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16336a(pendingIntent, (C2206c.C2208b) new C2206c.C2208b() {
                    /* renamed from: a */
                    public void mo16272a(int i, PendingIntent pendingIntent) {
                        C19852.this.mo10914b(LocationStatusCodes.m6625eD(i));
                    }

                    /* renamed from: b */
                    public void mo16273b(int i, String[] strArr) {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }
                });
            }
        });
    }

    public PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, final List<String> list) {
        return googleApiClient.mo10940b(new C1989a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16340a((List<String>) list, (C2206c.C2208b) new C2206c.C2208b() {
                    /* renamed from: a */
                    public void mo16272a(int i, PendingIntent pendingIntent) {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    /* renamed from: b */
                    public void mo16273b(int i, String[] strArr) {
                        C19873.this.mo10914b(LocationStatusCodes.m6625eD(i));
                    }
                });
            }
        });
    }
}
