package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface AppContentAnnotation extends Parcelable, Freezable<AppContentAnnotation> {
    String getDescription();

    String getTitle();

    String getType();

    /* renamed from: kL */
    Uri mo13179kL();
}
