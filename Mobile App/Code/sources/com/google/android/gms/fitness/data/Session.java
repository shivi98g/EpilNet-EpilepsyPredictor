package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.plus.PlusShare;
import java.util.concurrent.TimeUnit;

public class Session implements SafeParcelable {
    public static final Parcelable.Creator<Session> CREATOR = new C1001p();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";

    /* renamed from: CK */
    private final int f1413CK;

    /* renamed from: LW */
    private final long f1414LW;

    /* renamed from: TO */
    private final long f1415TO;

    /* renamed from: TZ */
    private final int f1416TZ;

    /* renamed from: UN */
    private final String f1417UN;

    /* renamed from: UO */
    private final String f1418UO;

    /* renamed from: Um */
    private final C0982a f1419Um;
    private final String mName;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: LW */
        public long f1420LW = 0;
        /* access modifiers changed from: private */

        /* renamed from: TO */
        public long f1421TO = 0;
        /* access modifiers changed from: private */

        /* renamed from: TZ */
        public int f1422TZ = 4;
        /* access modifiers changed from: private */

        /* renamed from: UN */
        public String f1423UN;
        /* access modifiers changed from: private */

        /* renamed from: UO */
        public String f1424UO;
        /* access modifiers changed from: private */

        /* renamed from: Um */
        public C0982a f1425Um;
        /* access modifiers changed from: private */
        public String mName = null;

        public Session build() {
            boolean z = false;
            C1785jx.m5355a(this.f1420LW > 0, "Start time should be specified.");
            if (this.f1421TO == 0 || this.f1421TO > this.f1420LW) {
                z = true;
            }
            C1785jx.m5355a(z, "End time should be later than start time.");
            if (this.f1423UN == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mName == null ? "" : this.mName);
                sb.append(this.f1420LW);
                this.f1423UN = sb.toString();
            }
            return new Session(this);
        }

        /* renamed from: cV */
        public Builder mo12393cV(int i) {
            this.f1422TZ = i;
            return this;
        }

        public Builder setActivity(String str) {
            return mo12393cV(FitnessActivities.m1627bs(str));
        }

        public Builder setDescription(String str) {
            C1785jx.m5362b(str.length() <= 1000, "Session description cannot exceed %d characters", 1000);
            this.f1424UO = str;
            return this;
        }

        public Builder setEndTime(long j, TimeUnit timeUnit) {
            C1785jx.m5355a(j >= 0, "End time should be positive.");
            this.f1421TO = timeUnit.toMillis(j);
            return this;
        }

        public Builder setIdentifier(String str) {
            C1785jx.m5354L(str != null && TextUtils.getTrimmedLength(str) > 0);
            this.f1423UN = str;
            return this;
        }

        public Builder setName(String str) {
            C1785jx.m5362b(str.length() <= 100, "Session name cannot exceed %d characters", 100);
            this.mName = str;
            return this;
        }

        public Builder setStartTime(long j, TimeUnit timeUnit) {
            C1785jx.m5355a(j > 0, "Start time should be positive.");
            this.f1420LW = timeUnit.toMillis(j);
            return this;
        }
    }

    Session(int i, long j, long j2, String str, String str2, String str3, int i2, C0982a aVar) {
        this.f1413CK = i;
        this.f1414LW = j;
        this.f1415TO = j2;
        this.mName = str;
        this.f1417UN = str2;
        this.f1418UO = str3;
        this.f1416TZ = i2;
        this.f1419Um = aVar;
    }

    private Session(Builder builder) {
        this.f1413CK = 2;
        this.f1414LW = builder.f1420LW;
        this.f1415TO = builder.f1421TO;
        this.mName = builder.mName;
        this.f1417UN = builder.f1423UN;
        this.f1418UO = builder.f1424UO;
        this.f1416TZ = builder.f1422TZ;
        this.f1419Um = builder.f1425Um;
    }

    /* renamed from: a */
    private boolean m1688a(Session session) {
        return this.f1414LW == session.f1414LW && this.f1415TO == session.f1415TO && C1781jv.equal(this.mName, session.mName) && C1781jv.equal(this.f1417UN, session.f1417UN) && C1781jv.equal(this.f1418UO, session.f1418UO) && C1781jv.equal(this.f1419Um, session.f1419Um) && this.f1416TZ == session.f1416TZ;
    }

    public static Session extract(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Session) C0724c.m778a(intent, EXTRA_SESSION, CREATOR);
    }

    public static String getMimeType(String str) {
        return MIME_TYPE_PREFIX + str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Session) && m1688a((Session) obj);
        }
        return true;
    }

    public String getActivity() {
        return FitnessActivities.getName(this.f1416TZ);
    }

    public String getAppPackageName() {
        if (this.f1419Um == null) {
            return null;
        }
        return this.f1419Um.getPackageName();
    }

    public String getDescription() {
        return this.f1418UO;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1415TO, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier() {
        return this.f1417UN;
    }

    public String getName() {
        return this.mName;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1414LW, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1413CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1414LW), Long.valueOf(this.f1415TO), this.f1417UN);
    }

    public boolean isOngoing() {
        return this.f1415TO == 0;
    }

    /* renamed from: jm */
    public int mo12386jm() {
        return this.f1416TZ;
    }

    /* renamed from: jo */
    public long mo12387jo() {
        return this.f1414LW;
    }

    /* renamed from: jp */
    public long mo12388jp() {
        return this.f1415TO;
    }

    /* renamed from: jx */
    public C0982a mo12389jx() {
        return this.f1419Um;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("startTime", Long.valueOf(this.f1414LW)).mo15935a("endTime", Long.valueOf(this.f1415TO)).mo15935a("name", this.mName).mo15935a("identifier", this.f1417UN).mo15935a(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.f1418UO).mo15935a("activity", Integer.valueOf(this.f1416TZ)).mo15935a("application", this.f1419Um).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1001p.m1760a(this, parcel, i);
    }
}
