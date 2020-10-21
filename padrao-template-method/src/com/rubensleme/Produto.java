package com.rubensleme;

public class Produto {
    private long id;
    private String nome;
    private String codigoBarras;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " '" + codigoBarras + "'";
    }
}
