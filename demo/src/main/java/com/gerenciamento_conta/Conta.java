package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudContaCorrente;
import com.gerenciamento_conta.CRUD.CrudContaPoupanca;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class Conta {
    public int numero_conta;
    public int cpf;
    public String NomeTitular;
    public float saldo;
    public CrudPessoa crudPessoa;
    public boolean ContaExiste;
    public CrudContaCorrente crudContaCorrente;
    public CrudContaPoupanca crudContaPoupanca;
    public int TipoConta;// 0 = Corrente, 1 = Poupança

    Conta(CrudPessoa crudPessoa, int TipoConta){
        this.crudPessoa = crudPessoa;
        this.TipoConta = TipoConta;
        if(this.TipoConta == 0){
            this.crudContaCorrente = new CrudContaCorrente(this.crudPessoa);
            if(crudContaCorrente.ContaCorrenteExiste()){
                this.ContaExiste = true;
                this.numero_conta = this.crudContaCorrente.PegarNumContaCorrente();
                this.cpf = this.crudPessoa.getCPF();
                this.NomeTitular = this.crudPessoa.getNome();
                this.saldo = this.crudContaCorrente.PegarSaldoContaCorrente();
            } else {
                this.ContaExiste = false;
                this.cpf = this.crudPessoa.getCPF();
                this.NomeTitular = this.crudPessoa.getNome();
            }
        } else if (this.TipoConta == 1) {
            this.crudContaPoupanca = new CrudContaPoupanca(this.crudPessoa);
            if(crudContaPoupanca.ContaPoupancaExiste()){
                this.ContaExiste = true;
                this.numero_conta = this.crudContaPoupanca.PegarNumContaPoupanca();
                this.cpf = this.crudPessoa.getCPF();
                this.NomeTitular = this.crudPessoa.getNome();
                this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupanca();
            } else {
                this.ContaExiste = false;
                this.cpf = this.crudPessoa.getCPF();
                this.NomeTitular = this.crudPessoa.getNome();
            }
        } else {
            System.out.println("error no Tipo de Conta");
        }
    }

    public boolean ContaExiste(){
        return this.ContaExiste;
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
        if(this.TipoConta == 0){
            this.saldo = this.crudContaCorrente.PegarSaldoContaCorrenteBD();
        } else if(this.TipoConta == 1){
            this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupancaBD();
        } else {
            System.out.println("error no Tipo de Conta");
        }
        
        return this.saldo;
    }

    //função saque
    public void DiminuirSaldo(float saque){
        if(this.TipoConta == 0){
            ConsultarSaldo();
            this.saldo -= saque;
            this.crudContaCorrente.AlterarSaldoContaCorrente(this.saldo);
        } else if(this.TipoConta == 1){
            this.saldo = this.crudContaPoupanca.PegarSaldoContaPoupancaBD();
            this.saldo -= saque;
            this.crudContaPoupanca.AlterarSaldoContaPoupanca(this.saldo);
        } else {
            System.out.println("error no Tipo de Conta");
        }

    }

    public boolean sacar(float saque){
        if (ConsultarSaldo() - saque < 0){
            return false;
        } else {
            DiminuirSaldo(saque);
            return true;
        }
    }

    public void deletarConta(){
        if(this.TipoConta == 0){
            this.crudContaCorrente.deletContaCorrente();
        } else if(this.TipoConta == 1){
            this.crudContaPoupanca.deletContaPoupanca();
        } else {
            System.out.println("error no Tipo de Conta");
        }
    }

}
