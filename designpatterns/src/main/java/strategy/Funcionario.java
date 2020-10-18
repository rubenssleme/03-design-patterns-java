package strategy;

public class Funcionario {
    private long numero;
    private String nome;
    private double salarioBruto;
    private Cargo cargo;

    Funcionario(String nome, Cargo cargo, double salarioBruto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioBruto - cargo.calculaDesconto(salarioBruto);
    }

    public Cargo getCargo() {
        return this.cargo;
    }
}
