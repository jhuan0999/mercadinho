package com.company;

import java.util.List;

public class Pedido {

    private List<Item> itens;
    private Cliente cliente;

    public  Pedido(List<Item> itens, Cliente cliente){
        this.itens = itens;
        this.cliente = cliente;
    }

    public String listaItens(){
        String msg = "";
        for(int i = 0; i < itens.size(); i++){
            msg += itens.get(i) + "\n";
        }
        return msg;
    }




    @Override
    public String toString(){
        String msg = "";
        msg += cliente;
        msg += "pedido: " + "\n";
        msg += listaItens();
        msg += "pagamento em: ";
        return msg;
    }

}



