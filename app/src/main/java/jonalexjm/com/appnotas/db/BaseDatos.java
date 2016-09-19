package jonalexjm.com.appnotas.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 18/09/2016.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private Context context;


    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCrearTablaNotas = "CREATE TABLE " + ConstantesBaseDatos.TABLA_NOTA + "(" +
                ConstantesBaseDatos.TABLA_NOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLA_NOTA_TITULO + " TEXT, " +
                ConstantesBaseDatos.TABLE_NOTA_CONTENIDO + " TEXT, " +
                ConstantesBaseDatos.TABLE_NOTA_DIA + " INTEGER, " +
                ConstantesBaseDatos.TABLE_NOTA_MES + " INTEGER, " +
                ConstantesBaseDatos.TABLE_NOTA_ANNO + " INTEGER, " +
                ConstantesBaseDatos.TABLE_NOTA_HORA + " INTEGER, " +
                ConstantesBaseDatos.TABLE_NOTA_MINUTOS + " INTEGER" +
                ")";

        db.execSQL(queryCrearTablaNotas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLA_NOTA);
        onCreate(db);

    }

    public ArrayList<Nota> obtenerTodasNotas() {
        ArrayList<Nota> notas = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLA_NOTA;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()){
            Nota NotaActual = new Nota();
            NotaActual.setId(registros.getInt(0));
            NotaActual.setTitulo(registros.getString(1));
            NotaActual.setContenido(registros.getString(2));
            NotaActual.setDiaNota(registros.getInt(3));
            NotaActual.setMesNota(registros.getInt(4));
            NotaActual.setAnnoNota(registros.getInt(5));
            NotaActual.setHoraNota(registros.getInt(6));
            NotaActual.setMinutoNota(registros.getInt(7));

            notas.add(NotaActual);



        }

        db.close();

        return notas;
    }

    public void insertarNota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLA_NOTA, null, contentValues);
        db.close();
    }
}
