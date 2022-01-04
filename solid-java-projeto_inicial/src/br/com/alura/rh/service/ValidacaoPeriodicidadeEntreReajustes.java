package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes  implements ValidaReajuste{
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual  = LocalDate.now();
        long mesesDesdeUltimoResjuste = ChronoUnit.MONTHS.between(dataUltimoReajuste,dataAtual);
        if (mesesDesdeUltimoResjuste < 6) {
            throw new ValidacaoException("Intervalo entre rejustes não pode ser menor que 6 meses");
        }
    }

}
