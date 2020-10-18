package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.plugues.Plugue;

/**
 * Interface que define o comportamento de uma tomada de formato {@link T}.
 *
 * @param <T> Tipo de formato concreto.
 */
public interface Tomada<T extends Formato> {

    /**
     * Método responsável por retornar o formato concreto da tomada.
     *
     * @return Formato concreto da tomada.
     */
    T getFormato();

    /**
     * Método responsável por retornar informação sobre conexão entre a tomada
     * e um plugue de formato {@link T}.
     *
     * @param plugue Plugue concreto de formato {@link T}.
     * @return Descrição da conexão.
     */
    String conecta(Plugue<T> plugue);

    /**
     * Método responsável por retornar o nome da rede da tomada.
     *
     * @return Nome da rede de alimentação.
     */
    String getNomeRede();

    /**
     * Método responsável por retornar a descrição do formato da tomada.
     *
     * @return Descrição do formato da tomada.
     */
    String getFormatoTomada();
}
