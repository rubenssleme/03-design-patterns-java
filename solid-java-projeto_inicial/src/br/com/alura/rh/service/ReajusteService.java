package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


public class ReajusteService {
private List<ValidaReajuste> validacoes;

    public ReajusteService(List<ValidaReajuste> validacoes) {
        this.validacoes = validacoes;
    }
    public void validar(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(funcionario,aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
