package com.rubensleme;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TemplateMethodTest {

    @Test
    public void deve_RetornarClienteComOsDadosPreenchidos_QuandoReceberOsDadosDoCliente() {
        Conversor<Cliente> conversor = new ConversorCliente();
        Map<String, Object> dados = new HashMap<>();
        dados.put("id", 3);
        dados.put("nome", "Fulano");
        dados.put("dataCadastro", LocalDate.of(2018, Month.FEBRUARY, 5));

        Cliente cliente = conversor.converterObjeto(dados);

        assertNotNull(cliente);

        assertThat(cliente.getId(), is(equalTo(3)));
        assertThat(cliente.getNome(), is(equalTo("Fulano")));
        assertThat(cliente.getDataCadastro(), is(equalTo(LocalDate.of(2018, Month.FEBRUARY, 5))));
    }

    @Test
    public void deve_RetornarClienteComOsDadosPreenchidos_QuandoReceberOsDadosDoClienteIncompletos() {
        Conversor<Cliente> conversor = new ConversorCliente();
        Map<String, Object> dados = new HashMap<>();
        dados.put("id", 3);
        dados.put("nome", "Fulano");

        Cliente cliente = conversor.converterObjeto(dados);

        assertNotNull(cliente);

        assertThat(cliente.getId(), is(equalTo(3)));
        assertThat(cliente.getNome(), is(equalTo("Fulano")));
        assertNull(cliente.getDataCadastro());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deve_LancarException_QuandoReceberDadosVazios() {
        Conversor<Cliente> conversor = new ConversorCliente();
        Map<String, Object> dados = new HashMap<>();

        Cliente cliente = conversor.converterObjeto(dados);

        fail("Deve lançar exception para dados vazios");
    }

    @Test(expected = NullPointerException.class)
    public void deve_LancarException_QuandoReceberDadosNulo() {
        Conversor<Cliente> conversor = new ConversorCliente();
        Map<String, Object> dados = null;

        Cliente cliente = conversor.converterObjeto(dados);

        fail("Deve lançar exception para dados nulo");
    }

    @Test
    public void deve_RetornarProdutoComOsDadosPreenchidos_QuandoReceberOsDadosDoProduto() {
        Conversor<Produto> conversor = new ConversorProduto();
        Map<String, Object> dados = new HashMap<>();
        dados.put("id", 25L);
        dados.put("nome", "Calça");
        dados.put("codigoBarras", "4567891234568");

        Produto produto = conversor.converterObjeto(dados);

        assertNotNull(produto);

        assertThat(produto.getId(), is(equalTo(25L)));
        assertThat(produto.getNome(), is(equalTo("Calça")));
        assertThat(produto.getCodigoBarras(), is(equalTo("4567891234568")));
    }

}