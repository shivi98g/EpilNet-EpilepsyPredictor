package epilepsy_nitkkr.epilepsypredictor;

import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.content.ContextCompat;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnStartService;
    Button btnStopService;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C2818R.layout.activity_main);
        this.btnStartService = (Button) findViewById(C2818R.C2820id.buttonStartService);
        this.btnStopService = (Button) findViewById(C2818R.C2820id.buttonStopService);
        final EditText txtViewPatientID = (EditText) findViewById(C2818R.C2820id.EditTextPatientID);
        this.btnStartService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startService(txtViewPatientID.getText().toString());
            }
        });
        this.btnStopService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.stopService();
            }
        });
    }

    public void startService(String patientID) {
        Intent serviceIntent = new Intent(this, ForegroundService.class);
        serviceIntent.putExtra("inputExtra", patientID);
        ContextCompat.startForegroundService(this, serviceIntent);
    }

    public void stopService() {
        stopService(new Intent(this, ForegroundService.class));
    }
}
