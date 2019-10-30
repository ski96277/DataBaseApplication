package rocketechit.com.databaseapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    public static DatabaseAccess instance;
    Cursor c = null;

    public DatabaseAccess(Context context) {
        this.openHelper = new MyDatabase(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open() {
        this.db = openHelper.getWritableDatabase();
    }

    public void close() {
        if (db != null) {
            this.db.close();
        }
    }

    public String getAddress(String name) {
        this.open();
        c = (Cursor) db.rawQuery("select address from Table1 where Name = '" + name + "'", new String[]{});
//        c = (Cursor) db.rawQuery("select * from Table1", new String[]{});

        StringBuffer stringBuffer = new StringBuffer();
        while (c.moveToNext()) {
            String address = c.getString(0);
            stringBuffer.append(address);
        }
        this.close();
        return stringBuffer.toString();
    }
}