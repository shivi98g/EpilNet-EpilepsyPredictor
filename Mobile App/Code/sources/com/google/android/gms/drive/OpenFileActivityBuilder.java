package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.C0824r;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.internal.C1785jx;

public class OpenFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    /* renamed from: OH */
    private String f871OH;

    /* renamed from: OI */
    private String[] f872OI;

    /* renamed from: OJ */
    private DriveId f873OJ;

    public IntentSender build(GoogleApiClient googleApiClient) {
        C1785jx.m5355a(googleApiClient.isConnected(), "Client must be connected");
        if (this.f872OI == null) {
            this.f872OI = new String[0];
        }
        try {
            return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11717iG().mo11484a(new OpenFileIntentSenderRequest(this.f871OH, this.f872OI, this.f873OJ));
        } catch (RemoteException e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId driveId) {
        this.f873OJ = (DriveId) C1785jx.m5364i(driveId);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String str) {
        this.f871OH = (String) C1785jx.m5364i(str);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String[] strArr) {
        C1785jx.m5361b(strArr != null, (Object) "mimeTypes may not be null");
        this.f872OI = strArr;
        return this;
    }
}
