package com.rubensleme;

public class PedidoEmAprovacao implements StatusPedido {
    @Override
    public void aprovar(Pedido pedido) {
        pedido.setStatus(new PedidoAprovado());
        System.out.println("Pedido 'Aprovado'");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatus(new PedidoCancelado());
        System.out.println("Pedido 'Cancelado'");
    }

    @Override
    public void reabrir(Pedido pedido) {
        throw new IllegalStateException("Pedido em 'Aprovação'");
    }
}
