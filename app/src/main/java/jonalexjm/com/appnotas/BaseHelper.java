package jonalexjm.com.appnotas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by electrom on 14/09/2016.
 */
public class BaseHelper extends SQLiteOpenHelper {



    String tabla="CREATE TABLE NOTA(ID INTEGER PRIMARY KEY, TITULO TEXT, CONTENIDO TEXT, DIA_NOTA INTEGER, MES_NOTA INTEGER, ANNO_NOTA INTEGER, HORA_NOTA INTEGER, MINUTO_NOTA INTEGER )";

    public BaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);// crea la tabla

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table nota");
        db.execSQL(tabla);
    }
}
