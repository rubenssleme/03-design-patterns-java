package state;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    static int num = 0;

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido(Cliente cliente) {
        this.numero = ++num;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = new PedidoEmAprovacao();
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionaItem(Produto produto, int quantidade) {
        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void aprovar() {
        status.aprovar(this);
    }

    public void cancelar() {
        status.cancelar(this);
    }

    public void reabrir() {
        status.reabrir(this);
    }
}
