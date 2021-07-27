package epilepsy_nitkkr.epilepsypredictor;

import android.database.Cursor;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class ViewListContents extends AppCompatActivity {
    DatabaseHelper myDB;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C2818R.layout.viewcontents_layout);
        ListView listView = (ListView) findViewById(C2818R.C2820id.listView);
        this.myDB = new DatabaseHelper(this);
        ArrayList<String> theList = new ArrayList<>();
        Cursor data = this.myDB.getListContents();
        if (data.getCount() == 0) {
            Toast.makeText(this, "There are no contents in this list!", 1).show();
            return;
        }
        while (data.moveToNext()) {
            theList.add(data.getString(1));
            listView.setAdapter(new ArrayAdapter(this, 17367043, theList));
        }
    }
}
