package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@C1507ey
/* renamed from: com.google.android.gms.internal.dm */
public final class C1442dm {
    /* renamed from: a */
    public static boolean m4283a(Context context, C1444do doVar, C1457dv dvVar) {
        String message;
        if (doVar == null) {
            message = "No intent data for launcher overlay.";
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(doVar.f2937rH)) {
                message = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(doVar.mimeType)) {
                    intent.setDataAndType(Uri.parse(doVar.f2937rH), doVar.mimeType);
                } else {
                    intent.setData(Uri.parse(doVar.f2937rH));
                }
                intent.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(doVar.packageName)) {
                    intent.setPackage(doVar.packageName);
                }
                if (!TextUtils.isEmpty(doVar.f2938rI)) {
                    String[] split = doVar.f2938rI.split("/", 2);
                    if (split.length < 2) {
                        message = "Could not parse component name from open GMSG: " + doVar.f2938rI;
                    } else {
                        intent.setClassName(split[0], split[1]);
                    }
                }
                try {
                    C1607gr.m4708V("Launching an intent: " + intent);
                    context.startActivity(intent);
                    dvVar.mo15172af();
                    return true;
                } catch (ActivityNotFoundException e) {
                    message = e.getMessage();
                }
            }
        }
        C1607gr.m4709W(message);
        return false;
    }
}
