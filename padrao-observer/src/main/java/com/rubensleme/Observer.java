package com.rubensleme;

public class Observer {
    public static void main(String[] args) {
        Pedido pedido = getPedido();
        pedido.adicionaListener(new SalvaPedido());
        pedido.adicionaListener(new ImprimePedido());
        pedido.adicionaListener(new EnviaPedido());

        pedido.aprovar();
    }

    public static Pedido getPedido() {
        Cliente cliente = new Cliente("Fulano");
        Pedido pedido = new Pedido(cliente);

        Produto camisa = new Produto("Camisa", 30.0D);
        Produto calca = new Produto("Calça", 45.0D);
        Produto tenis = new Produto("Tênis", 145.0D);

        pedido.adicionaItem(camisa, 1);
        pedido.adicionaItem(calca, 2);
        pedido.adicionaItem(tenis, 1);

        return pedido;
    }
}

