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
import com.google.android.gms.tagmanager.C2581db;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.google.android.gms.tagmanager.cb */
class C2526cb implements C2485at {
    /* access modifiers changed from: private */

    /* renamed from: BS */
    public static final String f4431BS = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"});
    /* access modifiers changed from: private */

    /* renamed from: BV */
    public final String f4432BV;

    /* renamed from: BX */
    private long f4433BX;

    /* renamed from: BY */
    private final int f4434BY;
    private final C2528b asf;
    private volatile C2466ab asg;
    private final C2486au ash;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: wb */
    public C1832ld f4435wb;

    /* renamed from: com.google.android.gms.tagmanager.cb$a */
    class C2527a implements C2581db.C2582a {
        C2527a() {
        }

        /* renamed from: a */
        public void mo18718a(C2480ap apVar) {
            C2526cb.this.m7313y(apVar.mo18651fb());
        }

        /* renamed from: b */
        public void mo18719b(C2480ap apVar) {
            C2526cb.this.m7313y(apVar.mo18651fb());
            C2504bh.m7245V("Permanent failure dispatching hitId: " + apVar.mo18651fb());
        }

        /* renamed from: c */
        public void mo18720c(C2480ap apVar) {
            long pK = apVar.mo18652pK();
            if (pK == 0) {
                C2526cb.this.m7309c(apVar.mo18651fb(), C2526cb.this.f4435wb.currentTimeMillis());
            } else if (pK + 14400000 < C2526cb.this.f4435wb.currentTimeMillis()) {
                C2526cb.this.m7313y(apVar.mo18651fb());
                C2504bh.m7245V("Giving up on failed hitId: " + apVar.mo18651fb());
            }
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cb$b */
    class C2528b extends SQLiteOpenHelper {

        /* renamed from: BZ */
        private boolean f4436BZ;

        /* renamed from: Ca */
        private long f4437Ca = 0;

        C2528b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m7324a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", (String[]) null);
            HashSet hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (String add : columnNames) {
                    hashSet.add(add);
                }
                rawQuery.close();
                if (!hashSet.remove("hit_id") || !hashSet.remove("hit_url") || !hashSet.remove("hit_time") || !hashSet.remove("hit_first_send_time")) {
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
        private boolean m7325a(java.lang.String r11, android.database.sqlite.SQLiteDatabase r12) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2526cb.C2528b.m7325a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
        }

        public SQLiteDatabase getWritableDatabase() {
            if (!this.f4436BZ || this.f4437Ca + 3600000 <= C2526cb.this.f4435wb.currentTimeMillis()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.f4436BZ = true;
                this.f4437Ca = C2526cb.this.f4435wb.currentTimeMillis();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    C2526cb.this.mContext.getDatabasePath(C2526cb.this.f4432BV).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.f4436BZ = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
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
            if (!m7325a("gtm_hits", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(C2526cb.f4431BS);
            } else {
                m7324a(sQLiteDatabase);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    C2526cb(C2486au auVar, Context context) {
        this(auVar, context, "gtm_urls.db", 2000);
    }

    C2526cb(C2486au auVar, Context context, String str, int i) {
        this.mContext = context.getApplicationContext();
        this.f4432BV = str;
        this.ash = auVar;
        this.f4435wb = C1834lf.m5525if();
        this.asf = new C2528b(this.mContext, this.f4432BV);
        this.asg = new C2581db(new DefaultHttpClient(), this.mContext, new C2527a());
        this.f4433BX = 0;
        this.f4434BY = i;
    }

    /* renamed from: al */
    private SQLiteDatabase m7306al(String str) {
        try {
            return this.asf.getWritableDatabase();
        } catch (SQLiteException e) {
            C2504bh.m7246W(str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m7309c(long j, long j2) {
        SQLiteDatabase al = m7306al("Error opening database for getNumStoredHits.");
        if (al != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                al.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
                m7313y(j);
            }
        }
    }

    /* renamed from: fh */
    private void m7310fh() {
        int fj = (mo18716fj() - this.f4434BY) + 1;
        if (fj > 0) {
            List<String> G = mo18712G(fj);
            C2504bh.m7245V("Store full, deleting " + G.size() + " hits to make room.");
            mo18714b((String[]) G.toArray(new String[0]));
        }
    }

    /* renamed from: g */
    private void m7311g(long j, String str) {
        SQLiteDatabase al = m7306al("Error opening database for putHit");
        if (al != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            try {
                al.insert("gtm_hits", (String) null, contentValues);
                this.ash.mo18662B(false);
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error storing hit");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m7313y(long j) {
        mo18714b(new String[]{String.valueOf(j)});
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo18712G(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 > 0) goto L_0x000d
            java.lang.String r15 = "Invalid maxHits specified. Skipping"
            com.google.android.gms.tagmanager.C2504bh.m7246W(r15)
            return r0
        L_0x000d:
            java.lang.String r1 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r2 = r14.m7306al(r1)
            if (r2 != 0) goto L_0x0016
            return r0
        L_0x0016:
            r1 = 0
            java.lang.String r3 = "gtm_hits"
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2526cb.mo18712G(int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104 A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011c A[EDGE_INSN: B:75:0x011c->B:49:0x011c ?: BREAK  , SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.tagmanager.C2480ap> mo18713H(int r17) {
        /*
            r16 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "Error opening database for peekHits"
            r3 = r16
            android.database.sqlite.SQLiteDatabase r2 = r3.m7306al(r2)
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r12 = 0
            java.lang.String r4 = "gtm_hits"
            java.lang.String r3 = "hit_id"
            java.lang.String r5 = "hit_time"
            java.lang.String r6 = "hit_first_send_time"
            java.lang.String[] r5 = new java.lang.String[]{r3, r5, r6}     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "%s ASC"
            r13 = 1
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.String r11 = "hit_id"
            r14 = 0
            r10[r14] = r11     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.String r10 = java.lang.String.format(r3, r10)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.String r11 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r3 = r2
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x012a }
            r12.<init>()     // Catch:{ SQLiteException -> 0x012a }
            boolean r1 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0128 }
            if (r1 == 0) goto L_0x005f
        L_0x0043:
            com.google.android.gms.tagmanager.ap r1 = new com.google.android.gms.tagmanager.ap     // Catch:{ SQLiteException -> 0x0128 }
            long r4 = r15.getLong(r14)     // Catch:{ SQLiteException -> 0x0128 }
            long r6 = r15.getLong(r13)     // Catch:{ SQLiteException -> 0x0128 }
            r3 = 2
            long r8 = r15.getLong(r3)     // Catch:{ SQLiteException -> 0x0128 }
            r3 = r1
            r3.<init>(r4, r6, r8)     // Catch:{ SQLiteException -> 0x0128 }
            r12.add(r1)     // Catch:{ SQLiteException -> 0x0128 }
            boolean r1 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x0128 }
            if (r1 != 0) goto L_0x0043
        L_0x005f:
            if (r15 == 0) goto L_0x0064
            r15.close()
        L_0x0064:
            java.lang.String r4 = "gtm_hits"
            java.lang.String r1 = "hit_id"
            java.lang.String r3 = "hit_url"
            java.lang.String[] r5 = new java.lang.String[]{r1, r3}     // Catch:{ SQLiteException -> 0x00db }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = "%s ASC"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x00db }
            java.lang.String r10 = "hit_id"
            r3[r14] = r10     // Catch:{ SQLiteException -> 0x00db }
            java.lang.String r10 = java.lang.String.format(r1, r3)     // Catch:{ SQLiteException -> 0x00db }
            java.lang.String r11 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x00db }
            r3 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00db }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            if (r2 == 0) goto L_0x00cc
            r2 = r14
        L_0x008e:
            r3 = r1
            android.database.sqlite.SQLiteCursor r3 = (android.database.sqlite.SQLiteCursor) r3     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            android.database.CursorWindow r3 = r3.getWindow()     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            int r3 = r3.getNumRows()     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            if (r3 <= 0) goto L_0x00a9
            java.lang.Object r3 = r12.get(r2)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            com.google.android.gms.tagmanager.ap r3 = (com.google.android.gms.tagmanager.C2480ap) r3     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            java.lang.String r4 = r1.getString(r13)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            r3.mo18650ak(r4)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            goto L_0x00c4
        L_0x00a9:
            java.lang.String r3 = "HitString for hitId %d too large.  Hit will be deleted."
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            java.lang.Object r5 = r12.get(r2)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            com.google.android.gms.tagmanager.ap r5 = (com.google.android.gms.tagmanager.C2480ap) r5     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            long r5 = r5.mo18651fb()     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            com.google.android.gms.tagmanager.C2504bh.m7246W(r3)     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
        L_0x00c4:
            int r2 = r2 + 1
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00d5, all -> 0x00d2 }
            if (r3 != 0) goto L_0x008e
        L_0x00cc:
            if (r1 == 0) goto L_0x00d1
            r1.close()
        L_0x00d1:
            return r12
        L_0x00d2:
            r0 = move-exception
            r15 = r1
            goto L_0x00d9
        L_0x00d5:
            r0 = move-exception
            r15 = r1
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
        L_0x00d9:
            r1 = r0
            goto L_0x0122
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r2.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "Error in peekHits fetching hit url: "
            r2.append(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00d8 }
            r2.append(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00d8 }
            com.google.android.gms.tagmanager.C2504bh.m7246W(r1)     // Catch:{ all -> 0x00d8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00d8 }
            r1.<init>()     // Catch:{ all -> 0x00d8 }
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x00d8 }
        L_0x00fe:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d8 }
            com.google.android.gms.tagmanager.ap r3 = (com.google.android.gms.tagmanager.C2480ap) r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = r3.mo18653pL()     // Catch:{ all -> 0x00d8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x0118
            if (r14 == 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            r14 = r13
        L_0x0118:
            r1.add(r3)     // Catch:{ all -> 0x00d8 }
            goto L_0x00fe
        L_0x011c:
            if (r15 == 0) goto L_0x0121
            r15.close()
        L_0x0121:
            return r1
        L_0x0122:
            if (r15 == 0) goto L_0x0127
            r15.close()
        L_0x0127:
            throw r1
        L_0x0128:
            r0 = move-exception
            goto L_0x0133
        L_0x012a:
            r0 = move-exception
            goto L_0x0132
        L_0x012c:
            r0 = move-exception
            r1 = r0
            r15 = r12
            goto L_0x0154
        L_0x0130:
            r0 = move-exception
            r15 = r12
        L_0x0132:
            r12 = r1
        L_0x0133:
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            r2.<init>()     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            r2.append(r3)     // Catch:{ all -> 0x0152 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0152 }
            r2.append(r1)     // Catch:{ all -> 0x0152 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0152 }
            com.google.android.gms.tagmanager.C2504bh.m7246W(r1)     // Catch:{ all -> 0x0152 }
            if (r15 == 0) goto L_0x0151
            r15.close()
        L_0x0151:
            return r12
        L_0x0152:
            r0 = move-exception
            r1 = r0
        L_0x0154:
            if (r15 == 0) goto L_0x0159
            r15.close()
        L_0x0159:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2526cb.mo18713H(int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18714b(String[] strArr) {
        SQLiteDatabase al;
        if (strArr != null && strArr.length != 0 && (al = m7306al("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                al.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                C2486au auVar = this.ash;
                if (mo18716fj() != 0) {
                    z = false;
                }
                auVar.mo18662B(z);
            } catch (SQLiteException e) {
                C2504bh.m7246W("Error deleting hits");
            }
        }
    }

    public void dispatch() {
        C2504bh.m7245V("GTM Dispatch running...");
        if (this.asg.mo18637ea()) {
            List<C2480ap> H = mo18713H(40);
            if (H.isEmpty()) {
                C2504bh.m7245V("...nothing to dispatch");
                this.ash.mo18662B(true);
                return;
            }
            this.asg.mo18638k(H);
            if (mo18717pY() > 0) {
                C2573cy.m7487qN().dispatch();
            }
        }
    }

    /* renamed from: f */
    public void mo18661f(long j, String str) {
        mo18715fi();
        m7310fh();
        m7311g(j, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fi */
    public int mo18715fi() {
        long currentTimeMillis = this.f4435wb.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis <= this.f4433BX + 86400000) {
            return 0;
        }
        this.f4433BX = currentTimeMillis;
        SQLiteDatabase al = m7306al("Error opening database for deleteStaleHits.");
        if (al == null) {
            return 0;
        }
        int delete = al.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.f4435wb.currentTimeMillis() - 2592000000L)});
        C2486au auVar = this.ash;
        if (mo18716fj() == 0) {
            z = true;
        }
        auVar.mo18662B(z);
        return delete;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0038  */
    /* renamed from: fj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18716fj() {
        /*
            r4 = this;
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r0 = r4.m7306al(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = 0
            java.lang.String r3 = "SELECT COUNT(*) from gtm_hits"
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2526cb.mo18716fj():int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: pY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18717pY() {
        /*
            r10 = this;
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r1 = r10.m7306al(r0)
            r0 = 0
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            r9 = 0
            java.lang.String r2 = "gtm_hits"
            java.lang.String r3 = "hit_id"
            java.lang.String r4 = "hit_first_send_time"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0032 }
            java.lang.String r4 = "hit_first_send_time=0"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0032 }
            int r2 = r1.getCount()     // Catch:{ SQLiteException -> 0x002d, all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            r0 = r2
            return r0
        L_0x002a:
            r0 = move-exception
            r9 = r1
            goto L_0x003e
        L_0x002d:
            r2 = move-exception
            r9 = r1
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x003e
        L_0x0032:
            r1 = move-exception
        L_0x0033:
            java.lang.String r1 = "Error getting num untried hits"
            com.google.android.gms.tagmanager.C2504bh.m7246W(r1)     // Catch:{ all -> 0x0030 }
            if (r9 == 0) goto L_0x003d
            r9.close()
        L_0x003d:
            return r0
        L_0x003e:
            if (r9 == 0) goto L_0x0043
            r9.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2526cb.mo18717pY():int");
    }
}
