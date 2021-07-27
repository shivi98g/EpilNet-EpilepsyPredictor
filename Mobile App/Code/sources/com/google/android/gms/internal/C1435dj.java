package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0530R;
import java.util.Map;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.dj */
public class C1435dj {
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: mo */
    public final C1610gu f2909mo;

    /* renamed from: rd */
    private final Map<String, String> f2910rd;

    public C1435dj(C1610gu guVar, Map<String, String> map) {
        this.f2909mo = guVar;
        this.f2910rd = map;
        this.mContext = guVar.mo15431dI();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo15093B(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public DownloadManager.Request mo15094b(String str, String str2) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        if (C1840ll.m5538ig()) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return request;
        }
        request.setShowRunningNotification(true);
        return request;
    }

    public void execute() {
        if (!new C1329bl(this.mContext).mo14929bq()) {
            C1607gr.m4709W("Store picture feature is not supported on this device.");
        } else if (TextUtils.isEmpty(this.f2910rd.get("iurl"))) {
            C1607gr.m4709W("Image url cannot be empty.");
        } else {
            final String str = this.f2910rd.get("iurl");
            if (!URLUtil.isValidUrl(str)) {
                C1607gr.m4709W("Invalid image url:" + str);
                return;
            }
            final String B = mo15093B(str);
            if (!C1591gi.m4640N(B)) {
                C1607gr.m4709W("Image type not recognized:");
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
            builder.setTitle(C1579ga.m4592c(C0530R.string.store_picture_title, "Save image"));
            builder.setMessage(C1579ga.m4592c(C0530R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(C1579ga.m4592c(C0530R.string.accept, "Accept"), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        ((DownloadManager) C1435dj.this.mContext.getSystemService("download")).enqueue(C1435dj.this.mo15094b(str, B));
                    } catch (IllegalStateException e) {
                        C1607gr.m4707U("Could not store picture.");
                    }
                }
            });
            builder.setNegativeButton(C1579ga.m4592c(C0530R.string.decline, "Decline"), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C1435dj.this.f2909mo.mo15421b("onStorePictureCanceled", new JSONObject());
                }
            });
            builder.create().show();
        }
    }
}
