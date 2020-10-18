package strategy;

import java.util.Arrays;
import java.util.List;

public class Strategy {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Fulano", Cargo.GERENTE, 15000.0),
                new Funcionario("Ciclano", Cargo.ANALISTA, 2500.0),
                new Funcionario("Beltrano", Cargo.PROGRAMADOR, 1000.0),
                new Funcionario("Silvio", Cargo.ANALISTA, 3000.0),
                new Funcionario("Bill Gaytes", Cargo.ESTAGIARIO, 800.0));

        CalculadoraDeSalarios calculadora = new CalculadoraDeSalarios();

        double folhaDePagamento = calculadora.calculaFolhaDePagamento(funcionarios);

        System.out.printf("Folha de pagamentos: %.2f\n", folhaDePagamento);
    }

}
