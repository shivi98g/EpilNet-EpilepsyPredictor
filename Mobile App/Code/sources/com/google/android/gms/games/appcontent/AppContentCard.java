package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentCard extends Parcelable, Freezable<AppContentCard> {
    List<AppContentAction> getActions();

    String getDescription();

    Uri getIconImageUri();

    String getTitle();

    String getType();

    /* renamed from: kH */
    List<AppContentCondition> mo13200kH();

    /* renamed from: kI */
    String mo13201kI();

    /* renamed from: kL */
    Uri mo13202kL();

    /* renamed from: kN */
    List<AppContentAnnotation> mo13203kN();

    /* renamed from: kO */
    int mo13204kO();

    /* renamed from: kP */
    Bundle mo13205kP();

    /* renamed from: kQ */
    String mo13206kQ();

    /* renamed from: kR */
    int mo13207kR();
}
