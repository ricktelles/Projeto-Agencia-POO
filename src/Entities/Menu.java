package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias = new ArrayList<>();

    public static void operacoes() {
        System.out.println("------------------------------------------------------");
        System.out.println("------------- Bem vindos à nossa Agência -------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listarContas();
                break;
            case 6:
                System.out.println("Flw é nóis!");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;
        }
    }

    public static void criarConta() {
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nEmail: ");
        String email = input.next();

        //Instaciando *Pessoa* e passndo os dados para *pessoa*
        Pessoa pessoa = new Pessoa(nome, cpf, email);

        //Instanciando *Conta* e passando  a pessoa com os dados para a *conta*
        Conta conta = new Conta(pessoa);

        //chando o arraylist e adcionando a *conta* com os dados
        contasBancarias.add(conta);

        System.out.println("Conta criada com sucesso!");
        operacoes();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        //Validacao para saber se a conta existe
        if (contasBancarias.size() > 0) {
            for (Conta c : contasBancarias) { //Verifica cada conta dentro da lista
                if (c.getNumConta() == numeroConta) { // verifica se c for igual a numero de conta q foi digitado
                    conta = c; // se for ele passo o numero para conta
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Numero da conta:");
        int numConta = input.nextInt();

        //Passando numero para conta
        Conta conta = encontrarConta(numConta);

        // validacao para ver se a conta foi encontrada
        if (conta != null) {
            System.out.println("Qual valor deseja depositar?");
            double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito); // Aplica a logia do depositar do conta
            System.out.println("Valor depositado com sucesso! ");
        } else {
            System.out.println("A conta nao foi encontrada! ");
        }
        operacoes();
    }

    public static void sacar() {
        System.out.println("Numero da conta:");
        int numConta = input.nextInt();

        //Passando numero para conta
        Conta conta = encontrarConta(numConta);

        // validacao para ver se a conta foi encontrada
        if (conta != null) {
            System.out.println("Qual valor deseja sacar?");
            double valorSaque = input.nextDouble();
            conta.depositar(valorSaque); // Aplica a logia do sacar do conta
        } else {
            System.out.println("A conta nao foi encontrada! ");
        }
        operacoes();
    }

    public static void transferir() {
        System.out.println("Numero da conta do remetente: ");
        int numContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Numero da conta do destinatario");
            int numContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numContaDestinatario);
            if (contaDestinatario != null) {
                System.out.println("Valor da tranferencia: ");
                double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            } else {
                System.out.println("A conta para deposito nao foi encontrada");
            }
        } else {
            System.out.println("A conta para transferenica nao foi encontrada");
        }
        operacoes();
    }

    public static void listarContas() {
        if (contasBancarias.size() > 0) {
            for (Conta conta : contasBancarias) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Nao ha contas cadastradas! ");
        }
        operacoes();
    }

}