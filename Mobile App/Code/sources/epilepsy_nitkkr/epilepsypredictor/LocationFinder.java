package epilepsy_nitkkr.epilepsypredictor;

import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.p000v4.app.ActivityCompat;
import android.support.p003v7.app.AlertDialog;

public class LocationFinder extends Service implements LocationListener {
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BW_UPDATES = 2000;
    boolean canGetLocation = false;
    Context context;
    boolean isGPSEnabled = false;
    boolean isNetworkEnabled = false;
    double latitude;
    Location location;
    protected LocationManager locationManager;
    double longitude;

    public LocationFinder(Context context2) {
        this.context = context2;
        getLocation();
    }

    public Location getLocation() {
        try {
            this.locationManager = (LocationManager) this.context.getSystemService("location");
            this.isGPSEnabled = this.locationManager.isProviderEnabled("gps");
            this.isNetworkEnabled = this.locationManager.isProviderEnabled("network");
            if (!this.isGPSEnabled && !this.isNetworkEnabled) {
                return this.location;
            }
            this.canGetLocation = true;
            if (this.isNetworkEnabled) {
                if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION");
                }
                this.locationManager.requestLocationUpdates("network", MIN_TIME_BW_UPDATES, 10.0f, this);
                if (this.locationManager != null) {
                    this.location = this.locationManager.getLastKnownLocation("network");
                    if (this.location != null) {
                        this.latitude = this.location.getLatitude();
                        this.longitude = this.location.getLongitude();
                    }
                }
            } else if (this.isGPSEnabled && this.location == null) {
                this.locationManager.requestLocationUpdates("gps", MIN_TIME_BW_UPDATES, 10.0f, this);
                if (this.locationManager != null) {
                    this.location = this.locationManager.getLastKnownLocation("gps");
                    if (this.location != null) {
                        this.latitude = this.location.getLatitude();
                        this.longitude = this.location.getLongitude();
                    }
                }
            }
            return this.location;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double getLatitude() {
        if (this.location != null) {
            this.latitude = this.location.getLatitude();
        }
        return this.latitude;
    }

    public double getLongitude() {
        if (this.location != null) {
            this.longitude = this.location.getLongitude();
        }
        return this.longitude;
    }

    public boolean canGetLocation() {
        return this.canGetLocation;
    }

    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.context);
        alertDialog.setTitle((CharSequence) "GPS settings");
        alertDialog.setMessage((CharSequence) "GPS is not enabled. Do you want to go to settings menu?");
        alertDialog.setPositiveButton((CharSequence) "Settings", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                LocationFinder.this.context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        });
        alertDialog.setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.show();
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onLocationChanged(Location location2) {
    }

    public void onStatusChanged(String s, int i, Bundle bundle) {
    }

    public void onProviderEnabled(String s) {
    }

    public void onProviderDisabled(String s) {
    }
}
