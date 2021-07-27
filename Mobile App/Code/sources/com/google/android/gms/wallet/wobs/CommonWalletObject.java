package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1829la;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class CommonWalletObject implements SafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new C2676a();

    /* renamed from: CK */
    private final int f4510CK;
    String ave;
    String avg;
    String avh;
    String avi;
    String avj;
    String avk;
    ArrayList<C2691p> avl;
    C2687l avm;
    ArrayList<LatLng> avn;
    String avo;
    String avp;
    ArrayList<C2679d> avq;
    boolean avr;
    ArrayList<C2689n> avs;
    ArrayList<C2685j> avt;
    ArrayList<C2689n> avu;

    /* renamed from: fl */
    String f4511fl;
    String name;
    int state;

    /* renamed from: com.google.android.gms.wallet.wobs.CommonWalletObject$a */
    public final class C2675a {
        private C2675a() {
        }

        /* renamed from: dh */
        public C2675a mo19199dh(String str) {
            CommonWalletObject.this.f4511fl = str;
            return this;
        }

        /* renamed from: ri */
        public CommonWalletObject mo19200ri() {
            return CommonWalletObject.this;
        }
    }

    CommonWalletObject() {
        this.f4510CK = 1;
        this.avl = C1829la.m5517ie();
        this.avn = C1829la.m5517ie();
        this.avq = C1829la.m5517ie();
        this.avs = C1829la.m5517ie();
        this.avt = C1829la.m5517ie();
        this.avu = C1829la.m5517ie();
    }

    CommonWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList<C2691p> arrayList, C2687l lVar, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<C2679d> arrayList3, boolean z, ArrayList<C2689n> arrayList4, ArrayList<C2685j> arrayList5, ArrayList<C2689n> arrayList6) {
        this.f4510CK = i;
        this.f4511fl = str;
        this.avk = str2;
        this.name = str3;
        this.ave = str4;
        this.avg = str5;
        this.avh = str6;
        this.avi = str7;
        this.avj = str8;
        this.state = i2;
        this.avl = arrayList;
        this.avm = lVar;
        this.avn = arrayList2;
        this.avo = str9;
        this.avp = str10;
        this.avq = arrayList3;
        this.avr = z;
        this.avs = arrayList4;
        this.avt = arrayList5;
        this.avu = arrayList6;
    }

    /* renamed from: rh */
    public static C2675a m7847rh() {
        CommonWalletObject commonWalletObject = new CommonWalletObject();
        commonWalletObject.getClass();
        return new C2675a();
    }

    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f4511fl;
    }

    public int getVersionCode() {
        return this.f4510CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2676a.m7850a(this, parcel, i);
    }
}
