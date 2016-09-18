package jonalexjm.com.appnotas.Presentador;

import android.content.Context;

import jonalexjm.com.appnotas.fragment.INotasRecyclerViewFragmentView;

/**
 * Created by andrea on 18/09/2016.
 */
public class NotaRecyclerViewFragmentPresentador implements INotasRecyclerViewFragmentPresentador {


    private INotasRecyclerViewFragmentView iNotasRecyclerViewFragmentView;
    private Context context;

    public NotaRecyclerViewFragmentPresentador(INotasRecyclerViewFragmentView iNotasRecyclerViewFragmentView, Context context) {
        this.iNotasRecyclerViewFragmentView = iNotasRecyclerViewFragmentView;
        this.context = context;
    }


    @Override
    public void obtenerContactosBaseDatos() {

    }

    @Override
    public void mostrarContactosRV() {

    }
}
