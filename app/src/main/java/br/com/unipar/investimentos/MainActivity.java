package br.com.unipar.investimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edAtivo, edLucro, edPatrimonio, edBolsa, edAtual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {

        //Recuperar os valores dos Edit's texts
        edAtivo = findViewById(R.id.edAtivo);
        edLucro = findViewById(R.id.edAtivo);
        edPatrimonio = findViewById(R.id.edAtivo);
        edBolsa = findViewById(R.id.edAtivo);
        edAtual = findViewById(R.id.edLucro);

        //Calcular o resultado

        double ativo = Double.parseDouble(edAtivo.getText().toString());
        double Lucro = Double.parseDouble(edLucro.getText().toString());
        double patrimonio = Double.parseDouble(edPatrimonio.getText().toString());
        double Bolsa = Double.parseDouble(edBolsa.getText().toString());
        double atual = Double.parseDouble(edAtual.getText().toString());

        //Retornar pro usuário
       // Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }

}
