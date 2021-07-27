package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.C0867b;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.query.internal.C0894f;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

/* renamed from: com.google.android.gms.drive.query.c */
public class C0888c implements C0894f<String> {
    /* renamed from: a */
    public <T> String mo11850b(C0867b<T> bVar, T t) {
        return String.format("contains(%s,%s)", new Object[]{bVar.getName(), t});
    }

    /* renamed from: a */
    public <T> String mo11851b(Operator operator, MetadataField<T> metadataField, T t) {
        return String.format("cmp(%s,%s,%s)", new Object[]{operator.getTag(), metadataField.getName(), t});
    }

    /* renamed from: a */
    public String mo11852b(Operator operator, List<String> list) {
        StringBuilder sb = new StringBuilder(operator.getTag() + "(");
        String str = "";
        for (String append : list) {
            sb.append(str);
            sb.append(append);
            str = ",";
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: bq */
    public String mo11858j(String str) {
        return String.format("not(%s)", new Object[]{str});
    }

    /* renamed from: c */
    public String mo11856d(MetadataField<?> metadataField) {
        return String.format("fieldOnly(%s)", new Object[]{metadataField.getName()});
    }

    /* renamed from: c */
    public <T> String mo11857d(MetadataField<T> metadataField, T t) {
        return String.format("has(%s,%s)", new Object[]{metadataField.getName(), t});
    }

    /* renamed from: jc */
    public String mo11860jd() {
        return "all()";
    }
}
