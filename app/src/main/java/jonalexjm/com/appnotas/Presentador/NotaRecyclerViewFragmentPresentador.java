package jonalexjm.com.appnotas.Presentador;

import android.content.Context;

import java.util.ArrayList;

import jonalexjm.com.appnotas.db.ContructorNotas;
import jonalexjm.com.appnotas.fragment.INotasRecyclerViewFragmentView;
import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 18/09/2016.
 */
public class NotaRecyclerViewFragmentPresentador implements INotasRecyclerViewFragmentPresentador {


    private INotasRecyclerViewFragmentView iNotasRecyclerViewFragmentView;
    private Context context;
    private ContructorNotas constructorNotas;
    private ArrayList<Nota> notas;

    public NotaRecyclerViewFragmentPresentador(INotasRecyclerViewFragmentView iNotasRecyclerViewFragmentView, Context context) {
        this.iNotasRecyclerViewFragmentView = iNotasRecyclerViewFragmentView;
        this.context = context;
        obtenerContactosBaseDatos();
    }


    @Override
    public void obtenerContactosBaseDatos() {
        constructorNotas = new ContructorNotas(context);
        notas = constructorNotas.obtenerDatos();
        mostrarContactosRV();


    }

    @Override
    public void mostrarContactosRV() {
        iNotasRecyclerViewFragmentView.inicializarAdaptadorRV(iNotasRecyclerViewFragmentView.crearAdaptador(notas));
        iNotasRecyclerViewFragmentView.generarLinearLayoutVertical();

    }
}
