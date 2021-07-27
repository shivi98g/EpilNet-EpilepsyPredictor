package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C0721a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C0722a extends RuntimeException {
        public C0722a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static String[] m708A(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: B */
    public static ArrayList<Integer> m709B(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: C */
    public static ArrayList<String> m710C(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: D */
    public static Parcel m711D(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(dataPosition + a);
        return obtain;
    }

    /* renamed from: E */
    public static Parcel[] m712E(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    /* renamed from: F */
    public static int m713F(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: G */
    public static int m714G(Parcel parcel) {
        int F = m713F(parcel);
        int a = m715a(parcel, F);
        int dataPosition = parcel.dataPosition();
        if (m720aH(F) != 20293) {
            throw new C0722a("Expected object header. Got 0x" + Integer.toHexString(F), parcel);
        }
        int i = a + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C0722a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    /* renamed from: a */
    public static int m715a(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m716a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return t;
    }

    /* renamed from: a */
    private static void m717a(Parcel parcel, int i, int i2) {
        int a = m715a(parcel, i);
        if (a != i2) {
            throw new C0722a("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    /* renamed from: a */
    private static void m718a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            throw new C0722a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
        }
    }

    /* renamed from: a */
    public static void m719a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + a);
        }
    }

    /* renamed from: aH */
    public static int m720aH(int i) {
        return i & 65535;
    }

    /* renamed from: b */
    public static void m721b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m715a(parcel, i));
    }

    /* renamed from: b */
    public static <T> T[] m722b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m723c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m724c(Parcel parcel, int i) {
        m717a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static Boolean m725d(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        if (a == 0) {
            return null;
        }
        m718a(parcel, i, a, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: e */
    public static byte m726e(Parcel parcel, int i) {
        m717a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: f */
    public static short m727f(Parcel parcel, int i) {
        m717a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: g */
    public static int m728g(Parcel parcel, int i) {
        m717a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: h */
    public static Integer m729h(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        if (a == 0) {
            return null;
        }
        m718a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: i */
    public static long m730i(Parcel parcel, int i) {
        m717a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: j */
    public static Long m731j(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        if (a == 0) {
            return null;
        }
        m718a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: k */
    public static BigInteger m732k(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    /* renamed from: l */
    public static float m733l(Parcel parcel, int i) {
        m717a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: m */
    public static double m734m(Parcel parcel, int i) {
        m717a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: n */
    public static BigDecimal m735n(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: o */
    public static String m736o(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: p */
    public static IBinder m737p(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: q */
    public static Bundle m738q(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: r */
    public static byte[] m739r(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: s */
    public static byte[][] m740s(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    /* renamed from: t */
    public static boolean[] m741t(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + a);
        return createBooleanArray;
    }

    /* renamed from: u */
    public static int[] m742u(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    /* renamed from: v */
    public static long[] m743v(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + a);
        return createLongArray;
    }

    /* renamed from: w */
    public static BigInteger[] m744w(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: x */
    public static float[] m745x(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + a);
        return createFloatArray;
    }

    /* renamed from: y */
    public static double[] m746y(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + a);
        return createDoubleArray;
    }

    /* renamed from: z */
    public static BigDecimal[] m747z(Parcel parcel, int i) {
        int a = m715a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }
}
