package interpreter;

public class Interpreter {

    public static void main(String[] args) {
        Expressao soma = new Soma(new Numero(2), new Soma(new Numero(5), new Numero(10)));

        Expressao divisao = new Divisao(new Soma(new Numero(3), new Numero(7)), new Numero(2));

        Expressao exp = new Soma(new Numero(3), new Divisao(new Numero(6), new Numero(3)));

        Expressao potencia = new Potencia(exp, new Numero(2));

        System.out.println("soma: " + soma.avalia());
        System.out.println("divisão: " + divisao.avalia());
        System.out.println("expressão: " + exp.avalia());
        System.out.println("potência: " + potencia.avalia());
    }
}
