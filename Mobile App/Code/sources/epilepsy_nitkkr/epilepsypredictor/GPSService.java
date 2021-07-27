package epilepsy_nitkkr.epilepsypredictor;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p000v4.app.ActivityCompat;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class GPSService extends Service implements LocationListener {
    private static final long DISTANCE = 20;
    private static final long TIME = 30000;
    boolean isGPSEnabled = false;
    public boolean isLocationAvailable = false;
    boolean isNetworkEnabled = false;
    /* access modifiers changed from: private */
    public final Context mContext;
    double mLatitude;
    Location mLocation;
    protected LocationManager mLocationManager;
    double mLongitude;

    public GPSService(Context context) {
        this.mContext = context;
        this.mLocationManager = (LocationManager) this.mContext.getSystemService("location");
    }

    public Location getLocation() {
        try {
            this.isGPSEnabled = this.mLocationManager.isProviderEnabled("gps");
            if (this.isGPSEnabled) {
                if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION");
                }
                this.mLocationManager.requestLocationUpdates("gps", TIME, 20.0f, this);
                if (this.mLocationManager != null) {
                    this.mLocation = this.mLocationManager.getLastKnownLocation("gps");
                    if (this.mLocation != null) {
                        this.mLatitude = this.mLocation.getLatitude();
                        this.mLongitude = this.mLocation.getLongitude();
                        this.isLocationAvailable = true;
                        return this.mLocation;
                    }
                }
            }
            this.isNetworkEnabled = this.mLocationManager.isProviderEnabled("network");
            if (this.isNetworkEnabled) {
                this.mLocationManager.requestLocationUpdates("network", TIME, 20.0f, this);
                if (this.mLocationManager != null) {
                    this.mLocation = this.mLocationManager.getLastKnownLocation("network");
                    if (this.mLocation != null) {
                        this.mLatitude = this.mLocation.getLatitude();
                        this.mLongitude = this.mLocation.getLongitude();
                        this.isLocationAvailable = true;
                        return this.mLocation;
                    }
                }
            }
            if (!this.isGPSEnabled) {
                askUserToOpenGPS();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.isLocationAvailable = false;
        return null;
    }

    public String getLocationAddress() {
        if (!this.isLocationAvailable) {
            return "Location Not available";
        }
        try {
            List<Address> addresses = new Geocoder(this.mContext, Locale.getDefault()).getFromLocation(this.mLatitude, this.mLongitude, 1);
            if (addresses == null || addresses.size() <= 0) {
                return "No address found by the service: Note to the developers, If no address is found by google itself, there is nothing you can do about it.";
            }
            Address address = addresses.get(0);
            Object[] objArr = new Object[3];
            objArr[0] = address.getMaxAddressLineIndex() > 0 ? address.getAddressLine(0) : "";
            objArr[1] = address.getLocality();
            objArr[2] = address.getCountryName();
            return String.format("%s, %s, %s", objArr);
        } catch (IOException e1) {
            e1.printStackTrace();
            return "IO Exception trying to get address:" + e1;
        } catch (IllegalArgumentException e2) {
            String errorString = "Illegal arguments " + Double.toString(this.mLatitude) + " , " + Double.toString(this.mLongitude) + " passed to address service";
            e2.printStackTrace();
            return errorString;
        }
    }

    public double getLatitude() {
        if (this.mLocation != null) {
            this.mLatitude = this.mLocation.getLatitude();
        }
        return this.mLatitude;
    }

    public double getLongitude() {
        if (this.mLocation != null) {
            this.mLongitude = this.mLocation.getLongitude();
        }
        return this.mLongitude;
    }

    public void closeGPS() {
        if (this.mLocationManager != null) {
            this.mLocationManager.removeUpdates(this);
        }
    }

    public void askUserToOpenGPS() {
        new AlertDialog.Builder(this.mContext).setTitle("Location not available, Open GPS?").setMessage("Activate GPS to use use location services?").setPositiveButton("Open Settings", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                GPSService.this.mContext.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        }).show();
    }

    public void onLocationChanged(Location location) {
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
    }

    public void onProviderDisabled(String provider) {
    }

    public void onProviderEnabled(String provider) {
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    public IBinder onBind(Intent arg0) {
        return null;
    }
}
