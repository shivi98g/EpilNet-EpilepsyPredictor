package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.constants.MatchResult;
import com.google.android.gms.internal.C1785jx;

public final class ParticipantResult implements SafeParcelable {
    public static final ParticipantResultCreator CREATOR = new ParticipantResultCreator();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;

    /* renamed from: CK */
    private final int f2136CK;

    /* renamed from: Zk */
    private final String f2137Zk;
    private final int aec;
    private final int aed;

    public ParticipantResult(int i, String str, int i2, int i3) {
        this.f2136CK = i;
        this.f2137Zk = (String) C1785jx.m5364i(str);
        C1785jx.m5353K(MatchResult.isValid(i2));
        this.aec = i2;
        this.aed = i3;
    }

    public ParticipantResult(String str, int i, int i2) {
        this(1, str, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public String getParticipantId() {
        return this.f2137Zk;
    }

    public int getPlacing() {
        return this.aed;
    }

    public int getResult() {
        return this.aec;
    }

    public int getVersionCode() {
        return this.f2136CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParticipantResultCreator.m3725a(this, parcel, i);
    }
}
