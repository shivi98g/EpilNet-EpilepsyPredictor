package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

@C1507ey
/* renamed from: com.google.android.gms.internal.gq */
public final class C1606gq {

    /* renamed from: wR */
    public static final Handler f3553wR = new Handler(Looper.getMainLooper());

    /* renamed from: R */
    public static String m4696R(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m4697a(Context context, int i) {
        return m4698a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m4698a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static void m4699a(ViewGroup viewGroup, C1306ay ayVar, String str) {
        m4700a(viewGroup, ayVar, str, ViewCompat.MEASURED_STATE_MASK, -1);
    }

    /* renamed from: a */
    private static void m4700a(ViewGroup viewGroup, C1306ay ayVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m4697a(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(ayVar.widthPixels - a, ayVar.heightPixels - a, 17));
            viewGroup.addView(frameLayout, ayVar.widthPixels, ayVar.heightPixels);
        }
    }

    /* renamed from: a */
    public static void m4701a(ViewGroup viewGroup, C1306ay ayVar, String str, String str2) {
        C1607gr.m4709W(str2);
        m4700a(viewGroup, ayVar, str, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: dA */
    public static boolean m4702dA() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: dB */
    public static boolean m4703dB() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: v */
    public static String m4704v(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || m4702dA()) {
            string = "emulator";
        }
        return m4696R(string);
    }
}
