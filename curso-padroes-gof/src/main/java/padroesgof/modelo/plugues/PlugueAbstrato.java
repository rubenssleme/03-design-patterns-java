package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Implementação abstrata de um {@link Plugue} de formato {@link T} visando eliminar repetição de código.
 */
public abstract class PlugueAbstrato<T extends Formato> implements Plugue<T> {

    private final T formato;

    public PlugueAbstrato(T formato) {
        this.formato = formato;
    }

    public String obtemEletricidade(Tomada<T> tomada) {
        return "Plugue tipo " + formato.getTipo() + " conectado a " + tomada.getNomeRede();
    }

    public String getFormatoPlug() {
        return "Formato do plug tipo " + formato.getTipo() + ": " + formato.getDescricao();
    }

}
