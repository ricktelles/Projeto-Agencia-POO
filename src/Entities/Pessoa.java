package Entities;

public class Pessoa {
    //Atributos
    private static int contadorDePessoas = 1;

    private String nome;
    private String cpf;
    private String email;

    //Construtor
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        contadorDePessoas += 1;
    }

    //Metodos getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // Metodo toString
    public String toString(){
        return "\nNome: " + this.getNome() +
                "\n CPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail();
    }
}