package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.C2005nn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent {
    private final int agl;
    private final List<Geofence> agm;
    private final Location agn;

    /* renamed from: tq */
    private final int f4281tq;

    private GeofencingEvent(int i, int i2, List<Geofence> list, Location location) {
        this.f4281tq = i;
        this.agl = i2;
        this.agm = list;
        this.agn = location;
    }

    public static GeofencingEvent fromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), m6612k(intent), m6613l(intent), (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: k */
    private static int m6612k(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra == -1) {
            return -1;
        }
        if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
            return intExtra;
        }
        return -1;
    }

    /* renamed from: l */
    private static List<Geofence> m6613l(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C2005nn.m5957h((byte[]) it.next()));
        }
        return arrayList2;
    }

    public int getErrorCode() {
        return this.f4281tq;
    }

    public int getGeofenceTransition() {
        return this.agl;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.agm;
    }

    public Location getTriggeringLocation() {
        return this.agn;
    }

    public boolean hasError() {
        return this.f4281tq != -1;
    }
}
