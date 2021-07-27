package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;

public class Filters {
    public static Filter and(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.f1203SB, filter, filterArr);
    }

    public static Filter and(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.f1203SB, iterable);
    }

    public static Filter contains(SearchableMetadataField<String> searchableMetadataField, String str) {
        return new ComparisonFilter(Operator.f1206SE, searchableMetadataField, str);
    }

    /* renamed from: eq */
    public static Filter m1323eq(CustomPropertyKey customPropertyKey, String str) {
        return new HasFilter(SearchableField.f1164Se, new AppVisibleCustomProperties.C0871a().mo11772a(customPropertyKey, str).mo11773iW());
    }

    /* renamed from: eq */
    public static <T> Filter m1324eq(SearchableMetadataField<T> searchableMetadataField, T t) {
        return new ComparisonFilter(Operator.f1207Sw, searchableMetadataField, t);
    }

    public static <T extends Comparable<T>> Filter greaterThan(SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        return new ComparisonFilter(Operator.f1210Sz, searchableOrderedMetadataField, t);
    }

    public static <T extends Comparable<T>> Filter greaterThanEquals(SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        return new ComparisonFilter(Operator.f1202SA, searchableOrderedMetadataField, t);
    }

    /* renamed from: in */
    public static <T> Filter m1325in(SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        return new InFilter(searchableCollectionMetadataField, t);
    }

    public static <T extends Comparable<T>> Filter lessThan(SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        return new ComparisonFilter(Operator.f1208Sx, searchableOrderedMetadataField, t);
    }

    public static <T extends Comparable<T>> Filter lessThanEquals(SearchableOrderedMetadataField<T> searchableOrderedMetadataField, T t) {
        return new ComparisonFilter(Operator.f1209Sy, searchableOrderedMetadataField, t);
    }

    public static Filter not(Filter filter) {
        return new NotFilter(filter);
    }

    public static Filter openedByMe() {
        return new FieldOnlyFilter(SearchableField.LAST_VIEWED_BY_ME);
    }

    /* renamed from: or */
    public static Filter m1326or(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.f1204SC, filter, filterArr);
    }

    /* renamed from: or */
    public static Filter m1327or(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.f1204SC, iterable);
    }

    public static Filter sharedWithMe() {
        return new FieldOnlyFilter(SearchableField.f1163Sd);
    }
}
