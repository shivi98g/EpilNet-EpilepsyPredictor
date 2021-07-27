package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSubscriptionsResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<ListSubscriptionsResult> CREATOR = new C1072e();

    /* renamed from: CK */
    private final int f1618CK;

    /* renamed from: Eb */
    private final Status f1619Eb;

    /* renamed from: Wu */
    private final List<Subscription> f1620Wu;

    ListSubscriptionsResult(int i, List<Subscription> list, Status status) {
        this.f1618CK = i;
        this.f1620Wu = list;
        this.f1619Eb = status;
    }

    public ListSubscriptionsResult(List<Subscription> list, Status status) {
        this.f1618CK = 3;
        this.f1620Wu = Collections.unmodifiableList(list);
        this.f1619Eb = (Status) C1785jx.m5359b(status, (Object) NotificationCompat.CATEGORY_STATUS);
    }

    /* renamed from: F */
    public static ListSubscriptionsResult m1982F(Status status) {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    /* renamed from: b */
    private boolean m1983b(ListSubscriptionsResult listSubscriptionsResult) {
        return this.f1619Eb.equals(listSubscriptionsResult.f1619Eb) && C1781jv.equal(this.f1620Wu, listSubscriptionsResult.f1620Wu);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ListSubscriptionsResult) && m1983b((ListSubscriptionsResult) obj);
        }
        return true;
    }

    public Status getStatus() {
        return this.f1619Eb;
    }

    public List<Subscription> getSubscriptions() {
        return this.f1620Wu;
    }

    public List<Subscription> getSubscriptions(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (Subscription next : this.f1620Wu) {
            if (dataType.equals(next.mo12408jJ())) {
                arrayList.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1618CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1619Eb, this.f1620Wu);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1619Eb).mo15935a("subscriptions", this.f1620Wu).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1072e.m2001a(this, parcel, i);
    }
}
