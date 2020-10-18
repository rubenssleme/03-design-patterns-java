package padroesgof.modelo.formatos;

/**
 * Implementação abstrata de um {@link Formato} visando eliminar repetição de código.
 */
public abstract class FormatoAbstrato implements Formato {

    private final String tipo;
    private final String descricao;

    public FormatoAbstrato(FormatosPadraoEnum padrao) {
        this.tipo = padrao.getTipo();
        this.descricao = padrao.getDescricao();
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
