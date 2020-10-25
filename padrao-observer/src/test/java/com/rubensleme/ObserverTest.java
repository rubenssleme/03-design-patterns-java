package com.rubensleme;

import com.rubensleme.AcaoPosAprovacaoDoPedido;
import com.rubensleme.Observer;
import com.rubensleme.Pedido;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ObserverTest {

    private Pedido pedido = Observer.getPedido();

    @Test(expected = IllegalStateException.class)
    public void deve_ExecutarNotificarObservador_QuandoOPedidoForAprovado() {
        AcaoPosAprovacaoDoPedido acao = pedido -> {
            System.out.println("Ação executada após a aprovação do pedido");
            throw new IllegalStateException();
        };

        pedido.adicionaListener(acao);
        assertThat(pedido.getListeners().size(), is(equalTo(1)));
        assertThat(pedido.getListeners().get(0), is(equalTo(acao)));

        pedido.aprovar();
    }
}