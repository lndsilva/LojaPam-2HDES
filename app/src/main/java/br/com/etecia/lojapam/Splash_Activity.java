package br.com.etecia.lojapam;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        }, 3000);


    }

   // public void abrirJanela(View view) {
        //Para testar o funcionamento do click no botão
        //Mostra caixa de mensagem para o usuário
        //Toast.makeText(getApplicationContext(),"Cliquei no botão",Toast.LENGTH_SHORT).show();
        //Comando para abrir uma janela.
        //Primeira forma
        /*
        Intent abrirJanela = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(abrirJanela);*/
        //Segunda forma
       // startActivity(new Intent(getApplicationContext(), MainActivity.class));
        //Fechar a janela em que estou
       // finish();

    //}
}
