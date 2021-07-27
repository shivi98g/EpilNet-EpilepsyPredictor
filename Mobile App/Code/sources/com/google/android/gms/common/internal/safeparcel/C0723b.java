package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.internal.view.SupportMenu;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C0723b {
    /* renamed from: F */
    private static int m748F(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: G */
    private static void m749G(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: H */
    public static int m750H(Parcel parcel) {
        return m748F(parcel, 20293);
    }

    /* renamed from: H */
    public static void m751H(Parcel parcel, int i) {
        m749G(parcel, i);
    }

    /* renamed from: a */
    public static void m752a(Parcel parcel, int i, byte b) {
        m773b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m753a(Parcel parcel, int i, double d) {
        m773b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m754a(Parcel parcel, int i, float f) {
        m773b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m755a(Parcel parcel, int i, long j) {
        m773b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m756a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int F = m748F(parcel, i);
            parcel.writeBundle(bundle);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m757a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int F = m748F(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m758a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int F = m748F(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m759a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int F = m748F(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m760a(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m773b(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m761a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m773b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m762a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m773b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m763a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int F = m748F(parcel, i);
            parcel.writeString(str);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m764a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int F = m748F(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m765a(Parcel parcel, int i, short s) {
        m773b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m766a(Parcel parcel, int i, boolean z) {
        m773b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m767a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int F = m748F(parcel, i);
            parcel.writeByteArray(bArr);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m768a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int F = m748F(parcel, i);
            parcel.writeIntArray(iArr);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m769a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int F = m748F(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m772a(parcel, t, i2);
                }
            }
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m770a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int F = m748F(parcel, i);
            parcel.writeStringArray(strArr);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m771a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int F = m748F(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m772a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static void m773b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    public static void m774b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int F = m748F(parcel, i);
            parcel.writeStringList(list);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: c */
    public static void m775c(Parcel parcel, int i, int i2) {
        m773b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m776c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int F = m748F(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m772a(parcel, parcelable, 0);
                }
            }
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }

    /* renamed from: d */
    public static void m777d(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int F = m748F(parcel, i);
            parcel.writeList(list);
            m749G(parcel, F);
        } else if (z) {
            m773b(parcel, i, 0);
        }
    }
}
