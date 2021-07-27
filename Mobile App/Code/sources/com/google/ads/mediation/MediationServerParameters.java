package com.google.ads.mediation;

import com.google.android.gms.internal.C1607gr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public abstract class MediationServerParameters {

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface Parameter {
        String name();

        boolean required() default true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9947a() {
    }

    public void load(Map<String, String> map) throws MappingException {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            Parameter parameter = (Parameter) field.getAnnotation(Parameter.class);
            if (parameter != null) {
                hashMap.put(parameter.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C1607gr.m4709W("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException e) {
                    sb = new StringBuilder();
                    sb.append("Server option \"");
                    sb.append((String) next.getKey());
                    str = "\" could not be set: Illegal Access";
                } catch (IllegalArgumentException e2) {
                    sb = new StringBuilder();
                    sb.append("Server option \"");
                    sb.append((String) next.getKey());
                    str = "\" could not be set: Bad Type";
                }
            } else {
                C1607gr.m4705S("Unexpected server option: " + ((String) next.getKey()) + " = \"" + ((String) next.getValue()) + "\"");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((Parameter) field3.getAnnotation(Parameter.class)).required()) {
                C1607gr.m4709W("Required server option missing: " + ((Parameter) field3.getAnnotation(Parameter.class)).name());
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(((Parameter) field3.getAnnotation(Parameter.class)).name());
            }
        }
        if (sb2.length() > 0) {
            throw new MappingException("Required server option(s) missing: " + sb2.toString());
        }
        mo9947a();
        return;
        sb.append(str);
        C1607gr.m4709W(sb.toString());
    }
}
