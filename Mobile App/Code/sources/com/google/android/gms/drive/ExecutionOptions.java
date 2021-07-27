package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.C0824r;
import com.google.android.gms.internal.C1781jv;

public final class ExecutionOptions {
    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;

    /* renamed from: OA */
    private final int f856OA;

    /* renamed from: Oy */
    private final String f857Oy;

    /* renamed from: Oz */
    private final boolean f858Oz;

    public static final class Builder {

        /* renamed from: OA */
        private int f859OA = 0;

        /* renamed from: Oy */
        private String f860Oy;

        /* renamed from: Oz */
        private boolean f861Oz;

        public ExecutionOptions build() {
            if (this.f859OA != 1 || this.f861Oz) {
                return new ExecutionOptions(this.f860Oy, this.f861Oz, this.f859OA);
            }
            throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
        }

        public Builder setConflictStrategy(int i) {
            if (!ExecutionOptions.m799bb(i)) {
                throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + i);
            }
            this.f859OA = i;
            return this;
        }

        public Builder setNotifyOnCompletion(boolean z) {
            this.f861Oz = z;
            return this;
        }

        public Builder setTrackingTag(String str) {
            if (!ExecutionOptions.m800bj(str)) {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[]{65536}));
            }
            this.f860Oy = str;
            return this;
        }
    }

    public ExecutionOptions(String str, boolean z, int i) {
        this.f857Oy = str;
        this.f858Oz = z;
        this.f856OA = i;
    }

    /* renamed from: a */
    public static void m797a(GoogleApiClient googleApiClient, ExecutionOptions executionOptions) {
        C0824r rVar = (C0824r) googleApiClient.mo10937a(Drive.f842DQ);
        if (executionOptions.mo11234iw() && !rVar.mo11720iJ()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    /* renamed from: ba */
    public static boolean m798ba(int i) {
        return i == 1;
    }

    /* renamed from: bb */
    public static boolean m799bb(int i) {
        switch (i) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: bj */
    public static boolean m800bj(String str) {
        return str != null && !str.isEmpty() && str.length() <= 65536;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ExecutionOptions executionOptions = (ExecutionOptions) obj;
        return C1781jv.equal(this.f857Oy, executionOptions.f857Oy) && this.f856OA == executionOptions.f856OA && this.f858Oz == executionOptions.f858Oz;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f857Oy, Integer.valueOf(this.f856OA), Boolean.valueOf(this.f858Oz));
    }

    /* renamed from: iv */
    public String mo11233iv() {
        return this.f857Oy;
    }

    /* renamed from: iw */
    public boolean mo11234iw() {
        return this.f858Oz;
    }

    /* renamed from: ix */
    public int mo11235ix() {
        return this.f856OA;
    }
}
