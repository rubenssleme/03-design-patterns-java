package strategy;

import java.util.List;

public class CalculadoraDeSalarios {

    public double calculaFolhaDePagamento(List<Funcionario> funcionarios) {
        double total = 0.0;
        for (Funcionario func : funcionarios) {
            total += func.getSalarioLiquido();
        }
        return total;
    }

    public double calculaFolhaDePagamentoSemStrategy(List<Funcionario> funcionarios) {
        double total = 0.0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCargo() == Cargo.ANALISTA) {
                total += funcionario.getSalarioBruto() - funcionario.getSalarioBruto() * 0.10;
            } else if (funcionario.getCargo() == Cargo.GERENTE) {
                total += funcionario.getSalarioBruto() - funcionario.getSalarioBruto() * 0.15;
            } else if (funcionario.getCargo() == Cargo.PROGRAMADOR) {
                total += funcionario.getSalarioBruto() - funcionario.getSalarioBruto() * 0.07;
            } else if (funcionario.getCargo() == Cargo.ESTAGIARIO) {
                total += funcionario.getSalarioBruto();
            }
        }
        return total;
    }

}
