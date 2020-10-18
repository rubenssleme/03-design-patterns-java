package state;

public class PedidoAprovado implements StatusPedido {
    @Override
    public void aprovar(Pedido pedido) {
        throw new IllegalStateException("Pedido já está 'Aprovado'");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Pedido já está 'Aprovado'");
    }

    @Override
    public void reabrir(Pedido pedido) {
        throw new IllegalStateException("Pedido já está 'Aprovado'");
    }
}
