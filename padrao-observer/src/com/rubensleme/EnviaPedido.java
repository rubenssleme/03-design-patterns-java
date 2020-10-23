package com.rubensleme;

public class EnviaPedido implements AcaoPosAprovacaoDoPedido {
    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Enviando o pedido para o cliente ...");
    }
}
