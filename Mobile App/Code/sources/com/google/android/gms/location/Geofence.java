package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.C2005nn;

public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {

        /* renamed from: Zt */
        private String f4280Zt = null;
        private int agd = 0;
        private long age = Long.MIN_VALUE;
        private short agf = -1;
        private double agg;
        private double agh;
        private float agi;
        private int agj = 0;
        private int agk = -1;

        public Geofence build() {
            if (this.f4280Zt == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.agd == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((this.agd & 4) != 0 && this.agk < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (this.age == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.agf == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            } else if (this.agj >= 0) {
                return new C2005nn(this.f4280Zt, this.agd, 1, this.agg, this.agh, this.agi, this.age, this.agj, this.agk);
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }

        public Builder setCircularRegion(double d, double d2, float f) {
            this.agf = 1;
            this.agg = d;
            this.agh = d2;
            this.agi = f;
            return this;
        }

        public Builder setExpirationDuration(long j) {
            this.age = j < 0 ? -1 : SystemClock.elapsedRealtime() + j;
            return this;
        }

        public Builder setLoiteringDelay(int i) {
            this.agk = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i) {
            this.agj = i;
            return this;
        }

        public Builder setRequestId(String str) {
            this.f4280Zt = str;
            return this;
        }

        public Builder setTransitionTypes(int i) {
            this.agd = i;
            return this;
        }
    }

    String getRequestId();
}
