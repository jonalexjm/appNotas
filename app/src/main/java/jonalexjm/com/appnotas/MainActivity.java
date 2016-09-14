package jonalexjm.com.appnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jonalexjm.com.appnotas.adaptador.NotaAdaptador;
import jonalexjm.com.appnotas.pojo.Nota;

public class MainActivity extends AppCompatActivity {

    ArrayList<Nota> notas;
    private RecyclerView rvNota;
    public NotaAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNota = (RecyclerView) findViewById(R.id.rvNota);


        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvNota.setLayoutManager(llm);

        inicializarListaNotas();
        inicializarAdaptador();


    }

    public void inicializarAdaptador(){

        NotaAdaptador adaptador = new NotaAdaptador(notas, this);
        rvNota.setAdapter(adaptador);

    }

    public void inicializarListaNotas(){

        notas = new ArrayList<Nota>();

        notas.add(new Nota("1", "Caminata nocturna","se realiza una caminata de acuerdo al plan",12,34, 12,34, 12));
        notas.add(new Nota("2","Noche de sexo","se realiza una buena noche romantica",23,34, 12,34, 12));


    }
}
