package dev.rafikmoreira.dogcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void definirContador(Integer value){
        TextView textoContador = findViewById(R.id.contador);
        textoContador.setText(String.valueOf(value));
    }

    public void aumentar(View view) {
        this.count++;
        this.definirContador(this.count);
    }

    public void reduzir(View view) {
        this.count--;
        this.definirContador(this.count);
    }

    public void zerar(View view) {
        this.count = 0;
        this.definirContador(this.count);
    }
}