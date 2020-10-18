package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.plugues.Plugue;

/**
 * Implementação abstrata de uma {@link Tomada} de formato {@link T} visando eliminar repetição de código.
 *
 * @param <T> Tipo de formato concreto.
 */
public abstract class TomadaAbstrata<T extends Formato> implements Tomada<T> {

    private final T formato;

    public TomadaAbstrata(T formato) {
        this.formato = formato;
    }

    public T getFormato() {
        return formato;
    }

    public String getNomeRede() {
        return "tomada tipo " + formato.getTipo();
    }

    public String conecta(Plugue<T> plugue) {
        return plugue.obtemEletricidade(this);
    }

    public String getFormatoTomada() {
        return "Formato da tomada tipo " + formato.getTipo() + ": encaixe para " + formato.getDescricao();
    }
}
