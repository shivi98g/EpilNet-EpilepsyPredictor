package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C1507ey
/* renamed from: com.google.android.gms.internal.gp */
public final class C1605gp extends C1584gf {
    private final Context mContext;

    /* renamed from: mG */
    private final String f3550mG;

    /* renamed from: vf */
    private final String f3551vf;

    /* renamed from: wl */
    private String f3552wl = null;

    public C1605gp(Context context, String str, String str2) {
        this.mContext = context;
        this.f3550mG = str;
        this.f3551vf = str2;
    }

    public C1605gp(Context context, String str, String str2, String str3) {
        this.mContext = context;
        this.f3550mG = str;
        this.f3551vf = str2;
        this.f3552wl = str3;
    }

    /* renamed from: cx */
    public void mo15197cx() {
        StringBuilder sb;
        String str;
        HttpURLConnection httpURLConnection;
        try {
            C1607gr.m4708V("Pinging URL: " + this.f3551vf);
            httpURLConnection = (HttpURLConnection) new URL(this.f3551vf).openConnection();
            if (this.f3552wl == null) {
                C1591gi.m4649a(this.mContext, this.f3550mG, true, httpURLConnection);
            } else {
                C1591gi.m4650a(this.mContext, this.f3550mG, true, httpURLConnection, this.f3552wl);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                C1607gr.m4709W("Received non-success response code " + responseCode + " from pinging URL: " + this.f3551vf);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            sb = new StringBuilder();
            sb.append("Error while parsing ping URL: ");
            sb.append(this.f3551vf);
            sb.append(". ");
            str = e.getMessage();
            sb.append(str);
            C1607gr.m4709W(sb.toString());
        } catch (IOException e2) {
            sb = new StringBuilder();
            sb.append("Error while pinging URL: ");
            sb.append(this.f3551vf);
            sb.append(". ");
            str = e2.getMessage();
            sb.append(str);
            C1607gr.m4709W(sb.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void onStop() {
    }
}
