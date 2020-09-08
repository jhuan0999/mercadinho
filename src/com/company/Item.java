package com.company;

public class Item {
    private Produto produto;
    private int quantidade;
   public Item(Produto produto, int quantidadeQuerida){
        this.produto = produto;
        this.quantidade = quantidadeQuerida;

    }

    @Override
    public String toString(){
       String msg = "";
       msg += "x" + quantidade + " ";
       msg += produto;
       return msg;

    }

}
