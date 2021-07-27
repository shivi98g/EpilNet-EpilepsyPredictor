package android.support.p000v4.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.FontRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.p000v4.util.Preconditions;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.res.ResourcesCompat */
public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    @Nullable
    public static Drawable getDrawable(@NonNull Resources res, @DrawableRes int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources res, @DrawableRes int id, int density, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawableForDensity(id, density, theme);
        }
        if (Build.VERSION.SDK_INT >= 15) {
            return res.getDrawableForDensity(id, density);
        }
        return res.getDrawable(id);
    }

    @ColorInt
    public static int getColor(@NonNull Resources res, @ColorRes int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColor(id, theme);
        }
        return res.getColor(id);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources res, @ColorRes int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColorStateList(id, theme);
        }
        return res.getColorStateList(id);
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int id) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id, new TypedValue(), 0, (FontCallback) null, (Handler) null, false);
    }

    /* renamed from: android.support.v4.content.res.ResourcesCompat$FontCallback */
    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int reason, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(reason);
                }
            });
        }
    }

    public static void getFont(@NonNull Context context, @FontRes int id, @NonNull FontCallback fontCallback, @Nullable Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
            return;
        }
        loadFont(context, id, new TypedValue(), 0, fontCallback, handler, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface getFont(@NonNull Context context, @FontRes int id, TypedValue value, int style, @Nullable FontCallback fontCallback) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id, value, style, fontCallback, (Handler) null, true);
    }

    private static Typeface loadFont(@NonNull Context context, int id, TypedValue value, int style, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = loadFont(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface loadFont(@android.support.annotation.NonNull android.content.Context r21, android.content.res.Resources r22, android.util.TypedValue r23, int r24, int r25, @android.support.annotation.Nullable android.support.p000v4.content.res.ResourcesCompat.FontCallback r26, @android.support.annotation.Nullable android.os.Handler r27, boolean r28) {
        /*
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            java.lang.CharSequence r1 = r10.string
            if (r1 != 0) goto L_0x003f
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Resource \""
            r2.append(r3)
            java.lang.String r3 = r9.getResourceName(r11)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r24)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.CharSequence r1 = r10.string
            java.lang.String r15 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r15.startsWith(r1)
            r16 = 0
            r8 = -3
            if (r1 != 0) goto L_0x0056
            if (r13 == 0) goto L_0x0055
            r13.callbackFailAsync(r8, r14)
        L_0x0055:
            return r16
        L_0x0056:
            android.graphics.Typeface r7 = android.support.p000v4.graphics.TypefaceCompat.findFromCache(r9, r11, r12)
            if (r7 == 0) goto L_0x0062
            if (r13 == 0) goto L_0x0061
            r13.callbackSuccessAsync(r7, r14)
        L_0x0061:
            return r7
        L_0x0062:
            java.lang.String r1 = r15.toLowerCase()     // Catch:{ XmlPullParserException -> 0x010a, IOException -> 0x00ec }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x010a, IOException -> 0x00ec }
            if (r1 == 0) goto L_0x00c6
            android.content.res.XmlResourceParser r1 = r9.getXml(r11)     // Catch:{ XmlPullParserException -> 0x00bf, IOException -> 0x00b8 }
            r6 = r1
            android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = android.support.p000v4.content.res.FontResourcesParserCompat.parse(r6, r9)     // Catch:{ XmlPullParserException -> 0x00bf, IOException -> 0x00b8 }
            r17 = r1
            if (r17 != 0) goto L_0x009b
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to find font-family tag"
            android.util.Log.e(r1, r2)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0089 }
            if (r13 == 0) goto L_0x0088
            r13.callbackFailAsync(r8, r14)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0089 }
        L_0x0088:
            return r16
        L_0x0089:
            r0 = move-exception
            r1 = r21
            r2 = r0
            r19 = r7
            r10 = r8
            goto L_0x00f3
        L_0x0092:
            r0 = move-exception
            r1 = r21
            r2 = r0
            r19 = r7
            r10 = r8
            goto L_0x0111
        L_0x009b:
            r1 = r21
            r2 = r17
            r3 = r9
            r4 = r11
            r5 = r12
            r18 = r6
            r6 = r13
            r19 = r7
            r7 = r14
            r10 = r8
            r8 = r28
            android.graphics.Typeface r1 = android.support.p000v4.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x00b4, IOException -> 0x00b0 }
            return r1
        L_0x00b0:
            r0 = move-exception
            r1 = r21
            goto L_0x00e7
        L_0x00b4:
            r0 = move-exception
            r1 = r21
            goto L_0x00ea
        L_0x00b8:
            r0 = move-exception
            r19 = r7
            r10 = r8
            r1 = r21
            goto L_0x00f2
        L_0x00bf:
            r0 = move-exception
            r19 = r7
            r10 = r8
            r1 = r21
            goto L_0x0110
        L_0x00c6:
            r19 = r7
            r10 = r8
            r1 = r21
            android.graphics.Typeface r2 = android.support.p000v4.graphics.TypefaceCompat.createFromResourcesFontFile(r1, r9, r11, r15, r12)     // Catch:{ XmlPullParserException -> 0x00e9, IOException -> 0x00e6 }
            r7 = r2
            if (r13 == 0) goto L_0x00e5
            if (r7 == 0) goto L_0x00e2
            r13.callbackSuccessAsync(r7, r14)     // Catch:{ XmlPullParserException -> 0x00dd, IOException -> 0x00d8 }
            goto L_0x00e5
        L_0x00d8:
            r0 = move-exception
            r2 = r0
            r19 = r7
            goto L_0x00f3
        L_0x00dd:
            r0 = move-exception
            r2 = r0
            r19 = r7
            goto L_0x0111
        L_0x00e2:
            r13.callbackFailAsync(r10, r14)     // Catch:{ XmlPullParserException -> 0x00dd, IOException -> 0x00d8 }
        L_0x00e5:
            return r7
        L_0x00e6:
            r0 = move-exception
        L_0x00e7:
            r2 = r0
            goto L_0x00f3
        L_0x00e9:
            r0 = move-exception
        L_0x00ea:
            r2 = r0
            goto L_0x0111
        L_0x00ec:
            r0 = move-exception
            r1 = r21
            r19 = r7
            r10 = r8
        L_0x00f2:
            r2 = r0
        L_0x00f3:
            java.lang.String r3 = "ResourcesCompat"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to read xml resource "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r2)
            goto L_0x0128
        L_0x010a:
            r0 = move-exception
            r1 = r21
            r19 = r7
            r10 = r8
        L_0x0110:
            r2 = r0
        L_0x0111:
            java.lang.String r3 = "ResourcesCompat"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to parse xml resource "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r2)
        L_0x0128:
            if (r13 == 0) goto L_0x012d
            r13.callbackFailAsync(r10, r14)
        L_0x012d:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }

    private ResourcesCompat() {
    }
}
