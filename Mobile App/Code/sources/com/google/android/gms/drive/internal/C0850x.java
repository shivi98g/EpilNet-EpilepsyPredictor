package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;
import com.google.android.gms.drive.internal.C0822q;

/* renamed from: com.google.android.gms.drive.internal.x */
public class C0850x implements DrivePreferencesApi {

    /* renamed from: com.google.android.gms.drive.internal.x$a */
    private class C0853a extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DrivePreferencesApi.FileUploadPreferencesResult> f1120Ea;

        private C0853a(BaseImplementation.C0670b<DrivePreferencesApi.FileUploadPreferencesResult> bVar) {
            this.f1120Ea = bVar;
        }

        /* renamed from: a */
        public void mo11521a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) throws RemoteException {
            this.f1120Ea.mo10914b(new C0854b(Status.f663Kw, onDeviceUsagePreferenceResponse.mo11413iN()));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1120Ea.mo10914b(new C0854b(status, (FileUploadPreferences) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.x$b */
    private class C0854b implements DrivePreferencesApi.FileUploadPreferencesResult {

        /* renamed from: Eb */
        private final Status f1122Eb;

        /* renamed from: Qs */
        private final FileUploadPreferences f1124Qs;

        private C0854b(Status status, FileUploadPreferences fileUploadPreferences) {
            this.f1122Eb = status;
            this.f1124Qs = fileUploadPreferences;
        }

        public FileUploadPreferences getFileUploadPreferences() {
            return this.f1124Qs;
        }

        public Status getStatus() {
            return this.f1122Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.x$c */
    private abstract class C0855c extends C0822q<DrivePreferencesApi.FileUploadPreferencesResult> {
        public C0855c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public DrivePreferencesApi.FileUploadPreferencesResult mo10544c(Status status) {
            return new C0854b(status, (FileUploadPreferences) null);
        }
    }

    public PendingResult<DrivePreferencesApi.FileUploadPreferencesResult> getFileUploadPreferences(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C0855c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11517h(new C0853a(this));
            }
        });
    }

    public PendingResult<Status> setFileUploadPreferences(GoogleApiClient googleApiClient, FileUploadPreferences fileUploadPreferences) {
        if (!(fileUploadPreferences instanceof FileUploadPreferencesImpl)) {
            throw new IllegalArgumentException("Invalid preference value");
        }
        final FileUploadPreferencesImpl fileUploadPreferencesImpl = (FileUploadPreferencesImpl) fileUploadPreferences;
        return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11505a(new SetFileUploadPreferencesRequest(fileUploadPreferencesImpl), (C0757af) new C0791bg(this));
            }
        });
    }
}
