package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C1785jx;

public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator<RealTimeMessage> CREATOR = new Parcelable.Creator<RealTimeMessage>() {
        /* renamed from: cB */
        public RealTimeMessage createFromParcel(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }

        /* renamed from: en */
        public RealTimeMessage[] newArray(int i) {
            return new RealTimeMessage[i];
        }
    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String aee;
    private final byte[] aef;
    private final int aeg;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.aee = (String) C1785jx.m5364i(str);
        this.aef = (byte[]) ((byte[]) C1785jx.m5364i(bArr)).clone();
        this.aeg = i;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getMessageData() {
        return this.aef;
    }

    public String getSenderParticipantId() {
        return this.aee;
    }

    public boolean isReliable() {
        return this.aeg == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aee);
        parcel.writeByteArray(this.aef);
        parcel.writeInt(this.aeg);
    }
}
