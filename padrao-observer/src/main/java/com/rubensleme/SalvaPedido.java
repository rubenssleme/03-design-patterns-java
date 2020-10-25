package com.rubensleme;

public class SalvaPedido implements AcaoPosAprovacaoDoPedido {
    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Salvando o pedido ...");
    }
}
