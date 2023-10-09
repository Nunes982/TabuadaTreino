package app.daazi.tabuadatreino.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import app.daazi.tabuadatreino.R;
import app.daazi.tabuadatreino.model.Tabuada;

public class TabuadaAdapter extends RecyclerView.Adapter<TabuadaAdapter.ViewHolder> {

    Tabuada tabuada;
    List<Tabuada> aTabuadas;
    private Context aContext;

    public TabuadaAdapter(List<Tabuada> aTabuadas, Context aContext) {
        this.aTabuadas = aTabuadas;
        this.aContext = aContext;
    }


    @NonNull
    @Override
    public TabuadaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_linha_tabuada, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TabuadaAdapter.ViewHolder holder, int position) {

        Tabuada item = aTabuadas.get(position);

        holder.editMultiplicando.setText(String.valueOf(item.getMultiplicando()));
        holder.txtSinalMultiplicacao.setText("X");
        holder.txtMultiplicador.setText(String.valueOf(item.getMultiplicador()));
        holder.txtSinalIgualdade.setText("=");
        holder.txtResultado.setText(String.valueOf(item.getResultado()));


    }

    @Override
    public int getItemCount() {
        return aTabuadas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public EditText editMultiplicando;
        public TextView txtSinalMultiplicacao;
        public TextView txtMultiplicador;
        public TextView txtSinalIgualdade;
        public TextView txtResultado;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            editMultiplicando = itemView.findViewById(R.id.editMultiplicando);
            txtSinalMultiplicacao = itemView.findViewById(R.id.txtSinalMultiplicacao);
            txtMultiplicador = itemView.findViewById(R.id.txtMultiplicador);
            txtSinalIgualdade = itemView.findViewById(R.id.txtSinalIgualdade);
            txtResultado = itemView.findViewById(R.id.txtResultado);
        }
    }
}
