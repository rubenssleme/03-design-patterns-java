package observer;

public class ImprimePedido implements AcaoPosAprovacaoDoPedido {
    @Override
    public void executaAcao(Pedido pedido) {
        System.out.println("Imprimindo o pedido ...");
    }
}
