package ContaBancaria;

import java.util.ArrayList;
// import java.util.Scanner;

public class Execucao {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite um número para sua conta: ");
        // int numero = scanner.nextInt();

        // System.out.println("Digite seu nome: ");
        // String nomeTitular = scanner.next();
        ArrayList<Conta> contas = new ArrayList<>();
        Banco banco = new Banco();
        banco.createConta(4, "Daniel Vitor", 0 );
        banco.depositar(300.05, 4);
        banco.depositar(300.05, 4); 
        banco.sacar(250, 4);
        banco.mostrarContas();

        // scanner.close();
    }
}
