package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudContaPoupanca;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class ContaPoupanca{
    private int numero_conta;
    private int cpf;
    private String NomeTitular;
    private float saldo;
    private float taxa;
    private CrudPessoa crudPessoa;
    private CrudContaPoupanca crudContaPoupanca;
    private boolean ContaExiste;

    public ContaPoupanca(CrudPessoa crudPessoa){
        this.crudPessoa = crudPessoa;
        this.crudContaPoupanca = new CrudContaPoupanca(this.crudPessoa);
        if(crudContaPoupanca.ContaPoupancaExiste()){
            this.ContaExiste = true;
            this.numero_conta = this.crudContaPoupanca.PegarNumContaPoupanca();
            this.cpf = this.crudPessoa.getCPF();
            this.NomeTitular = this.crudPessoa.getNome();
            this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupanca();
            this.taxa = this.crudContaPoupanca.PegarTaxaContaPoupanca();
        } else {
            this.ContaExiste = false;
            this.cpf = this.crudPessoa.getCPF();
            this.NomeTitular = this.crudPessoa.getNome();
        }
    }

    public boolean ContaExiste(){
        return this.ContaExiste;
    }

    public void CriarConta(float saldo){
        this.crudContaPoupanca.createContaPoupanca(saldo);
        this.numero_conta = this.crudContaPoupanca.PegarNumContaPoupanca();
        this.taxa = this.crudContaPoupanca.PegarTaxaContaPoupanca();
        this.saldo = saldo;
        this.ContaExiste = true;
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
        this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupancaBD();
        return this.saldo;
    }

    public void Deposita(float deposito){
        this.saldo += deposito + (deposito * this.taxa); 
        this.crudContaPoupanca.AlterarSaldoContaPoupanca(this.saldo);
    }

    //função saque
    public void DiminuirSaldo(float saque){
        this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupancaBD();
        this.saldo -= saque;
        this.crudContaPoupanca.AlterarSaldoContaPoupanca(this.saldo);
    }

    public boolean sacar(float saque){
        if (ConsultarSaldo() < 0){
            return false;
        } else {
            DiminuirSaldo(saque);
            return true;
        }
    }
}
