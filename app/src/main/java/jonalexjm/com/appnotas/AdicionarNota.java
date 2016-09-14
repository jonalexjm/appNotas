package jonalexjm.com.appnotas;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdicionarNota extends AppCompatActivity {


    EditText EdTvtitulo;
    EditText EdTvcontenido;
    EditText EdTvdia;
    EditText EdTvmes;
    EditText EdTvanno;
    Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_nota);

        EdTvtitulo = (EditText) findViewById(R.id.EtvTitulo);
        EdTvcontenido = (EditText) findViewById(R.id.EtvContenido);

        btnGuardar = (Button) findViewById(R.id.btnAgregarNota);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar(EdTvtitulo.getText().toString(), EdTvcontenido.getText().toString());
                Toast.makeText(AdicionarNota.this, "has dado click en guardar", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private  void guardar(String Titulo, String Contenido){

        BaseHelper helper = new BaseHelper(this, "Demo", null, 1);
        SQLiteDatabase db = helper.getWritableDatabase();

        try{
            ContentValues c = new ContentValues();
            c.put("Titulo", Titulo);
            c.put("Contenido",Contenido);
            db.insert("NOTA",null, c);
            db.close();
            Toast.makeText(this, "Registro insertado", Toast.LENGTH_SHORT).show();
            EdTvtitulo.setText("");
            EdTvcontenido.setText("");



        }catch (Exception e){
            Toast.makeText(this, "Error"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
