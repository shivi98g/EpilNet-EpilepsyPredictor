package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    /* renamed from: d */
    private void m7138d(String str, String str2, String str3) {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        create.show();
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C2504bh.m7244U("Preview activity");
            Uri data = getIntent().getData();
            if (!TagManager.getInstance(this).mo18617i(data)) {
                String str = "Cannot preview the app with the uri: " + data + ". Launching current version instead.";
                C2504bh.m7246W(str);
                m7138d("Preview failure", str, "Continue");
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                C2504bh.m7244U("Invoke the launch activity for package name: " + getPackageName());
                startActivity(launchIntentForPackage);
                return;
            }
            C2504bh.m7244U("No launch activity found for package name: " + getPackageName());
        } catch (Exception e) {
            C2504bh.m7243T("Calling preview threw an exception: " + e.getMessage());
        }
    }
}
