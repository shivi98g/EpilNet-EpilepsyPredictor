package com.google.android.gms.appstate;

import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.appstate.a */
public final class C0626a implements AppState {

    /* renamed from: DK */
    private final int f435DK;

    /* renamed from: DL */
    private final String f436DL;

    /* renamed from: DM */
    private final byte[] f437DM;

    /* renamed from: DN */
    private final boolean f438DN;

    /* renamed from: DO */
    private final String f439DO;

    /* renamed from: DP */
    private final byte[] f440DP;

    public C0626a(AppState appState) {
        this.f435DK = appState.getKey();
        this.f436DL = appState.getLocalVersion();
        this.f437DM = appState.getLocalData();
        this.f438DN = appState.hasConflict();
        this.f439DO = appState.getConflictVersion();
        this.f440DP = appState.getConflictData();
    }

    /* renamed from: a */
    static int m364a(AppState appState) {
        return C1781jv.hashCode(Integer.valueOf(appState.getKey()), appState.getLocalVersion(), appState.getLocalData(), Boolean.valueOf(appState.hasConflict()), appState.getConflictVersion(), appState.getConflictData());
    }

    /* renamed from: a */
    static boolean m365a(AppState appState, Object obj) {
        if (!(obj instanceof AppState)) {
            return false;
        }
        if (appState == obj) {
            return true;
        }
        AppState appState2 = (AppState) obj;
        return C1781jv.equal(Integer.valueOf(appState2.getKey()), Integer.valueOf(appState.getKey())) && C1781jv.equal(appState2.getLocalVersion(), appState.getLocalVersion()) && C1781jv.equal(appState2.getLocalData(), appState.getLocalData()) && C1781jv.equal(Boolean.valueOf(appState2.hasConflict()), Boolean.valueOf(appState.hasConflict())) && C1781jv.equal(appState2.getConflictVersion(), appState.getConflictVersion()) && C1781jv.equal(appState2.getConflictData(), appState.getConflictData());
    }

    /* renamed from: b */
    static String m366b(AppState appState) {
        return C1781jv.m5348h(appState).mo15935a("Key", Integer.valueOf(appState.getKey())).mo15935a("LocalVersion", appState.getLocalVersion()).mo15935a("LocalData", appState.getLocalData()).mo15935a("HasConflict", Boolean.valueOf(appState.hasConflict())).mo15935a("ConflictVersion", appState.getConflictVersion()).mo15935a("ConflictData", appState.getConflictData()).toString();
    }

    public boolean equals(Object obj) {
        return m365a(this, obj);
    }

    /* renamed from: fJ */
    public AppState freeze() {
        return this;
    }

    public byte[] getConflictData() {
        return this.f440DP;
    }

    public String getConflictVersion() {
        return this.f439DO;
    }

    public int getKey() {
        return this.f435DK;
    }

    public byte[] getLocalData() {
        return this.f437DM;
    }

    public String getLocalVersion() {
        return this.f436DL;
    }

    public boolean hasConflict() {
        return this.f438DN;
    }

    public int hashCode() {
        return m364a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m366b(this);
    }
}
