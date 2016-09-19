package jonalexjm.com.appnotas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import jonalexjm.com.appnotas.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotaAgregarFragment extends Fragment {

    private Button btnBuscarFechas, btnGuardarNota;
    private TextView txtTitulo, txtContenido, txtFecha, txtDia, txtMes, txtAnno;
    private EditText edTxtTitulo,edTxtContenido;



    public NotaAgregarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_nota, container, false);

        btnBuscarFechas = (Button) v.findViewById(R.id.btnEscoger_fecha);
        btnGuardarNota = (Button)  v.findViewById(R.id.btnAgregarNota);

        txtTitulo = (TextView) v.findViewById(R.id.txtTitulo);
        txtContenido = (TextView) v.findViewById(R.id.txtContenido);
        txtFecha = (TextView) v.findViewById(R.id.txtFecha);
        txtDia = (TextView) v.findViewById(R.id.txtDia);
        txtMes = (TextView) v.findViewById(R.id.txtMes);
        txtAnno = (TextView) v.findViewById(R.id.txtAnno);

        edTxtTitulo = (EditText) v.findViewById(R.id.edTxtTitulo);
        edTxtContenido = (EditText) v.findViewById(R.id.edTxtContenido);


        return v;
    }

}
