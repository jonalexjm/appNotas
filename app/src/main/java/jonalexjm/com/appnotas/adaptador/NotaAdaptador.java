package jonalexjm.com.appnotas.adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import jonalexjm.com.appnotas.R;
import jonalexjm.com.appnotas.pojo.Nota;

/**
 * Created by andrea on 13/09/2016.
 */
public class NotaAdaptador extends RecyclerView.Adapter<NotaAdaptador.NotaViewHolder> {

    ArrayList<Nota> notas;
    Activity activity;

    public NotaAdaptador(ArrayList<Nota> notas, Activity activity) {
        this.notas = notas;
        this.activity = activity;
    }

    @Override
    public NotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_nota, parent, false);


        return new NotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NotaViewHolder notaViewHolder, int position) {

        final Nota nota = notas.get(position);
        notaViewHolder.tvTitulo.setText(nota.getTitulo());
        notaViewHolder.tvContenido.setText(nota.getContenido());
        notaViewHolder.tvFecha.setText(Integer.toString(nota.getDiaNota()) +"/"+ Integer.toString(nota.getMesNota()) +"/"+ Integer.toString(nota.getAnnoNota()));
        notaViewHolder.tvHora.setText(Integer.toString(nota.getHoraNota())+":"+ Integer.toString(nota.getMinutoNota()));


    }

    @Override
    public int getItemCount() {
        return notas.size();
    }


    public static class NotaViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitulo;
        private TextView tvContenido;
        private TextView tvFecha;
        private TextView tvHora;

        public NotaViewHolder(View itemView) {
            super(itemView);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvContenido = (TextView) itemView.findViewById(R.id.tvContenido);
            tvFecha = (TextView) itemView.findViewById(R.id.tvFecha);
            tvHora = (TextView) itemView.findViewById(R.id.tvHora);

        }
    }
}