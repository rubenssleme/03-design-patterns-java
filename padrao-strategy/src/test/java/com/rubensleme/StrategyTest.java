package strategy;

import com.rubensleme.CalculadoraDeSalarios;
import com.rubensleme.Cargo;
import com.rubensleme.Funcionario;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StrategyTest {

    @Test
    public void deve_RetornarSalarioComODescontoCorreto_DeAcordoComOCargo() {
        Funcionario gerente = new Funcionario("", Cargo.GERENTE, 15000.0);
        assertThat(gerente.getSalarioBruto(), is(equalTo(15000.0)));
        assertThat(gerente.getSalarioLiquido(), is(equalTo(12750.0)));

        Funcionario analista = new Funcionario("", Cargo.ANALISTA, 2500.0);
        assertThat(analista.getSalarioBruto(), is(equalTo(2500.0)));
        assertThat(analista.getSalarioLiquido(), is(equalTo(2250.0)));

        Funcionario programador = new Funcionario("", Cargo.PROGRAMADOR, 1000.0);
        assertThat(programador.getSalarioBruto(), is(equalTo(1000.0)));
        assertThat(programador.getSalarioLiquido(), is(equalTo(930.0)));

        Funcionario estagiario = new Funcionario("", Cargo.ESTAGIARIO, 800.0);
        assertThat(estagiario.getSalarioBruto(), is(equalTo(800.0)));
        assertThat(estagiario.getSalarioLiquido(), is(equalTo(800.0)));
    }

    @Test
    public void deve_RetornarSomatoriaDosSalariosLiquidos_ParaUmaListaDeFuncionarios() {
        List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Fulano", Cargo.GERENTE, 15000.0),
                new Funcionario("Ciclano", Cargo.ANALISTA, 2500.0),
                new Funcionario("Beltrano", Cargo.PROGRAMADOR, 1000.0),
                new Funcionario("Bill Gaytes", Cargo.ESTAGIARIO, 800.0));

        CalculadoraDeSalarios calculadora = new CalculadoraDeSalarios();

        double folhaDePagamento = calculadora.calculaFolhaDePagamento(funcionarios);

        assertThat(folhaDePagamento, is(equalTo(16730.0)));
    }

}