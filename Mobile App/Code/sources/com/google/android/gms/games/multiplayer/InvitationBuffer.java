package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class InvitationBuffer extends C0708g<Invitation> {
    public InvitationBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_invitation_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Invitation mo11099f(int i, int i2) {
        return new InvitationRef(this.f763JG, i, i2);
    }
}
