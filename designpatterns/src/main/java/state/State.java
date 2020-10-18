package state;

public class State {
    public static void main(String[] args) {
        Pedido pedido = getPedido();

        pedido.aprovar();

        pedido.cancelar();
    }

    static Pedido getPedido() {
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
