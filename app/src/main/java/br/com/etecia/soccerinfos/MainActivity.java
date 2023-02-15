package br.com.etecia.soccerinfos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView ListaTimes;

    String titulo[] = {"São Paulo", "Vasco", "Flamengo", "Palmeiras", "Corinthians"};
    String descricao[] = {"O maior do Brasil", "Nada a declarar", "É o gigante da colina", "Sem mundial", "Quarta força"};
    String avaliacao[] = {"5,0", "1,5", "3,0", "1,0", "0,5"};
    int escudo[] = {R.drawable.saopaulo, R.drawable.flamengo, R.drawable.vasco, R.drawable.palmeiras, R.drawable.corinthians};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaTimes = findViewById(R.id.ListaTimes);

        MyAdapter adapter = new MyAdapter();


        ListaTimes.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return escudo.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView escudoTime;
            TextView nomeTime, descricaoTime, avaliacaoTime;

            View v = getLayoutInflater().inflate(R.layout.modelo_time, null);

            escudoTime = v.findViewById(R.id.idEscudoTime);
            nomeTime = v.findViewById(R.id.idNomeTime);
            descricaoTime = v.findViewById(R.id.idDescricaoTime);
            avaliacaoTime = v.findViewById(R.id.idAvaliacaoTime);

            nomeTime.setText(titulo[i]);
            descricaoTime.setText(descricao[i]);
            avaliacaoTime.setText(avaliacao[i]);
            escudoTime.setImageResource(escudo[i]);

            return v;
        }
    }
}