package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.internal.C2018o;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.i */
public abstract class C1670i extends C1626h {

    /* renamed from: kA */
    private static Method f3673kA;

    /* renamed from: kB */
    private static Method f3674kB;

    /* renamed from: kC */
    private static Method f3675kC;

    /* renamed from: kD */
    private static Method f3676kD;

    /* renamed from: kE */
    private static Method f3677kE;

    /* renamed from: kF */
    private static Method f3678kF;

    /* renamed from: kG */
    private static Method f3679kG;

    /* renamed from: kH */
    private static Method f3680kH;

    /* renamed from: kI */
    private static Method f3681kI;

    /* renamed from: kJ */
    private static String f3682kJ;

    /* renamed from: kK */
    private static String f3683kK;

    /* renamed from: kL */
    private static String f3684kL;

    /* renamed from: kM */
    private static C2018o f3685kM;

    /* renamed from: kN */
    static boolean f3686kN = false;
    private static long startTime = 0;

    /* renamed from: com.google.android.gms.internal.i$a */
    static class C1671a extends Exception {
        public C1671a() {
        }

        public C1671a(Throwable th) {
            super(th);
        }
    }

    protected C1670i(Context context, C1880m mVar, C1963n nVar) {
        super(context, mVar, nVar);
    }

    /* renamed from: a */
    static String m4881a(Context context, C1880m mVar) throws C1671a {
        if (f3683kK != null) {
            return f3683kK;
        }
        if (f3676kD == null) {
            throw new C1671a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f3676kD.invoke((Object) null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C1671a();
            }
            f3683kK = mVar.mo15184a(byteBuffer.array(), true);
            return f3683kK;
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: a */
    static ArrayList<Long> m4882a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws C1671a {
        if (f3677kE == null || motionEvent == null) {
            throw new C1671a();
        }
        try {
            return (ArrayList) f3677kE.invoke((Object) null, new Object[]{motionEvent, displayMetrics});
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: a */
    protected static synchronized void m4883a(String str, Context context, C1880m mVar) {
        synchronized (C1670i.class) {
            if (!f3686kN) {
                try {
                    f3685kM = new C2018o(mVar, (SecureRandom) null);
                    f3682kJ = str;
                    m4889g(context);
                    startTime = m4891w().longValue();
                    f3686kN = true;
                } catch (C1671a | UnsupportedOperationException e) {
                }
            }
        }
    }

    /* renamed from: b */
    static String m4884b(Context context, C1880m mVar) throws C1671a {
        if (f3684kL != null) {
            return f3684kL;
        }
        if (f3679kG == null) {
            throw new C1671a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f3679kG.invoke((Object) null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C1671a();
            }
            f3684kL = mVar.mo15184a(byteBuffer.array(), true);
            return f3684kL;
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: b */
    private static String m4885b(byte[] bArr, String str) throws C1671a {
        try {
            return new String(f3685kM.mo16434c(bArr, str), "UTF-8");
        } catch (C2018o.C2019a e) {
            throw new C1671a(e);
        } catch (UnsupportedEncodingException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: d */
    static String m4886d(Context context) throws C1671a {
        if (f3678kF == null) {
            throw new C1671a();
        }
        try {
            String str = (String) f3678kF.invoke((Object) null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new C1671a();
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: e */
    static ArrayList<Long> m4887e(Context context) throws C1671a {
        if (f3680kH == null) {
            throw new C1671a();
        }
        try {
            ArrayList<Long> arrayList = (ArrayList) f3680kH.invoke((Object) null, new Object[]{context});
            if (arrayList != null) {
                if (arrayList.size() == 2) {
                    return arrayList;
                }
            }
            throw new C1671a();
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: f */
    static int[] m4888f(Context context) throws C1671a {
        if (f3681kI == null) {
            throw new C1671a();
        }
        try {
            return (int[]) f3681kI.invoke((Object) null, new Object[]{context});
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: g */
    private static void m4889g(Context context) throws C1671a {
        File cacheDir;
        File createTempFile;
        try {
            byte[] b = f3685kM.mo16433b(C2118q.getKey());
            byte[] c = f3685kM.mo16434c(b, C2118q.m6220E());
            cacheDir = context.getCacheDir();
            if (cacheDir == null && (cacheDir = context.getDir("dex", 0)) == null) {
                throw new C1671a();
            }
            createTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(c, 0, c.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), (String) null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(m4885b(b, C2118q.m6223H()));
            Class loadClass2 = dexClassLoader.loadClass(m4885b(b, C2118q.m6235T()));
            Class loadClass3 = dexClassLoader.loadClass(m4885b(b, C2118q.m6229N()));
            Class loadClass4 = dexClassLoader.loadClass(m4885b(b, C2118q.m6227L()));
            Class loadClass5 = dexClassLoader.loadClass(m4885b(b, C2118q.m6237V()));
            Class loadClass6 = dexClassLoader.loadClass(m4885b(b, C2118q.m6225J()));
            Class loadClass7 = dexClassLoader.loadClass(m4885b(b, C2118q.m6233R()));
            Class loadClass8 = dexClassLoader.loadClass(m4885b(b, C2118q.m6231P()));
            Class loadClass9 = dexClassLoader.loadClass(m4885b(b, C2118q.m6221F()));
            f3673kA = loadClass.getMethod(m4885b(b, C2118q.m6224I()), new Class[0]);
            f3674kB = loadClass2.getMethod(m4885b(b, C2118q.m6236U()), new Class[0]);
            f3675kC = loadClass3.getMethod(m4885b(b, C2118q.m6230O()), new Class[0]);
            f3676kD = loadClass4.getMethod(m4885b(b, C2118q.m6228M()), new Class[]{Context.class});
            f3677kE = loadClass5.getMethod(m4885b(b, C2118q.m6238W()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            f3678kF = loadClass6.getMethod(m4885b(b, C2118q.m6226K()), new Class[]{Context.class});
            f3679kG = loadClass7.getMethod(m4885b(b, C2118q.m6234S()), new Class[]{Context.class});
            f3680kH = loadClass8.getMethod(m4885b(b, C2118q.m6232Q()), new Class[]{Context.class});
            f3681kI = loadClass9.getMethod(m4885b(b, C2118q.m6222G()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (FileNotFoundException e) {
            throw new C1671a(e);
        } catch (IOException e2) {
            throw new C1671a(e2);
        } catch (ClassNotFoundException e3) {
            throw new C1671a(e3);
        } catch (C2018o.C2019a e4) {
            throw new C1671a(e4);
        } catch (NoSuchMethodException e5) {
            throw new C1671a(e5);
        } catch (NullPointerException e6) {
            throw new C1671a(e6);
        } catch (Throwable th) {
            String name2 = createTempFile.getName();
            createTempFile.delete();
            new File(cacheDir, name2.replace(".jar", ".dex")).delete();
            throw th;
        }
    }

    /* renamed from: v */
    static String m4890v() throws C1671a {
        if (f3682kJ != null) {
            return f3682kJ;
        }
        throw new C1671a();
    }

    /* renamed from: w */
    static Long m4891w() throws C1671a {
        if (f3673kA == null) {
            throw new C1671a();
        }
        try {
            return (Long) f3673kA.invoke((Object) null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: x */
    static String m4892x() throws C1671a {
        if (f3675kC == null) {
            throw new C1671a();
        }
        try {
            return (String) f3675kC.invoke((Object) null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* renamed from: y */
    static Long m4893y() throws C1671a {
        if (f3674kB == null) {
            throw new C1671a();
        }
        try {
            return (Long) f3674kB.invoke((Object) null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C1671a(e);
        } catch (InvocationTargetException e2) {
            throw new C1671a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:31:0x008a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15493b(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 1
            java.lang.String r1 = m4892x()     // Catch:{ a -> 0x000b }
            r7.mo15491a((int) r0, (java.lang.String) r1)     // Catch:{ a -> 0x000b }
            goto L_0x000c
        L_0x0009:
            r8 = move-exception
            return
        L_0x000b:
            r1 = move-exception
        L_0x000c:
            r1 = 2
            java.lang.String r2 = m4890v()     // Catch:{ a -> 0x0015 }
            r7.mo15491a((int) r1, (java.lang.String) r2)     // Catch:{ a -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r1 = move-exception
        L_0x0016:
            java.lang.Long r1 = m4891w()     // Catch:{ a -> 0x003b }
            long r1 = r1.longValue()     // Catch:{ a -> 0x003b }
            r3 = 25
            r7.mo15490a((int) r3, (long) r1)     // Catch:{ a -> 0x003b }
            long r3 = startTime     // Catch:{ a -> 0x003b }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x003c
            r3 = 17
            long r4 = startTime     // Catch:{ a -> 0x003b }
            long r1 = r1 - r4
            r7.mo15490a((int) r3, (long) r1)     // Catch:{ a -> 0x003b }
            r1 = 23
            long r2 = startTime     // Catch:{ a -> 0x003b }
            r7.mo15490a((int) r1, (long) r2)     // Catch:{ a -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r1 = move-exception
        L_0x003c:
            r1 = 0
            java.util.ArrayList r2 = m4887e(r8)     // Catch:{ a -> 0x0060 }
            r3 = 31
            java.lang.Object r4 = r2.get(r1)     // Catch:{ a -> 0x0060 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ a -> 0x0060 }
            long r4 = r4.longValue()     // Catch:{ a -> 0x0060 }
            r7.mo15490a((int) r3, (long) r4)     // Catch:{ a -> 0x0060 }
            r3 = 32
            java.lang.Object r2 = r2.get(r0)     // Catch:{ a -> 0x0060 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ a -> 0x0060 }
            long r4 = r2.longValue()     // Catch:{ a -> 0x0060 }
            r7.mo15490a((int) r3, (long) r4)     // Catch:{ a -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r2 = move-exception
        L_0x0061:
            r2 = 33
            java.lang.Long r3 = m4893y()     // Catch:{ a -> 0x006f }
            long r3 = r3.longValue()     // Catch:{ a -> 0x006f }
            r7.mo15490a((int) r2, (long) r3)     // Catch:{ a -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r2 = move-exception
        L_0x0070:
            r2 = 27
            com.google.android.gms.internal.m r3 = r7.f3603ky     // Catch:{ a -> 0x007c }
            java.lang.String r3 = m4881a((android.content.Context) r8, (com.google.android.gms.internal.C1880m) r3)     // Catch:{ a -> 0x007c }
            r7.mo15491a((int) r2, (java.lang.String) r3)     // Catch:{ a -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r2 = move-exception
        L_0x007d:
            r2 = 29
            com.google.android.gms.internal.m r3 = r7.f3603ky     // Catch:{ a -> 0x0089 }
            java.lang.String r3 = m4884b((android.content.Context) r8, (com.google.android.gms.internal.C1880m) r3)     // Catch:{ a -> 0x0089 }
            r7.mo15491a((int) r2, (java.lang.String) r3)     // Catch:{ a -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            int[] r8 = m4888f(r8)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r2 = 5
            r1 = r8[r1]     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r7.mo15490a((int) r2, (long) r3)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r1 = 6
            r8 = r8[r0]     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            long r2 = (long) r8     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r7.mo15490a((int) r1, (long) r2)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1670i.mo15493b(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:14:0x0025] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15494c(android.content.Context r6) {
        /*
            r5 = this;
            r6 = 2
            java.lang.String r0 = m4890v()     // Catch:{ a -> 0x000b }
            r5.mo15491a((int) r6, (java.lang.String) r0)     // Catch:{ a -> 0x000b }
            goto L_0x000c
        L_0x0009:
            r6 = move-exception
            return
        L_0x000b:
            r0 = move-exception
        L_0x000c:
            r0 = 1
            java.lang.String r1 = m4892x()     // Catch:{ a -> 0x0015 }
            r5.mo15491a((int) r0, (java.lang.String) r1)     // Catch:{ a -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r1 = move-exception
        L_0x0016:
            r1 = 25
            java.lang.Long r2 = m4891w()     // Catch:{ a -> 0x0024 }
            long r2 = r2.longValue()     // Catch:{ a -> 0x0024 }
            r5.mo15490a((int) r1, (long) r2)     // Catch:{ a -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r1 = move-exception
        L_0x0025:
            android.view.MotionEvent r1 = r5.f3601kw     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            android.util.DisplayMetrics r2 = r5.f3602kx     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            java.util.ArrayList r1 = m4882a((android.view.MotionEvent) r1, (android.util.DisplayMetrics) r2)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r2 = 14
            r3 = 0
            java.lang.Object r3 = r1.get(r3)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            long r3 = r3.longValue()     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r5.mo15490a((int) r2, (long) r3)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r2 = 15
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            long r3 = r0.longValue()     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r5.mo15490a((int) r2, (long) r3)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r2 = 3
            if (r0 < r2) goto L_0x0062
            r0 = 16
            java.lang.Object r6 = r1.get(r6)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            long r1 = r6.longValue()     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
            r5.mo15490a((int) r0, (long) r1)     // Catch:{ IOException -> 0x0009, IOException -> 0x0009 }
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1670i.mo15494c(android.content.Context):void");
    }
}
