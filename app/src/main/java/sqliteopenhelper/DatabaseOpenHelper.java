package sqliteopenhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME="database.db";
    private static final int  DATABASE_VERSION=1;

    //constructor
    public DatabaseOpenHelper(Context context){
        super(context, DATABASE_NAME , null , DATABASE_VERSION);
    }
}
