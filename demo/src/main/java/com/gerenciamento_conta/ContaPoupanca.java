package com.gerenciamento_conta;

public class ContaPoupanca extends Conta{
    private float taxa_juros;

    public ContaPoupanca(int numero_conta, int cpf, String NomeTitular, float saldo){
        super(numero_conta, cpf, NomeTitular, saldo);
    }

    public float ConsultarTaxaJuros(){
        return this.taxa_juros;
    }

    @Override
    public boolean sacar(float saque){
        if (ConsultarSaldo() - saque < 0){
            return false;
        } else {
            DiminuirSaldo(saque);
            //A classe ContaPoupanca terá um valor de taxa de juros de 0,005% que irá aumentar toda vez que o usuário fizer um depósito.
            this.taxa_juros += 0.005;
            return true;
        }
    }
}
