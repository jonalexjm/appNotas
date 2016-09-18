package jonalexjm.com.appnotas.fragment;

import java.util.ArrayList;

import jonalexjm.com.appnotas.adaptador.NotaAdaptador;
import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 18/09/2016.
 * vamos a concentrar todos los metodos que queremos implementar en la clase NotasRecyclerViewFragment
 */
public interface INotasRecyclerViewFragmentView {
    public void generarLinearLayoutVertical();

    public NotaAdaptador crearAdaptador(ArrayList<Nota> notas);

    public void inicializarAdaptadorRV(NotaAdaptador adaptador);

}
