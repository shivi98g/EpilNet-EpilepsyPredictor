package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.C0867b;
import com.google.android.gms.drive.metadata.MetadataField;
import java.util.List;

/* renamed from: com.google.android.gms.drive.query.internal.f */
public interface C0894f<F> {
    /* renamed from: b */
    <T> F mo11850b(C0867b<T> bVar, T t);

    /* renamed from: b */
    <T> F mo11851b(Operator operator, MetadataField<T> metadataField, T t);

    /* renamed from: b */
    F mo11852b(Operator operator, List<F> list);

    /* renamed from: d */
    F mo11856d(MetadataField<?> metadataField);

    /* renamed from: d */
    <T> F mo11857d(MetadataField<T> metadataField, T t);

    /* renamed from: j */
    F mo11858j(F f);

    /* renamed from: jd */
    F mo11860jd();
}
