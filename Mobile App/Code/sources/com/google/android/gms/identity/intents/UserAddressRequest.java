package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest implements SafeParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new C1256a();

    /* renamed from: CK */
    private final int f2175CK;
    List<CountrySpecification> afH;

    public final class Builder {
        private Builder() {
        }

        public Builder addAllowedCountrySpecification(CountrySpecification countrySpecification) {
            if (UserAddressRequest.this.afH == null) {
                UserAddressRequest.this.afH = new ArrayList();
            }
            UserAddressRequest.this.afH.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection<CountrySpecification> collection) {
            if (UserAddressRequest.this.afH == null) {
                UserAddressRequest.this.afH = new ArrayList();
            }
            UserAddressRequest.this.afH.addAll(collection);
            return this;
        }

        public UserAddressRequest build() {
            if (UserAddressRequest.this.afH != null) {
                UserAddressRequest.this.afH = Collections.unmodifiableList(UserAddressRequest.this.afH);
            }
            return UserAddressRequest.this;
        }
    }

    UserAddressRequest() {
        this.f2175CK = 1;
    }

    UserAddressRequest(int i, List<CountrySpecification> list) {
        this.f2175CK = i;
        this.afH = list;
    }

    public static Builder newBuilder() {
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f2175CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1256a.m3819a(this, parcel, i);
    }
}
