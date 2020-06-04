package br.com.etecia.lojapam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class Menu_Activity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        //Criando a toolbar
        toolbar = findViewById(R.id.toolBarMenu);
        setSupportActionBar(toolbar);
    }

    //Instânciando o menu na toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.grupo_menu, menu);
        return true;
    }

    //Ações de click nos itens de menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int escolha = item.getItemId();

        switch (escolha) {
            case R.id.mAquivo:
                startActivity(new Intent(getApplicationContext(), Splash_Activity.class));
                break;
            case R.id.mEditar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Editar...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Excluir...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Salvar...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSair:
                //chamada de método para fechar a janela do app (finalizar)
                finish();
                break;
        }
        return true;
    }
}