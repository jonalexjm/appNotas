package jonalexjm.com.appnotas;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdicionarNota extends AppCompatActivity {


    private Button btnBuscarFechas, btnGuardarNota;
    private TextView txtTitulo, txtContenido, txtFecha, txtDia, txtMes, txtAnno;
    private EditText edTxtTitulo,edTxtContenido;
    private int diaNota, mesNota, annoNota, sDia, msMes, sAnno;
    static final int DATE_ID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_nota);

        btnBuscarFechas = (Button) findViewById(R.id.btnEscoger_fecha);
        btnGuardarNota = (Button) findViewById(R.id.btnAgregarNota);

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtContenido = (TextView) findViewById(R.id.txtContenido);
        txtFecha = (TextView) findViewById(R.id.txtFecha);
        txtDia = (TextView) findViewById(R.id.txtDia);
        txtMes = (TextView) findViewById(R.id.txtMes);
        txtAnno = (TextView) findViewById(R.id.txtAnno);

        edTxtTitulo = (EditText) findViewById(R.id.edTxtTitulo);
        edTxtContenido = (EditText) findViewById(R.id.edTxtContenido);

        btnBuscarFechas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog(DATE_ID);

            }
        });


    }

    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener(){
        public void onDateSet(DatePicker view, int anno, int mes, int dia ){

            diaNota = dia;
            mesNota = mes;
            annoNota = anno;
//colocarFecha
        }

    };

    protected Dialog onCreateDialog(int id){
        switch (id){
            case DATE_ID:
                return new DatePickerDialog(this
                        , mDateSetListener,
                        sAnno, msMes, sDia);
        }
        return null;
    }


}
