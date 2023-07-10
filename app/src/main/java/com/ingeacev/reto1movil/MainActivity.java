package com.ingeacev.reto1movil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumA, etNumB;
    Button btnSumar, btnRestar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumA = findViewById(R.id.etNumA);
        etNumB = findViewById(R.id.etNumB);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        tvResultado = findViewById(R.id.txtResult);

        //Cuando se de clic al boton sumar, ejecuta lo que esta dentro de public void onClick
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numA = Double.parseDouble(etNumA.getText().toString());
                double numB = Double.parseDouble(etNumB.getText().toString());
                String rta = String.valueOf(numA + numB);
                tvResultado.setText(getString(R.string.txt_resultado)+" "+rta);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numA = Double.parseDouble(etNumA.getText().toString());
                double numB = Double.parseDouble(etNumB.getText().toString());
                String rta = String.valueOf(numA - numB);
                tvResultado.setText(getString(R.string.txt_resultado)+" "+rta);
            }
        });
    }
}