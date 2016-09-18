package jonalexjm.com.appnotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import jonalexjm.com.appnotas.R;
import jonalexjm.com.appnotas.adaptador.NotaAdaptador;
import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 18/09/2016.
 */
public class NotasRecyclerViewFragment extends Fragment {

    private RecyclerView rvNota;
    ArrayList<Nota> notas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_notasrecyclerview, container, false);//RELACIONA AL LAYOUT

        rvNota = (RecyclerView) v.findViewById(R.id.rvNota);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvNota.setLayoutManager(llm);

        inicializarListaNotas();
        inicializarAdaptador();
        return v;
    }

    public void inicializarAdaptador(){

        NotaAdaptador adaptador = new NotaAdaptador(notas, getActivity());
        rvNota.setAdapter(adaptador);

    }

    public void inicializarListaNotas(){

        notas = new ArrayList<Nota>();

        notas.add(new Nota(1, "Caminata nocturna","se realiza una caminata de acuerdo al plan",12,34, 12,34, 12));
        notas.add(new Nota(2,"Noche de sexo","se realiza una buena noche romantica",23,34, 12,34, 12));


    }
}
