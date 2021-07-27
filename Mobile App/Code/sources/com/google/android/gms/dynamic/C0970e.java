package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.C0967d;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.e */
public final class C0970e<T> extends C0967d.C0968a {

    /* renamed from: TH */
    private final T f1316TH;

    private C0970e(T t) {
        this.f1316TH = t;
    }

    /* renamed from: f */
    public static <T> T m1612f(C0967d dVar) {
        if (dVar instanceof C0970e) {
            return ((C0970e) dVar).f1316TH;
        }
        IBinder asBinder = dVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    /* renamed from: k */
    public static <T> C0967d m1613k(T t) {
        return new C0970e(t);
    }
}
