package padroesgof.adapter;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.plugues.Plugue;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Interface de adaptação que define o comportamento de um adaptador.
 * Que se comporta tanto como {@link Tomada<T>} como {@link Plugue<U>}.
 *
 * @param <T> Formato do plugue a ser adaptado.
 * @param <U> Formato da tomada adaptada.
 */
public interface Adaptador<T extends Formato, U extends Formato> extends Tomada<T>, Plugue<U> {

    /**
     * Método responsável por retornar a descrição do formato do adaptador.
     *
     * @return Descrição do formato do adaptador.
     */
    String getFormatoAdaptador();
}
