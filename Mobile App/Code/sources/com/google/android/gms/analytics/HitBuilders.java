package com.google.android.gms.analytics;

import android.support.p000v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0605y;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HitBuilders {

    @Deprecated
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_APP_VIEW);
            set("&t", "screenview");
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }
    }

    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_EVENT);
            set("&t", "event");
        }

        public EventBuilder(String str, String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public EventBuilder setAction(String str) {
            set("&ea", str);
            return this;
        }

        public EventBuilder setCategory(String str) {
            set("&ec", str);
            return this;
        }

        public EventBuilder setLabel(String str) {
            set("&el", str);
            return this;
        }

        public EventBuilder setValue(long j) {
            set("&ev", Long.toString(j));
            return this;
        }
    }

    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_EXCEPTION);
            set("&t", "exception");
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public ExceptionBuilder setDescription(String str) {
            set("&exd", str);
            return this;
        }

        public ExceptionBuilder setFatal(boolean z) {
            set("&exf", C0561an.m160E(z));
            return this;
        }
    }

    protected static class HitBuilder<T extends HitBuilder> {

        /* renamed from: BA */
        private Map<String, String> f152BA = new HashMap();

        /* renamed from: BB */
        ProductAction f153BB;

        /* renamed from: BC */
        Map<String, List<Product>> f154BC = new HashMap();

        /* renamed from: BD */
        List<Promotion> f155BD = new ArrayList();

        /* renamed from: BE */
        List<Product> f156BE = new ArrayList();

        protected HitBuilder() {
        }

        public T addImpression(Product product, String str) {
            if (product == null) {
                C0550ae.m106W("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.f154BC.containsKey(str)) {
                this.f154BC.put(str, new ArrayList());
            }
            this.f154BC.get(str).add(product);
            return this;
        }

        public T addProduct(Product product) {
            if (product == null) {
                C0550ae.m106W("product should be non-null");
                return this;
            }
            this.f156BE.add(product);
            return this;
        }

        public T addPromotion(Promotion promotion) {
            if (promotion == null) {
                C0550ae.m106W("promotion should be non-null");
                return this;
            }
            this.f155BD.add(promotion);
            return this;
        }

        public Map<String, String> build() {
            HashMap hashMap = new HashMap(this.f152BA);
            if (this.f153BB != null) {
                hashMap.putAll(this.f153BB.build());
            }
            int i = 1;
            for (Promotion aq : this.f155BD) {
                hashMap.putAll(aq.mo10439aq(C0585s.m254B(i)));
                i++;
            }
            int i2 = 1;
            for (Product aq2 : this.f156BE) {
                hashMap.putAll(aq2.mo10414aq(C0585s.m253A(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry next : this.f154BC.entrySet()) {
                String D = C0585s.m256D(i3);
                int i4 = 1;
                for (Product aq3 : (List) next.getValue()) {
                    hashMap.putAll(aq3.mo10414aq(D + C0585s.m255C(i4)));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                    hashMap.put(D + "nm", next.getKey());
                }
                i3++;
            }
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public String get(String str) {
            return this.f152BA.get(str);
        }

        public final T set(String str, String str2) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.MAP_BUILDER_SET);
            if (str != null) {
                this.f152BA.put(str, str2);
                return this;
            }
            C0550ae.m106W(" HitBuilder.set() called with a null paramName.");
            return this;
        }

        public final T setAll(Map<String, String> map) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.MAP_BUILDER_SET_ALL);
            if (map == null) {
                return this;
            }
            this.f152BA.putAll(new HashMap(map));
            return this;
        }

        public T setCampaignParamsFromUrl(String str) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.MAP_BUILDER_SET_CAMPAIGN_PARAMS);
            String ao = C0561an.m166ao(str);
            if (TextUtils.isEmpty(ao)) {
                return this;
            }
            Map<String, String> an = C0561an.m165an(ao);
            set("&cc", an.get("utm_content"));
            set("&cm", an.get("utm_medium"));
            set("&cn", an.get("utm_campaign"));
            set("&cs", an.get("utm_source"));
            set("&ck", an.get("utm_term"));
            set("&ci", an.get("utm_id"));
            set("&gclid", an.get("gclid"));
            set("&dclid", an.get("dclid"));
            set("&gmob_t", an.get("gmob_t"));
            return this;
        }

        public T setCustomDimension(int i, String str) {
            set(C0585s.m260y(i), str);
            return this;
        }

        public T setCustomMetric(int i, float f) {
            set(C0585s.m261z(i), Float.toString(f));
            return this;
        }

        /* access modifiers changed from: protected */
        public T setHitType(String str) {
            set("&t", str);
            return this;
        }

        public T setNewSession() {
            set("&sc", "start");
            return this;
        }

        public T setNonInteraction(boolean z) {
            set("&ni", C0561an.m160E(z));
            return this;
        }

        public T setProductAction(ProductAction productAction) {
            this.f153BB = productAction;
            return this;
        }

        public T setPromotionAction(String str) {
            this.f152BA.put("&promoa", str);
            return this;
        }
    }

    @Deprecated
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_ITEM);
            set("&t", "item");
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public ItemBuilder setCategory(String str) {
            set("&iv", str);
            return this;
        }

        public ItemBuilder setCurrencyCode(String str) {
            set("&cu", str);
            return this;
        }

        public ItemBuilder setName(String str) {
            set("&in", str);
            return this;
        }

        public ItemBuilder setPrice(double d) {
            set("&ip", Double.toString(d));
            return this;
        }

        public ItemBuilder setQuantity(long j) {
            set("&iq", Long.toString(j));
            return this;
        }

        public ItemBuilder setSku(String str) {
            set("&ic", str);
            return this;
        }

        public ItemBuilder setTransactionId(String str) {
            set("&ti", str);
            return this;
        }
    }

    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_APP_VIEW);
            set("&t", "screenview");
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }
    }

    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_SOCIAL);
            set("&t", NotificationCompat.CATEGORY_SOCIAL);
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public SocialBuilder setAction(String str) {
            set("&sa", str);
            return this;
        }

        public SocialBuilder setNetwork(String str) {
            set("&sn", str);
            return this;
        }

        public SocialBuilder setTarget(String str) {
            set("&st", str);
            return this;
        }
    }

    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_TIMING);
            set("&t", "timing");
        }

        public TimingBuilder(String str, String str2, long j) {
            this();
            setVariable(str2);
            setValue(j);
            setCategory(str);
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public TimingBuilder setCategory(String str) {
            set("&utc", str);
            return this;
        }

        public TimingBuilder setLabel(String str) {
            set("&utl", str);
            return this;
        }

        public TimingBuilder setValue(long j) {
            set("&utt", Long.toString(j));
            return this;
        }

        public TimingBuilder setVariable(String str) {
            set("&utv", str);
            return this;
        }
    }

    @Deprecated
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            C0605y.m324eK().mo10499a(C0605y.C0606a.CONSTRUCT_TRANSACTION);
            set("&t", "transaction");
        }

        public /* bridge */ /* synthetic */ Map build() {
            return super.build();
        }

        public TransactionBuilder setAffiliation(String str) {
            set("&ta", str);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String str) {
            set("&cu", str);
            return this;
        }

        public TransactionBuilder setRevenue(double d) {
            set("&tr", Double.toString(d));
            return this;
        }

        public TransactionBuilder setShipping(double d) {
            set("&ts", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTax(double d) {
            set("&tt", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTransactionId(String str) {
            set("&ti", str);
            return this;
        }
    }
}
