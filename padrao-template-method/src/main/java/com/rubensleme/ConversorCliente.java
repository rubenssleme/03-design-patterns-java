package com.rubensleme;

import java.time.LocalDate;
import java.util.Map;

public class ConversorCliente extends Conversor<Cliente> {
    @Override
    protected Cliente converter(Map<String, Object> dados) {
        Cliente cliente = new Cliente();
        cliente.setId((Integer) dados.get("id"));
        cliente.setNome((String) dados.get("nome"));
        cliente.setDataCadastro((LocalDate) dados.get("dataCadastro"));
        return cliente;
    }
}
