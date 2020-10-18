package state;

public interface StatusPedido {
    void aprovar(Pedido pedido);

    void cancelar(Pedido pedido);

    void reabrir(Pedido pedido);
}
