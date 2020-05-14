package br.com.etecia.lojapam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Criar variaveis que irão representar os componentes do xml
    Button btnEntrar, btnSair;
    EditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //está chamada de método que faz referência ao layout
        setContentView(R.layout.activity_main);

        //Apresentar os componentes do xml para o java
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        //Inserindo ação para o botão sair
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, senha;

                email = txtEmail.getText().toString();
                senha = txtSenha.getText().toString();

                if (email.equals("etecia") && senha.equals("etecia")) {
                    Toast.makeText(getApplicationContext(),
                            "Bem vindo ao sistema!!!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Email ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
