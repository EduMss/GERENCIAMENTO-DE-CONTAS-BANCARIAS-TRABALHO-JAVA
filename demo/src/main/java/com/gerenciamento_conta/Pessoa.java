package com.gerenciamento_conta;
import com.gerenciamento_conta.CRUD.CrudPessoa;

public class Pessoa {
    private String nome;
    private int cpf;
    private CrudPessoa crudPessoa;
    private boolean ContaExiste;

    //Contrutor
    Pessoa(int cpf){
        this.cpf = cpf;
        this.crudPessoa = new CrudPessoa(this.cpf);
        if(crudPessoa.UsuarioExiste()){
            this.ContaExiste = true;
            this.nome = this.crudPessoa.getNome();
        } else {
            this.ContaExiste = false;
        }
    }

    public String PegarNome(){
        return this.nome;
    }

    public int PegarCpf(){
        return this.cpf;
    }

    public CrudPessoa PegarCrudPessoa(){
        return this.crudPessoa;
    }

    public boolean ContaExiste(){
        return this.ContaExiste;
    }

    public void CrearContaPesso(String nome){
        this.nome = nome;
        this.crudPessoa.createUserPessoa(this.nome);   
    }




}
