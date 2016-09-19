package jonalexjm.com.appnotas.db;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import jonalexjm.com.appnotas.pojo.Nota;

/**
 * tambien se le llama clase interactor
 * Created by andrea on 18/09/2016.
 */
public class ContructorNotas {

    private Context context;
    ArrayList<Nota> notas;

    public ContructorNotas(Context context) {
        this.context = context;
    }

    public ArrayList<Nota> obtenerDatos(){
/**
        ArrayList<Nota> notas = new ArrayList<>();

        notas.add(new Nota(1, "Caminata nocturna","se realiza una caminata de acuerdo al plan",12,34, 12,34, 12));
        notas.add(new Nota(2,"Noche de sexo","se realiza una buena noche romantica",23,34, 12,34, 12));
        return  notas;
 */
        BaseDatos db = new BaseDatos(context);
        insertarNotas(db);
        return db.obtenerTodasNotas();
    }

    public void insertarNotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_NOTA_TITULO, "PRIMERA NOTA");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_CONTENIDO, "PRIMERA IMAGEN DE CREAR");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_DIA, 12);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MES, 10);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_ANNO, 2014);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_HORA, 20);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MINUTOS, 55);

        db.insertarNota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_NOTA_TITULO, "SEGUNDA NOTA");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_CONTENIDO, "TE AMO");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_DIA, 12);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MES, 10);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_ANNO, 2014);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_HORA, 20);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MINUTOS, 55);

        db.insertarNota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_NOTA_TITULO, "TERCERA NOTA");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_CONTENIDO, "TE AMO");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_DIA, 12);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MES, 10);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_ANNO, 2014);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_HORA, 20);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MINUTOS, 55);

        db.insertarNota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLA_NOTA_TITULO, "CUARTA NOTA");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_CONTENIDO, "TE AMO");
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_DIA, 12);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MES, 10);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_ANNO, 2014);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_HORA, 20);
        contentValues.put(ConstantesBaseDatos.TABLE_NOTA_MINUTOS, 55);

        db.insertarNota(contentValues);

    }
}
