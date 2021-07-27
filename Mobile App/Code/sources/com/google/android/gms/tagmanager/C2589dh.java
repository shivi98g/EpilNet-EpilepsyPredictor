package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.dh */
class C2589dh extends Number implements Comparable<C2589dh> {
    private double atZ;
    private long aua;
    private boolean aub = false;

    private C2589dh(double d) {
        this.atZ = d;
    }

    private C2589dh(long j) {
        this.aua = j;
    }

    /* renamed from: a */
    public static C2589dh m7519a(Double d) {
        return new C2589dh(d.doubleValue());
    }

    /* renamed from: cY */
    public static C2589dh m7520cY(String str) throws NumberFormatException {
        try {
            return new C2589dh(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new C2589dh(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(str + " is not a valid TypedNumber");
            }
        }
    }

    /* renamed from: z */
    public static C2589dh m7521z(long j) {
        return new C2589dh(j);
    }

    /* renamed from: a */
    public int compareTo(C2589dh dhVar) {
        return (!mo18841qR() || !dhVar.mo18841qR()) ? Double.compare(doubleValue(), dhVar.doubleValue()) : new Long(this.aua).compareTo(Long.valueOf(dhVar.aua));
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public double doubleValue() {
        return mo18841qR() ? (double) this.aua : this.atZ;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2589dh) && compareTo((C2589dh) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return mo18843qT();
    }

    public long longValue() {
        return mo18842qS();
    }

    /* renamed from: qQ */
    public boolean mo18840qQ() {
        return !mo18841qR();
    }

    /* renamed from: qR */
    public boolean mo18841qR() {
        return this.aub;
    }

    /* renamed from: qS */
    public long mo18842qS() {
        return mo18841qR() ? this.aua : (long) this.atZ;
    }

    /* renamed from: qT */
    public int mo18843qT() {
        return (int) longValue();
    }

    /* renamed from: qU */
    public short mo18844qU() {
        return (short) ((int) longValue());
    }

    public short shortValue() {
        return mo18844qU();
    }

    public String toString() {
        return mo18841qR() ? Long.toString(this.aua) : Double.toString(this.atZ);
    }
}
