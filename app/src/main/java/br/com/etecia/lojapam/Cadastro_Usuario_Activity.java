package br.com.etecia.lojapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_Usuario_Activity extends AppCompatActivity {
    Button btnCadUsu;
    EditText txtCadUsuNome, txtCadUsuTel, txtCadUsuCPF, txtCadUsuEmail,
            txtCadUsuSenha, txtCadUsuCSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__usuario_layout);

        btnCadUsu = findViewById(R.id.btnCadUsuConfirmar);
        txtCadUsuNome = findViewById(R.id.txtCadUsuNome);
        txtCadUsuCPF = findViewById(R.id.txtCadUsuCPF);
        txtCadUsuTel = findViewById(R.id.txtCadUsuTel);
        txtCadUsuSenha = findViewById(R.id.txtCadUsuSenha);
        txtCadUsuCSenha = findViewById(R.id.txtCadUsuConfSenha);
        txtCadUsuEmail = findViewById(R.id.txtCadUsuEmail);

        btnCadUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeUsu = txtCadUsuNome.getText().toString();
                String cpfUsu = txtCadUsuCPF.getText().toString();
                String telUsu = txtCadUsuTel.getText().toString();
                String emailUsu = txtCadUsuEmail.getText().toString();
                String senhaUsu = txtCadUsuSenha.getText().toString();
                String csenhaUsu = txtCadUsuCSenha.getText().toString();

                //Verifica se o campo está vazio
                if (nomeUsu.isEmpty()) {
                    txtCadUsuNome.setError("Entre com o nome");
                    txtCadUsuNome.requestFocus();
                }
                if (cpfUsu.isEmpty()) {
                    txtCadUsuCPF.setError("Entre com o CPF");
                    txtCadUsuCPF.requestFocus();
                }
                if (telUsu.isEmpty()) {
                    txtCadUsuTel.setError("Entre com o CPF");
                    txtCadUsuTel.requestFocus();
                }
                if (emailUsu.isEmpty()) {
                    txtCadUsuEmail.setError("Entre com o CPF");
                    txtCadUsuEmail.requestFocus();
                }
                if (senhaUsu.isEmpty()) {
                    txtCadUsuSenha.setError("Entre com o CPF");
                    txtCadUsuSenha.requestFocus();
                }
                if (csenhaUsu.isEmpty()) {
                    txtCadUsuCSenha.setError("Entre com o CPF");
                    txtCadUsuCSenha.requestFocus();
                }

                //Limpa os campos apos o cadastro
                txtCadUsuNome.setText("");
                txtCadUsuEmail.setText("");
                txtCadUsuTel.setText("");
                txtCadUsuCPF.setText("");
                txtCadUsuSenha.setText("");
                txtCadUsuCSenha.setText("");
                //Coloca o cursor no campo nome
                txtCadUsuNome.requestFocus();

                Toast.makeText(getApplicationContext(),
                        "Usuário inserido com sucesso...",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Inserindo ações na seta de retorno do smartphone
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Splash_Activity.class));
        finish();
        super.onBackPressed();
    }
}