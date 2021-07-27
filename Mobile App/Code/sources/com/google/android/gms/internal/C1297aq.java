package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.aq */
public class C1297aq {
    /* renamed from: a */
    private static boolean m3926a(Character.UnicodeBlock unicodeBlock) {
        return unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlock == Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT || unicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY || unicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS || unicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || unicodeBlock == Character.UnicodeBlock.BOPOMOFO || unicodeBlock == Character.UnicodeBlock.HIRAGANA || unicodeBlock == Character.UnicodeBlock.KATAKANA || unicodeBlock == Character.UnicodeBlock.HANGUL_SYLLABLES || unicodeBlock == Character.UnicodeBlock.HANGUL_JAMO;
    }

    /* renamed from: d */
    static boolean m3927d(int i) {
        return Character.isLetter(i) && m3926a(Character.UnicodeBlock.of(i));
    }

    /* renamed from: o */
    public static int m3928o(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            bArr = str.getBytes();
        }
        return C1839lk.m5536a(bArr, 0, bArr.length, 0);
    }

    /* renamed from: p */
    public static String[] m3929p(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (m3927d(codePointAt)) {
                if (z) {
                    arrayList.add(new String(charArray, i2, i - i2));
                }
                str2 = new String(charArray, i, charCount);
            } else {
                if (Character.isLetterOrDigit(codePointAt)) {
                    if (!z) {
                        i2 = i;
                    }
                    z = true;
                } else if (z) {
                    str2 = new String(charArray, i2, i - i2);
                }
                i += charCount;
            }
            arrayList.add(str2);
            z = false;
            i += charCount;
        }
        if (z) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
