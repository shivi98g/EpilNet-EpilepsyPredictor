package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.internal.C1299as;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ap */
public class C1294ap {

    /* renamed from: nT */
    private final int f2374nT;

    /* renamed from: nU */
    private final int f2375nU;

    /* renamed from: nV */
    private final C1293ao f2376nV = new C1298ar();

    /* renamed from: nW */
    private Base64OutputStream f2377nW;

    /* renamed from: nX */
    private ByteArrayOutputStream f2378nX;

    public C1294ap(int i) {
        this.f2375nU = i;
        this.f2374nT = 6;
    }

    /* renamed from: m */
    private String m3922m(String str) {
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return "";
        }
        this.f2378nX = new ByteArrayOutputStream();
        this.f2377nW = new Base64OutputStream(this.f2378nX, 10);
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        });
        int i = 0;
        while (i < split.length && i < this.f2375nU) {
            if (split[i].trim().length() != 0) {
                try {
                    this.f2377nW.write(this.f2376nV.mo14797l(split[i]));
                } catch (IOException e) {
                    C1607gr.m4711b("Error while writing hash to byteStream", e);
                }
            }
            i++;
        }
        try {
            this.f2377nW.flush();
            this.f2377nW.close();
            return this.f2378nX.toString();
        } catch (IOException e2) {
            C1607gr.m4711b("HashManager: Unable to convert to base 64", e2);
            return "";
        }
    }

    /* renamed from: a */
    public String mo14798a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toLowerCase(Locale.US));
            stringBuffer.append(10);
        }
        switch (0) {
            case 0:
                return mo14799n(stringBuffer.toString());
            case 1:
                return m3922m(stringBuffer.toString());
            default:
                return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo14799n(String str) {
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return "";
        }
        this.f2378nX = new ByteArrayOutputStream();
        this.f2377nW = new Base64OutputStream(this.f2378nX, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.f2375nU, new Comparator<C1299as.C1300a>() {
            /* renamed from: a */
            public int compare(C1299as.C1300a aVar, C1299as.C1300a aVar2) {
                return (int) (aVar.value - aVar2.value);
            }
        });
        for (String p : split) {
            String[] p2 = C1297aq.m3929p(p);
            if (p2.length >= this.f2374nT) {
                C1299as.m3937a(p2, this.f2375nU, this.f2374nT, (PriorityQueue<C1299as.C1300a>) priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                this.f2377nW.write(this.f2376nV.mo14797l(((C1299as.C1300a) it.next()).f2382oa));
            } catch (IOException e) {
                C1607gr.m4711b("Error while writing hash to byteStream", e);
            }
        }
        try {
            this.f2377nW.flush();
            this.f2377nW.close();
            return this.f2378nX.toString();
        } catch (IOException e2) {
            C1607gr.m4711b("HashManager: unable to convert to base 64", e2);
            return "";
        }
    }
}
