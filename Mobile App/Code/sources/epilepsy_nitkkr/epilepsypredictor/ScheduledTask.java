package epilepsy_nitkkr.epilepsypredictor;

import android.util.Log;
import java.util.Date;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
    private static final String TAG = "My Scheduled Task";
    Date now;

    public void run() {
        this.now = new Date();
        Log.d(TAG, "run: " + this.now);
    }
}
