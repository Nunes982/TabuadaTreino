package app.daazi.tabuadatreino.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.daazi.tabuadatreino.R;
import app.daazi.tabuadatreino.api.TabuadaAdapter;
import app.daazi.tabuadatreino.model.Tabuada;

public class TabuadaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TabuadaAdapter adapter;
    private List<Tabuada> tabuadas;

    private EditText editEscolhaTabuada;
    private Button btnCalcular;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        editEscolhaTabuada = findViewById(R.id.editEscolhaTabuada);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroStr = editEscolhaTabuada.getText().toString();

                try {
                    numero = Integer.parseInt(numeroStr);
                    calcularTabuadas(numero);
                } catch (NumberFormatException e) {
                    Toast.makeText(TabuadaActivity.this, "Infelizmente algo deu errado: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        recyclerView = findViewById(R.id.rvTabuada);

        tabuadas = new ArrayList<>();

        // Inicialmente, não há tabuadas calculadas

        adapter = new TabuadaAdapter(tabuadas, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Não é necessário chamar adapter.notifyDataSetChanged() aqui, pois a lista está vazia inicialmente.
    }

    private void calcularTabuadas(int numero) {
        // Limpe a lista atual de tabuadas
        tabuadas.clear();

        // Calcule e adicione as novas tabuadas
        for (int i = 1; i <= 10; i++) {
            Tabuada tabuada = new Tabuada();
            tabuada.setMultiplicando(numero);
            tabuada.setMultiplicador(i);
            tabuada.setResultado(numero * i);
            tabuadas.add(tabuada);
        }

        // Notifique o adaptador de que os dados foram alterados
        adapter.notifyDataSetChanged();
    }
}
