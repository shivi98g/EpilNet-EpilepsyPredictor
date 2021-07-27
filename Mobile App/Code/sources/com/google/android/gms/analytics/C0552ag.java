package com.google.android.gms.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.C1627ha;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C1834lf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.google.android.gms.analytics.ag */
class C0552ag implements C0567d {
    /* access modifiers changed from: private */

    /* renamed from: BS */
    public static final String f207BS = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: BT */
    private final C0553a f208BT;

    /* renamed from: BU */
    private volatile C0584r f209BU;
    /* access modifiers changed from: private */

    /* renamed from: BV */
    public final String f210BV;

    /* renamed from: BW */
    private C0551af f211BW;

    /* renamed from: BX */
    private long f212BX;

    /* renamed from: BY */
    private final int f213BY;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: wb */
    public C1832ld f214wb;

    /* renamed from: ys */
    private C0581o f215ys;

    /* renamed from: yt */
    private volatile boolean f216yt;

    /* renamed from: zc */
    private final C0568e f217zc;

    /* renamed from: com.google.android.gms.analytics.ag$a */
    class C0553a extends SQLiteOpenHelper {

        /* renamed from: BZ */
        private boolean f218BZ;

        /* renamed from: Ca */
        private long f219Ca = 0;

        C0553a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m129a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM hits2 WHERE 0", (String[]) null);
            HashSet hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (String add : columnNames) {
                    hashSet.add(add);
                }
                rawQuery.close();
                if (!hashSet.remove("hit_id") || !hashSet.remove("hit_url") || !hashSet.remove("hit_string") || !hashSet.remove("hit_time")) {
                    throw new SQLiteException("Database column missing");
                }
                boolean z = !hashSet.remove("hit_app_id");
                if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                } else if (z) {
                    sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
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
        private boolean m130a(java.lang.String r11, android.database.sqlite.SQLiteDatabase r12) {
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
                com.google.android.gms.analytics.C0550ae.m106W(r11)     // Catch:{ all -> 0x0029 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0552ag.C0553a.m130a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
        }

        public SQLiteDatabase getWritableDatabase() {
            if (!this.f218BZ || this.f219Ca + 3600000 <= C0552ag.this.f214wb.currentTimeMillis()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.f218BZ = true;
                this.f219Ca = C0552ag.this.f214wb.currentTimeMillis();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    C0552ag.this.mContext.getDatabasePath(C0552ag.this.f210BV).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.f218BZ = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C0586t.m262ag(sQLiteDatabase.getPath());
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
            if (!m130a("hits2", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(C0552ag.f207BS);
            } else {
                m129a(sQLiteDatabase);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    C0552ag(C0568e eVar, Context context, C0581o oVar) {
        this(eVar, context, "google_analytics_v4.db", 2000, oVar);
    }

    C0552ag(C0568e eVar, Context context, String str, int i, C0581o oVar) {
        this.f216yt = true;
        this.mContext = context.getApplicationContext();
        this.f215ys = oVar;
        this.f210BV = str;
        this.f217zc = eVar;
        this.f214wb = C1834lf.m5525if();
        this.f208BT = new C0553a(this.mContext, this.f210BV);
        this.f209BU = new C0571h(new DefaultHttpClient(), this.mContext, this.f215ys);
        this.f212BX = 0;
        this.f213BY = i;
    }

    /* renamed from: A */
    static String m111A(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C0548ac.encode((String) next.getKey()) + "=" + C0548ac.encode((String) next.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    /* renamed from: a */
    private void m113a(Map<String, String> map, long j, String str) {
        SQLiteDatabase al = m115al("Error opening database for putHit");
        if (al != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_string", m111A(map));
            contentValues.put("hit_time", Long.valueOf(j));
            long j2 = 0;
            if (map.containsKey("AppUID")) {
                try {
                    j2 = Long.parseLong(map.get("AppUID"));
                } catch (NumberFormatException e) {
                }
            }
            contentValues.put("hit_app_id", Long.valueOf(j2));
            if (str == null) {
                str = "http://www.google-analytics.com/collect";
            }
            if (str.length() == 0) {
                C0550ae.m106W("Empty path: not sending hit");
                return;
            }
            contentValues.put("hit_url", str);
            try {
                al.insert("hits2", (String) null, contentValues);
                this.f217zc.mo10413B(false);
            } catch (SQLiteException e2) {
                C0550ae.m106W("Error storing hit");
            }
        }
    }

    /* renamed from: a */
    private void m114a(Map<String, String> map, Collection<C1627ha> collection) {
        String substring = "&_v".substring(1);
        if (collection != null) {
            for (C1627ha next : collection) {
                if ("appendVersion".equals(next.getId())) {
                    map.put(substring, next.getValue());
                    return;
                }
            }
        }
    }

    /* renamed from: al */
    private SQLiteDatabase m115al(String str) {
        try {
            return this.f208BT.getWritableDatabase();
        } catch (SQLiteException e) {
            C0550ae.m106W(str);
            return null;
        }
    }

    /* renamed from: fh */
    private void m118fh() {
        int fj = (mo10365fj() - this.f213BY) + 1;
        if (fj > 0) {
            List<String> G = mo10357G(fj);
            C0550ae.m105V("Store full, deleting " + G.size() + " hits to make room.");
            mo10361b((String[]) G.toArray(new String[0]));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo10357G(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 > 0) goto L_0x000d
            java.lang.String r15 = "Invalid maxHits specified. Skipping"
            com.google.android.gms.analytics.C0550ae.m106W(r15)
            return r0
        L_0x000d:
            java.lang.String r1 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r2 = r14.m115al(r1)
            if (r2 != 0) goto L_0x0016
            return r0
        L_0x0016:
            r1 = 0
            java.lang.String r3 = "hits2"
            java.lang.String r4 = "hit_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0060 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x0060 }
            java.lang.String r11 = "hit_id"
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
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            r2.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x005e }
            r2.append(r15)     // Catch:{ all -> 0x005e }
            java.lang.String r15 = r2.toString()     // Catch:{ all -> 0x005e }
            com.google.android.gms.analytics.C0550ae.m106W(r15)     // Catch:{ all -> 0x005e }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0552ag.mo10357G(int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110 A[Catch:{ all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128 A[EDGE_INSN: B:76:0x0128->B:49:0x0128 ?: BREAK  , SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.analytics.C0547ab> mo10358H(int r17) {
        /*
            r16 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "Error opening database for peekHits"
            r3 = r16
            android.database.sqlite.SQLiteDatabase r2 = r3.m115al(r2)
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r12 = 0
            java.lang.String r4 = "hits2"
            java.lang.String r3 = "hit_id"
            java.lang.String r5 = "hit_time"
            java.lang.String[] r5 = new java.lang.String[]{r3, r5}     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "%s ASC"
            r13 = 1
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            java.lang.String r11 = "hit_id"
            r14 = 0
            r10[r14] = r11     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            java.lang.String r10 = java.lang.String.format(r3, r10)     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            java.lang.String r11 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            r3 = r2
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x013c, all -> 0x0138 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0136 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0136 }
            boolean r1 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0134 }
            if (r1 == 0) goto L_0x005b
        L_0x0041:
            com.google.android.gms.analytics.ab r1 = new com.google.android.gms.analytics.ab     // Catch:{ SQLiteException -> 0x0134 }
            r4 = 0
            long r5 = r15.getLong(r14)     // Catch:{ SQLiteException -> 0x0134 }
            long r7 = r15.getLong(r13)     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String r9 = ""
            r3 = r1
            r3.<init>(r4, r5, r7, r9)     // Catch:{ SQLiteException -> 0x0134 }
            r12.add(r1)     // Catch:{ SQLiteException -> 0x0134 }
            boolean r1 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x0134 }
            if (r1 != 0) goto L_0x0041
        L_0x005b:
            if (r15 == 0) goto L_0x0060
            r15.close()
        L_0x0060:
            java.lang.String r4 = "hits2"
            java.lang.String r1 = "hit_id"
            java.lang.String r3 = "hit_string"
            java.lang.String r5 = "hit_url"
            java.lang.String[] r5 = new java.lang.String[]{r1, r3, r5}     // Catch:{ SQLiteException -> 0x00e7 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = "%s ASC"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r10 = "hit_id"
            r3[r14] = r10     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r10 = java.lang.String.format(r1, r3)     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r11 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x00e7 }
            r3 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00e7 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            if (r2 == 0) goto L_0x00d8
            r2 = r14
        L_0x008c:
            r3 = r1
            android.database.sqlite.SQLiteCursor r3 = (android.database.sqlite.SQLiteCursor) r3     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            android.database.CursorWindow r3 = r3.getWindow()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            int r3 = r3.getNumRows()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            if (r3 <= 0) goto L_0x00b5
            java.lang.Object r3 = r12.get(r2)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.analytics.ab r3 = (com.google.android.gms.analytics.C0547ab) r3     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.String r4 = r1.getString(r13)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            r3.mo10347aj(r4)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.Object r3 = r12.get(r2)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.analytics.ab r3 = (com.google.android.gms.analytics.C0547ab) r3     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            r3.mo10348ak(r4)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            goto L_0x00d0
        L_0x00b5:
            java.lang.String r3 = "HitString for hitId %d too large.  Hit will be deleted."
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.Object r5 = r12.get(r2)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.analytics.ab r5 = (com.google.android.gms.analytics.C0547ab) r5     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            long r5 = r5.mo10350fb()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            com.google.android.gms.analytics.C0550ae.m106W(r3)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
        L_0x00d0:
            int r2 = r2 + 1
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00de }
            if (r3 != 0) goto L_0x008c
        L_0x00d8:
            if (r1 == 0) goto L_0x00dd
            r1.close()
        L_0x00dd:
            return r12
        L_0x00de:
            r0 = move-exception
            r15 = r1
            goto L_0x00e5
        L_0x00e1:
            r0 = move-exception
            r15 = r1
            goto L_0x00e8
        L_0x00e4:
            r0 = move-exception
        L_0x00e5:
            r1 = r0
            goto L_0x012e
        L_0x00e7:
            r0 = move-exception
        L_0x00e8:
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r2.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = "Error in peekHits fetching hitString: "
            r2.append(r3)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00e4 }
            r2.append(r1)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.analytics.C0550ae.m106W(r1)     // Catch:{ all -> 0x00e4 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x010a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0128
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.analytics.ab r3 = (com.google.android.gms.analytics.C0547ab) r3     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = r3.mo10349fa()     // Catch:{ all -> 0x00e4 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0124
            if (r14 == 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r14 = r13
        L_0x0124:
            r1.add(r3)     // Catch:{ all -> 0x00e4 }
            goto L_0x010a
        L_0x0128:
            if (r15 == 0) goto L_0x012d
            r15.close()
        L_0x012d:
            return r1
        L_0x012e:
            if (r15 == 0) goto L_0x0133
            r15.close()
        L_0x0133:
            throw r1
        L_0x0134:
            r0 = move-exception
            goto L_0x013f
        L_0x0136:
            r0 = move-exception
            goto L_0x013e
        L_0x0138:
            r0 = move-exception
            r1 = r0
            r15 = r12
            goto L_0x0160
        L_0x013c:
            r0 = move-exception
            r15 = r12
        L_0x013e:
            r12 = r1
        L_0x013f:
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r2.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            r2.append(r3)     // Catch:{ all -> 0x015e }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x015e }
            r2.append(r1)     // Catch:{ all -> 0x015e }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x015e }
            com.google.android.gms.analytics.C0550ae.m106W(r1)     // Catch:{ all -> 0x015e }
            if (r15 == 0) goto L_0x015d
            r15.close()
        L_0x015d:
            return r12
        L_0x015e:
            r0 = move-exception
            r1 = r0
        L_0x0160:
            if (r15 == 0) goto L_0x0165
            r15.close()
        L_0x0165:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0552ag.mo10358H(int):java.util.List");
    }

    /* renamed from: a */
    public void mo10359a(Map<String, String> map, long j, String str, Collection<C1627ha> collection) {
        mo10364fi();
        m118fh();
        m114a(map, collection);
        m113a(map, j, str);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public void mo10360b(Collection<C0547ab> collection) {
        if (collection == null || collection.isEmpty()) {
            C0550ae.m106W("Empty/Null collection passed to deleteHits.");
            return;
        }
        String[] strArr = new String[collection.size()];
        int i = 0;
        for (C0547ab fb : collection) {
            strArr[i] = String.valueOf(fb.mo10350fb());
            i++;
        }
        mo10361b(strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10361b(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            C0550ae.m106W("Empty hitIds passed to deleteHits.");
            return;
        }
        SQLiteDatabase al = m115al("Error opening database for deleteHits.");
        if (al != null) {
            boolean z = true;
            try {
                al.delete("hits2", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                C0568e eVar = this.f217zc;
                if (mo10365fj() != 0) {
                    z = false;
                }
                eVar.mo10413B(z);
            } catch (SQLiteException e) {
                C0550ae.m106W("Error deleting hits " + TextUtils.join(",", strArr));
            }
        }
    }

    /* renamed from: dV */
    public C0584r mo10362dV() {
        return this.f209BU;
    }

    public void dispatch() {
        C0550ae.m105V("Dispatch running...");
        if (this.f209BU.mo10458ea()) {
            List<C0547ab> H = mo10358H(20);
            boolean z = true;
            if (H.isEmpty()) {
                C0550ae.m105V("...nothing to dispatch");
                this.f217zc.mo10413B(true);
                return;
            }
            if (this.f211BW == null) {
                this.f211BW = new C0551af("_t=dispatch&_v=ma4.0.4", false);
            }
            if (mo10365fj() > H.size()) {
                z = false;
            }
            int a = this.f209BU.mo10454a(H, this.f211BW, z);
            C0550ae.m105V("sent " + a + " of " + H.size() + " hits");
            mo10360b((Collection<C0547ab>) H.subList(0, Math.min(a, H.size())));
            if (a != H.size() || mo10365fj() <= 0) {
                this.f211BW = null;
            } else {
                GoogleAnalytics.getInstance(this.mContext).dispatchLocalHits();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fi */
    public int mo10364fi() {
        long currentTimeMillis = this.f214wb.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis <= this.f212BX + 86400000) {
            return 0;
        }
        this.f212BX = currentTimeMillis;
        SQLiteDatabase al = m115al("Error opening database for deleteStaleHits.");
        if (al == null) {
            return 0;
        }
        int delete = al.delete("hits2", "HIT_TIME < ?", new String[]{Long.toString(this.f214wb.currentTimeMillis() - 2592000000L)});
        C0568e eVar = this.f217zc;
        if (mo10365fj() == 0) {
            z = true;
        }
        eVar.mo10413B(z);
        return delete;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0038  */
    /* renamed from: fj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo10365fj() {
        /*
            r4 = this;
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r0 = r4.m115al(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = 0
            java.lang.String r3 = "SELECT COUNT(*) from hits2"
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
            java.lang.String r0 = "Error getting numStoredHits"
            com.google.android.gms.analytics.C0550ae.m106W(r0)     // Catch:{ all -> 0x0028 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0552ag.mo10365fj():int");
    }

    /* renamed from: l */
    public void mo10366l(long j) {
        SQLiteDatabase al = m115al("Error opening database for clearHits");
        if (al != null) {
            boolean z = false;
            if (j == 0) {
                al.delete("hits2", (String) null, (String[]) null);
            } else {
                al.delete("hits2", "hit_app_id = ?", new String[]{Long.valueOf(j).toString()});
            }
            C0568e eVar = this.f217zc;
            if (mo10365fj() == 0) {
                z = true;
            }
            eVar.mo10413B(z);
        }
    }

    public void setDryRun(boolean z) {
        this.f216yt = z;
        if (this.f209BU != null) {
            this.f209BU.setDryRun(z);
        }
    }
}
