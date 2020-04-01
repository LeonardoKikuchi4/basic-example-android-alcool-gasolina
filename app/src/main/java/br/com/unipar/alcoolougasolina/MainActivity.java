package br.com.unipar.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edPrecoAlcool, edPrecoGasolina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {

        //Recuperar os valores dos Edit's texts
        edPrecoAlcool = findViewById(R.id.edPrecoAlcool);
        edPrecoGasolina = findViewById(R.id.edPrecoGasolina);

        //Calcular o resultado

        double precoAlcool = Double.parseDouble(edPrecoAlcool.getText().toString());
        double precoGasolina = Double.parseDouble(edPrecoGasolina.getText().toString());

        String result = (precoAlcool / precoGasolina) > 0.7 ? "Compensa abastecer com Gasolina!" : "Compensa abastecer com álcool";

        //Retornar pro usuário
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }

}
