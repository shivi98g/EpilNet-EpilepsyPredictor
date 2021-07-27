package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataHolder implements SafeParcelable {
    public static final C0707f CREATOR = new C0707f();

    /* renamed from: Ll */
    private static final C0700a f765Ll = new C0700a(new String[0], (String) null) {
    };

    /* renamed from: CK */
    private final int f766CK;

    /* renamed from: Iv */
    private final int f767Iv;

    /* renamed from: Ld */
    private final String[] f768Ld;

    /* renamed from: Le */
    Bundle f769Le;

    /* renamed from: Lf */
    private final CursorWindow[] f770Lf;

    /* renamed from: Lg */
    private final Bundle f771Lg;

    /* renamed from: Lh */
    int[] f772Lh;

    /* renamed from: Li */
    int f773Li;

    /* renamed from: Lj */
    private Object f774Lj;

    /* renamed from: Lk */
    private boolean f775Lk;
    boolean mClosed;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C0700a {
        /* access modifiers changed from: private */

        /* renamed from: Ld */
        public final String[] f776Ld;
        /* access modifiers changed from: private */

        /* renamed from: Lm */
        public final ArrayList<HashMap<String, Object>> f777Lm;

        /* renamed from: Ln */
        private final String f778Ln;

        /* renamed from: Lo */
        private final HashMap<Object, Integer> f779Lo;

        /* renamed from: Lp */
        private boolean f780Lp;

        /* renamed from: Lq */
        private String f781Lq;

        private C0700a(String[] strArr, String str) {
            this.f776Ld = (String[]) C1785jx.m5364i(strArr);
            this.f777Lm = new ArrayList<>();
            this.f778Ln = str;
            this.f779Lo = new HashMap<>();
            this.f780Lp = false;
            this.f781Lq = null;
        }
    }

    /* renamed from: com.google.android.gms.common.data.DataHolder$b */
    public static class C0701b extends RuntimeException {
        public C0701b(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.f775Lk = true;
        this.f766CK = i;
        this.f768Ld = strArr;
        this.f770Lf = cursorWindowArr;
        this.f767Iv = i2;
        this.f771Lg = bundle;
    }

    private DataHolder(C0700a aVar, int i, Bundle bundle) {
        this(aVar.f776Ld, m624a(aVar, -1), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.f775Lk = true;
        this.f766CK = 1;
        this.f768Ld = (String[]) C1785jx.m5364i(strArr);
        this.f770Lf = (CursorWindow[]) C1785jx.m5364i(cursorWindowArr);
        this.f767Iv = i;
        this.f771Lg = bundle;
        mo11059gX();
    }

    /* renamed from: a */
    public static DataHolder m623a(int i, Bundle bundle) {
        return new DataHolder(f765Ll, i, bundle);
    }

    /* renamed from: a */
    private static CursorWindow[] m624a(C0700a aVar, int i) {
        long j;
        if (aVar.f776Ld.length == 0) {
            return new CursorWindow[0];
        }
        List b = (i < 0 || i >= aVar.f777Lm.size()) ? aVar.f777Lm : aVar.f777Lm.subList(0, i);
        int size = b.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.f776Ld.length);
        boolean z = false;
        CursorWindow cursorWindow2 = cursorWindow;
        int i2 = 0;
        while (i2 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i2 + ")");
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(aVar.f776Ld.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) b.get(i2);
                boolean z2 = true;
                for (int i3 = 0; i3 < aVar.f776Ld.length && z2; i3++) {
                    String str = aVar.f776Ld[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow2.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow2.putString((String) obj, i2, i3);
                    } else {
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            j = ((Boolean) obj).booleanValue() ? 1 : 0;
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow2.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow2.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                        } else {
                            throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj);
                        }
                        z2 = cursorWindow2.putLong(j, i2, i3);
                    }
                }
                if (z2) {
                    z = false;
                } else if (z) {
                    throw new C0701b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", "Couldn't populate window data for row " + i2 + " - allocating new window.");
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(aVar.f776Ld.length);
                    arrayList.add(cursorWindow2);
                    i2--;
                    z = true;
                }
                i2++;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    /* renamed from: av */
    public static DataHolder m625av(int i) {
        return m623a(i, (Bundle) null);
    }

    /* renamed from: g */
    private void m626g(String str, int i) {
        if (this.f769Le == null || !this.f769Le.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f773Li) {
            throw new CursorIndexOutOfBoundsException(i, this.f773Li);
        }
    }

    /* renamed from: a */
    public long mo11044a(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].getLong(i, this.f769Le.getInt(str));
    }

    /* renamed from: a */
    public void mo11045a(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        m626g(str, i);
        this.f770Lf[i2].copyStringToBuffer(i, this.f769Le.getInt(str), charArrayBuffer);
    }

    /* renamed from: aQ */
    public boolean mo11046aQ(String str) {
        return this.f769Le.containsKey(str);
    }

    /* renamed from: au */
    public int mo11047au(int i) {
        int i2 = 0;
        C1785jx.m5353K(i >= 0 && i < this.f773Li);
        while (true) {
            if (i2 >= this.f772Lh.length) {
                break;
            } else if (i < this.f772Lh[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f772Lh.length ? i2 - 1 : i2;
    }

    /* renamed from: b */
    public int mo11048b(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].getInt(i, this.f769Le.getInt(str));
    }

    /* renamed from: c */
    public String mo11049c(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].getString(i, this.f769Le.getInt(str));
    }

    public void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.f770Lf) {
                    close.close();
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo11051d(String str, int i, int i2) {
        m626g(str, i);
        return Long.valueOf(this.f770Lf[i2].getLong(i, this.f769Le.getInt(str))).longValue() == 1;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float mo11053e(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].getFloat(i, this.f769Le.getInt(str));
    }

    /* renamed from: e */
    public void mo11054e(Object obj) {
        this.f774Lj = obj;
    }

    /* renamed from: f */
    public byte[] mo11055f(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].getBlob(i, this.f769Le.getInt(str));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        String str;
        try {
            if (this.f775Lk && this.f770Lf.length > 0 && !isClosed()) {
                if (this.f774Lj == null) {
                    str = "internal object: " + toString();
                } else {
                    str = this.f774Lj.toString();
                }
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + str + ")");
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public Uri mo11057g(String str, int i, int i2) {
        String c = mo11049c(str, i, i2);
        if (c == null) {
            return null;
        }
        return Uri.parse(c);
    }

    /* renamed from: gV */
    public Bundle mo11058gV() {
        return this.f771Lg;
    }

    /* renamed from: gX */
    public void mo11059gX() {
        this.f769Le = new Bundle();
        for (int i = 0; i < this.f768Ld.length; i++) {
            this.f769Le.putInt(this.f768Ld[i], i);
        }
        this.f772Lh = new int[this.f770Lf.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f770Lf.length; i3++) {
            this.f772Lh[i3] = i2;
            i2 += this.f770Lf[i3].getNumRows() - (i2 - this.f770Lf[i3].getStartPosition());
        }
        this.f773Li = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gY */
    public String[] mo11060gY() {
        return this.f768Ld;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gZ */
    public CursorWindow[] mo11061gZ() {
        return this.f770Lf;
    }

    public int getCount() {
        return this.f773Li;
    }

    public int getStatusCode() {
        return this.f767Iv;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f766CK;
    }

    /* renamed from: h */
    public boolean mo11065h(String str, int i, int i2) {
        m626g(str, i);
        return this.f770Lf[i2].isNull(i, this.f769Le.getInt(str));
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0707f.m659a(this, parcel, i);
    }
}
