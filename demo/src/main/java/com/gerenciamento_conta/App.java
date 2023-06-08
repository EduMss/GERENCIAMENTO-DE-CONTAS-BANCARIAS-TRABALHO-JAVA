package com.gerenciamento_conta;

public class App {
    public static void main( String[] args ){
        Pessoa usuario = new Pessoa(133);
        if(usuario.ContaExiste()){
            // ContaCorrente usuariContaCorrente = new ContaCorrente(usuario.PegarCrudPessoa());
            // if(usuariContaCorrente.ContaExiste()){
            //     System.out.println("ContaCorrente Logada");
            // } else {
            //     System.out.println("ContaCorrente Criada");
            //     usuariContaCorrente.CriarConta(500.0f);
            // }

            ContaPoupanca usuarioContaPoupanca = new ContaPoupanca(usuario.PegarCrudPessoa());
            if(usuarioContaPoupanca.ContaExiste()){
                System.out.println("ContaPoupança Logado");
                usuarioContaPoupanca.Deposita(201.3f);
                // usuarioContaPoupanca.sacar(280.3f);
                System.out.println(usuarioContaPoupanca.ConsultarSaldo());
            } else {
                System.out.println("ContaPoupança Criada");
                usuarioContaPoupanca.CriarConta(500.0f);
            }
        } else {
            usuario.CrearContaPesso("Eduardo");
            ContaCorrente usuariContaCorrente = new ContaCorrente(usuario.PegarCrudPessoa());
            if(usuariContaCorrente.ContaExiste()){
                System.out.println("ContaCorrente Logada");
            } else {
                System.out.println("ContaCorrente Criada");
                usuariContaCorrente.CriarConta(500.0f);
            }
        }
    }
}
