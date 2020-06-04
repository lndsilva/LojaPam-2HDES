package br.com.etecia.lojapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Cadastro_Usuario_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__usuario_layout);
    }

    //Inserindo ações na seta de retorno do smartphone
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Splash_Activity.class));
        finish();
        super.onBackPressed();
    }
}