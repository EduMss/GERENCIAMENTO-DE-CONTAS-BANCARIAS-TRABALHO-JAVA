package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudConta;
import com.gerenciamento_conta.CRUD.CrudContaCorrente;
import com.gerenciamento_conta.CRUD.CrudContaPoupanca;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class App {
    public static void main( String[] args ){
        CrudPessoa connection = new CrudPessoa(132);// contrutor, so precisa informar o cpf
        // connection.UsuarioExiste(); // ele vai verificar se o usuario existe, o retorno dele e booleando, e utilizara o cpf passado no construtor
        // connection.createUserPessoa("Eduardo"); //Para voce criar um novo usuario apartir o cpf passado no construto, vc so precisa passar um nome(String)
        // connection.getNomeUsuario();//retorna o nome(String)
        // connection.getCPF(); // retorna o cpf(int)

        // System.out.println(connection.UsuarioExiste());
        // connection.createUserPessoa("Eduardo");
        // System.out.println(connection.getNomeUsuarioBD());
        // System.out.println(connection.getNome());
        // System.out.println(connection.getCPF());
        connection.deletPessoa();



        // CrudConta userConta = new CrudConta(connection);// construtor, você so precisa passar um "CrudPessoa" para que ele saiba o Cpf e o Nome
        // userConta.createConta(133);//para criar uma nova conta a partir do cpf e nome obtido pelo CrudConta, voce so precisara passar o valor do saldo(int)
        // userConta.PegarNumContaBD();//para pegar o numero da conta apartir do Banco de Dados, ele retorna um int
        // userConta.PegarNumConta();//Pegar o Valor do Numero da Conta apartir do valor ja armazenado dentro do CrudConta, ele retorna um int
        // userConta.deletConta();//deletar a conta apartir do Numero da Conta obtido pelo CPF
        // userConta.AlterarSaldo(111.10f);//para alterar o valor do saldo atual, voce passa o valor do novo saldo(float)
        // userConta.PegarSaldoContaBD();//pegando o saldo da conta apartir do banco de dados, ele retorna um float
        // userConta.PegarSaldoConta();//pegando o saldo apartio da variavel ja armazenada dentro de CrudConta, ele retorna um float
        // System.out.println("\n\n\n");

        // System.out.println(userConta.PegarNumContaBD());
        // System.out.println(userConta.PegarNumConta());
        // System.out.println(userConta.PegarSaldoContaBD());
        // System.out.println(userConta.PegarSaldoContaBD());

        // CrudContaCorrente userContaCorrente = new CrudContaCorrente(connection);// construtor, você so precisa passar um "CrudPessoa" para que ele saiba o Cpf e o Nome
        // userContaCorrente.createContaCorrente(133);//para criar uma nova conta a partir do cpf e nome obtido pelo CrudContaCorrente, voce so precisara passar o valor do saldo(int)
        // userContaCorrente.PegarNumContaCorrenteBD();//para pegar o numero da conta apartir do Banco de Dados, ele retorna um int
        // userContaCorrente.PegarNumContaCorrente();//Pegar o Valor do Numero da Conta apartir do valor ja armazenado dentro do CrudContaCorrente, ele retorna um int
        // userContaCorrente.deletContaCorrente();//deletar a conta apartir do Numero da Conta obtido pelo CPF
        // userContaCorrente.AlterarSaldoContaCorrente(111.10f);//para alterar o valor do saldo atual, voce passa o valor do novo saldo(float)
        // userContaCorrente.PegarSaldoContaCorrenteBD();//pegando o saldo da conta apartir do banco de dados, ele retorna um float
        // userContaCorrente.PegarSaldoContaCorrente();//pegando o saldo apartio da variavel ja armazenada dentro de CrudContaCorrente, ele retorna um float
        // userContaCorrente.AlterarChequeEspecialContaCorrenteBD(211.5f);//Alterar o valor do credito especial no banco de dados, ele recebe o novo valor para atualizar(float)
        // userContaCorrente.PegarChequeEspecialContaCorrenteBD();//Ele pega quanto Ta disponivel de Cheque Especial no banco de dados, ele retorna um float
        // userContaCorrente.PegarChequeEspecialContaCorrente();//Ele pega quanto Ta disponivel de Cheque Especial na variavel ja armazenada dentro do CrudContaCorrente, ele retorna um float
        // System.out.println("\n\n\n");


        // System.out.println(userContaCorrente.PegarNumContaCorrenteBD());
        // System.out.println(userContaCorrente.PegarNumContaCorrente());
        // System.out.println(userContaCorrente.PegarSaldoContaCorrenteBD());
        // System.out.println(userContaCorrente.PegarSaldoContaCorrente());
        // System.out.println(userContaCorrente.PegarChequeEspecialContaCorrenteBD());
        // System.out.println(userContaCorrente.PegarChequeEspecialContaCorrente());

        // CrudContaPoupanca userContaPoupanca = new CrudContaPoupanca(connection);// construtor, você so precisa passar um "CrudPessoa" para que ele saiba o Cpf e o Nome
        // userContaPoupanca.createContaPoupanca(133);//para criar uma nova conta a partir do cpf e nome obtido pelo CrudContaPoupanca, voce so precisara passar o valor do saldo(int)
        // userContaPoupanca.PegarNumContaPoupancaBD();//para pegar o numero da conta apartir do Banco de Dados, ele retorna um int
        // userContaPoupanca.PegarNumContaPoupanca();//Pegar o Valor do Numero da Conta apartir do valor ja armazenado dentro do CrudContaPoupanca, ele retorna um int
        // userContaPoupanca.deletContaPoupanca();//deletar a conta apartir do Numero da Conta obtido pelo CPF
        // userContaPoupanca.AlterarSaldoContaPoupanca(111.10f);//para alterar o valor do saldo atual, voce passa o valor do novo saldo(float)
        // userContaPoupanca.PegarSaldoContaPoupancaBD();//pegando o saldo da conta apartir do banco de dados, ele retorna um float
        // userContaPoupanca.PegarSaldoContaPoupanca();//pegando o saldo apartio da variavel ja armazenada dentro de CrudContaPoupanca, ele retorna um float
        // userContaPoupanca.AlterarTaxaContaPoupancaBD(111.5f);//Altera o valor da taxa no banco de dados, inseri o valor da nova taxa(float)
        // userContaPoupanca.PegarTaxaContaPoupancaBD();//Ele pega o valor de taxa que esta dentro do banco de dados, ele retorna um float
        // userContaPoupanca.PegarTaxaContaPoupanca();//Ele pega o valor de taxa apartio da variavel ja armazenada dentro de CrudContaPoupanca, ele retorna um float
        // System.out.println("\n\n\n");


        // System.out.println(userContaPoupanca.PegarNumContaPoupancaBD());
        // System.out.println(userContaPoupanca.PegarNumContaPoupanca());
        // System.out.println(userContaPoupanca.PegarSaldoContaPoupancaBD());
        // System.out.println(userContaPoupanca.PegarSaldoContaPoupanca());
        // System.out.println(userContaPoupanca.PegarTaxaContaPoupancaBD());
        // System.out.println(userContaPoupanca.PegarTaxaContaPoupanca());
    
    }
}
