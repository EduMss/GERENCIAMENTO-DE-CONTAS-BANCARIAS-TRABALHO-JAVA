package com.gerenciamento_conta;
public class Conta {
    private int numero_conta;
    private int cpf;
    private String NomeTitular;
    private float saldo;

    //Contrutor
    public Conta(int numero_conta, int cpf,String NomeTitular, float saldo) {
        this.numero_conta = numero_conta;
        this.cpf = cpf;
        this.NomeTitular = NomeTitular;
        this.saldo = saldo;
    }


    //consultas
    public int ConsultarNumeroConta(){
        return this.numero_conta;
    }

    public int ConsultarCPF(){
        return this.cpf;
    }

    public String ConsultarTitular(){
        return this.NomeTitular;
    }

    public float ConsultarSaldo(){
        return this.saldo;
    }

    //função saque
    public void DiminuirSaldo(float saque){
        this.saldo -= saque;
    }

    public boolean sacar(float saque){
        if (this.saldo - saque < 0){
            return false;
        } else {
            this.saldo -= saque;
            return true;
        }
    }
}
