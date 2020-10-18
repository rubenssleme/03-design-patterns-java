package state;

public class PedidoCancelado implements StatusPedido {
    @Override
    public void aprovar(Pedido pedido) {
        throw new IllegalStateException("Pedido 'Cancelado'");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Pedido 'Cancelado'");
    }

    @Override
    public void reabrir(Pedido pedido) {
        pedido.setStatus(new PedidoEmAprovacao());
        System.out.println("Pedido em 'Aprovação'");
    }
}
