package com.gerenciamento_conta;

public class ContaCorrente extends Conta{
    private float cheque_especial;

    public ContaCorrente(int numero_conta, int cpf, String NomeTitular, float saldo){
        super(numero_conta, cpf, NomeTitular, saldo);
        this.cheque_especial = 500.00f;
    }

    public float ConsultarChequeEspecial(){
        return this.cheque_especial;
    }

    public float ConsultarSaldoComChequeEspecial(){
        return ConsultarSaldo() + cheque_especial;
    }
}
