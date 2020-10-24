package com.rubensleme;

import java.util.Map;

public class ConversorProduto extends Conversor<Produto> {
    @Override
    protected Produto converter(Map<String, Object> dados) {
        Produto produto = new Produto();
        produto.setId((Long) dados.get("id"));
        produto.setNome((String) dados.get("nome"));
        produto.setCodigoBarras((String) dados.get("codigoBarras"));
        return produto;
    }
}
