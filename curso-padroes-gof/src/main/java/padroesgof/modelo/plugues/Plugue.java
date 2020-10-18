package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Interface que define o comportamento de um plug de formato {@link T}.
 *
 * @param <T> Tipo de formato concreto.
 * @see Formato
 */
public interface Plugue<T extends Formato> {

    /**
     * Método responsável por retornar informação sobre conexão com uma tomada de formato {@link T}.
     *
     * @param tomada Tomada qual o plugue está conectado.
     * @return Descrição da conexão realizada.
     */
    String obtemEletricidade(Tomada<T> tomada);

    /**
     * Método responsável por retornar a descrição do formato do plugue.
     *
     * @return Descrição do formato do plugue.
     */
    String getFormatoPlug();

}
