package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.C2150ql;
import com.google.android.gms.internal.C2152qm;
import com.google.android.gms.internal.C2165qv;
import com.google.android.gms.internal.C2166qw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataMap {
    public static final String TAG = "DataMap";
    private final HashMap<String, Object> axg = new HashMap<>();

    /* renamed from: a */
    private static void m7883a(Bundle bundle, String str, Object obj) {
        Parcelable bundle2;
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else {
            if (obj instanceof Asset) {
                bundle2 = (Asset) obj;
            } else if (obj instanceof DataMap) {
                bundle2 = ((DataMap) obj).toBundle();
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                switch (m7889d(arrayList)) {
                    case 0:
                    case 1:
                    case 3:
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    case 2:
                        bundle.putIntegerArrayList(str, arrayList);
                        return;
                    case 4:
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((DataMap) it.next()).toBundle());
                        }
                        bundle.putParcelableArrayList(str, arrayList2);
                        return;
                    default:
                        return;
                }
            } else {
                return;
            }
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: a */
    private static void m7884a(DataMap dataMap, String str, Object obj) {
        if (obj instanceof String) {
            dataMap.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            dataMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            dataMap.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            dataMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            dataMap.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            dataMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataMap.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            dataMap.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            dataMap.putStringArray(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            dataMap.putLongArray(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            dataMap.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof Asset) {
            dataMap.putAsset(str, (Asset) obj);
        } else if (obj instanceof Bundle) {
            dataMap.putDataMap(str, fromBundle((Bundle) obj));
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            int d = m7889d(arrayList);
            if (d != 5) {
                switch (d) {
                    case 0:
                    case 1:
                    case 3:
                        dataMap.putStringArrayList(str, arrayList);
                        return;
                    case 2:
                        dataMap.putIntegerArrayList(str, arrayList);
                        return;
                    default:
                        return;
                }
            } else {
                dataMap.putDataMapArrayList(str, arrayListFromBundleArrayList(arrayList));
            }
        }
    }

    /* renamed from: a */
    private void m7885a(String str, Object obj, String str2, ClassCastException classCastException) {
        m7886a(str, obj, str2, "<null>", classCastException);
    }

    /* renamed from: a */
    private void m7886a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w(TAG, "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w(TAG, "Attempt to cast generated internal exception:", classCastException);
    }

    /* renamed from: a */
    private static boolean m7887a(Asset asset, Asset asset2) {
        return (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.getDigest()) ? asset.getDigest().equals(asset2.getDigest()) : Arrays.equals(asset.getData(), asset2.getData());
    }

    /* renamed from: a */
    private static boolean m7888a(DataMap dataMap, DataMap dataMap2) {
        if (dataMap.size() != dataMap2.size()) {
            return false;
        }
        for (String next : dataMap.keySet()) {
            Object obj = dataMap.get(next);
            Object obj2 = dataMap2.get(next);
            if (obj instanceof Asset) {
                if (!(obj2 instanceof Asset) || !m7887a((Asset) obj, (Asset) obj2)) {
                    return false;
                }
            } else if (obj instanceof String[]) {
                if (!(obj2 instanceof String[]) || !Arrays.equals((String[]) obj, (String[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof float[]) {
                if (!(obj2 instanceof float[]) || !Arrays.equals((float[]) obj, (float[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if (obj == null || obj2 == null) {
                return obj == obj2;
            } else {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayList<DataMap> arrayListFromBundleArrayList(ArrayList<Bundle> arrayList) {
        ArrayList<DataMap> arrayList2 = new ArrayList<>();
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(fromBundle(it.next()));
        }
        return arrayList2;
    }

    /* renamed from: d */
    private static int m7889d(ArrayList<?> arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                if (next instanceof Integer) {
                    return 2;
                }
                if (next instanceof String) {
                    return 3;
                }
                if (next instanceof DataMap) {
                    return 4;
                }
                if (next instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    public static DataMap fromBundle(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        DataMap dataMap = new DataMap();
        for (String str : bundle.keySet()) {
            m7884a(dataMap, str, bundle.get(str));
        }
        return dataMap;
    }

    public static DataMap fromByteArray(byte[] bArr) {
        try {
            return C2150ql.m6323a(new C2150ql.C2151a(C2152qm.m6327n(bArr), new ArrayList()));
        } catch (C2165qv e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public void clear() {
        this.axg.clear();
    }

    public boolean containsKey(String str) {
        return this.axg.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DataMap)) {
            return false;
        }
        return m7888a(this, (DataMap) obj);
    }

    public <T> T get(String str) {
        return this.axg.get(str);
    }

    public Asset getAsset(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "Asset", e);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            String str2 = str;
            m7886a(str2, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0);
    }

    public byte getByte(String str, byte b) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return b;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e) {
            String str2 = str;
            m7886a(str2, obj, "Byte", Byte.valueOf(b), e);
            return b;
        }
    }

    public byte[] getByteArray(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "byte[]", e);
            return null;
        }
    }

    public DataMap getDataMap(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataMap) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, TAG, e);
            return null;
        }
    }

    public ArrayList<DataMap> getDataMapArrayList(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double getDouble(String str, double d) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            String str2 = str;
            m7886a(str2, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float getFloat(String str, float f) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            String str2 = str;
            m7886a(str2, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public float[] getFloatArray(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "float[]", e);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int getInt(String str, int i) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            m7885a(str, obj, "Integer", e);
            return i;
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long getLong(String str, long j) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            m7885a(str, obj, "long", e);
            return j;
        }
    }

    public long[] getLongArray(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "long[]", e);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "String", e);
            return null;
        }
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public String[] getStringArray(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "String[]", e);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        Object obj = this.axg.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7885a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public int hashCode() {
        return 29 * this.axg.hashCode();
    }

    public boolean isEmpty() {
        return this.axg.isEmpty();
    }

    public Set<String> keySet() {
        return this.axg.keySet();
    }

    public void putAll(DataMap dataMap) {
        for (String next : dataMap.keySet()) {
            this.axg.put(next, dataMap.get(next));
        }
    }

    public void putAsset(String str, Asset asset) {
        this.axg.put(str, asset);
    }

    public void putBoolean(String str, boolean z) {
        this.axg.put(str, Boolean.valueOf(z));
    }

    public void putByte(String str, byte b) {
        this.axg.put(str, Byte.valueOf(b));
    }

    public void putByteArray(String str, byte[] bArr) {
        this.axg.put(str, bArr);
    }

    public void putDataMap(String str, DataMap dataMap) {
        this.axg.put(str, dataMap);
    }

    public void putDataMapArrayList(String str, ArrayList<DataMap> arrayList) {
        this.axg.put(str, arrayList);
    }

    public void putDouble(String str, double d) {
        this.axg.put(str, Double.valueOf(d));
    }

    public void putFloat(String str, float f) {
        this.axg.put(str, Float.valueOf(f));
    }

    public void putFloatArray(String str, float[] fArr) {
        this.axg.put(str, fArr);
    }

    public void putInt(String str, int i) {
        this.axg.put(str, Integer.valueOf(i));
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.axg.put(str, arrayList);
    }

    public void putLong(String str, long j) {
        this.axg.put(str, Long.valueOf(j));
    }

    public void putLongArray(String str, long[] jArr) {
        this.axg.put(str, jArr);
    }

    public void putString(String str, String str2) {
        this.axg.put(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.axg.put(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.axg.put(str, arrayList);
    }

    public Object remove(String str) {
        return this.axg.remove(str);
    }

    public int size() {
        return this.axg.size();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (String next : this.axg.keySet()) {
            m7883a(bundle, next, this.axg.get(next));
        }
        return bundle;
    }

    public byte[] toByteArray() {
        return C2166qw.m6480f(C2150ql.m6321a(this).ayo);
    }

    public String toString() {
        return this.axg.toString();
    }
}
