package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

@C1507ey
/* renamed from: com.google.android.gms.internal.eh */
public class C1476eh {

    /* renamed from: mH */
    private static final Object f3027mH = new Object();
    /* access modifiers changed from: private */

    /* renamed from: sZ */
    public static final String f3028sZ = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});

    /* renamed from: tb */
    private static C1476eh f3029tb;

    /* renamed from: ta */
    private final C1477a f3030ta;

    /* renamed from: com.google.android.gms.internal.eh$a */
    public class C1477a extends SQLiteOpenHelper {
        public C1477a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C1476eh.f3028sZ);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C1607gr.m4707U("Database updated from version " + i + " to version " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sQLiteDatabase);
        }
    }

    private C1476eh(Context context) {
        this.f3030ta = new C1477a(context, "google_inapp_purchase.db");
    }

    /* renamed from: j */
    public static C1476eh m4369j(Context context) {
        C1476eh ehVar;
        synchronized (f3027mH) {
            if (f3029tb == null) {
                f3029tb = new C1476eh(context);
            }
            ehVar = f3029tb;
        }
        return ehVar;
    }

    /* renamed from: a */
    public C1474ef mo15219a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C1474ef(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    /* renamed from: a */
    public void mo15220a(C1474ef efVar) {
        if (efVar != null) {
            synchronized (f3027mH) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.delete("InAppPurchase", String.format("%s = %d", new Object[]{"purchase_id", Long.valueOf(efVar.f3018sT)}), (String[]) null);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15221b(com.google.android.gms.internal.C1474ef r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = f3027mH
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.getWritableDatabase()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x000e:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0047 }
            r2.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "product_id"
            java.lang.String r4 = r7.f3020sV     // Catch:{ all -> 0x0047 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "developer_payload"
            java.lang.String r4 = r7.f3019sU     // Catch:{ all -> 0x0047 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "record_time"
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0047 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0047 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "InAppPurchase"
            r4 = 0
            long r1 = r1.insert(r3, r4, r2)     // Catch:{ all -> 0x0047 }
            r7.f3018sT = r1     // Catch:{ all -> 0x0047 }
            int r7 = r6.getRecordCount()     // Catch:{ all -> 0x0047 }
            long r1 = (long) r7     // Catch:{ all -> 0x0047 }
            r3 = 20000(0x4e20, double:9.8813E-320)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            r6.mo15222cA()     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1476eh.mo15221b(com.google.android.gms.internal.ef):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054 A[SYNTHETIC, Splitter:B:27:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* renamed from: cA */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15222cA() {
        /*
            r11 = this;
            java.lang.Object r0 = f3027mH
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r11.getWritableDatabase()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x000b:
            r10 = 0
            java.lang.String r8 = "record_time ASC"
            java.lang.String r2 = "InAppPurchase"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0039 }
            if (r1 == 0) goto L_0x0031
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ef r2 = r11.mo15219a((android.database.Cursor) r1)     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            r11.mo15220a((com.google.android.gms.internal.C1474ef) r2)     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            goto L_0x0031
        L_0x002b:
            r2 = move-exception
            r10 = r1
            goto L_0x0059
        L_0x002e:
            r2 = move-exception
            r10 = r1
            goto L_0x003a
        L_0x0031:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x005f }
            goto L_0x0057
        L_0x0037:
            r2 = move-exception
            goto L_0x0059
        L_0x0039:
            r2 = move-exception
        L_0x003a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "Error remove oldest record"
            r1.append(r3)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0037 }
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0057
            r10.close()     // Catch:{ all -> 0x005f }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x0059:
            if (r10 == 0) goto L_0x005e
            r10.close()     // Catch:{ all -> 0x005f }
        L_0x005e:
            throw r2     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1476eh.mo15222cA():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066 A[SYNTHETIC, Splitter:B:31:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.internal.C1474ef> mo15223d(long r13) {
        /*
            r12 = this;
            java.lang.Object r0 = f3027mH
            monitor-enter(r0)
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return r1
        L_0x0010:
            android.database.sqlite.SQLiteDatabase r2 = r12.getWritableDatabase()     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return r1
        L_0x0018:
            r11 = 0
            java.lang.String r9 = "record_time ASC"
            java.lang.String r3 = "InAppPurchase"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r10 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x004b }
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x004b }
            boolean r14 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0046, all -> 0x0043 }
            if (r14 == 0) goto L_0x003d
        L_0x0030:
            com.google.android.gms.internal.ef r14 = r12.mo15219a((android.database.Cursor) r13)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0043 }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0043 }
            boolean r14 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0046, all -> 0x0043 }
            if (r14 != 0) goto L_0x0030
        L_0x003d:
            if (r13 == 0) goto L_0x0069
            r13.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0069
        L_0x0043:
            r14 = move-exception
            r11 = r13
            goto L_0x006b
        L_0x0046:
            r14 = move-exception
            r11 = r13
            goto L_0x004c
        L_0x0049:
            r14 = move-exception
            goto L_0x006b
        L_0x004b:
            r14 = move-exception
        L_0x004c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r13.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "Error extracing purchase info: "
            r13.append(r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0049 }
            r13.append(r14)     // Catch:{ all -> 0x0049 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.internal.C1607gr.m4709W(r13)     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0069
            r11.close()     // Catch:{ all -> 0x0071 }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return r1
        L_0x006b:
            if (r11 == 0) goto L_0x0070
            r11.close()     // Catch:{ all -> 0x0071 }
        L_0x0070:
            throw r14     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1476eh.mo15223d(long):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC, Splitter:B:30:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getRecordCount() {
        /*
            r7 = this;
            java.lang.Object r0 = f3027mH
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch:{ all -> 0x005a }
            r2 = 0
            if (r1 != 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x000c:
            r3 = 0
            java.lang.String r4 = "select count(*) from InAppPurchase"
            android.database.Cursor r1 = r1.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x0034 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002d, all -> 0x002a }
            if (r3 == 0) goto L_0x0024
            int r3 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x002d, all -> 0x002a }
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ all -> 0x005a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r3
        L_0x0024:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ all -> 0x005a }
            goto L_0x0052
        L_0x002a:
            r2 = move-exception
            r3 = r1
            goto L_0x0054
        L_0x002d:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x0035
        L_0x0032:
            r2 = move-exception
            goto L_0x0054
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = "Error getting record count"
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0032 }
            r4.append(r1)     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ all -> 0x005a }
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0054:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ all -> 0x005a }
        L_0x0059:
            throw r2     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1476eh.getRecordCount():int");
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return this.f3030ta.getWritableDatabase();
        } catch (SQLiteException e) {
            C1607gr.m4709W("Error opening writable conversion tracking database");
            return null;
        }
    }
}
