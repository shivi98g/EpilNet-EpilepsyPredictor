package epilepsy_nitkkr.epilepsypredictor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import java.util.List;
import java.util.Locale;

public class GPSLocation {
    String AddressLine = "";
    String CityName = "";
    String CountryName = "";
    Double MyLat;
    Double MyLong;
    String StateName = "";
    private Context context;
    private StringBuilder currentLocation = new StringBuilder();
    private boolean gps_enabled = false;
    Location location;
    private boolean network_enabled = false;

    public GPSLocation(Context context2) {
        this.context = context2;
    }

    public void turnGPSOn() {
        try {
            if (!Settings.Secure.getString(this.context.getContentResolver(), "location_providers_allowed").contains("gps")) {
                Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory("android.intent.category.ALTERNATIVE");
                poke.setData(Uri.parse("3"));
                this.context.sendBroadcast(poke);
            }
        } catch (Exception e) {
        }
    }

    public void turnGPSOff() {
        if (Settings.Secure.getString(this.context.getContentResolver(), "location_providers_allowed").contains("gps")) {
            Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory("android.intent.category.ALTERNATIVE");
            poke.setData(Uri.parse("3"));
            this.context.sendBroadcast(poke);
        }
    }

    @SuppressLint({"MissingPermission"})
    public String getMyCurrentLocation() {
        LocationManager locManager = (LocationManager) this.context.getSystemService("location");
        LocationListener locListener = new MyLocationListener();
        try {
            this.gps_enabled = locManager.isProviderEnabled("gps");
        } catch (Exception e) {
        }
        try {
            this.network_enabled = locManager.isProviderEnabled("network");
        } catch (Exception e2) {
        }
        if (this.gps_enabled) {
            locManager.requestLocationUpdates("gps", 0, 0.0f, locListener);
        }
        if (this.gps_enabled) {
            this.location = locManager.getLastKnownLocation("gps");
        }
        if (this.network_enabled && this.location == null) {
            locManager.requestLocationUpdates("network", 0, 0.0f, locListener);
        }
        if (this.network_enabled && this.location == null) {
            this.location = locManager.getLastKnownLocation("network");
        }
        if (this.location != null) {
            this.MyLat = Double.valueOf(this.location.getLatitude());
            this.MyLong = Double.valueOf(this.location.getLongitude());
            StringBuilder sb = this.currentLocation;
            sb.append("Latitude : " + this.MyLat + " Longitude : " + this.MyLong);
        } else {
            Location loc = getLastKnownLocation(this.context);
            if (loc != null) {
                this.MyLat = Double.valueOf(loc.getLatitude());
                this.MyLong = Double.valueOf(loc.getLongitude());
            }
        }
        locManager.removeUpdates(locListener);
        try {
            List<Address> addresses = new Geocoder(this.context, Locale.getDefault()).getFromLocation(this.MyLat.doubleValue(), this.MyLong.doubleValue(), 1);
            this.StateName = addresses.get(0).getAdminArea();
            this.CityName = addresses.get(0).getLocality();
            this.CountryName = addresses.get(0).getCountryName();
            this.AddressLine = addresses.get(0).getAddressLine(0);
            StringBuilder sb2 = this.currentLocation;
            sb2.append(" Address Line : " + this.AddressLine);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return this.currentLocation.toString();
    }

    public class MyLocationListener implements LocationListener {
        public MyLocationListener() {
        }

        public void onLocationChanged(Location location) {
        }

        public void onProviderDisabled(String provider) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
    }

    public static Location getLastKnownLocation(Context context2) {
        Location location1;
        Location location2 = null;
        LocationManager locationmanager = (LocationManager) context2.getSystemService("location");
        boolean i = false;
        for (String s : locationmanager.getAllProviders()) {
            if ((!i || locationmanager.isProviderEnabled(s)) && (location1 = locationmanager.getLastKnownLocation(s)) != null) {
                if (location2 == null || location2.getAccuracy() < location1.getAccuracy() || location1.getTime() - location2.getTime() > 600000) {
                    location2 = location1;
                    i = locationmanager.isProviderEnabled(s);
                }
            }
        }
        return location2;
    }
}
