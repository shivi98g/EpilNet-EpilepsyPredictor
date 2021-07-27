package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.internal.C1815kr;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pd */
public final class C2084pd extends C1818ks implements ItemScope {
    public static final C2085pe CREATOR = new C2085pe();
    private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

    /* renamed from: CE */
    String f4176CE;

    /* renamed from: CK */
    final int f4177CK;

    /* renamed from: UO */
    String f4178UO;
    double agg;
    double agh;
    String aoA;
    C2084pd aoB;
    String aoC;
    String aoD;
    List<C2084pd> aoE;
    String aoF;
    String aoG;
    String aoH;
    String aoI;
    String aoJ;
    String aoK;
    String aoL;
    String aoM;
    C2084pd aoN;
    String aoO;
    String aoP;
    String aoQ;
    C2084pd aoR;
    C2084pd aoS;
    C2084pd aoT;
    List<C2084pd> aoU;
    String aoV;
    String aoW;
    String aoX;
    String aoY;
    C2084pd aoZ;
    final Set<Integer> aon;
    C2084pd aoo;
    List<String> aop;
    C2084pd aoq;
    String aor;
    String aos;
    String aot;
    List<C2084pd> aou;
    int aov;
    List<C2084pd> aow;
    C2084pd aox;
    List<C2084pd> aoy;
    String aoz;
    String apa;
    String apb;
    String apc;
    C2084pd apd;
    String ape;
    String apf;
    String apg;
    String aph;
    String mName;

    /* renamed from: ov */
    String f4179ov;

    /* renamed from: vc */
    String f4180vc;

    /* renamed from: vf */
    String f4181vf;

    static {
        aom.put("about", C1815kr.C1816a.m5439a("about", 2, C2084pd.class));
        aom.put("additionalName", C1815kr.C1816a.m5446m("additionalName", 3));
        aom.put("address", C1815kr.C1816a.m5439a("address", 4, C2084pd.class));
        aom.put("addressCountry", C1815kr.C1816a.m5445l("addressCountry", 5));
        aom.put("addressLocality", C1815kr.C1816a.m5445l("addressLocality", 6));
        aom.put("addressRegion", C1815kr.C1816a.m5445l("addressRegion", 7));
        aom.put("associated_media", C1815kr.C1816a.m5440b("associated_media", 8, C2084pd.class));
        aom.put("attendeeCount", C1815kr.C1816a.m5442i("attendeeCount", 9));
        aom.put("attendees", C1815kr.C1816a.m5440b("attendees", 10, C2084pd.class));
        aom.put("audio", C1815kr.C1816a.m5439a("audio", 11, C2084pd.class));
        aom.put("author", C1815kr.C1816a.m5440b("author", 12, C2084pd.class));
        aom.put("bestRating", C1815kr.C1816a.m5445l("bestRating", 13));
        aom.put("birthDate", C1815kr.C1816a.m5445l("birthDate", 14));
        aom.put("byArtist", C1815kr.C1816a.m5439a("byArtist", 15, C2084pd.class));
        aom.put("caption", C1815kr.C1816a.m5445l("caption", 16));
        aom.put("contentSize", C1815kr.C1816a.m5445l("contentSize", 17));
        aom.put("contentUrl", C1815kr.C1816a.m5445l("contentUrl", 18));
        aom.put("contributor", C1815kr.C1816a.m5440b("contributor", 19, C2084pd.class));
        aom.put("dateCreated", C1815kr.C1816a.m5445l("dateCreated", 20));
        aom.put("dateModified", C1815kr.C1816a.m5445l("dateModified", 21));
        aom.put("datePublished", C1815kr.C1816a.m5445l("datePublished", 22));
        aom.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, C1815kr.C1816a.m5445l(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, 23));
        aom.put("duration", C1815kr.C1816a.m5445l("duration", 24));
        aom.put("embedUrl", C1815kr.C1816a.m5445l("embedUrl", 25));
        aom.put("endDate", C1815kr.C1816a.m5445l("endDate", 26));
        aom.put("familyName", C1815kr.C1816a.m5445l("familyName", 27));
        aom.put("gender", C1815kr.C1816a.m5445l("gender", 28));
        aom.put("geo", C1815kr.C1816a.m5439a("geo", 29, C2084pd.class));
        aom.put("givenName", C1815kr.C1816a.m5445l("givenName", 30));
        aom.put("height", C1815kr.C1816a.m5445l("height", 31));
        aom.put("id", C1815kr.C1816a.m5445l("id", 32));
        aom.put("image", C1815kr.C1816a.m5445l("image", 33));
        aom.put("inAlbum", C1815kr.C1816a.m5439a("inAlbum", 34, C2084pd.class));
        aom.put("latitude", C1815kr.C1816a.m5443j("latitude", 36));
        aom.put("location", C1815kr.C1816a.m5439a("location", 37, C2084pd.class));
        aom.put("longitude", C1815kr.C1816a.m5443j("longitude", 38));
        aom.put("name", C1815kr.C1816a.m5445l("name", 39));
        aom.put("partOfTVSeries", C1815kr.C1816a.m5439a("partOfTVSeries", 40, C2084pd.class));
        aom.put("performers", C1815kr.C1816a.m5440b("performers", 41, C2084pd.class));
        aom.put("playerType", C1815kr.C1816a.m5445l("playerType", 42));
        aom.put("postOfficeBoxNumber", C1815kr.C1816a.m5445l("postOfficeBoxNumber", 43));
        aom.put("postalCode", C1815kr.C1816a.m5445l("postalCode", 44));
        aom.put("ratingValue", C1815kr.C1816a.m5445l("ratingValue", 45));
        aom.put("reviewRating", C1815kr.C1816a.m5439a("reviewRating", 46, C2084pd.class));
        aom.put("startDate", C1815kr.C1816a.m5445l("startDate", 47));
        aom.put("streetAddress", C1815kr.C1816a.m5445l("streetAddress", 48));
        aom.put("text", C1815kr.C1816a.m5445l("text", 49));
        aom.put("thumbnail", C1815kr.C1816a.m5439a("thumbnail", 50, C2084pd.class));
        aom.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, C1815kr.C1816a.m5445l(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, 51));
        aom.put("tickerSymbol", C1815kr.C1816a.m5445l("tickerSymbol", 52));
        aom.put("type", C1815kr.C1816a.m5445l("type", 53));
        aom.put(PlusShare.KEY_CALL_TO_ACTION_URL, C1815kr.C1816a.m5445l(PlusShare.KEY_CALL_TO_ACTION_URL, 54));
        aom.put("width", C1815kr.C1816a.m5445l("width", 55));
        aom.put("worstRating", C1815kr.C1816a.m5445l("worstRating", 56));
    }

    public C2084pd() {
        this.f4177CK = 1;
        this.aon = new HashSet();
    }

    C2084pd(Set<Integer> set, int i, C2084pd pdVar, List<String> list, C2084pd pdVar2, String str, String str2, String str3, List<C2084pd> list2, int i2, List<C2084pd> list3, C2084pd pdVar3, List<C2084pd> list4, String str4, String str5, C2084pd pdVar4, String str6, String str7, String str8, List<C2084pd> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C2084pd pdVar5, String str18, String str19, String str20, String str21, C2084pd pdVar6, double d, C2084pd pdVar7, double d2, String str22, C2084pd pdVar8, List<C2084pd> list6, String str23, String str24, String str25, String str26, C2084pd pdVar9, String str27, String str28, String str29, C2084pd pdVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.aon = set;
        this.f4177CK = i;
        this.aoo = pdVar;
        this.aop = list;
        this.aoq = pdVar2;
        this.aor = str;
        this.aos = str2;
        this.aot = str3;
        this.aou = list2;
        this.aov = i2;
        this.aow = list3;
        this.aox = pdVar3;
        this.aoy = list4;
        this.aoz = str4;
        this.aoA = str5;
        this.aoB = pdVar4;
        this.aoC = str6;
        this.aoD = str7;
        this.f4179ov = str8;
        this.aoE = list5;
        this.aoF = str9;
        this.aoG = str10;
        this.aoH = str11;
        this.f4178UO = str12;
        this.aoI = str13;
        this.aoJ = str14;
        this.aoK = str15;
        this.aoL = str16;
        this.aoM = str17;
        this.aoN = pdVar5;
        this.aoO = str18;
        this.aoP = str19;
        this.f4176CE = str20;
        this.aoQ = str21;
        this.aoR = pdVar6;
        this.agg = d;
        this.aoS = pdVar7;
        this.agh = d2;
        this.mName = str22;
        this.aoT = pdVar8;
        this.aoU = list6;
        this.aoV = str23;
        this.aoW = str24;
        this.aoX = str25;
        this.aoY = str26;
        this.aoZ = pdVar9;
        this.apa = str27;
        this.apb = str28;
        this.apc = str29;
        this.apd = pdVar10;
        this.ape = str30;
        this.apf = str31;
        this.f4180vc = str32;
        this.f4181vf = str33;
        this.apg = str34;
        this.aph = str35;
    }

    public C2084pd(Set<Integer> set, C2084pd pdVar, List<String> list, C2084pd pdVar2, String str, String str2, String str3, List<C2084pd> list2, int i, List<C2084pd> list3, C2084pd pdVar3, List<C2084pd> list4, String str4, String str5, C2084pd pdVar4, String str6, String str7, String str8, List<C2084pd> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C2084pd pdVar5, String str18, String str19, String str20, String str21, C2084pd pdVar6, double d, C2084pd pdVar7, double d2, String str22, C2084pd pdVar8, List<C2084pd> list6, String str23, String str24, String str25, String str26, C2084pd pdVar9, String str27, String str28, String str29, C2084pd pdVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.aon = set;
        this.f4177CK = 1;
        this.aoo = pdVar;
        this.aop = list;
        this.aoq = pdVar2;
        this.aor = str;
        this.aos = str2;
        this.aot = str3;
        this.aou = list2;
        this.aov = i;
        this.aow = list3;
        this.aox = pdVar3;
        this.aoy = list4;
        this.aoz = str4;
        this.aoA = str5;
        this.aoB = pdVar4;
        this.aoC = str6;
        this.aoD = str7;
        this.f4179ov = str8;
        this.aoE = list5;
        this.aoF = str9;
        this.aoG = str10;
        this.aoH = str11;
        this.f4178UO = str12;
        this.aoI = str13;
        this.aoJ = str14;
        this.aoK = str15;
        this.aoL = str16;
        this.aoM = str17;
        this.aoN = pdVar5;
        this.aoO = str18;
        this.aoP = str19;
        this.f4176CE = str20;
        this.aoQ = str21;
        this.aoR = pdVar6;
        this.agg = d;
        this.aoS = pdVar7;
        this.agh = d2;
        this.mName = str22;
        this.aoT = pdVar8;
        this.aoU = list6;
        this.aoV = str23;
        this.aoW = str24;
        this.aoX = str25;
        this.aoY = str26;
        this.aoZ = pdVar9;
        this.apa = str27;
        this.apb = str28;
        this.apc = str29;
        this.apd = pdVar10;
        this.ape = str30;
        this.apf = str31;
        this.f4180vc = str32;
        this.f4181vf = str33;
        this.apg = str34;
        this.aph = str35;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16002a(C1815kr.C1816a aVar) {
        return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo16003b(C1815kr.C1816a aVar) {
        switch (aVar.mo16022hR()) {
            case 2:
                return this.aoo;
            case 3:
                return this.aop;
            case 4:
                return this.aoq;
            case 5:
                return this.aor;
            case 6:
                return this.aos;
            case 7:
                return this.aot;
            case 8:
                return this.aou;
            case 9:
                return Integer.valueOf(this.aov);
            case 10:
                return this.aow;
            case 11:
                return this.aox;
            case 12:
                return this.aoy;
            case 13:
                return this.aoz;
            case 14:
                return this.aoA;
            case 15:
                return this.aoB;
            case 16:
                return this.aoC;
            case 17:
                return this.aoD;
            case 18:
                return this.f4179ov;
            case 19:
                return this.aoE;
            case 20:
                return this.aoF;
            case 21:
                return this.aoG;
            case 22:
                return this.aoH;
            case 23:
                return this.f4178UO;
            case 24:
                return this.aoI;
            case 25:
                return this.aoJ;
            case 26:
                return this.aoK;
            case 27:
                return this.aoL;
            case 28:
                return this.aoM;
            case 29:
                return this.aoN;
            case 30:
                return this.aoO;
            case 31:
                return this.aoP;
            case 32:
                return this.f4176CE;
            case 33:
                return this.aoQ;
            case 34:
                return this.aoR;
            case 36:
                return Double.valueOf(this.agg);
            case 37:
                return this.aoS;
            case 38:
                return Double.valueOf(this.agh);
            case 39:
                return this.mName;
            case 40:
                return this.aoT;
            case 41:
                return this.aoU;
            case 42:
                return this.aoV;
            case 43:
                return this.aoW;
            case 44:
                return this.aoX;
            case 45:
                return this.aoY;
            case 46:
                return this.aoZ;
            case 47:
                return this.apa;
            case 48:
                return this.apb;
            case 49:
                return this.apc;
            case 50:
                return this.apd;
            case 51:
                return this.ape;
            case 52:
                return this.apf;
            case 53:
                return this.f4180vc;
            case 54:
                return this.f4181vf;
            case 55:
                return this.apg;
            case 56:
                return this.aph;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
        }
    }

    public int describeContents() {
        C2085pe peVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2084pd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2084pd pdVar = (C2084pd) obj;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                if (!pdVar.mo16002a(next) || !mo16003b(next).equals(pdVar.mo16003b(next))) {
                    return false;
                }
            } else if (pdVar.mo16002a(next)) {
                return false;
            }
        }
        return true;
    }

    public ItemScope getAbout() {
        return this.aoo;
    }

    public List<String> getAdditionalName() {
        return this.aop;
    }

    public ItemScope getAddress() {
        return this.aoq;
    }

    public String getAddressCountry() {
        return this.aor;
    }

    public String getAddressLocality() {
        return this.aos;
    }

    public String getAddressRegion() {
        return this.aot;
    }

    public List<ItemScope> getAssociated_media() {
        return (ArrayList) this.aou;
    }

    public int getAttendeeCount() {
        return this.aov;
    }

    public List<ItemScope> getAttendees() {
        return (ArrayList) this.aow;
    }

    public ItemScope getAudio() {
        return this.aox;
    }

    public List<ItemScope> getAuthor() {
        return (ArrayList) this.aoy;
    }

    public String getBestRating() {
        return this.aoz;
    }

    public String getBirthDate() {
        return this.aoA;
    }

    public ItemScope getByArtist() {
        return this.aoB;
    }

    public String getCaption() {
        return this.aoC;
    }

    public String getContentSize() {
        return this.aoD;
    }

    public String getContentUrl() {
        return this.f4179ov;
    }

    public List<ItemScope> getContributor() {
        return (ArrayList) this.aoE;
    }

    public String getDateCreated() {
        return this.aoF;
    }

    public String getDateModified() {
        return this.aoG;
    }

    public String getDatePublished() {
        return this.aoH;
    }

    public String getDescription() {
        return this.f4178UO;
    }

    public String getDuration() {
        return this.aoI;
    }

    public String getEmbedUrl() {
        return this.aoJ;
    }

    public String getEndDate() {
        return this.aoK;
    }

    public String getFamilyName() {
        return this.aoL;
    }

    public String getGender() {
        return this.aoM;
    }

    public ItemScope getGeo() {
        return this.aoN;
    }

    public String getGivenName() {
        return this.aoO;
    }

    public String getHeight() {
        return this.aoP;
    }

    public String getId() {
        return this.f4176CE;
    }

    public String getImage() {
        return this.aoQ;
    }

    public ItemScope getInAlbum() {
        return this.aoR;
    }

    public double getLatitude() {
        return this.agg;
    }

    public ItemScope getLocation() {
        return this.aoS;
    }

    public double getLongitude() {
        return this.agh;
    }

    public String getName() {
        return this.mName;
    }

    public ItemScope getPartOfTVSeries() {
        return this.aoT;
    }

    public List<ItemScope> getPerformers() {
        return (ArrayList) this.aoU;
    }

    public String getPlayerType() {
        return this.aoV;
    }

    public String getPostOfficeBoxNumber() {
        return this.aoW;
    }

    public String getPostalCode() {
        return this.aoX;
    }

    public String getRatingValue() {
        return this.aoY;
    }

    public ItemScope getReviewRating() {
        return this.aoZ;
    }

    public String getStartDate() {
        return this.apa;
    }

    public String getStreetAddress() {
        return this.apb;
    }

    public String getText() {
        return this.apc;
    }

    public ItemScope getThumbnail() {
        return this.apd;
    }

    public String getThumbnailUrl() {
        return this.ape;
    }

    public String getTickerSymbol() {
        return this.apf;
    }

    public String getType() {
        return this.f4180vc;
    }

    public String getUrl() {
        return this.f4181vf;
    }

    public String getWidth() {
        return this.apg;
    }

    public String getWorstRating() {
        return this.aph;
    }

    /* renamed from: hK */
    public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
        return aom;
    }

    public boolean hasAbout() {
        return this.aon.contains(2);
    }

    public boolean hasAdditionalName() {
        return this.aon.contains(3);
    }

    public boolean hasAddress() {
        return this.aon.contains(4);
    }

    public boolean hasAddressCountry() {
        return this.aon.contains(5);
    }

    public boolean hasAddressLocality() {
        return this.aon.contains(6);
    }

    public boolean hasAddressRegion() {
        return this.aon.contains(7);
    }

    public boolean hasAssociated_media() {
        return this.aon.contains(8);
    }

    public boolean hasAttendeeCount() {
        return this.aon.contains(9);
    }

    public boolean hasAttendees() {
        return this.aon.contains(10);
    }

    public boolean hasAudio() {
        return this.aon.contains(11);
    }

    public boolean hasAuthor() {
        return this.aon.contains(12);
    }

    public boolean hasBestRating() {
        return this.aon.contains(13);
    }

    public boolean hasBirthDate() {
        return this.aon.contains(14);
    }

    public boolean hasByArtist() {
        return this.aon.contains(15);
    }

    public boolean hasCaption() {
        return this.aon.contains(16);
    }

    public boolean hasContentSize() {
        return this.aon.contains(17);
    }

    public boolean hasContentUrl() {
        return this.aon.contains(18);
    }

    public boolean hasContributor() {
        return this.aon.contains(19);
    }

    public boolean hasDateCreated() {
        return this.aon.contains(20);
    }

    public boolean hasDateModified() {
        return this.aon.contains(21);
    }

    public boolean hasDatePublished() {
        return this.aon.contains(22);
    }

    public boolean hasDescription() {
        return this.aon.contains(23);
    }

    public boolean hasDuration() {
        return this.aon.contains(24);
    }

    public boolean hasEmbedUrl() {
        return this.aon.contains(25);
    }

    public boolean hasEndDate() {
        return this.aon.contains(26);
    }

    public boolean hasFamilyName() {
        return this.aon.contains(27);
    }

    public boolean hasGender() {
        return this.aon.contains(28);
    }

    public boolean hasGeo() {
        return this.aon.contains(29);
    }

    public boolean hasGivenName() {
        return this.aon.contains(30);
    }

    public boolean hasHeight() {
        return this.aon.contains(31);
    }

    public boolean hasId() {
        return this.aon.contains(32);
    }

    public boolean hasImage() {
        return this.aon.contains(33);
    }

    public boolean hasInAlbum() {
        return this.aon.contains(34);
    }

    public boolean hasLatitude() {
        return this.aon.contains(36);
    }

    public boolean hasLocation() {
        return this.aon.contains(37);
    }

    public boolean hasLongitude() {
        return this.aon.contains(38);
    }

    public boolean hasName() {
        return this.aon.contains(39);
    }

    public boolean hasPartOfTVSeries() {
        return this.aon.contains(40);
    }

    public boolean hasPerformers() {
        return this.aon.contains(41);
    }

    public boolean hasPlayerType() {
        return this.aon.contains(42);
    }

    public boolean hasPostOfficeBoxNumber() {
        return this.aon.contains(43);
    }

    public boolean hasPostalCode() {
        return this.aon.contains(44);
    }

    public boolean hasRatingValue() {
        return this.aon.contains(45);
    }

    public boolean hasReviewRating() {
        return this.aon.contains(46);
    }

    public boolean hasStartDate() {
        return this.aon.contains(47);
    }

    public boolean hasStreetAddress() {
        return this.aon.contains(48);
    }

    public boolean hasText() {
        return this.aon.contains(49);
    }

    public boolean hasThumbnail() {
        return this.aon.contains(50);
    }

    public boolean hasThumbnailUrl() {
        return this.aon.contains(51);
    }

    public boolean hasTickerSymbol() {
        return this.aon.contains(52);
    }

    public boolean hasType() {
        return this.aon.contains(53);
    }

    public boolean hasUrl() {
        return this.aon.contains(54);
    }

    public boolean hasWidth() {
        return this.aon.contains(55);
    }

    public boolean hasWorstRating() {
        return this.aon.contains(56);
    }

    public int hashCode() {
        int i = 0;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                i = i + next.mo16022hR() + mo16003b(next).hashCode();
            }
        }
        return i;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: oI */
    public C2084pd freeze() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2085pe peVar = CREATOR;
        C2085pe.m6119a(this, parcel, i);
    }
}
