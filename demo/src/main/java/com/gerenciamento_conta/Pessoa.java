package com.gerenciamento_conta;

public class Pessoa {
    private String nome;
    private int cpf;
    private Conta[] conta;
    private ContaCorrente[] contaCorrente;
    private ContaPoupanca[] contaPoupanca;


    //Contrutor
    Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    //Conta
    public void CriarConta(int numero_conta, float saldo){
        this.conta =  new Conta[this.conta.length];
        this.conta[this.conta.length - 1] = new Conta(0, this.cpf, this.nome, 500.50f);
    }

    public void QuantasContas(){
        System.out.println(this.conta.length);
    }

    //Conta Corrente
    public void CriarContaCorrente(int numero_conta, float saldo){
        this.contaCorrente =  new ContaCorrente[this.contaCorrente.length];
        this.contaCorrente[this.contaCorrente.length - 1] = new ContaCorrente(0, this.cpf, this.nome, 500.50f);
    }

    public void QuantasContasCorrente(){
        System.out.println(this.contaCorrente.length);
    }

    //Conta Poupança
    public void CriarContaPoupanca(int numero_conta, float saldo){
        this.contaPoupanca =  new ContaPoupanca[this.contaPoupanca.length];
        this.contaPoupanca[this.contaPoupanca.length - 1] = new ContaPoupanca(0, this.cpf, this.nome, 500.50f);
    }

    public void QuantasContaPoupanca(){
        System.out.println(this.contaPoupanca.length);
    }


}
