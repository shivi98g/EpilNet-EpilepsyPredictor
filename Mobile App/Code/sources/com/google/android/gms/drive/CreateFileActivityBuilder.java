package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.C0800i;
import com.google.android.gms.drive.internal.C0830s;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1836lh;

public class CreateFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    /* renamed from: Ol */
    private final C0800i f839Ol = new C0800i(0);

    /* renamed from: Om */
    private DriveContents f840Om;

    /* renamed from: On */
    private boolean f841On;

    public IntentSender build(GoogleApiClient googleApiClient) {
        C1785jx.m5359b(Boolean.valueOf(this.f841On), (Object) "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        C1785jx.m5361b(googleApiClient.mo10939a(Drive.SCOPE_FILE) || googleApiClient.mo10939a(Drive.f843Oo), (Object) "The apiClient must have suitable scope to create files");
        if (this.f840Om != null) {
            C1836lh.m5529a(this.f840Om.getParcelFileDescriptor());
            this.f840Om.mo11196is();
        }
        return this.f839Ol.build(googleApiClient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveId) {
        this.f839Ol.mo11670a(driveId);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String str) {
        this.f839Ol.mo11672bl(str);
        return this;
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents driveContents) {
        if (driveContents == null) {
            this.f839Ol.mo11673bq(1);
        } else if (!(driveContents instanceof C0830s)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        } else if (driveContents.getDriveId() != null) {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        } else if (driveContents.mo11197it()) {
            throw new IllegalArgumentException("DriveContents are already closed.");
        } else {
            this.f839Ol.mo11673bq(driveContents.mo11195ir().getRequestId());
            this.f840Om = driveContents;
        }
        this.f841On = true;
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadataChangeSet) {
        this.f839Ol.mo11671a(metadataChangeSet);
        return this;
    }
}
