package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2005nn;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest implements SafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C2202a();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    /* renamed from: CK */
    private final int f4282CK;
    private final List<C2005nn> ago;
    private final int agp;

    public static final class Builder {
        private final List<C2005nn> ago = new ArrayList();
        private int agp = 5;

        /* renamed from: ew */
        public static int m6615ew(int i) {
            return i & 7;
        }

        public Builder addGeofence(Geofence geofence) {
            C1785jx.m5359b(geofence, (Object) "geofence can't be null.");
            C1785jx.m5361b(geofence instanceof C2005nn, (Object) "Geofence must be created using Geofence.Builder.");
            this.ago.add((C2005nn) geofence);
            return this;
        }

        public Builder addGeofences(List<Geofence> list) {
            if (list == null || list.isEmpty()) {
                return this;
            }
            for (Geofence next : list) {
                if (next != null) {
                    addGeofence(next);
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            C1785jx.m5361b(!this.ago.isEmpty(), (Object) "No geofence has been added to this request.");
            return new GeofencingRequest((List) this.ago, this.agp);
        }

        public Builder setInitialTrigger(int i) {
            this.agp = m6615ew(i);
            return this;
        }
    }

    GeofencingRequest(int i, List<C2005nn> list, int i2) {
        this.f4282CK = i;
        this.ago = list;
        this.agp = i2;
    }

    private GeofencingRequest(List<C2005nn> list, int i) {
        this(1, list, i);
    }

    public int describeContents() {
        return 0;
    }

    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.ago);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.agp;
    }

    public int getVersionCode() {
        return this.f4282CK;
    }

    /* renamed from: ng */
    public List<C2005nn> mo17201ng() {
        return this.ago;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2202a.m6626a(this, parcel, i);
    }
}
