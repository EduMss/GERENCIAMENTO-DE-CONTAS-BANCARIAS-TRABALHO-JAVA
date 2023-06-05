package com.gerenciamento_conta;

public class teste {
    private int conta[];

    teste(){
        this.conta[0] = 1;
        this.conta[1] = 5;
        this.conta[2] = 4;

    }

    public void main(){
        System.out.println("ola");
        System.out.println(this.conta.length);


        //conta normal
        Conta conta1 = new Conta(0, 111, "Eduardo Matheus", 500.50f);
        // System.out.println( conta1.ConsultarNumeroConta() );
        // System.out.println( conta1.ConsultarCPF() );
        // System.out.println( conta1.ConsultarTitular() );
        // System.out.println( conta1.ConsultarSaldo() );
        // conta1.DiminuirSaldo(25.00f);
        // System.out.println( conta1.ConsultarSaldo() );
        // conta1.sacar(240.00f);
        // System.out.println( conta1.ConsultarSaldo() );

        //conta corrente
        ContaCorrente conta2 = new ContaCorrente(0, 111 , "Eduardo Matheus", 500.50f);
        // System.out.println( conta2.ConsultarNumeroConta() );
        // System.out.println( conta2.ConsultarCPF() );
        // System.out.println( conta2.ConsultarTitular() );
        // System.out.println( conta2.ConsultarSaldo() );
        // conta2.DiminuirSaldo(25.00f);
        // System.out.println( conta2.ConsultarSaldo() );
        // conta2.sacar(240.00f);
        // System.out.println( conta2.ConsultarSaldo() );
        // System.out.println( conta2.ConsultarChequeEspecial() );
        // System.out.println( conta2.ConsultarSaldoComChequeEspecial() );

        //conta poupança
        ContaPoupanca conta3 = new ContaPoupanca(0, 111 , "Eduardo Matheus", 500.50f);
        // System.out.println( conta3.ConsultarNumeroConta() );
        // System.out.println( conta3.ConsultarCPF() );
        // System.out.println( conta3.ConsultarTitular() );
        // System.out.println( conta3.ConsultarSaldo() );
        // conta3.DiminuirSaldo(25.00f);
        // System.out.println( conta3.ConsultarSaldo() );
        // conta3.sacar(240.00f);
        // System.out.println( conta3.ConsultarSaldo() );
        // System.out.println( conta3.ConsultarTaxaJuros() );
        
        

    }
}
