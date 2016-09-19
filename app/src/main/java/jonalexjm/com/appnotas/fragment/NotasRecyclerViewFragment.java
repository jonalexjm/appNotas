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

import jonalexjm.com.appnotas.Presentador.INotasRecyclerViewFragmentPresentador;
import jonalexjm.com.appnotas.Presentador.NotaRecyclerViewFragmentPresentador;
import jonalexjm.com.appnotas.R;
import jonalexjm.com.appnotas.adaptador.NotaAdaptador;
import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 18/09/2016.
 */
public class NotasRecyclerViewFragment extends Fragment implements INotasRecyclerViewFragmentView {

    private RecyclerView rvNota;
    ArrayList<Nota> notas;
    private INotasRecyclerViewFragmentPresentador presentador;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_notasrecyclerview, container, false);//RELACIONA AL LAYOUT

        rvNota = (RecyclerView) v.findViewById(R.id.rvNota);
        presentador = new NotaRecyclerViewFragmentPresentador(this, getContext());

        return v;
    }




    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvNota.setLayoutManager(llm);

    }

    @Override
    public NotaAdaptador crearAdaptador(ArrayList<Nota> notas) {
        NotaAdaptador adaptador = new NotaAdaptador(notas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(NotaAdaptador adaptador) {

        rvNota.setAdapter(adaptador);

    }
}
