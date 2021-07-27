package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.drive.internal.i */
public class C0800i {

    /* renamed from: OH */
    private String f1040OH;

    /* renamed from: OJ */
    private DriveId f1041OJ;

    /* renamed from: Pu */
    protected MetadataChangeSet f1042Pu;

    /* renamed from: Pv */
    private Integer f1043Pv;

    /* renamed from: Pw */
    private final int f1044Pw;

    public C0800i(int i) {
        this.f1044Pw = i;
    }

    /* renamed from: a */
    public void mo11670a(DriveId driveId) {
        this.f1041OJ = (DriveId) C1785jx.m5364i(driveId);
    }

    /* renamed from: a */
    public void mo11671a(MetadataChangeSet metadataChangeSet) {
        this.f1042Pu = (MetadataChangeSet) C1785jx.m5364i(metadataChangeSet);
    }

    /* renamed from: bl */
    public void mo11672bl(String str) {
        this.f1040OH = (String) C1785jx.m5364i(str);
    }

    /* renamed from: bq */
    public void mo11673bq(int i) {
        this.f1043Pv = Integer.valueOf(i);
    }

    public IntentSender build(GoogleApiClient googleApiClient) {
        C1785jx.m5359b(this.f1042Pu, (Object) "Must provide initial metadata to CreateFileActivityBuilder.");
        C1785jx.m5355a(googleApiClient.isConnected(), "Client must be connected");
        C0824r rVar = (C0824r) googleApiClient.mo10937a(Drive.f842DQ);
        this.f1042Pu.mo11287iz().setContext(rVar.getContext());
        try {
            return rVar.mo11717iG().mo11483a(new CreateFileIntentSenderRequest(this.f1042Pu.mo11287iz(), this.f1043Pv == null ? -1 : this.f1043Pv.intValue(), this.f1040OH, this.f1041OJ, this.f1044Pw));
        } catch (RemoteException e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }
}
