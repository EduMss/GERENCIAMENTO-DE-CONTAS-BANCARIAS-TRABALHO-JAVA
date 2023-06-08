package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class ContaPoupanca extends Conta{
    private float taxa;

    public ContaPoupanca(CrudPessoa crudPessoa){
        super(crudPessoa, 1);
        if(ContaExiste){
            this.taxa = this.crudContaPoupanca.PegarTaxaContaPoupanca();
        }
    }

    public void CriarConta(float saldo){
        this.crudContaPoupanca.createContaPoupanca(saldo);
        this.numero_conta = this.crudContaPoupanca.PegarNumContaPoupanca();
        this.taxa = this.crudContaPoupanca.PegarTaxaContaPoupanca();
        this.saldo = saldo;
        this.ContaExiste = true;
    }

    public void Deposita(float deposito){
        this.saldo += deposito + (deposito * this.taxa); 
        this.crudContaPoupanca.AlterarSaldoContaPoupanca(this.saldo);
    }

}
