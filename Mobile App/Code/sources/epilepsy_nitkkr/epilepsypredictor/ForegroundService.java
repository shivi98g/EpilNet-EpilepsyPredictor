package epilepsy_nitkkr.epilepsypredictor;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.p000v4.app.NotificationCompat;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class ForegroundService extends Service {
    public static final String CHANNEL_ID = "ForegroundServiceChannel";
    private static final String TAG = "My Epilepsy Service";
    Location mlocation;
    /* access modifiers changed from: private */
    public boolean run;

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        String input = intent.getStringExtra("inputExtra");
        createNotificationChannel();
        startForeground(1, new NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle("Epilepsy Service").setContentText(input).setSmallIcon(C2818R.C2819drawable.ic_launcher_background).setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0)).build());
        this.run = true;
        new Thread(new Runnable() {
            public void run() {
                Looper.prepare();
                while (ForegroundService.this.run) {
                    Log.i(ForegroundService.TAG, "Staring Again ");
                    JSONObject obj = null;
                    try {
                        obj = new JSONObject("{'data':[-20,-43,-47,-37,-28,-24,-26,-37,-61,-72,-33,0,33,27,27,-4,11,19,1,12,-8,7,13,10,31,59,56,12,-27,-52,-34,-25,-4,-12,-14,-30,-53,-57,-64,-59,-35,-12,1,5,-9,-15,-1,-17,-44,-62,-78,-64,-40,-13,-21,-32,-55,-95,-60,-31,12,15,-19,-21,-3,3,8,-4,-31,-29,-13,3,-12,-31,-46,-46,-22,-4,-1,-1,-13,-19,-35,-25,-27,-24,-58,-92,-115,-98,-67,-50,-38,-44,-24,5,9,0,-9,-24,-20,-3,-5,-1,-34,-47,-60,-63,-44,-42,-38,-43,-55,-26,-31,-5,-47,-68,-65,-52,-29,-36,8,6,-8,-22,-21,-15,-20,-36,-54,-45,-40,-33,-36,-60,-44,-17,24,50,28,-2,-44,-60,-63,-35,-10,-6,-37,-37,-47,-23,-28,-10,14,20,31,1,-24,-63,-70,-55,-43,-48,-34,-29,-13,2,6,7,-2,-24,-48,-64,-47,-38,-27,-2]}");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    final String[] Res = new String[1];
                    RequestQueue requestQueue = Volley.newRequestQueue(ForegroundService.this.getApplicationContext());
                    JsonObjectRequest jsonobj = new JsonObjectRequest(1, "https://testing-major.herokuapp.com/web", obj, new Response.Listener<JSONObject>() {
                        public void onResponse(JSONObject response) {
                            Log.i(ForegroundService.TAG, response.toString());
                            Res[0] = response.toString();
                            Toast.makeText(ForegroundService.this.getApplicationContext(), response.toString(), 1).show();
                        }
                    }, new Response.ErrorListener() {
                        public void onErrorResponse(VolleyError error) {
                            Log.i(ForegroundService.TAG, error.toString());
                        }
                    });
                    String loc = ForegroundService.this.getLocationUsingInternet();
                    Toast.makeText(ForegroundService.this.getApplicationContext(), loc, 1).show();
                    jsonobj.setRetryPolicy(new DefaultRetryPolicy(600000, 1, 1.0f));
                    requestQueue.add(jsonobj);
                    Log.d(ForegroundService.TAG, "SMS STARTING");
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage("+917206183769", (String) null, "At :" + loc + " Condition : " + Res[0], (PendingIntent) null, (PendingIntent) null);
                    Log.d(ForegroundService.TAG, "SMS SENT");
                    Log.d(ForegroundService.TAG, loc);
                    Log.d(ForegroundService.TAG, "Job finished");
                    try {
                        Thread.sleep(60000);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }).start();
        Log.d(TAG, "Job ENDING");
        return 2;
    }

    /* access modifiers changed from: private */
    public String getLocationUsingInternet() {
        if (new ConnectionDetector(getApplicationContext()).isConnectingToInternet()) {
            new GPSLocation(getApplicationContext()).turnGPSOn();
            String getLocation = new GPSLocation(getApplicationContext()).getMyCurrentLocation();
            Log.d(TAG, getLocation);
            return getLocation;
        }
        Toast.makeText(getApplicationContext(), "There is no internet connection.", 0).show();
        Log.d(TAG, "There is no internet connection.");
        return "";
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroy Started  ");
        this.run = false;
        stopForeground(true);
        stopSelf();
        new GPSLocation(getApplicationContext()).turnGPSOff();
        Log.d(TAG, "Destroy Ended");
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(CHANNEL_ID, "Foreground Service Channel", 3));
        }
    }
}
