package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0578m;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.gms.analytics.n */
abstract class C0579n<T extends C0578m> {
    Context mContext;

    /* renamed from: yL */
    C0580a<T> f281yL;

    /* renamed from: com.google.android.gms.analytics.n$a */
    public interface C0580a<U extends C0578m> {
        /* renamed from: c */
        void mo10383c(String str, int i);

        /* renamed from: e */
        void mo10384e(String str, String str2);

        /* renamed from: e */
        void mo10385e(String str, boolean z);

        /* renamed from: er */
        U mo10386er();

        /* renamed from: f */
        void mo10387f(String str, String str2);
    }

    public C0579n(Context context, C0580a<T> aVar) {
        this.mContext = context;
        this.f281yL = aVar;
    }

    /* renamed from: a */
    private T m232a(XmlResourceParser xmlResourceParser) {
        StringBuilder sb;
        String str;
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase();
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.f281yL.mo10384e(attributeValue, trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.f281yL.mo10387f(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.f281yL.mo10385e(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e) {
                                str = "Error parsing bool configuration value: " + trim3;
                                C0550ae.m103T(str);
                                eventType = xmlResourceParser.next();
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.f281yL.mo10383c(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e2) {
                                str = "Error parsing int configuration value: " + trim4;
                                C0550ae.m103T(str);
                                eventType = xmlResourceParser.next();
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Error parsing tracker configuration file: ");
            sb.append(e);
            C0550ae.m103T(sb.toString());
            return this.f281yL.mo10386er();
        } catch (IOException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Error parsing tracker configuration file: ");
            sb.append(e);
            C0550ae.m103T(sb.toString());
            return this.f281yL.mo10386er();
        }
        return this.f281yL.mo10386er();
    }

    /* renamed from: x */
    public T mo10475x(int i) {
        try {
            return m232a(this.mContext.getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            C0550ae.m106W("inflate() called with unknown resourceId: " + e);
            return null;
        }
    }
}
