package ContaBancaria;

import java.util.ArrayList;
// import java.util.Scanner;

public class Banco {
    int numero;
    String nomeTitular;
    double saldo;
    ArrayList<Conta> contas;

    public Banco() {
        this.numero = 0;
        this.nomeTitular = "";
        this.saldo = 0;
        this.contas = new ArrayList<>();
    }

    public void createConta(int numero, String nomeTitular, double saldo) {
        Conta conta = new Conta(numero, nomeTitular, saldo);
        contas.add(conta);
    }

    public Banco depositar(double value, int numeroConta) {
        for (Conta conta : contas) {
            if (numeroConta == conta.getNumber()) {
                conta.saldo += value;
            }
        }
        return null;
    }
    
    public Banco sacar(double value, int numeroConta) {
        for (Conta conta : contas) {
            if (numeroConta == conta.getNumber()) {
                conta.saldo -= value;
            }
        }
        return null;
    }


    public void mostrarContas() {
        for (Conta conta : contas) {
            System.out.println("N° da conta: " + conta.getNumber() + "\n");
            System.out.println("Nome do Titular: " + conta.getName() + "\n");
            System.out.println("Saldo da conta: $" + conta.getSaldo() + "\n");
        }
    }
}
