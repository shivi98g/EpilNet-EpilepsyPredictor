package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.tagmanager.dj */
class C2591dj extends C2588dg {

    /* renamed from: ID */
    private static final String f4457ID = C1259a.UNIVERSAL_ANALYTICS.toString();
    private static final String aul = C1308b.ACCOUNT.toString();
    private static final String aum = C1308b.ANALYTICS_PASS_THROUGH.toString();
    private static final String aun = C1308b.ENABLE_ECOMMERCE.toString();
    private static final String auo = C1308b.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String aup = C1308b.ECOMMERCE_MACRO_DATA.toString();
    private static final String auq = C1308b.ANALYTICS_FIELDS.toString();
    private static final String aur = C1308b.TRACK_TRANSACTION.toString();
    private static final String aus = C1308b.TRANSACTION_DATALAYER_MAP.toString();
    private static final String aut = C1308b.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> auu = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern auv = Pattern.compile("dimension(\\d+)");
    private static final Pattern auw = Pattern.compile("metric(\\d+)");
    private static Map<String, String> aux;
    private static Map<String, String> auy;
    private final DataLayer aqn;
    private final C2586df auA;
    private final Set<String> auz;

    public C2591dj(Context context, DataLayer dataLayer) {
        this(context, dataLayer, new C2586df(context));
    }

    C2591dj(Context context, DataLayer dataLayer, C2586df dfVar) {
        super(f4457ID, new String[0]);
        this.aqn = dataLayer;
        this.auA = dfVar;
        this.auz = new HashSet();
        this.auz.add("");
        this.auz.add("0");
        this.auz.add("false");
    }

    /* renamed from: L */
    private Promotion m7555L(Map<String, String> map) {
        Promotion promotion = new Promotion();
        String str = map.get("id");
        if (str != null) {
            promotion.setId(String.valueOf(str));
        }
        String str2 = map.get("name");
        if (str2 != null) {
            promotion.setName(String.valueOf(str2));
        }
        String str3 = map.get("creative");
        if (str3 != null) {
            promotion.setCreative(String.valueOf(str3));
        }
        String str4 = map.get("position");
        if (str4 != null) {
            promotion.setPosition(String.valueOf(str4));
        }
        return promotion;
    }

    /* renamed from: M */
    private Product m7556M(Map<String, Object> map) {
        StringBuilder sb;
        String str;
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            product.setName(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            product.setBrand(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            product.setCouponCode(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(m7569z(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            product.setPrice(m7568y(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(m7569z(obj9).intValue());
        }
        for (String next : map.keySet()) {
            Matcher matcher = auv.matcher(next);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(next)));
                } catch (NumberFormatException e) {
                    sb = new StringBuilder();
                    str = "illegal number in custom dimension value: ";
                    sb.append(str);
                    sb.append(next);
                    C2504bh.m7246W(sb.toString());
                }
            } else {
                Matcher matcher2 = auw.matcher(next);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), m7569z(map.get(next)).intValue());
                    } catch (NumberFormatException e2) {
                        sb = new StringBuilder();
                        str = "illegal number in custom metric value: ";
                        sb.append(str);
                        sb.append(next);
                        C2504bh.m7246W(sb.toString());
                    }
                }
            }
        }
        return product;
    }

    /* renamed from: N */
    private Map<String, String> m7557N(Map<String, C1408d.C1409a> map) {
        C1408d.C1409a aVar = map.get(aus);
        if (aVar != null) {
            return m7563c(aVar);
        }
        if (aux == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", "&ti");
            hashMap.put("transactionAffiliation", "&ta");
            hashMap.put("transactionTax", "&tt");
            hashMap.put("transactionShipping", "&ts");
            hashMap.put("transactionTotal", "&tr");
            hashMap.put("transactionCurrency", "&cu");
            aux = hashMap;
        }
        return aux;
    }

    /* renamed from: O */
    private Map<String, String> m7558O(Map<String, C1408d.C1409a> map) {
        C1408d.C1409a aVar = map.get(aut);
        if (aVar != null) {
            return m7563c(aVar);
        }
        if (auy == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", "&in");
            hashMap.put("sku", "&ic");
            hashMap.put("category", "&iv");
            hashMap.put("price", "&ip");
            hashMap.put("quantity", "&iq");
            hashMap.put("currency", "&cu");
            auy = hashMap;
        }
        return auy;
    }

    /* renamed from: a */
    private void m7559a(Tracker tracker, Map<String, C1408d.C1409a> map) {
        String de = m7564de("transactionId");
        if (de == null) {
            C2504bh.m7243T("Cannot find transactionId in data layer.");
            return;
        }
        LinkedList<Map> linkedList = new LinkedList<>();
        try {
            Map<String, String> p = m7567p(map.get(auq));
            p.put("&t", "transaction");
            for (Map.Entry next : m7557N(map).entrySet()) {
                m7561b(p, (String) next.getValue(), m7564de((String) next.getKey()));
            }
            linkedList.add(p);
            List<Map<String, String>> df = m7565df("transactionProducts");
            if (df != null) {
                for (Map next2 : df) {
                    if (next2.get("name") == null) {
                        C2504bh.m7243T("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map<String, String> p2 = m7567p(map.get(auq));
                    p2.put("&t", "item");
                    p2.put("&ti", de);
                    for (Map.Entry next3 : m7558O(map).entrySet()) {
                        m7561b(p2, (String) next3.getValue(), (String) next2.get(next3.getKey()));
                    }
                    linkedList.add(p2);
                }
            }
            for (Map send : linkedList) {
                tracker.send(send);
            }
        } catch (IllegalArgumentException e) {
            C2504bh.m7247b("Unable to send transaction", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if ((r8 instanceof java.util.Map) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if ((r8 instanceof java.util.Map) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7560b(com.google.android.gms.analytics.Tracker r7, java.util.Map<java.lang.String, com.google.android.gms.internal.C1408d.C1409a> r8) {
        /*
            r6 = this;
            com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder r0 = new com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder
            r0.<init>()
            java.lang.String r1 = auq
            java.lang.Object r1 = r8.get(r1)
            com.google.android.gms.internal.d$a r1 = (com.google.android.gms.internal.C1408d.C1409a) r1
            java.util.Map r1 = r6.m7567p(r1)
            r0.setAll(r1)
            java.lang.String r2 = auo
            boolean r2 = r6.m7566f(r8, r2)
            r3 = 0
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.tagmanager.DataLayer r8 = r6.aqn
            java.lang.String r2 = "ecommerce"
            java.lang.Object r8 = r8.get(r2)
            boolean r2 = r8 instanceof java.util.Map
            if (r2 == 0) goto L_0x003d
            goto L_0x003a
        L_0x002a:
            java.lang.String r2 = aup
            java.lang.Object r8 = r8.get(r2)
            com.google.android.gms.internal.d$a r8 = (com.google.android.gms.internal.C1408d.C1409a) r8
            java.lang.Object r8 = com.google.android.gms.tagmanager.C2590di.m7538o(r8)
            boolean r2 = r8 instanceof java.util.Map
            if (r2 == 0) goto L_0x003d
        L_0x003a:
            java.util.Map r8 = (java.util.Map) r8
            goto L_0x003e
        L_0x003d:
            r8 = r3
        L_0x003e:
            if (r8 == 0) goto L_0x01a4
            java.lang.String r2 = "&cu"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = "currencyCode"
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0052:
            if (r1 == 0) goto L_0x0059
            java.lang.String r2 = "&cu"
            r0.set(r2, r1)
        L_0x0059:
            java.lang.String r1 = "impressions"
            java.lang.Object r1 = r8.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L_0x009f
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            com.google.android.gms.analytics.ecommerce.Product r4 = r6.m7556M(r2)     // Catch:{ RuntimeException -> 0x0085 }
            java.lang.String r5 = "list"
            java.lang.Object r2 = r2.get(r5)     // Catch:{ RuntimeException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RuntimeException -> 0x0085 }
            r0.addImpression(r4, r2)     // Catch:{ RuntimeException -> 0x0085 }
            goto L_0x0069
        L_0x0085:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to extract a product from DataLayer. "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.tagmanager.C2504bh.m7243T(r2)
            goto L_0x0069
        L_0x009f:
            java.lang.String r1 = "promoClick"
            boolean r1 = r8.containsKey(r1)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = "promoClick"
        L_0x00a9:
            java.lang.Object r1 = r8.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "promotions"
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            goto L_0x00c4
        L_0x00b9:
            java.lang.String r1 = "promoView"
            boolean r1 = r8.containsKey(r1)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = "promoView"
            goto L_0x00a9
        L_0x00c4:
            r1 = 1
            if (r3 == 0) goto L_0x0111
            java.util.Iterator r2 = r3.iterator()
        L_0x00cb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            com.google.android.gms.analytics.ecommerce.Promotion r3 = r6.m7555L(r3)     // Catch:{ RuntimeException -> 0x00df }
            r0.addPromotion(r3)     // Catch:{ RuntimeException -> 0x00df }
            goto L_0x00cb
        L_0x00df:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to extract a promotion from DataLayer. "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.gms.tagmanager.C2504bh.m7243T(r3)
            goto L_0x00cb
        L_0x00f9:
            java.lang.String r2 = "promoClick"
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x010a
            java.lang.String r1 = "&promoa"
            java.lang.String r2 = "click"
            r0.set(r1, r2)
            r1 = 0
            goto L_0x0111
        L_0x010a:
            java.lang.String r2 = "&promoa"
            java.lang.String r3 = "view"
            r0.set(r2, r3)
        L_0x0111:
            if (r1 == 0) goto L_0x01a4
            java.util.List<java.lang.String> r1 = auu
            java.util.Iterator r1 = r1.iterator()
        L_0x0119:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r8.containsKey(r2)
            if (r3 == 0) goto L_0x0119
            java.lang.Object r8 = r8.get(r2)
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r1 = "products"
            java.lang.Object r1 = r8.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x016d
            java.util.Iterator r1 = r1.iterator()
        L_0x013f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x016d
            java.lang.Object r3 = r1.next()
            java.util.Map r3 = (java.util.Map) r3
            com.google.android.gms.analytics.ecommerce.Product r3 = r6.m7556M(r3)     // Catch:{ RuntimeException -> 0x0153 }
            r0.addProduct(r3)     // Catch:{ RuntimeException -> 0x0153 }
            goto L_0x013f
        L_0x0153:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to extract a product from DataLayer. "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.gms.tagmanager.C2504bh.m7243T(r3)
            goto L_0x013f
        L_0x016d:
            java.lang.String r1 = "actionField"
            boolean r1 = r8.containsKey(r1)     // Catch:{ RuntimeException -> 0x018b }
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = "actionField"
            java.lang.Object r8 = r8.get(r1)     // Catch:{ RuntimeException -> 0x018b }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ RuntimeException -> 0x018b }
            com.google.android.gms.analytics.ecommerce.ProductAction r8 = r6.m7562c(r2, r8)     // Catch:{ RuntimeException -> 0x018b }
            goto L_0x0187
        L_0x0182:
            com.google.android.gms.analytics.ecommerce.ProductAction r8 = new com.google.android.gms.analytics.ecommerce.ProductAction     // Catch:{ RuntimeException -> 0x018b }
            r8.<init>(r2)     // Catch:{ RuntimeException -> 0x018b }
        L_0x0187:
            r0.setProductAction(r8)     // Catch:{ RuntimeException -> 0x018b }
            goto L_0x01a4
        L_0x018b:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to extract a product action from DataLayer. "
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.google.android.gms.tagmanager.C2504bh.m7243T(r8)
        L_0x01a4:
            java.util.Map r8 = r0.build()
            r7.send(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2591dj.m7560b(com.google.android.gms.analytics.Tracker, java.util.Map):void");
    }

    /* renamed from: b */
    private void m7561b(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: c */
    private ProductAction m7562c(String str, Map<String, Object> map) {
        ProductAction productAction = new ProductAction(str);
        Object obj = map.get("id");
        if (obj != null) {
            productAction.setTransactionId(String.valueOf(obj));
        }
        Object obj2 = map.get("affiliation");
        if (obj2 != null) {
            productAction.setTransactionAffiliation(String.valueOf(obj2));
        }
        Object obj3 = map.get("coupon");
        if (obj3 != null) {
            productAction.setTransactionCouponCode(String.valueOf(obj3));
        }
        Object obj4 = map.get("list");
        if (obj4 != null) {
            productAction.setProductActionList(String.valueOf(obj4));
        }
        Object obj5 = map.get("option");
        if (obj5 != null) {
            productAction.setCheckoutOptions(String.valueOf(obj5));
        }
        Object obj6 = map.get("revenue");
        if (obj6 != null) {
            productAction.setTransactionRevenue(m7568y(obj6).doubleValue());
        }
        Object obj7 = map.get("tax");
        if (obj7 != null) {
            productAction.setTransactionTax(m7568y(obj7).doubleValue());
        }
        Object obj8 = map.get("shipping");
        if (obj8 != null) {
            productAction.setTransactionShipping(m7568y(obj8).doubleValue());
        }
        Object obj9 = map.get("step");
        if (obj9 != null) {
            productAction.setCheckoutStep(m7569z(obj9).intValue());
        }
        return productAction;
    }

    /* renamed from: c */
    private Map<String, String> m7563c(C1408d.C1409a aVar) {
        Object o = C2590di.m7538o(aVar);
        if (!(o instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) o).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: de */
    private String m7564de(String str) {
        Object obj = this.aqn.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* renamed from: df */
    private List<Map<String, String>> m7565df(String str) {
        Object obj = this.aqn.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        List<Map<String, String>> list = (List) obj;
        for (Map<String, String> map : list) {
            if (!(map instanceof Map)) {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }
        return list;
    }

    /* renamed from: f */
    private boolean m7566f(Map<String, C1408d.C1409a> map, String str) {
        C1408d.C1409a aVar = map.get(str);
        if (aVar == null) {
            return false;
        }
        return C2590di.m7537n(aVar).booleanValue();
    }

    /* renamed from: p */
    private Map<String, String> m7567p(C1408d.C1409a aVar) {
        if (aVar == null) {
            return new HashMap();
        }
        Map<String, String> c = m7563c(aVar);
        if (c == null) {
            return new HashMap();
        }
        String str = c.get("&aip");
        if (str != null && this.auz.contains(str.toLowerCase())) {
            c.remove("&aip");
        }
        return c;
    }

    /* renamed from: y */
    private Double m7568y(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Double: " + e.getMessage());
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new RuntimeException("Cannot convert the object to Double: " + obj.toString());
        }
    }

    /* renamed from: z */
    private Integer m7569z(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Integer: " + e.getMessage());
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            throw new RuntimeException("Cannot convert the object to Integer: " + obj.toString());
        }
    }

    /* renamed from: D */
    public void mo18830D(Map<String, C1408d.C1409a> map) {
        Tracker cW = this.auA.mo18829cW("_GTM_DEFAULT_TRACKER_");
        cW.enableAdvertisingIdCollection(m7566f(map, "collect_adid"));
        if (m7566f(map, aun)) {
            m7560b(cW, map);
        } else if (m7566f(map, aum)) {
            cW.send(m7567p(map.get(auq)));
        } else if (m7566f(map, aur)) {
            m7559a(cW, map);
        } else {
            C2504bh.m7246W("Ignoring unknown tag.");
        }
    }
}
