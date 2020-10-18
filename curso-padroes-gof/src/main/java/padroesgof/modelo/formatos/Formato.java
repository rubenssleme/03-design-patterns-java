package padroesgof.modelo.formatos;

/**
 * Interface que define o comportamento de um formato de plugue ou tomada.
 * Seguindo como base o padrão definido no
 * <a href="https://www.iec.ch/worldplugs/"><strong>IEC (<i>International Electrotechnical Commission</i>)</strong></a>.
 */
public interface Formato {

    /**
     * Método responsável por retornar o tipo do formato.
     *
     * @return Tipo do formato.
     */
    String getTipo();

    /**
     * Método responsável por retornar a descrição do formato.
     *
     * @return Descrição do formato.
     */
    String getDescricao();
}
