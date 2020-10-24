package com.rubensleme;

public enum Cargo {
    GERENTE(0.15), ANALISTA(0.10), PROGRAMADOR(0.07), ESTAGIARIO(0.0);

    private final double porcentagemDesconto;

    Cargo(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public double calculaDesconto(double salario) {
        return salario * porcentagemDesconto;
    }
}
