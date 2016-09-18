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



    }


}
