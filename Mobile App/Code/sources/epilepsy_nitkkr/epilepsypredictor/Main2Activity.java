package epilepsy_nitkkr.epilepsypredictor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private static Button clear;
    private static TextView displayInternetLocation;
    /* access modifiers changed from: private */
    public static TextView displayLocation;
    /* access modifiers changed from: private */
    public static Button getLocation;
    private static Button getLocation_usingInternet;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C2818R.layout.activity_main2);
        init();
        setListeners();
    }

    private void init() {
        getLocation = (Button) findViewById(C2818R.C2820id.get_location_without_internet);
        getLocation_usingInternet = (Button) findViewById(C2818R.C2820id.get_location_using_internet);
        clear = (Button) findViewById(C2818R.C2820id.clear);
        displayLocation = (TextView) findViewById(C2818R.C2820id.show_location_without_internet);
        displayInternetLocation = (TextView) findViewById(C2818R.C2820id.show_location_using_internet);
    }

    private void setListeners() {
        getLocation.setOnClickListener(this);
        getLocation_usingInternet.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id != C2818R.C2820id.clear) {
            switch (id) {
                case C2818R.C2820id.get_location_using_internet /*2131230812*/:
                    getLocationUsingInternet();
                    return;
                case C2818R.C2820id.get_location_without_internet /*2131230813*/:
                    getLocationWithoutInternet();
                    return;
                default:
                    return;
            }
        } else {
            displayInternetLocation.setText("");
            displayLocation.setText("");
            Toast.makeText(this, "CLicked Clear", 1).show();
        }
    }

    private void getLocationUsingInternet() {
        if (new ConnectionDetector(this).isConnectingToInternet()) {
            getLocation_usingInternet.setText("Please wait...");
            getLocation_usingInternet.setEnabled(false);
            new GPSLocation(this).turnGPSOn();
            displayInternetLocation.setText(new GPSLocation(this).getMyCurrentLocation());
            getLocation_usingInternet.setText(C2818R.string.location_internet);
            getLocation_usingInternet.setEnabled(true);
            return;
        }
        Toast.makeText(this, "There is no internet connection.", 0).show();
    }

    @SuppressLint({"MissingPermission"})
    private void getLocationWithoutInternet() {
        getLocation.setText("Please wait..");
        getLocation.setEnabled(false);
        LocationManager locationManager = (LocationManager) getSystemService("location");
        C28141 r6 = new LocationListener() {
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            public void onProviderEnabled(String provider) {
            }

            public void onProviderDisabled(String provider) {
            }

            public void onLocationChanged(Location location) {
                TextView access$000 = Main2Activity.displayLocation;
                access$000.setText("Latitude : " + location.getLatitude() + "nLongitude : " + location.getLongitude());
                Context applicationContext = Main2Activity.this.getApplicationContext();
                Toast.makeText(applicationContext, location.getLatitude() + "     " + location.getLongitude(), 0).show();
                Main2Activity.getLocation.setText(C2818R.string.location_without_internet);
                Main2Activity.getLocation.setEnabled(true);
            }
        };
        if (locationManager.getAllProviders().contains("network")) {
            locationManager.requestLocationUpdates("network", 0, 0.0f, r6);
        }
        if (locationManager.getAllProviders().contains("gps")) {
            locationManager.requestLocationUpdates("gps", 0, 0.0f, r6);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        new GPSLocation(this).turnGPSOff();
    }
}
