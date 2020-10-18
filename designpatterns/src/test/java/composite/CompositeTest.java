package composite;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CompositeTest {

    @Test
    public void deve_RetornarPrecoCorreto_QuandoHouverAgrupamentoDeProdutosComDesconto() {
        Produto camisa = new ProdutoSimples("Camisa", 30.0);
        assertThat(camisa.getPreco(), is(equalTo(30.0)));

        Produto calca = new ProdutoSimples("Calça", 50.0);
        assertThat(calca.getPreco(), is(equalTo(50.0)));

        List<Produto> calcaCamisa = Arrays.asList(camisa, calca);

        Produto conjunto = new ProdutoComposto("Conjunto Calça e Camisa", calcaCamisa, 0.15);

        assertThat(conjunto.getPreco(), is(equalTo(68.0)));
//        assertThat(conjunto.getDescricao(), is(equalTo("Conjunto Calça e Camisa")));
    }

    @Test
    public void deve_RetornarPrecoCorreto_QuandoHouverAgrupamentoDeProdutosSemDesconto() {
        Produto camisa = new ProdutoSimples("Camisa", 30.0);
        assertThat(camisa.getPreco(), is(equalTo(30.0)));

        Produto calca = new ProdutoSimples("Calça", 50.0);
        assertThat(calca.getPreco(), is(equalTo(50.0)));

        List<Produto> calcaCamisa = Arrays.asList(camisa, calca);

        Produto conjunto = new ProdutoComposto("Conjunto Calça e Camisa", calcaCamisa, 0.0);

        assertThat(conjunto.getPreco(), is(equalTo(80.0)));
//        assertThat(conjunto.getDescricao(), is(equalTo("Conjunto Calça e Camisa")));
    }
}