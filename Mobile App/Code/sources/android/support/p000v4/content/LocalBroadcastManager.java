package android.support.p000v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.content.LocalBroadcastManager */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap<>();

    /* renamed from: android.support.v4.content.LocalBroadcastManager$ReceiverRecord */
    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter _filter, BroadcastReceiver _receiver) {
            this.filter = _filter;
            this.receiver = _receiver;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder(128);
            builder.append("Receiver{");
            builder.append(this.receiver);
            builder.append(" filter=");
            builder.append(this.filter);
            if (this.dead) {
                builder.append(" DEAD");
            }
            builder.append("}");
            return builder.toString();
        }
    }

    /* renamed from: android.support.v4.content.LocalBroadcastManager$BroadcastRecord */
    private static final class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent _intent, ArrayList<ReceiverRecord> _receivers) {
            this.intent = _intent;
            this.receivers = _receivers;
        }
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message msg) {
                if (msg.what != 1) {
                    super.handleMessage(msg);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public void registerReceiver(@NonNull BroadcastReceiver receiver, @NonNull IntentFilter filter) {
        synchronized (this.mReceivers) {
            ReceiverRecord entry = new ReceiverRecord(filter, receiver);
            ArrayList<ReceiverRecord> filters = this.mReceivers.get(receiver);
            if (filters == null) {
                filters = new ArrayList<>(1);
                this.mReceivers.put(receiver, filters);
            }
            filters.add(entry);
            for (int i = 0; i < filter.countActions(); i++) {
                String action = filter.getAction(i);
                ArrayList<ReceiverRecord> entries = this.mActions.get(action);
                if (entries == null) {
                    entries = new ArrayList<>(1);
                    this.mActions.put(action, entries);
                }
                entries.add(entry);
            }
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver receiver) {
        synchronized (this.mReceivers) {
            ArrayList<ReceiverRecord> filters = this.mReceivers.remove(receiver);
            if (filters != null) {
                for (int i = filters.size() - 1; i >= 0; i--) {
                    ReceiverRecord filter = filters.get(i);
                    filter.dead = true;
                    for (int j = 0; j < filter.filter.countActions(); j++) {
                        String action = filter.filter.getAction(j);
                        ArrayList<ReceiverRecord> receivers = this.mActions.get(action);
                        if (receivers != null) {
                            for (int k = receivers.size() - 1; k >= 0; k--) {
                                ReceiverRecord rec = receivers.get(k);
                                if (rec.receiver == receiver) {
                                    rec.dead = true;
                                    receivers.remove(k);
                                }
                            }
                            if (receivers.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0169, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendBroadcast(@android.support.annotation.NonNull android.content.Intent r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>> r3 = r1.mReceivers
            monitor-enter(r3)
            java.lang.String r5 = r20.getAction()     // Catch:{ all -> 0x016e }
            android.content.Context r4 = r1.mAppContext     // Catch:{ all -> 0x016e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r2.resolveTypeIfNeeded(r4)     // Catch:{ all -> 0x016e }
            r11 = r4
            android.net.Uri r8 = r20.getData()     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r20.getScheme()     // Catch:{ all -> 0x016e }
            r12 = r4
            java.util.Set r9 = r20.getCategories()     // Catch:{ all -> 0x016e }
            int r4 = r20.getFlags()     // Catch:{ all -> 0x016e }
            r4 = r4 & 8
            if (r4 == 0) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            r15 = r4
            if (r15 == 0) goto L_0x0058
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r6.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "Resolving type "
            r6.append(r7)     // Catch:{ all -> 0x016e }
            r6.append(r11)     // Catch:{ all -> 0x016e }
            java.lang.String r7 = " scheme "
            r6.append(r7)     // Catch:{ all -> 0x016e }
            r6.append(r12)     // Catch:{ all -> 0x016e }
            java.lang.String r7 = " of intent "
            r6.append(r7)     // Catch:{ all -> 0x016e }
            r6.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x016e }
        L_0x0058:
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>> r4 = r1.mActions     // Catch:{ all -> 0x016e }
            java.lang.String r6 = r20.getAction()     // Catch:{ all -> 0x016e }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x016e }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x016e }
            r10 = r4
            if (r10 == 0) goto L_0x016b
            if (r15 == 0) goto L_0x007f
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r6.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "Action list: "
            r6.append(r7)     // Catch:{ all -> 0x016e }
            r6.append(r10)     // Catch:{ all -> 0x016e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x016e }
        L_0x007f:
            r4 = 0
            r7 = r4
            r4 = 0
        L_0x0082:
            r6 = r4
            int r4 = r10.size()     // Catch:{ all -> 0x016e }
            if (r6 >= r4) goto L_0x0136
            java.lang.Object r4 = r10.get(r6)     // Catch:{ all -> 0x016e }
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r4 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r4     // Catch:{ all -> 0x016e }
            if (r15 == 0) goto L_0x00ac
            java.lang.String r13 = "LocalBroadcastManager"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r14.<init>()     // Catch:{ all -> 0x016e }
            r16 = r6
            java.lang.String r6 = "Matching against filter "
            r14.append(r6)     // Catch:{ all -> 0x016e }
            android.content.IntentFilter r6 = r4.filter     // Catch:{ all -> 0x016e }
            r14.append(r6)     // Catch:{ all -> 0x016e }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.v(r13, r6)     // Catch:{ all -> 0x016e }
            goto L_0x00ae
        L_0x00ac:
            r16 = r6
        L_0x00ae:
            boolean r6 = r4.broadcasting     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x00c2
            if (r15 == 0) goto L_0x00bb
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.String r13 = "  Filter's target already added"
            android.util.Log.v(r6, r13)     // Catch:{ all -> 0x016e }
        L_0x00bb:
            r18 = r10
            r17 = r11
            r11 = r7
            goto L_0x012d
        L_0x00c2:
            android.content.IntentFilter r6 = r4.filter     // Catch:{ all -> 0x016e }
            java.lang.String r13 = "LocalBroadcastManager"
            r14 = r4
            r4 = r6
            r6 = r11
            r17 = r11
            r11 = r7
            r7 = r12
            r18 = r10
            r10 = r13
            int r4 = r4.match(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x016e }
            if (r4 < 0) goto L_0x0103
            if (r15 == 0) goto L_0x00f2
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r7.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r10 = "  Filter matched!  match=0x"
            r7.append(r10)     // Catch:{ all -> 0x016e }
            java.lang.String r10 = java.lang.Integer.toHexString(r4)     // Catch:{ all -> 0x016e }
            r7.append(r10)     // Catch:{ all -> 0x016e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.v(r6, r7)     // Catch:{ all -> 0x016e }
        L_0x00f2:
            if (r11 != 0) goto L_0x00fb
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x016e }
            r6.<init>()     // Catch:{ all -> 0x016e }
            r7 = r6
            goto L_0x00fc
        L_0x00fb:
            r7 = r11
        L_0x00fc:
            r7.add(r14)     // Catch:{ all -> 0x016e }
            r6 = 1
            r14.broadcasting = r6     // Catch:{ all -> 0x016e }
            goto L_0x012e
        L_0x0103:
            if (r15 == 0) goto L_0x012d
            switch(r4) {
                case -4: goto L_0x0114;
                case -3: goto L_0x0111;
                case -2: goto L_0x010e;
                case -1: goto L_0x010b;
                default: goto L_0x0108;
            }     // Catch:{ all -> 0x016e }
        L_0x0108:
            java.lang.String r6 = "unknown reason"
            goto L_0x0116
        L_0x010b:
            java.lang.String r6 = "type"
            goto L_0x0116
        L_0x010e:
            java.lang.String r6 = "data"
            goto L_0x0116
        L_0x0111:
            java.lang.String r6 = "action"
            goto L_0x0116
        L_0x0114:
            java.lang.String r6 = "category"
        L_0x0116:
            java.lang.String r7 = "LocalBroadcastManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r10.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r13 = "  Filter did not match: "
            r10.append(r13)     // Catch:{ all -> 0x016e }
            r10.append(r6)     // Catch:{ all -> 0x016e }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.v(r7, r10)     // Catch:{ all -> 0x016e }
        L_0x012d:
            r7 = r11
        L_0x012e:
            int r4 = r16 + 1
            r11 = r17
            r10 = r18
            goto L_0x0082
        L_0x0136:
            r18 = r10
            r17 = r11
            r11 = r7
            if (r11 == 0) goto L_0x016b
            r4 = 0
        L_0x013e:
            int r6 = r11.size()     // Catch:{ all -> 0x016e }
            if (r4 >= r6) goto L_0x0150
            java.lang.Object r6 = r11.get(r4)     // Catch:{ all -> 0x016e }
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r6 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r6     // Catch:{ all -> 0x016e }
            r7 = 0
            r6.broadcasting = r7     // Catch:{ all -> 0x016e }
            int r4 = r4 + 1
            goto L_0x013e
        L_0x0150:
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r4 = r1.mPendingBroadcasts     // Catch:{ all -> 0x016e }
            android.support.v4.content.LocalBroadcastManager$BroadcastRecord r6 = new android.support.v4.content.LocalBroadcastManager$BroadcastRecord     // Catch:{ all -> 0x016e }
            r6.<init>(r2, r11)     // Catch:{ all -> 0x016e }
            r4.add(r6)     // Catch:{ all -> 0x016e }
            android.os.Handler r4 = r1.mHandler     // Catch:{ all -> 0x016e }
            r6 = 1
            boolean r4 = r4.hasMessages(r6)     // Catch:{ all -> 0x016e }
            if (r4 != 0) goto L_0x0168
            android.os.Handler r4 = r1.mHandler     // Catch:{ all -> 0x016e }
            r4.sendEmptyMessage(r6)     // Catch:{ all -> 0x016e }
        L_0x0168:
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            r3 = 1
            return r3
        L_0x016b:
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            r3 = 0
            return r3
        L_0x016e:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.LocalBroadcastManager.sendBroadcast(android.content.Intent):boolean");
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r2 >= r0.length) goto L_0x0001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r3 = r0[r2];
        r4 = r3.receivers.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r5 >= r4) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r6 = r3.receivers.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r6.dead != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r6.receiver.onReceive(r10.mAppContext, r3.intent);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executePendingBroadcasts() {
        /*
            r10 = this;
            r0 = 0
        L_0x0001:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>> r1 = r10.mReceivers
            monitor-enter(r1)
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r2 = r10.mPendingBroadcasts     // Catch:{ all -> 0x0048 }
            int r2 = r2.size()     // Catch:{ all -> 0x0048 }
            if (r2 > 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            return
        L_0x000e:
            android.support.v4.content.LocalBroadcastManager$BroadcastRecord[] r3 = new android.support.p000v4.content.LocalBroadcastManager.BroadcastRecord[r2]     // Catch:{ all -> 0x0048 }
            r0 = r3
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch:{ all -> 0x0048 }
            r3.toArray(r0)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r3 = r10.mPendingBroadcasts     // Catch:{ all -> 0x0048 }
            r3.clear()     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r1 = 0
            r2 = r1
        L_0x001e:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0047
            r3 = r0[r2]
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord> r4 = r3.receivers
            int r4 = r4.size()
            r5 = r1
        L_0x002a:
            if (r5 >= r4) goto L_0x0044
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord> r6 = r3.receivers
            java.lang.Object r6 = r6.get(r5)
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r6 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r6
            boolean r7 = r6.dead
            if (r7 != 0) goto L_0x0041
            android.content.BroadcastReceiver r7 = r6.receiver
            android.content.Context r8 = r10.mAppContext
            android.content.Intent r9 = r3.intent
            r7.onReceive(r8, r9)
        L_0x0041:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0047:
            goto L_0x0001
        L_0x0048:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.LocalBroadcastManager.executePendingBroadcasts():void");
    }
}
