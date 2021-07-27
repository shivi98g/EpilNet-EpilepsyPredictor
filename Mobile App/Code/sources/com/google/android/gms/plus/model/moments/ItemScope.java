package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C2084pd;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope extends Freezable<ItemScope> {

    public static class Builder {

        /* renamed from: CE */
        private String f4383CE;

        /* renamed from: UO */
        private String f4384UO;
        private double agg;
        private double agh;
        private String aoA;
        private C2084pd aoB;
        private String aoC;
        private String aoD;
        private List<C2084pd> aoE;
        private String aoF;
        private String aoG;
        private String aoH;
        private String aoI;
        private String aoJ;
        private String aoK;
        private String aoL;
        private String aoM;
        private C2084pd aoN;
        private String aoO;
        private String aoP;
        private String aoQ;
        private C2084pd aoR;
        private C2084pd aoS;
        private C2084pd aoT;
        private List<C2084pd> aoU;
        private String aoV;
        private String aoW;
        private String aoX;
        private String aoY;
        private C2084pd aoZ;
        private final Set<Integer> aon = new HashSet();
        private C2084pd aoo;
        private List<String> aop;
        private C2084pd aoq;
        private String aor;
        private String aos;
        private String aot;
        private List<C2084pd> aou;
        private int aov;
        private List<C2084pd> aow;
        private C2084pd aox;
        private List<C2084pd> aoy;
        private String aoz;
        private String apa;
        private String apb;
        private String apc;
        private C2084pd apd;
        private String ape;
        private String apf;
        private String apg;
        private String aph;
        private String mName;

        /* renamed from: ov */
        private String f4385ov;

        /* renamed from: vc */
        private String f4386vc;

        /* renamed from: vf */
        private String f4387vf;

        public ItemScope build() {
            Set<Integer> set = this.aon;
            C2084pd pdVar = this.aoo;
            List<String> list = this.aop;
            C2084pd pdVar2 = this.aoq;
            String str = this.aor;
            String str2 = this.aos;
            String str3 = this.aot;
            List<C2084pd> list2 = this.aou;
            int i = this.aov;
            List<C2084pd> list3 = this.aow;
            C2084pd pdVar3 = this.aox;
            List<C2084pd> list4 = this.aoy;
            String str4 = this.aoz;
            String str5 = this.aoA;
            C2084pd pdVar4 = this.aoB;
            String str6 = this.aoC;
            String str7 = this.aoD;
            String str8 = this.f4385ov;
            List<C2084pd> list5 = this.aoE;
            String str9 = this.aoF;
            String str10 = this.aoG;
            String str11 = this.aoH;
            String str12 = this.f4384UO;
            String str13 = this.aoI;
            String str14 = this.aoJ;
            String str15 = this.aoK;
            String str16 = this.aoL;
            String str17 = this.aoM;
            C2084pd pdVar5 = this.aoN;
            String str18 = this.aoO;
            String str19 = this.aoP;
            String str20 = this.f4383CE;
            String str21 = this.aoQ;
            String str22 = str5;
            C2084pd pdVar6 = this.aoR;
            double d = this.agg;
            C2084pd pdVar7 = this.aoS;
            double d2 = this.agh;
            String str23 = this.mName;
            C2084pd pdVar8 = this.aoT;
            String str24 = str23;
            List<C2084pd> list6 = this.aoU;
            String str25 = this.aoV;
            String str26 = this.aoW;
            String str27 = this.aoX;
            String str28 = this.aoY;
            C2084pd pdVar9 = this.aoZ;
            String str29 = this.apa;
            String str30 = this.apb;
            String str31 = this.apc;
            C2084pd pdVar10 = this.apd;
            String str32 = this.ape;
            String str33 = this.apf;
            String str34 = this.f4386vc;
            String str35 = this.f4387vf;
            C2084pd pdVar11 = pdVar8;
            return new C2084pd(set, pdVar, list, pdVar2, str, str2, str3, list2, i, list3, pdVar3, list4, str4, str22, pdVar4, str6, str7, str8, list5, str9, str10, str11, str12, str13, str14, str15, str16, str17, pdVar5, str18, str19, str20, str21, pdVar6, d, pdVar7, d2, str24, pdVar11, list6, str25, str26, str27, str28, pdVar9, str29, str30, str31, pdVar10, str32, str33, str34, str35, this.apg, this.aph);
        }

        public Builder setAbout(ItemScope itemScope) {
            this.aoo = (C2084pd) itemScope;
            this.aon.add(2);
            return this;
        }

        public Builder setAdditionalName(List<String> list) {
            this.aop = list;
            this.aon.add(3);
            return this;
        }

        public Builder setAddress(ItemScope itemScope) {
            this.aoq = (C2084pd) itemScope;
            this.aon.add(4);
            return this;
        }

        public Builder setAddressCountry(String str) {
            this.aor = str;
            this.aon.add(5);
            return this;
        }

        public Builder setAddressLocality(String str) {
            this.aos = str;
            this.aon.add(6);
            return this;
        }

        public Builder setAddressRegion(String str) {
            this.aot = str;
            this.aon.add(7);
            return this;
        }

        public Builder setAssociated_media(List<ItemScope> list) {
            this.aou = list;
            this.aon.add(8);
            return this;
        }

        public Builder setAttendeeCount(int i) {
            this.aov = i;
            this.aon.add(9);
            return this;
        }

        public Builder setAttendees(List<ItemScope> list) {
            this.aow = list;
            this.aon.add(10);
            return this;
        }

        public Builder setAudio(ItemScope itemScope) {
            this.aox = (C2084pd) itemScope;
            this.aon.add(11);
            return this;
        }

        public Builder setAuthor(List<ItemScope> list) {
            this.aoy = list;
            this.aon.add(12);
            return this;
        }

        public Builder setBestRating(String str) {
            this.aoz = str;
            this.aon.add(13);
            return this;
        }

        public Builder setBirthDate(String str) {
            this.aoA = str;
            this.aon.add(14);
            return this;
        }

        public Builder setByArtist(ItemScope itemScope) {
            this.aoB = (C2084pd) itemScope;
            this.aon.add(15);
            return this;
        }

        public Builder setCaption(String str) {
            this.aoC = str;
            this.aon.add(16);
            return this;
        }

        public Builder setContentSize(String str) {
            this.aoD = str;
            this.aon.add(17);
            return this;
        }

        public Builder setContentUrl(String str) {
            this.f4385ov = str;
            this.aon.add(18);
            return this;
        }

        public Builder setContributor(List<ItemScope> list) {
            this.aoE = list;
            this.aon.add(19);
            return this;
        }

        public Builder setDateCreated(String str) {
            this.aoF = str;
            this.aon.add(20);
            return this;
        }

        public Builder setDateModified(String str) {
            this.aoG = str;
            this.aon.add(21);
            return this;
        }

        public Builder setDatePublished(String str) {
            this.aoH = str;
            this.aon.add(22);
            return this;
        }

        public Builder setDescription(String str) {
            this.f4384UO = str;
            this.aon.add(23);
            return this;
        }

        public Builder setDuration(String str) {
            this.aoI = str;
            this.aon.add(24);
            return this;
        }

        public Builder setEmbedUrl(String str) {
            this.aoJ = str;
            this.aon.add(25);
            return this;
        }

        public Builder setEndDate(String str) {
            this.aoK = str;
            this.aon.add(26);
            return this;
        }

        public Builder setFamilyName(String str) {
            this.aoL = str;
            this.aon.add(27);
            return this;
        }

        public Builder setGender(String str) {
            this.aoM = str;
            this.aon.add(28);
            return this;
        }

        public Builder setGeo(ItemScope itemScope) {
            this.aoN = (C2084pd) itemScope;
            this.aon.add(29);
            return this;
        }

        public Builder setGivenName(String str) {
            this.aoO = str;
            this.aon.add(30);
            return this;
        }

        public Builder setHeight(String str) {
            this.aoP = str;
            this.aon.add(31);
            return this;
        }

        public Builder setId(String str) {
            this.f4383CE = str;
            this.aon.add(32);
            return this;
        }

        public Builder setImage(String str) {
            this.aoQ = str;
            this.aon.add(33);
            return this;
        }

        public Builder setInAlbum(ItemScope itemScope) {
            this.aoR = (C2084pd) itemScope;
            this.aon.add(34);
            return this;
        }

        public Builder setLatitude(double d) {
            this.agg = d;
            this.aon.add(36);
            return this;
        }

        public Builder setLocation(ItemScope itemScope) {
            this.aoS = (C2084pd) itemScope;
            this.aon.add(37);
            return this;
        }

        public Builder setLongitude(double d) {
            this.agh = d;
            this.aon.add(38);
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            this.aon.add(39);
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemScope) {
            this.aoT = (C2084pd) itemScope;
            this.aon.add(40);
            return this;
        }

        public Builder setPerformers(List<ItemScope> list) {
            this.aoU = list;
            this.aon.add(41);
            return this;
        }

        public Builder setPlayerType(String str) {
            this.aoV = str;
            this.aon.add(42);
            return this;
        }

        public Builder setPostOfficeBoxNumber(String str) {
            this.aoW = str;
            this.aon.add(43);
            return this;
        }

        public Builder setPostalCode(String str) {
            this.aoX = str;
            this.aon.add(44);
            return this;
        }

        public Builder setRatingValue(String str) {
            this.aoY = str;
            this.aon.add(45);
            return this;
        }

        public Builder setReviewRating(ItemScope itemScope) {
            this.aoZ = (C2084pd) itemScope;
            this.aon.add(46);
            return this;
        }

        public Builder setStartDate(String str) {
            this.apa = str;
            this.aon.add(47);
            return this;
        }

        public Builder setStreetAddress(String str) {
            this.apb = str;
            this.aon.add(48);
            return this;
        }

        public Builder setText(String str) {
            this.apc = str;
            this.aon.add(49);
            return this;
        }

        public Builder setThumbnail(ItemScope itemScope) {
            this.apd = (C2084pd) itemScope;
            this.aon.add(50);
            return this;
        }

        public Builder setThumbnailUrl(String str) {
            this.ape = str;
            this.aon.add(51);
            return this;
        }

        public Builder setTickerSymbol(String str) {
            this.apf = str;
            this.aon.add(52);
            return this;
        }

        public Builder setType(String str) {
            this.f4386vc = str;
            this.aon.add(53);
            return this;
        }

        public Builder setUrl(String str) {
            this.f4387vf = str;
            this.aon.add(54);
            return this;
        }

        public Builder setWidth(String str) {
            this.apg = str;
            this.aon.add(55);
            return this;
        }

        public Builder setWorstRating(String str) {
            this.aph = str;
            this.aon.add(56);
            return this;
        }
    }

    ItemScope getAbout();

    List<String> getAdditionalName();

    ItemScope getAddress();

    String getAddressCountry();

    String getAddressLocality();

    String getAddressRegion();

    List<ItemScope> getAssociated_media();

    int getAttendeeCount();

    List<ItemScope> getAttendees();

    ItemScope getAudio();

    List<ItemScope> getAuthor();

    String getBestRating();

    String getBirthDate();

    ItemScope getByArtist();

    String getCaption();

    String getContentSize();

    String getContentUrl();

    List<ItemScope> getContributor();

    String getDateCreated();

    String getDateModified();

    String getDatePublished();

    String getDescription();

    String getDuration();

    String getEmbedUrl();

    String getEndDate();

    String getFamilyName();

    String getGender();

    ItemScope getGeo();

    String getGivenName();

    String getHeight();

    String getId();

    String getImage();

    ItemScope getInAlbum();

    double getLatitude();

    ItemScope getLocation();

    double getLongitude();

    String getName();

    ItemScope getPartOfTVSeries();

    List<ItemScope> getPerformers();

    String getPlayerType();

    String getPostOfficeBoxNumber();

    String getPostalCode();

    String getRatingValue();

    ItemScope getReviewRating();

    String getStartDate();

    String getStreetAddress();

    String getText();

    ItemScope getThumbnail();

    String getThumbnailUrl();

    String getTickerSymbol();

    String getType();

    String getUrl();

    String getWidth();

    String getWorstRating();

    boolean hasAbout();

    boolean hasAdditionalName();

    boolean hasAddress();

    boolean hasAddressCountry();

    boolean hasAddressLocality();

    boolean hasAddressRegion();

    boolean hasAssociated_media();

    boolean hasAttendeeCount();

    boolean hasAttendees();

    boolean hasAudio();

    boolean hasAuthor();

    boolean hasBestRating();

    boolean hasBirthDate();

    boolean hasByArtist();

    boolean hasCaption();

    boolean hasContentSize();

    boolean hasContentUrl();

    boolean hasContributor();

    boolean hasDateCreated();

    boolean hasDateModified();

    boolean hasDatePublished();

    boolean hasDescription();

    boolean hasDuration();

    boolean hasEmbedUrl();

    boolean hasEndDate();

    boolean hasFamilyName();

    boolean hasGender();

    boolean hasGeo();

    boolean hasGivenName();

    boolean hasHeight();

    boolean hasId();

    boolean hasImage();

    boolean hasInAlbum();

    boolean hasLatitude();

    boolean hasLocation();

    boolean hasLongitude();

    boolean hasName();

    boolean hasPartOfTVSeries();

    boolean hasPerformers();

    boolean hasPlayerType();

    boolean hasPostOfficeBoxNumber();

    boolean hasPostalCode();

    boolean hasRatingValue();

    boolean hasReviewRating();

    boolean hasStartDate();

    boolean hasStreetAddress();

    boolean hasText();

    boolean hasThumbnail();

    boolean hasThumbnailUrl();

    boolean hasTickerSymbol();

    boolean hasType();

    boolean hasUrl();

    boolean hasWidth();

    boolean hasWorstRating();
}
