package com.google.android.gms.internal;

import com.google.android.gms.internal.C2152qm;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ql */
public final class C2150ql {

    /* renamed from: com.google.android.gms.internal.ql$a */
    public static class C2151a {
        public final C2152qm ayo;
        public final List<Asset> ayp;

        public C2151a(C2152qm qmVar, List<Asset> list) {
            this.ayo = qmVar;
            this.ayp = list;
        }
    }

    /* renamed from: a */
    private static int m6319a(String str, C2152qm.C2153a.C2154a[] aVarArr) {
        int i = 14;
        for (C2152qm.C2153a.C2154a aVar : aVarArr) {
            if (i == 14) {
                if (aVar.type == 9 || aVar.type == 2 || aVar.type == 6) {
                    i = aVar.type;
                } else if (aVar.type != 14) {
                    throw new IllegalArgumentException("Unexpected TypedValue type: " + aVar.type + " for key " + str);
                }
            } else if (aVar.type != i) {
                throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + i + " and " + aVar.type);
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m6320a(List<Asset> list, Asset asset) {
        list.add(asset);
        return list.size() - 1;
    }

    /* renamed from: a */
    public static C2151a m6321a(DataMap dataMap) {
        C2152qm qmVar = new C2152qm();
        ArrayList arrayList = new ArrayList();
        qmVar.ayq = m6326a(dataMap, (List<Asset>) arrayList);
        return new C2151a(qmVar, arrayList);
    }

    /* renamed from: a */
    private static C2152qm.C2153a.C2154a m6322a(List<Asset> list, Object obj) {
        C2152qm.C2153a.C2154a aVar = new C2152qm.C2153a.C2154a();
        if (obj == null) {
            aVar.type = 14;
            return aVar;
        }
        aVar.ayu = new C2152qm.C2153a.C2154a.C2155a();
        if (obj instanceof String) {
            aVar.type = 2;
            aVar.ayu.ayw = (String) obj;
            return aVar;
        } else if (obj instanceof Integer) {
            aVar.type = 6;
            aVar.ayu.ayA = ((Integer) obj).intValue();
            return aVar;
        } else if (obj instanceof Long) {
            aVar.type = 5;
            aVar.ayu.ayz = ((Long) obj).longValue();
            return aVar;
        } else if (obj instanceof Double) {
            aVar.type = 3;
            aVar.ayu.ayx = ((Double) obj).doubleValue();
            return aVar;
        } else if (obj instanceof Float) {
            aVar.type = 4;
            aVar.ayu.ayy = ((Float) obj).floatValue();
            return aVar;
        } else if (obj instanceof Boolean) {
            aVar.type = 8;
            aVar.ayu.ayC = ((Boolean) obj).booleanValue();
            return aVar;
        } else if (obj instanceof Byte) {
            aVar.type = 7;
            aVar.ayu.ayB = ((Byte) obj).byteValue();
            return aVar;
        } else if (obj instanceof byte[]) {
            aVar.type = 1;
            aVar.ayu.ayv = (byte[]) obj;
            return aVar;
        } else if (obj instanceof String[]) {
            aVar.type = 11;
            aVar.ayu.ayF = (String[]) obj;
            return aVar;
        } else if (obj instanceof long[]) {
            aVar.type = 12;
            aVar.ayu.ayG = (long[]) obj;
            return aVar;
        } else if (obj instanceof float[]) {
            aVar.type = 15;
            aVar.ayu.ayH = (float[]) obj;
            return aVar;
        } else if (obj instanceof Asset) {
            aVar.type = 13;
            aVar.ayu.ayI = (long) m6320a(list, (Asset) obj);
            return aVar;
        } else {
            int i = 0;
            if (obj instanceof DataMap) {
                aVar.type = 9;
                DataMap dataMap = (DataMap) obj;
                Set<String> keySet = dataMap.keySet();
                C2152qm.C2153a[] aVarArr = new C2152qm.C2153a[keySet.size()];
                for (String next : keySet) {
                    aVarArr[i] = new C2152qm.C2153a();
                    aVarArr[i].name = next;
                    aVarArr[i].ays = m6322a(list, dataMap.get(next));
                    i++;
                }
                aVar.ayu.ayD = aVarArr;
                return aVar;
            } else if (obj instanceof ArrayList) {
                aVar.type = 10;
                ArrayList arrayList = (ArrayList) obj;
                C2152qm.C2153a.C2154a[] aVarArr2 = new C2152qm.C2153a.C2154a[arrayList.size()];
                int size = arrayList.size();
                Object obj2 = null;
                int i2 = 14;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    C2152qm.C2153a.C2154a a = m6322a(list, obj3);
                    if (a.type == 14 || a.type == 2 || a.type == 6 || a.type == 9) {
                        if (i2 == 14 && a.type != 14) {
                            i2 = a.type;
                            obj2 = obj3;
                        } else if (a.type != i2) {
                            throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + obj2.getClass() + " and a " + obj3.getClass());
                        }
                        aVarArr2[i] = a;
                        i++;
                    } else {
                        throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + obj3.getClass());
                    }
                }
                aVar.ayu.ayE = aVarArr2;
                return aVar;
            } else {
                throw new RuntimeException("newFieldValueFromValue: unexpected value " + obj.getClass().getSimpleName());
            }
        }
    }

    /* renamed from: a */
    public static DataMap m6323a(C2151a aVar) {
        DataMap dataMap = new DataMap();
        for (C2152qm.C2153a aVar2 : aVar.ayo.ayq) {
            m6325a(aVar.ayp, dataMap, aVar2.name, aVar2.ays);
        }
        return dataMap;
    }

    /* renamed from: a */
    private static ArrayList m6324a(List<Asset> list, C2152qm.C2153a.C2154a.C2155a aVar, int i) {
        Object valueOf;
        ArrayList arrayList = new ArrayList(aVar.ayE.length);
        for (C2152qm.C2153a.C2154a aVar2 : aVar.ayE) {
            if (aVar2.type == 14) {
                valueOf = null;
            } else if (i == 9) {
                DataMap dataMap = new DataMap();
                for (C2152qm.C2153a aVar3 : aVar2.ayu.ayD) {
                    m6325a(list, dataMap, aVar3.name, aVar3.ays);
                }
                arrayList.add(dataMap);
            } else if (i == 2) {
                valueOf = aVar2.ayu.ayw;
            } else if (i == 6) {
                valueOf = Integer.valueOf(aVar2.ayu.ayA);
            } else {
                throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
            }
            arrayList.add(valueOf);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m6325a(List<Asset> list, DataMap dataMap, String str, C2152qm.C2153a.C2154a aVar) {
        int i = aVar.type;
        if (i == 14) {
            dataMap.putString(str, (String) null);
            return;
        }
        C2152qm.C2153a.C2154a.C2155a aVar2 = aVar.ayu;
        if (i == 1) {
            dataMap.putByteArray(str, aVar2.ayv);
        } else if (i == 11) {
            dataMap.putStringArray(str, aVar2.ayF);
        } else if (i == 12) {
            dataMap.putLongArray(str, aVar2.ayG);
        } else if (i == 15) {
            dataMap.putFloatArray(str, aVar2.ayH);
        } else if (i == 2) {
            dataMap.putString(str, aVar2.ayw);
        } else if (i == 3) {
            dataMap.putDouble(str, aVar2.ayx);
        } else if (i == 4) {
            dataMap.putFloat(str, aVar2.ayy);
        } else if (i == 5) {
            dataMap.putLong(str, aVar2.ayz);
        } else if (i == 6) {
            dataMap.putInt(str, aVar2.ayA);
        } else if (i == 7) {
            dataMap.putByte(str, (byte) aVar2.ayB);
        } else if (i == 8) {
            dataMap.putBoolean(str, aVar2.ayC);
        } else if (i == 13) {
            if (list == null) {
                throw new RuntimeException("populateBundle: unexpected type for: " + str);
            }
            dataMap.putAsset(str, list.get((int) aVar2.ayI));
        } else if (i == 9) {
            DataMap dataMap2 = new DataMap();
            for (C2152qm.C2153a aVar3 : aVar2.ayD) {
                m6325a(list, dataMap2, aVar3.name, aVar3.ays);
            }
            dataMap.putDataMap(str, dataMap2);
        } else if (i == 10) {
            int a = m6319a(str, aVar2.ayE);
            ArrayList a2 = m6324a(list, aVar2, a);
            if (a != 14) {
                if (a == 9) {
                    dataMap.putDataMapArrayList(str, a2);
                    return;
                } else if (a != 2) {
                    if (a == 6) {
                        dataMap.putIntegerArrayList(str, a2);
                        return;
                    }
                    throw new IllegalStateException("Unexpected typeOfArrayList: " + a);
                }
            }
            dataMap.putStringArrayList(str, a2);
        } else {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
    }

    /* renamed from: a */
    private static C2152qm.C2153a[] m6326a(DataMap dataMap, List<Asset> list) {
        Set<String> keySet = dataMap.keySet();
        C2152qm.C2153a[] aVarArr = new C2152qm.C2153a[keySet.size()];
        int i = 0;
        for (String next : keySet) {
            Object obj = dataMap.get(next);
            aVarArr[i] = new C2152qm.C2153a();
            aVarArr[i].name = next;
            aVarArr[i].ays = m6322a(list, obj);
            i++;
        }
        return aVarArr;
    }
}
