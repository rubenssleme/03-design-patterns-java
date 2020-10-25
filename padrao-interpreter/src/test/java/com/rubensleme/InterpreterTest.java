package interpreter;

import com.rubensleme.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class InterpreterTest {

    @Test
    public void deve_RetornarResultado_ParaUmaSomaDeDoisNumeros() {
        Expressao soma = new Soma(new Numero(5), new Numero(11));
        assertThat(soma.avalia(), is(equalTo(16.0)));
    }

    @Test
    public void deve_RetornarResultado_ParaUmaSubtracaoDeDoisNumeros() {
        Expressao subtracao = new Subtracao(new Numero(2), new Numero(11));
        assertThat(subtracao.avalia(), is(equalTo(-9.0)));
    }

    @Test
    public void deve_RetornarRazao_ParaUmaDivisaoDeDoisNumerosDiferentesDeZero() {
        Expressao divisao = new Divisao(new Numero(11), new Numero(2));
        assertThat(divisao.avalia(), is(equalTo(5.5)));
    }

    @Test
    public void deve_RetornarProduto_ParaUmaMultiplicacaoDeDoisNumeros() {
        Expressao multiplicacao = new Multiplicacao(new Numero(7), new Numero(11));
        assertThat(multiplicacao.avalia(), is(equalTo(77.0)));
    }

    @Test(expected = ArithmeticException.class)
    public void deve_LancarException_ParaUmaDivisaoPorZero() {
        Expressao divisao = new Divisao(new Numero(5), new Numero(0.0));
        divisao.avalia();
        fail("Deveria lançar uma ArithmeticException pela divisão por zero.");
    }

    @Test
    public void deve_RetornarResultado_ParaUmaExpressaoEncadeada() {
        Expressao soma = new Soma(new Numero(10), new Subtracao(new Numero(3), new Numero(-14)));
        assertThat(soma.avalia(), is(equalTo(27.0)));

        Expressao divisao = new Divisao(soma, new Multiplicacao(new Numero(3), new Divisao(new Numero(12), new Numero(4))));
        assertThat(divisao.avalia(), is(equalTo(3.0)));
    }

}