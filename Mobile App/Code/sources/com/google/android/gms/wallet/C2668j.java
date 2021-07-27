package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1829la;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.C2679d;
import com.google.android.gms.wallet.wobs.C2681f;
import com.google.android.gms.wallet.wobs.C2685j;
import com.google.android.gms.wallet.wobs.C2687l;
import com.google.android.gms.wallet.wobs.C2689n;
import com.google.android.gms.wallet.wobs.C2691p;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.j */
public class C2668j implements Parcelable.Creator<LoyaltyWalletObject> {
    /* renamed from: a */
    static void m7829a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, loyaltyWalletObject.getVersionCode());
        C0723b.m763a(parcel, 2, loyaltyWalletObject.f4493fl, false);
        C0723b.m763a(parcel, 3, loyaltyWalletObject.avd, false);
        C0723b.m763a(parcel, 4, loyaltyWalletObject.ave, false);
        C0723b.m763a(parcel, 5, loyaltyWalletObject.avf, false);
        C0723b.m763a(parcel, 6, loyaltyWalletObject.aki, false);
        C0723b.m763a(parcel, 7, loyaltyWalletObject.avg, false);
        C0723b.m763a(parcel, 8, loyaltyWalletObject.avh, false);
        C0723b.m763a(parcel, 9, loyaltyWalletObject.avi, false);
        C0723b.m763a(parcel, 10, loyaltyWalletObject.avj, false);
        C0723b.m763a(parcel, 11, loyaltyWalletObject.avk, false);
        C0723b.m775c(parcel, 12, loyaltyWalletObject.state);
        C0723b.m776c(parcel, 13, loyaltyWalletObject.avl, false);
        C0723b.m759a(parcel, 14, (Parcelable) loyaltyWalletObject.avm, i, false);
        C0723b.m776c(parcel, 15, loyaltyWalletObject.avn, false);
        C0723b.m763a(parcel, 17, loyaltyWalletObject.avp, false);
        C0723b.m763a(parcel, 16, loyaltyWalletObject.avo, false);
        C0723b.m766a(parcel, 19, loyaltyWalletObject.avr);
        C0723b.m776c(parcel, 18, loyaltyWalletObject.avq, false);
        C0723b.m776c(parcel, 21, loyaltyWalletObject.avt, false);
        C0723b.m776c(parcel, 20, loyaltyWalletObject.avs, false);
        C0723b.m759a(parcel, 23, (Parcelable) loyaltyWalletObject.avv, i, false);
        C0723b.m776c(parcel, 22, loyaltyWalletObject.avu, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dR */
    public LoyaltyWalletObject createFromParcel(Parcel parcel) {
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
        String str9 = null;
        String str10 = null;
        C2687l lVar = null;
        String str11 = null;
        String str12 = null;
        C2681f fVar = null;
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
                    str9 = C0721a.m736o(parcel2, F);
                    break;
                case 11:
                    str10 = C0721a.m736o(parcel2, F);
                    break;
                case 12:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 13:
                    arrayList = C0721a.m723c(parcel2, F, C2691p.CREATOR);
                    break;
                case 14:
                    lVar = (C2687l) C0721a.m716a(parcel2, F, C2687l.CREATOR);
                    break;
                case 15:
                    arrayList2 = C0721a.m723c(parcel2, F, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = C0721a.m736o(parcel2, F);
                    break;
                case 17:
                    str12 = C0721a.m736o(parcel2, F);
                    break;
                case 18:
                    arrayList3 = C0721a.m723c(parcel2, F, C2679d.CREATOR);
                    break;
                case 19:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 20:
                    ie4 = C0721a.m723c(parcel2, F, C2689n.CREATOR);
                    break;
                case 21:
                    ie5 = C0721a.m723c(parcel2, F, C2685j.CREATOR);
                    break;
                case 22:
                    ie6 = C0721a.m723c(parcel2, F, C2689n.CREATOR);
                    break;
                case 23:
                    fVar = (C2681f) C0721a.m716a(parcel2, F, C2681f.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new LoyaltyWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, arrayList, lVar, arrayList2, str11, str12, arrayList3, z, ie4, ie5, ie6, fVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: fY */
    public LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
