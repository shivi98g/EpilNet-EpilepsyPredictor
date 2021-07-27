package com.google.android.gms.internal;

import android.support.p003v7.widget.helper.ItemTouchHelper;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.qx */
public final class C2167qx {
    /* renamed from: a */
    private static void m6486a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        String str2;
        if (obj != null) {
            if (obj instanceof C2166qw) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(m6489dl(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            m6486a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i = 0; i < length2; i++) {
                                m6486a(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                m6486a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException e) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    str2 = ">\n";
                } else {
                    return;
                }
            } else {
                String dl = m6489dl(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(dl);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String dm = m6490dm((String) obj);
                    stringBuffer2.append("\"");
                    stringBuffer2.append(dm);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    m6487a((byte[]) obj, stringBuffer2);
                } else {
                    stringBuffer2.append(obj);
                }
                str2 = "\n";
            }
            stringBuffer2.append(str2);
        }
    }

    /* renamed from: a */
    private static void m6487a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 == 92 || b2 == 34) {
                stringBuffer.append('\\');
            } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
            }
            stringBuffer.append((char) b2);
        }
        stringBuffer.append('\"');
    }

    /* renamed from: bh */
    private static String m6488bh(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: dl */
    private static String m6489dl(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* renamed from: dm */
    private static String m6490dm(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION) + "[...]";
        }
        return m6488bh(str);
    }

    /* renamed from: g */
    public static <T extends C2166qw> String m6491g(T t) {
        StringBuilder sb;
        String message;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m6486a((String) null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append("Error printing proto: ");
            message = e.getMessage();
            sb.append(message);
            return sb.toString();
        } catch (InvocationTargetException e2) {
            sb = new StringBuilder();
            sb.append("Error printing proto: ");
            message = e2.getMessage();
            sb.append(message);
            return sb.toString();
        }
    }
}
