package epilepsy_nitkkr.epilepsypredictor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.p003v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case C2818R.C2820id.navigation_dashboard /*2131230851*/:
                    Main3Activity.this.mTextMessage.setText(C2818R.string.title_dashboard);
                    Main3Activity.this.startActivity(new Intent(Main3Activity.this, AddPhoneNo.class));
                    return true;
                case C2818R.C2820id.navigation_home /*2131230853*/:
                    Main3Activity.this.mTextMessage.setText(C2818R.string.title_home);
                    Main3Activity.this.startActivity(new Intent(Main3Activity.this, MainActivity.class));
                    return true;
                case C2818R.C2820id.navigation_notifications /*2131230854*/:
                    Main3Activity.this.mTextMessage.setText(C2818R.string.title_notifications);
                    return true;
                default:
                    return false;
            }
        }
    };
    /* access modifiers changed from: private */
    public TextView mTextMessage;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C2818R.layout.activity_main3);
        this.mTextMessage = (TextView) findViewById(C2818R.C2820id.message);
        ((BottomNavigationView) findViewById(C2818R.C2820id.navigation)).setOnNavigationItemSelectedListener(this.mOnNavigationItemSelectedListener);
    }
}
