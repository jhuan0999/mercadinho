package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Produto sabonete = new Produto(2,4, "sabonete");
        Produto pastaDente = new Produto(5,5, "pasta de dente");
        Produto salgado = new Produto(4, 2, "salgado");
        Produto suco = new Produto(8, 3,"suco");

        Item item1 = new Item(pastaDente, 3);
        Item item2 = new Item(sabonete, 2);
        Item item3 = new Item(salgado, 1);
        Item item4 = new Item(suco, 2);

        List<Item> pedido1 = new ArrayList<>();
        pedido1.add(item1);
        pedido1.add(item2);
        pedido1.add(item3);
        pedido1.add(item4);

        Cliente cliente = new Cliente("jorjão", 10);

        Pedido pedido = new Pedido(pedido1, cliente);

        System.out.println(" ");
        System.out.print(pedido + TiposPagamento.CHEQUE.name());
    }
}
