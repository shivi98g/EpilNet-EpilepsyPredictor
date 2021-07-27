package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1829la;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.wobs.a */
public class C2676a implements Parcelable.Creator<CommonWalletObject> {
    /* renamed from: a */
    static void m7850a(CommonWalletObject commonWalletObject, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, commonWalletObject.getVersionCode());
        C0723b.m763a(parcel, 2, commonWalletObject.f4511fl, false);
        C0723b.m763a(parcel, 3, commonWalletObject.avk, false);
        C0723b.m763a(parcel, 4, commonWalletObject.name, false);
        C0723b.m763a(parcel, 5, commonWalletObject.ave, false);
        C0723b.m763a(parcel, 6, commonWalletObject.avg, false);
        C0723b.m763a(parcel, 7, commonWalletObject.avh, false);
        C0723b.m763a(parcel, 8, commonWalletObject.avi, false);
        C0723b.m763a(parcel, 9, commonWalletObject.avj, false);
        C0723b.m775c(parcel, 10, commonWalletObject.state);
        C0723b.m776c(parcel, 11, commonWalletObject.avl, false);
        C0723b.m759a(parcel, 12, (Parcelable) commonWalletObject.avm, i, false);
        C0723b.m776c(parcel, 13, commonWalletObject.avn, false);
        C0723b.m763a(parcel, 14, commonWalletObject.avo, false);
        C0723b.m763a(parcel, 15, commonWalletObject.avp, false);
        C0723b.m766a(parcel, 17, commonWalletObject.avr);
        C0723b.m776c(parcel, 16, commonWalletObject.avq, false);
        C0723b.m776c(parcel, 19, commonWalletObject.avt, false);
        C0723b.m776c(parcel, 18, commonWalletObject.avs, false);
        C0723b.m776c(parcel, 20, commonWalletObject.avu, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ec */
    public CommonWalletObject createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        ArrayList<C2691p> ie = C1829la.m5517ie();
        ArrayList ie2 = C1829la.m5517ie();
        ArrayList<C2679d> ie3 = C1829la.m5517ie();
        ArrayList<C2691p> arrayList = ie;
        ArrayList arrayList2 = ie2;
        ArrayList<C2679d> arrayList3 = ie3;
        ArrayList<C2689n> ie4 = C1829la.m5517ie();
        ArrayList<C2685j> ie5 = C1829la.m5517ie();
        ArrayList<C2689n> ie6 = C1829la.m5517ie();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        C2687l lVar = null;
        String str9 = null;
        String str10 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 6:
                    str5 = C0721a.m736o(parcel2, F);
                    break;
                case 7:
                    str6 = C0721a.m736o(parcel2, F);
                    break;
                case 8:
                    str7 = C0721a.m736o(parcel2, F);
                    break;
                case 9:
                    str8 = C0721a.m736o(parcel2, F);
                    break;
                case 10:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 11:
                    arrayList = C0721a.m723c(parcel2, F, C2691p.CREATOR);
                    break;
                case 12:
                    lVar = (C2687l) C0721a.m716a(parcel2, F, C2687l.CREATOR);
                    break;
                case 13:
                    arrayList2 = C0721a.m723c(parcel2, F, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = C0721a.m736o(parcel2, F);
                    break;
                case 15:
                    str10 = C0721a.m736o(parcel2, F);
                    break;
                case 16:
                    arrayList3 = C0721a.m723c(parcel2, F, C2679d.CREATOR);
                    break;
                case 17:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 18:
                    ie4 = C0721a.m723c(parcel2, F, C2689n.CREATOR);
                    break;
                case 19:
                    ie5 = C0721a.m723c(parcel2, F, C2685j.CREATOR);
                    break;
                case 20:
                    ie6 = C0721a.m723c(parcel2, F, C2689n.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CommonWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, i2, arrayList, lVar, arrayList2, str9, str10, arrayList3, z, ie4, ie5, ie6);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: gl */
    public CommonWalletObject[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
