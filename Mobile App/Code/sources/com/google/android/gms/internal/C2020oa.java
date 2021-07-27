package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.games.multiplayer.Multiplayer;

/* renamed from: com.google.android.gms.internal.oa */
public final class C2020oa implements SafeParcelable {
    public static final C2021ob CREATOR = new C2021ob();
    public static final C2020oa ahB = m5994cc("accounting");
    public static final C2020oa ahC = m5994cc("airport");
    public static final C2020oa ahD = m5994cc("amusement_park");
    public static final C2020oa ahE = m5994cc("aquarium");
    public static final C2020oa ahF = m5994cc("art_gallery");
    public static final C2020oa ahG = m5994cc("atm");
    public static final C2020oa ahH = m5994cc("bakery");
    public static final C2020oa ahI = m5994cc("bank");
    public static final C2020oa ahJ = m5994cc("bar");
    public static final C2020oa ahK = m5994cc("beauty_salon");
    public static final C2020oa ahL = m5994cc("bicycle_store");
    public static final C2020oa ahM = m5994cc("book_store");
    public static final C2020oa ahN = m5994cc("bowling_alley");
    public static final C2020oa ahO = m5994cc("bus_station");
    public static final C2020oa ahP = m5994cc("cafe");
    public static final C2020oa ahQ = m5994cc("campground");
    public static final C2020oa ahR = m5994cc("car_dealer");
    public static final C2020oa ahS = m5994cc("car_rental");
    public static final C2020oa ahT = m5994cc("car_repair");
    public static final C2020oa ahU = m5994cc("car_wash");
    public static final C2020oa ahV = m5994cc("casino");
    public static final C2020oa ahW = m5994cc("cemetery");
    public static final C2020oa ahX = m5994cc("church");
    public static final C2020oa ahY = m5994cc("city_hall");
    public static final C2020oa ahZ = m5994cc("clothing_store");
    public static final C2020oa aiA = m5994cc("jewelry_store");
    public static final C2020oa aiB = m5994cc("laundry");
    public static final C2020oa aiC = m5994cc("lawyer");
    public static final C2020oa aiD = m5994cc("library");
    public static final C2020oa aiE = m5994cc("liquor_store");
    public static final C2020oa aiF = m5994cc("local_government_office");
    public static final C2020oa aiG = m5994cc("locksmith");
    public static final C2020oa aiH = m5994cc("lodging");
    public static final C2020oa aiI = m5994cc("meal_delivery");
    public static final C2020oa aiJ = m5994cc("meal_takeaway");
    public static final C2020oa aiK = m5994cc("mosque");
    public static final C2020oa aiL = m5994cc("movie_rental");
    public static final C2020oa aiM = m5994cc("movie_theater");
    public static final C2020oa aiN = m5994cc("moving_company");
    public static final C2020oa aiO = m5994cc("museum");
    public static final C2020oa aiP = m5994cc("night_club");
    public static final C2020oa aiQ = m5994cc("painter");
    public static final C2020oa aiR = m5994cc("park");
    public static final C2020oa aiS = m5994cc("parking");
    public static final C2020oa aiT = m5994cc("pet_store");
    public static final C2020oa aiU = m5994cc("pharmacy");
    public static final C2020oa aiV = m5994cc("physiotherapist");
    public static final C2020oa aiW = m5994cc("place_of_worship");
    public static final C2020oa aiX = m5994cc("plumber");
    public static final C2020oa aiY = m5994cc("police");
    public static final C2020oa aiZ = m5994cc("post_office");
    public static final C2020oa aia = m5994cc("convenience_store");
    public static final C2020oa aib = m5994cc("courthouse");
    public static final C2020oa aic = m5994cc("dentist");
    public static final C2020oa aid = m5994cc("department_store");
    public static final C2020oa aie = m5994cc("doctor");
    public static final C2020oa aif = m5994cc("electrician");
    public static final C2020oa aig = m5994cc("electronics_store");
    public static final C2020oa aih = m5994cc("embassy");
    public static final C2020oa aii = m5994cc("establishment");
    public static final C2020oa aij = m5994cc("finance");
    public static final C2020oa aik = m5994cc("fire_station");
    public static final C2020oa ail = m5994cc("florist");
    public static final C2020oa aim = m5994cc("food");
    public static final C2020oa ain = m5994cc("funeral_home");
    public static final C2020oa aio = m5994cc("furniture_store");
    public static final C2020oa aip = m5994cc("gas_station");
    public static final C2020oa aiq = m5994cc("general_contractor");
    public static final C2020oa air = m5994cc("grocery_or_supermarket");
    public static final C2020oa ais = m5994cc("gym");
    public static final C2020oa ait = m5994cc("hair_care");
    public static final C2020oa aiu = m5994cc("hardware_store");
    public static final C2020oa aiv = m5994cc("health");
    public static final C2020oa aiw = m5994cc("hindu_temple");
    public static final C2020oa aix = m5994cc("home_goods_store");
    public static final C2020oa aiy = m5994cc("hospital");
    public static final C2020oa aiz = m5994cc("insurance_agency");
    public static final C2020oa ajA = m5994cc("intersection");
    public static final C2020oa ajB = m5994cc("locality");
    public static final C2020oa ajC = m5994cc("natural_feature");
    public static final C2020oa ajD = m5994cc("neighborhood");
    public static final C2020oa ajE = m5994cc("political");
    public static final C2020oa ajF = m5994cc("point_of_interest");
    public static final C2020oa ajG = m5994cc("post_box");
    public static final C2020oa ajH = m5994cc("postal_code");
    public static final C2020oa ajI = m5994cc("postal_code_prefix");
    public static final C2020oa ajJ = m5994cc("postal_town");
    public static final C2020oa ajK = m5994cc("premise");
    public static final C2020oa ajL = m5994cc(Multiplayer.EXTRA_ROOM);
    public static final C2020oa ajM = m5994cc("route");
    public static final C2020oa ajN = m5994cc("street_address");
    public static final C2020oa ajO = m5994cc("sublocality");
    public static final C2020oa ajP = m5994cc("sublocality_level_1");
    public static final C2020oa ajQ = m5994cc("sublocality_level_2");
    public static final C2020oa ajR = m5994cc("sublocality_level_3");
    public static final C2020oa ajS = m5994cc("sublocality_level_4");
    public static final C2020oa ajT = m5994cc("sublocality_level_5");
    public static final C2020oa ajU = m5994cc("subpremise");
    public static final C2020oa ajV = m5994cc("transit_station");
    public static final C2020oa ajW = m5994cc(FitnessActivities.OTHER);
    public static final C2020oa aja = m5994cc("real_estate_agency");
    public static final C2020oa ajb = m5994cc("restaurant");
    public static final C2020oa ajc = m5994cc("roofing_contractor");
    public static final C2020oa ajd = m5994cc("rv_park");
    public static final C2020oa aje = m5994cc("school");
    public static final C2020oa ajf = m5994cc("shoe_store");
    public static final C2020oa ajg = m5994cc("shopping_mall");
    public static final C2020oa ajh = m5994cc("spa");
    public static final C2020oa aji = m5994cc("stadium");
    public static final C2020oa ajj = m5994cc("storage");
    public static final C2020oa ajk = m5994cc("store");
    public static final C2020oa ajl = m5994cc("subway_station");
    public static final C2020oa ajm = m5994cc("synagogue");
    public static final C2020oa ajn = m5994cc("taxi_stand");
    public static final C2020oa ajo = m5994cc("train_station");
    public static final C2020oa ajp = m5994cc("travel_agency");
    public static final C2020oa ajq = m5994cc("university");
    public static final C2020oa ajr = m5994cc("veterinary_care");
    public static final C2020oa ajs = m5994cc("zoo");
    public static final C2020oa ajt = m5994cc("administrative_area_level_1");
    public static final C2020oa aju = m5994cc("administrative_area_level_2");
    public static final C2020oa ajv = m5994cc("administrative_area_level_3");
    public static final C2020oa ajw = m5994cc("colloquial_area");
    public static final C2020oa ajx = m5994cc("country");
    public static final C2020oa ajy = m5994cc("floor");
    public static final C2020oa ajz = m5994cc("geocode");

    /* renamed from: CK */
    final int f4156CK;

    /* renamed from: vc */
    final String f4157vc;

    C2020oa(int i, String str) {
        C1785jx.m5363bb(str);
        this.f4156CK = i;
        this.f4157vc = str;
    }

    /* renamed from: cc */
    public static C2020oa m5994cc(String str) {
        return new C2020oa(0, str);
    }

    public int describeContents() {
        C2021ob obVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2020oa) && this.f4157vc.equals(((C2020oa) obj).f4157vc);
    }

    public int hashCode() {
        return this.f4157vc.hashCode();
    }

    public String toString() {
        return this.f4157vc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2021ob obVar = CREATOR;
        C2021ob.m5995a(this, parcel, i);
    }
}
