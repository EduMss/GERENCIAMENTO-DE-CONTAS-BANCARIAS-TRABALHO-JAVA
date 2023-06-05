package com.gerenciamento_conta;

public class numeros {
    private int[] conta;

    numeros(){
        this.conta =  new int[1];
        this.conta[0] = 2;
        this.conta =  new int[2];
        this.conta[1] = 5;
        this.conta =  new int[3];
        this.conta[2] = 4;

    }

    public void Valor(){
        System.out.println(this.conta.length);
    }
}
