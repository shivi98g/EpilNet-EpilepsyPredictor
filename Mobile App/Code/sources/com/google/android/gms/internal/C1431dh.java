package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.C0530R;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.plus.PlusShare;
import java.util.Map;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.dh */
public class C1431dh {
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: mo */
    public final C1610gu f2891mo;

    /* renamed from: rd */
    private final Map<String, String> f2892rd;

    /* renamed from: re */
    private String f2893re;

    /* renamed from: rf */
    private long f2894rf;

    /* renamed from: rg */
    private long f2895rg;

    /* renamed from: rh */
    private String f2896rh;

    /* renamed from: ri */
    private String f2897ri;

    public C1431dh(C1610gu guVar, Map<String, String> map) {
        this.f2891mo = guVar;
        this.f2892rd = map;
        this.mContext = guVar.mo15431dI();
        m4252bQ();
    }

    /* renamed from: A */
    private String m4249A(String str) {
        return TextUtils.isEmpty(this.f2892rd.get(str)) ? "" : this.f2892rd.get(str);
    }

    /* renamed from: bQ */
    private void m4252bQ() {
        this.f2893re = m4249A(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        this.f2896rh = m4249A("summary");
        this.f2894rf = C1591gi.m4641O(this.f2892rd.get("start"));
        this.f2895rg = C1591gi.m4641O(this.f2892rd.get("end"));
        this.f2897ri = m4249A("location");
    }

    /* access modifiers changed from: package-private */
    public Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, this.f2896rh);
        data.putExtra("eventLocation", this.f2897ri);
        data.putExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.f2893re);
        data.putExtra("beginTime", this.f2894rf);
        data.putExtra("endTime", this.f2895rg);
        data.setFlags(DriveFile.MODE_READ_ONLY);
        return data;
    }

    public void execute() {
        if (!new C1329bl(this.mContext).mo14931bt()) {
            C1607gr.m4709W("This feature is not available on this version of the device.");
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        builder.setTitle(C1579ga.m4592c(C0530R.string.create_calendar_title, "Create calendar event"));
        builder.setMessage(C1579ga.m4592c(C0530R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
        builder.setPositiveButton(C1579ga.m4592c(C0530R.string.accept, "Accept"), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C1431dh.this.mContext.startActivity(C1431dh.this.createIntent());
            }
        });
        builder.setNegativeButton(C1579ga.m4592c(C0530R.string.decline, "Decline"), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C1431dh.this.f2891mo.mo15421b("onCalendarEventCanceled", new JSONObject());
            }
        });
        builder.create().show();
    }
}
