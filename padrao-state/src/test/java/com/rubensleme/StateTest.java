package state;

import com.rubensleme.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class StateTest {
    private Pedido pedido = State.getPedido();

    @Test
    public void deve_AprovarOPedido_QuandoOPedidoEstiverEmAprovacao() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.aprovar();
        assertThat(pedido.getStatus(), instanceOf(PedidoAprovado.class));
    }

    @Test
    public void deve_CancelarOPedido_QuandoOPedidoEstiverEmAprovacao() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.cancelar();
        assertThat(pedido.getStatus(), instanceOf(PedidoCancelado.class));
    }

    @Test(expected = IllegalStateException.class)
    public void deve_ImpedirAReaberturaDoPedido_QuandoOPedidoEstiverEmAprovacao() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.reabrir();
    }

    @Test(expected = IllegalStateException.class)
    public void deve_ImpedirCancelamentoDoPedido_QuandoOPedidoEstiverAprovado() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.aprovar();
        assertThat(pedido.getStatus(), instanceOf(PedidoAprovado.class));
        pedido.cancelar();
    }

    @Test(expected = IllegalStateException.class)
    public void deve_ImpedirReaberturaDoPedido_QuandoOPedidoEstiverAprovado() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.aprovar();
        assertThat(pedido.getStatus(), instanceOf(PedidoAprovado.class));
        pedido.reabrir();
    }

    @Test(expected = IllegalStateException.class)
    public void deve_ImpedirAprovacaoDoPedido_QuandoOPedidoEstiverAprovado() {
        assertThat(pedido.getStatus(), instanceOf(PedidoEmAprovacao.class));
        pedido.aprovar();
        assertThat(pedido.getStatus(), instanceOf(PedidoAprovado.class));
        pedido.aprovar();
    }
}