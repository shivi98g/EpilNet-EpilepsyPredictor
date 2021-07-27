package epilepsy_nitkkr.epilepsypredictor;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPhoneNo extends AppCompatActivity {
    Button btnAdd;
    Button btnView;
    EditText editText;
    DatabaseHelper myDB;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C2818R.layout.activity_add_phone_no);
        this.editText = (EditText) findViewById(C2818R.C2820id.editText);
        this.btnAdd = (Button) findViewById(C2818R.C2820id.btnAdd);
        this.btnView = (Button) findViewById(C2818R.C2820id.btnView);
        this.myDB = new DatabaseHelper(this);
        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String newEntry = AddPhoneNo.this.editText.getText().toString();
                if (AddPhoneNo.this.editText.length() != 0) {
                    AddPhoneNo.this.AddData(newEntry);
                    AddPhoneNo.this.editText.setText("");
                    return;
                }
                Toast.makeText(AddPhoneNo.this, "You must put something in the text field!", 1).show();
            }
        });
        this.btnView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AddPhoneNo.this.startActivity(new Intent(AddPhoneNo.this, ViewListContents.class));
            }
        });
    }

    public void AddData(String newEntry) {
        if (this.myDB.addData(newEntry)) {
            Toast.makeText(this, "Data Successfully Inserted!", 1).show();
        } else {
            Toast.makeText(this, "Something went wrong :(.", 1).show();
        }
    }
}
