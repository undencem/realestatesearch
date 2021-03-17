package sqliteopenhelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class DatabaseAccess {

    private SQLiteOpenHelper mOpenHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null ;

    // private constructor so that object creation from outside class is avoided
    private DatabaseAccess(Context context){
        this.mOpenHelper = new DatabaseOpenHelper(context);
    }

    // to return the single instance of database
    // Singleton
    public static DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    // Opens connection to db
    public void open(){
        this.db = mOpenHelper.getWritableDatabase();
    }

    // Closes connection to db
    public void close(){
        if(db!=null){
            this.db.close();
        }
    }

    // now lets create a method to query and return the result from database
    // we will query for address passing PLAKA
    public String getIl(int plaka){
        c = db.rawQuery("SELECT IL_ADI FROM il_table WHERE PLAKA='"+plaka+"'",new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String il = c.getString(0);
            buffer.append(""+il);
        }
        return buffer.toString();
    }

}
