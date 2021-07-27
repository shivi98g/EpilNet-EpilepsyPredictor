package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C1834lf;
import com.google.android.gms.tagmanager.DataLayer;
import epilepsy_nitkkr.epilepsypredictor.DatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.tagmanager.v */
class C2627v implements DataLayer.C2453c {
    /* access modifiers changed from: private */
    public static final String ara = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", DatabaseHelper.COL1, "key", "value", "expires"});
    private final Executor arb;
    private C2631a arc;
    private int ard;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: wb */
    private C1832ld f4477wb;

    /* renamed from: com.google.android.gms.tagmanager.v$a */
    class C2631a extends SQLiteOpenHelper {
        C2631a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m7696a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", (String[]) null);
            HashSet hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (String add : columnNames) {
                    hashSet.add(add);
                }
                rawQuery.close();
                if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove(DatabaseHelper.COL1) || !hashSet.remove("expires")) {
                    throw new SQLiteException("Database column missing");
                } else if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                }
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m7697a(java.lang.String r11, android.database.sqlite.SQLiteDatabase r12) {
            /*
                r10 = this;
                r0 = 0
                r1 = 0
                java.lang.String r3 = "SQLITE_MASTER"
                java.lang.String r2 = "name"
                java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch:{ SQLiteException -> 0x002b }
                java.lang.String r5 = "name=?"
                r2 = 1
                java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002b }
                r6[r0] = r11     // Catch:{ SQLiteException -> 0x002b }
                r7 = 0
                r8 = 0
                r9 = 0
                r2 = r12
                android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x002b }
                boolean r1 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0026, all -> 0x0023 }
                if (r12 == 0) goto L_0x0022
                r12.close()
            L_0x0022:
                return r1
            L_0x0023:
                r11 = move-exception
                r1 = r12
                goto L_0x0046
            L_0x0026:
                r1 = move-exception
                r1 = r12
                goto L_0x002c
            L_0x0029:
                r11 = move-exception
                goto L_0x0046
            L_0x002b:
                r12 = move-exception
            L_0x002c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r12.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "Error querying for table "
                r12.append(r2)     // Catch:{ all -> 0x0029 }
                r12.append(r11)     // Catch:{ all -> 0x0029 }
                java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0029 }
                com.google.android.gms.tagmanager.C2504bh.m7246W(r11)     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0045
                r1.close()
            L_0x0045:
                return r0
            L_0x0046:
                if (r1 == 0) goto L_0x004b
                r1.close()
            L_0x004b:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2627v.C2631a.m7697a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
        }

        public SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                C2627v.this.mContext.getDatabasePath("google_tagmanager.db").delete();
                sQLiteDatabase = null;
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C2475ak.m7182ag(sQLiteDatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (Build.VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", (String[]) null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (!m7697a("datalayer", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(C2627v.ara);
            } else {
                m7696a(sQLiteDatabase);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.v$b */
    private static class C2632b {

        /* renamed from: KP */
        final String f4478KP;
        final byte[] arj;

        C2632b(String str, byte[] bArr) {
            this.f4478KP = str;
            this.arj = bArr;
        }

        public String toString() {
            return "KeyAndSerialized: key = " + this.f4478KP + " serialized hash = " + Arrays.hashCode(this.arj);
        }
    }

    public C2627v(Context context) {
        this(context, C1834lf.m5525if(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    C2627v(Context context, C1832ld ldVar, String str, int i, Executor executor) {
        this.mContext = context;
        this.f4477wb = ldVar;
        this.ard = i;
        this.arb = executor;
        this.arc = new C2631a(this.mContext, str);
    }

    /* renamed from: al */
    private SQLiteDatabase m7675al(String str) {
        try {
            return this.arc.getWritableDatabase();
        } catch (SQLiteException e) {
            C2504bh.m7246W(str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m7677b(List<C2632b> list, long j) {
        try {
            long currentTimeMillis = this.f4477wb.currentTimeMillis();
            m7692x(currentTimeMillis);
            m7680fI(list.size());
            m7678c(list, currentTimeMillis + j);
            m7689pC();
        } catch (Throwable th) {
            m7689pC();
            throw th;
        }
    }

    /* renamed from: c */
    private void m7678c(List<C2632b> list, long j) {
        SQLiteDatabase al = m7675al("Error opening database for writeEntryToDatabase.");
        if (al != null) {
            for (C2632b next : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", next.f4478KP);
                contentValues.put("value", next.arj);
                al.insert("datalayer", (String) null, contentValues);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: cA */
    public void m7679cA(String str) {
        SQLiteDatabase al = m7675al("Error opening database for clearKeysWithPrefix.");
        if (al != null) {
            try {
                int delete = al.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"});
                C2504bh.m7245V("Cleared " + delete + " items");
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error deleting entries with key prefix: " + str + " (" + e + ").");
            } catch (Throwable th) {
                m7689pC();
                throw th;
            }
            m7689pC();
        }
    }

    /* renamed from: fI */
    private void m7680fI(int i) {
        int pB = (m7688pB() - this.ard) + i;
        if (pB > 0) {
            List<String> fJ = m7681fJ(pB);
            C2504bh.m7244U("DataLayer store full, deleting " + fJ.size() + " entries to make room.");
            m7682h((String[]) fJ.toArray(new String[0]));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* renamed from: fJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> m7681fJ(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 > 0) goto L_0x000d
            java.lang.String r15 = "Invalid maxEntries specified. Skipping."
            com.google.android.gms.tagmanager.C2504bh.m7246W(r15)
            return r0
        L_0x000d:
            java.lang.String r1 = "Error opening database for peekEntryIds."
            android.database.sqlite.SQLiteDatabase r2 = r14.m7675al(r1)
            if (r2 != 0) goto L_0x0016
            return r0
        L_0x0016:
            r1 = 0
            java.lang.String r3 = "datalayer"
            java.lang.String r4 = "ID"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0060 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x0060 }
            java.lang.String r11 = "ID"
            r12 = 0
            r10[r12] = r11     // Catch:{ SQLiteException -> 0x0060 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ SQLiteException -> 0x0060 }
            java.lang.String r10 = java.lang.Integer.toString(r15)     // Catch:{ SQLiteException -> 0x0060 }
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0060 }
            boolean r1 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0059, all -> 0x0056 }
            if (r1 == 0) goto L_0x0050
        L_0x003f:
            long r1 = r15.getLong(r12)     // Catch:{ SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x0059, all -> 0x0056 }
            r0.add(r1)     // Catch:{ SQLiteException -> 0x0059, all -> 0x0056 }
            boolean r1 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x0059, all -> 0x0056 }
            if (r1 != 0) goto L_0x003f
        L_0x0050:
            if (r15 == 0) goto L_0x007e
            r15.close()
            return r0
        L_0x0056:
            r0 = move-exception
            r1 = r15
            goto L_0x007f
        L_0x0059:
            r1 = move-exception
            r13 = r1
            r1 = r15
            r15 = r13
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            goto L_0x007f
        L_0x0060:
            r15 = move-exception
        L_0x0061:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r2.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "Error in peekEntries fetching entryIds: "
            r2.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x005e }
            r2.append(r15)     // Catch:{ all -> 0x005e }
            java.lang.String r15 = r2.toString()     // Catch:{ all -> 0x005e }
            com.google.android.gms.tagmanager.C2504bh.m7246W(r15)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x007e
            r1.close()
        L_0x007e:
            return r0
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2627v.m7681fJ(int):java.util.List");
    }

    /* renamed from: h */
    private void m7682h(String[] strArr) {
        SQLiteDatabase al;
        if (strArr != null && strArr.length != 0 && (al = m7675al("Error opening database for deleteEntries.")) != null) {
            try {
                al.delete("datalayer", String.format("%s in (%s)", new Object[]{DatabaseHelper.COL1, TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error deleting entries " + Arrays.toString(strArr));
            }
        }
    }

    /* renamed from: i */
    private List<DataLayer.C2451a> m7683i(List<C2632b> list) {
        ArrayList arrayList = new ArrayList();
        for (C2632b next : list) {
            arrayList.add(new DataLayer.C2451a(next.f4478KP, m7684j(next.arj)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[SYNTHETIC, Splitter:B:18:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0035 A[SYNTHETIC, Splitter:B:27:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0043 A[SYNTHETIC, Splitter:B:36:0x0043] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m7684j(byte[] r5) {
        /*
            r4 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x0031, all -> 0x0024 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x0031, all -> 0x0024 }
            java.lang.Object r2 = r1.readObject()     // Catch:{ IOException -> 0x0022, ClassNotFoundException -> 0x0020, all -> 0x001b }
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r5 = move-exception
            return r2
        L_0x0017:
            r0.close()     // Catch:{ IOException -> 0x0015 }
            return r2
        L_0x001b:
            r5 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
            goto L_0x0025
        L_0x0020:
            r2 = move-exception
            goto L_0x0033
        L_0x0022:
            r2 = move-exception
            goto L_0x0041
        L_0x0024:
            r1 = move-exception
        L_0x0025:
            if (r5 == 0) goto L_0x002d
            r5.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002d
        L_0x002b:
            r5 = move-exception
            goto L_0x0030
        L_0x002d:
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x0030:
            throw r1
        L_0x0031:
            r1 = move-exception
            r1 = r5
        L_0x0033:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r0 = move-exception
            return r5
        L_0x003b:
            r0.close()     // Catch:{ IOException -> 0x0039 }
            return r5
        L_0x003f:
            r1 = move-exception
            r1 = r5
        L_0x0041:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            r0 = move-exception
            return r5
        L_0x0049:
            r0.close()     // Catch:{ IOException -> 0x0047 }
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2627v.m7684j(byte[]):java.lang.Object");
    }

    /* renamed from: j */
    private List<C2632b> m7685j(List<DataLayer.C2451a> list) {
        ArrayList arrayList = new ArrayList();
        for (DataLayer.C2451a next : list) {
            arrayList.add(new C2632b(next.f4392KP, m7686m(next.f4393wF)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC, Splitter:B:17:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0034 A[SYNTHETIC, Splitter:B:26:0x0034] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m7686m(java.lang.Object r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0030, all -> 0x0023 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0030, all -> 0x0023 }
            r2.writeObject(r4)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            byte[] r4 = r0.toByteArray()     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            return r4
        L_0x001a:
            r0.close()     // Catch:{ IOException -> 0x0018 }
            return r4
        L_0x001e:
            r4 = move-exception
            r1 = r2
            goto L_0x0024
        L_0x0021:
            r4 = move-exception
            goto L_0x0032
        L_0x0023:
            r4 = move-exception
        L_0x0024:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r0 = move-exception
            goto L_0x002f
        L_0x002c:
            r0.close()     // Catch:{ IOException -> 0x002a }
        L_0x002f:
            throw r4
        L_0x0030:
            r4 = move-exception
            r2 = r1
        L_0x0032:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r4 = move-exception
            return r1
        L_0x003a:
            r0.close()     // Catch:{ IOException -> 0x0038 }
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2627v.m7686m(java.lang.Object):byte[]");
    }

    /* renamed from: pA */
    private List<C2632b> m7687pA() {
        SQLiteDatabase al = m7675al("Error opening database for loadSerialized.");
        ArrayList arrayList = new ArrayList();
        if (al == null) {
            return arrayList;
        }
        Cursor query = al.query("datalayer", new String[]{"key", "value"}, (String) null, (String[]) null, (String) null, (String) null, DatabaseHelper.COL1, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C2632b(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0038  */
    /* renamed from: pB */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m7688pB() {
        /*
            r4 = this;
            java.lang.String r0 = "Error opening database for getNumStoredEntries."
            android.database.sqlite.SQLiteDatabase r0 = r4.m7675al(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = 0
            java.lang.String r3 = "SELECT COUNT(*) from datalayer"
            android.database.Cursor r0 = r0.rawQuery(r3, r2)     // Catch:{ SQLiteException -> 0x002a }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            long r2 = r0.getLong(r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            int r1 = (int) r2
        L_0x001c:
            if (r0 == 0) goto L_0x0035
            r0.close()
            return r1
        L_0x0022:
            r1 = move-exception
            r2 = r0
            goto L_0x0036
        L_0x0025:
            r2 = move-exception
            r2 = r0
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x0036
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r0 = "Error getting numStoredEntries"
            com.google.android.gms.tagmanager.C2504bh.m7246W(r0)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0035
            r2.close()
        L_0x0035:
            return r1
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2627v.m7688pB():int");
    }

    /* renamed from: pC */
    private void m7689pC() {
        try {
            this.arc.close();
        } catch (SQLiteException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pz */
    public List<DataLayer.C2451a> m7691pz() {
        try {
            m7692x(this.f4477wb.currentTimeMillis());
            return m7683i(m7687pA());
        } finally {
            m7689pC();
        }
    }

    /* renamed from: x */
    private void m7692x(long j) {
        SQLiteDatabase al = m7675al("Error opening database for deleteOlderThan.");
        if (al != null) {
            try {
                int delete = al.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
                C2504bh.m7245V("Deleted " + delete + " expired items");
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error deleting old entries.");
            }
        }
    }

    /* renamed from: a */
    public void mo18601a(final DataLayer.C2453c.C2454a aVar) {
        this.arb.execute(new Runnable() {
            public void run() {
                aVar.mo18604h(C2627v.this.m7691pz());
            }
        });
    }

    /* renamed from: a */
    public void mo18602a(List<DataLayer.C2451a> list, final long j) {
        final List<C2632b> j2 = m7685j(list);
        this.arb.execute(new Runnable() {
            public void run() {
                C2627v.this.m7677b(j2, j);
            }
        });
    }

    /* renamed from: cz */
    public void mo18603cz(final String str) {
        this.arb.execute(new Runnable() {
            public void run() {
                C2627v.this.m7679cA(str);
            }
        });
    }
}
