package epilepsy_nitkkr.epilepsypredictor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String COL1 = "ID";
    public static final String COL2 = "PhoneNo";
    public static final String DATABASE_NAME = "epilepsy_predictor.db";
    public static final String TABLE_NAME = "contacts";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE contacts (ID INTEGER PRIMARY KEY AUTOINCREMENT,  PhoneNo TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP  TABLE IF EXISTS contacts");
        onCreate(db);
    }

    public boolean addData(String PhoneNo) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, PhoneNo);
        if (db.insert(TABLE_NAME, (String) null, contentValues) == -1) {
            return false;
        }
        return true;
    }

    public Cursor getListContents() {
        return getWritableDatabase().rawQuery("SELECT * FROM contacts", (String[]) null);
    }
}
