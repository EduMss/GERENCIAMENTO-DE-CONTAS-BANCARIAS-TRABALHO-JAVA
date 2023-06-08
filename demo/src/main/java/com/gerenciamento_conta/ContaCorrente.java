package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class ContaCorrente extends Conta{
    private float cheque_especial;

    public ContaCorrente(CrudPessoa crudPessoa){
        super(crudPessoa, 0);
        if(ContaExiste){
            this.cheque_especial = this.crudContaCorrente.PegarChequeEspecialContaCorrente();
        }
    }

    public void CriarConta(float saldo){
        this.crudContaCorrente.createContaCorrente(saldo);
        this.numero_conta = this.crudContaCorrente.PegarNumContaCorrente();
        this.cheque_especial = this.crudContaCorrente.PegarChequeEspecialContaCorrente();
        this.saldo = saldo;
        this.ContaExiste = true;
    }

    public void Deposita(float deposito){
        if(this.saldo < 0){
            if(this.saldo + deposito > 0){
                AleterarChequeEspecial(500.0f);
                this.saldo += deposito; 
                this.crudContaCorrente.AlterarSaldoContaCorrente(this.saldo);
            } else {
                AleterarChequeEspecial(this.cheque_especial + deposito);
                this.saldo += deposito; 
                this.crudContaCorrente.AlterarSaldoContaCorrente(this.saldo);
            }
        } else {
            this.saldo += deposito; 
            this.crudContaCorrente.AlterarSaldoContaCorrente(this.saldo);
        }
    }

    @Override
    public boolean sacar(float saque){
        if (ConsultarSaldo() - saque < 0){
            if(ConsultarChequeEspecial() < saque - ConsultarSaldo()){
                return false;
            } else {
                System.out.println("esta passando aqui");
                this.saldo -= saque;
                this.crudContaCorrente.AlterarSaldoContaCorrente(this.saldo);

                this.cheque_especial += this.saldo;
                this.crudContaCorrente.AlterarChequeEspecialContaCorrenteBD(this.cheque_especial);
                return true;
            }
            
        } else {
            DiminuirSaldo(saque);
            return true;
        }
    }

    
    public float ConsultarChequeEspecial(){
        this.cheque_especial = this.crudContaCorrente.PegarChequeEspecialContaCorrenteBD();
        return this.cheque_especial;
    }

    public void AleterarChequeEspecial(float ChequeEspecial){
        this.cheque_especial = ChequeEspecial;
        this.crudContaCorrente.AlterarChequeEspecialContaCorrenteBD(this.cheque_especial);
    }

}
