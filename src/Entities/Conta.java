package Entities;

import Entities.Pessoa;
import Utilitarios.Utils;

public class Conta {

    // Atributos
    private static int contadorDeContas = 1;

    private int numConta;
    private Pessoa pessoa;
    private Double Saldo = 0.0;

    //Construtor
    public Conta(Pessoa pessoa) {
        this.numConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    // Metodos Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    //Metodo toString
    public String toString() {
        return "\nNumero da conta: " + this.getNumConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) + "\n";
    }
    //Metodos da conta

    public void depositar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito foi realizado com sucesso!");
        } else {
            System.out.println("Nao foi possivel realizar o deposito!");
        }
    }

    public void sacar(Double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado com sucesso!");
        } else {
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }
    public void transferir(Conta contaParaDeposito, Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);

            contaParaDeposito.Saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Sua transferencia foi realizado  com sucesso!");
        }else {
            System.out.println("Nao foi possivel realizar a transferencia!");
        }
    }
}