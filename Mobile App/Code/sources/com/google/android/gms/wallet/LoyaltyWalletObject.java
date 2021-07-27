package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1829la;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.C2679d;
import com.google.android.gms.wallet.wobs.C2681f;
import com.google.android.gms.wallet.wobs.C2685j;
import com.google.android.gms.wallet.wobs.C2687l;
import com.google.android.gms.wallet.wobs.C2689n;
import com.google.android.gms.wallet.wobs.C2691p;
import java.util.ArrayList;

public final class LoyaltyWalletObject implements SafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new C2668j();

    /* renamed from: CK */
    private final int f4492CK;
    String aki;
    String avd;
    String ave;
    String avf;
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
    C2681f avv;

    /* renamed from: fl */
    String f4493fl;
    int state;

    LoyaltyWalletObject() {
        this.f4492CK = 4;
        this.avl = C1829la.m5517ie();
        this.avn = C1829la.m5517ie();
        this.avq = C1829la.m5517ie();
        this.avs = C1829la.m5517ie();
        this.avt = C1829la.m5517ie();
        this.avu = C1829la.m5517ie();
    }

    LoyaltyWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList<C2691p> arrayList, C2687l lVar, ArrayList<LatLng> arrayList2, String str11, String str12, ArrayList<C2679d> arrayList3, boolean z, ArrayList<C2689n> arrayList4, ArrayList<C2685j> arrayList5, ArrayList<C2689n> arrayList6, C2681f fVar) {
        this.f4492CK = i;
        this.f4493fl = str;
        this.avd = str2;
        this.ave = str3;
        this.avf = str4;
        this.aki = str5;
        this.avg = str6;
        this.avh = str7;
        this.avi = str8;
        this.avj = str9;
        this.avk = str10;
        this.state = i2;
        this.avl = arrayList;
        this.avm = lVar;
        this.avn = arrayList2;
        this.avo = str11;
        this.avp = str12;
        this.avq = arrayList3;
        this.avr = z;
        this.avs = arrayList4;
        this.avt = arrayList5;
        this.avu = arrayList6;
        this.avv = fVar;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountId() {
        return this.avd;
    }

    public String getAccountName() {
        return this.aki;
    }

    public String getBarcodeAlternateText() {
        return this.avg;
    }

    public String getBarcodeType() {
        return this.avh;
    }

    public String getBarcodeValue() {
        return this.avi;
    }

    public String getId() {
        return this.f4493fl;
    }

    public String getIssuerName() {
        return this.ave;
    }

    public String getProgramName() {
        return this.avf;
    }

    public int getVersionCode() {
        return this.f4492CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2668j.m7829a(this, parcel, i);
    }
}
