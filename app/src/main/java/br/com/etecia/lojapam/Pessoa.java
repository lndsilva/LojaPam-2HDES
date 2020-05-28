package br.com.etecia.lojapam;

public class Pessoa {

    private String nome, email, telefone;

    //alt+insert ou clicar com o botão direito do mouse e
    //selecionar o item Generate do menu suspenso

    //Construtor vazio
    public Pessoa() {
    }
    //Construtor com parâmetros
    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    //Criado os getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
