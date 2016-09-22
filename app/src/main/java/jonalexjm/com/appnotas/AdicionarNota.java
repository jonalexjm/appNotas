package jonalexjm.com.appnotas;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class AdicionarNota extends AppCompatActivity {


    private Button btnBuscarFechas, btnGuardarNota, btnAgregarHora;
    private TextView txtTitulo, txtContenido, txtFecha, txtDia, txtMes, txtAnno, txtHora, txtMinutos;
    private EditText edTxtTitulo,edTxtContenido;
    private int diaNota, mesNota, annoNota, sDia, msMes, sAnno;
    static final int DATE_ID = 0;

    TimePickerDialog timePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_nota);

        btnBuscarFechas = (Button) findViewById(R.id.btnEscoger_fecha);
        btnGuardarNota = (Button) findViewById(R.id.btnAgregarNota);
        btnAgregarHora =  (Button) findViewById(R.id.btnAgregarHora);

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtContenido = (TextView) findViewById(R.id.txtContenido);
        txtFecha = (TextView) findViewById(R.id.txtFecha);
        txtDia = (TextView) findViewById(R.id.txtDia);
        txtMes = (TextView) findViewById(R.id.txtMes);
        txtAnno = (TextView) findViewById(R.id.txtAnno);
        txtHora = (TextView) findViewById(R.id.txtHora);
        txtMinutos = (TextView) findViewById(R.id.txtMinutos);

        edTxtTitulo = (EditText) findViewById(R.id.edTxtTitulo);
        edTxtContenido = (EditText) findViewById(R.id.edTxtContenido);

        btnBuscarFechas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog(DATE_ID);

            }
        });


        btnAgregarHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(AdicionarNota.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        txtHora.setText(selectedHour + ":" + selectedMinute);
                       // txtMinutos.setText(selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Seleccione la hora");
                mTimePicker.show();

            }
        });


    }

    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener(){
        public void onDateSet(DatePicker view, int anno, int mes, int dia ){

            diaNota = dia;
            mesNota = mes;//aqui se almacena la fecha que selecciones en el datepicker
            annoNota = anno;

            ColocarFechasTxtView();
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

    private void ColocarFechasTxtView(){
        txtDia.setText(new StringBuilder().append(diaNota));
        txtMes.setText(new StringBuilder().append(mesNota +1));
        txtAnno.setText(new StringBuilder().append(annoNota));
    }


}
