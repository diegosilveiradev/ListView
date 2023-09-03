package br.com.gertec.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import br.com.gertec.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String [] itens = {
    "Angra dos Reis", "Caldas Novas", "Campos do Jordão", "Costa do Sauípe", "Ilhéus", "Porto Seguro",
            "Tiradentes", "Praga", "Santiago", "Zurique", "Caribe", "Buenos Aires", "Budapeste", "Cancún", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listLocais.setAdapter( adaptador );

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado,Toast.LENGTH_LONG).show();
            }
        });



    }
}