package com.company;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    public Produto(int preco, int qntdEstoque, String nome){
        this.preco = preco;
        this.quantidade = qntdEstoque;
        this.nome = nome;
    }

    @Override
    public String toString(){
        String msg = "";
        msg += nome + " ";
        msg += "R$: " + preco;
        return msg;
    }

}
