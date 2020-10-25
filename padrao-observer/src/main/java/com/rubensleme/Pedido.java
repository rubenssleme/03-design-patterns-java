package com.rubensleme;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    static int num = 0;

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private List<AcaoPosAprovacaoDoPedido> listeners;

    public Pedido(Cliente cliente) {
        this.numero = ++num;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.listeners = new ArrayList<>();
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

    public void adicionaListener(AcaoPosAprovacaoDoPedido listener) {
        this.listeners.add(listener);
    }

    public List<AcaoPosAprovacaoDoPedido> getListeners() {
        return listeners;
    }

    public void aprovar() {
        System.out.println("Pedido aprovado.");
        for (AcaoPosAprovacaoDoPedido listener : listeners) {
            listener.executaAcao(this);
        }
    }
}
