package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

/* renamed from: com.google.android.gms.internal.ph */
public final class C2088ph extends C0705d implements Moment {
    private C2086pf apk;

    public C2088ph(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: oK */
    private C2086pf m6129oK() {
        synchronized (this) {
            if (this.apk == null) {
                byte[] byteArray = getByteArray("momentImpl");
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                this.apk = C2086pf.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
        }
        return this.apk;
    }

    public String getId() {
        return m6129oK().getId();
    }

    public ItemScope getResult() {
        return m6129oK().getResult();
    }

    public String getStartDate() {
        return m6129oK().getStartDate();
    }

    public ItemScope getTarget() {
        return m6129oK().getTarget();
    }

    public String getType() {
        return m6129oK().getType();
    }

    public boolean hasId() {
        return m6129oK().hasId();
    }

    public boolean hasResult() {
        return m6129oK().hasResult();
    }

    public boolean hasStartDate() {
        return m6129oK().hasStartDate();
    }

    public boolean hasTarget() {
        return m6129oK().hasTarget();
    }

    public boolean hasType() {
        return m6129oK().hasType();
    }

    /* renamed from: oJ */
    public C2086pf freeze() {
        return m6129oK();
    }
}
