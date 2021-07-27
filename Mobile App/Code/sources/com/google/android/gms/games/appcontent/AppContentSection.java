package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentSection extends Parcelable, Freezable<AppContentSection> {
    List<AppContentAction> getActions();

    String getTitle();

    String getType();

    /* renamed from: kI */
    String mo13245kI();

    /* renamed from: kP */
    Bundle mo13246kP();

    /* renamed from: kQ */
    String mo13247kQ();

    /* renamed from: kY */
    Uri mo13248kY();

    /* renamed from: kZ */
    List<AppContentCard> mo13249kZ();
}
