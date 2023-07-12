package ContaBancaria;


public class Conta {
    int numero;
    String nomeTitular;
    double saldo;

    public Conta(int numero, String nomeTitular, double saldo){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumber(){
        return this.numero;
    }

    public String getName(){
        return this.nomeTitular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }


}


