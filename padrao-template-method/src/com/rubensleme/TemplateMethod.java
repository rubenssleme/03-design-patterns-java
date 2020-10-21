package com.rubensleme;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class TemplateMethod {
    public static void main(String[] args) {
        Map<String, Object> dadosCliente = new HashMap<>();
        dadosCliente.put("id", 3);
        dadosCliente.put("nome", "Fulano");
        dadosCliente.put("dataCadastro", LocalDate.of(2018, Month.FEBRUARY, 5));

        Conversor<Cliente> conversorCliente = new ConversorCliente();
        Cliente cliente = conversorCliente.converterObjeto(dadosCliente);

        System.out.println(cliente);

        Map<String, Object> dadosProduto = new HashMap<>();
        dadosProduto.put("id", 20L);
        dadosProduto.put("nome", "Tekpix");
        dadosProduto.put("codigoBarras", "7890420183248");

        Conversor<Produto> conversorProduto = new ConversorProduto();
        Produto produto = conversorProduto.converterObjeto(dadosProduto);

        System.out.println(produto);
    }
}

