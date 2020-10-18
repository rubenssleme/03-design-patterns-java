package padroesgof.facade;

import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.tomadas.TomadaTipoA;
import padroesgof.modelo.tomadas.TomadaTipoB;
import padroesgof.modelo.tomadas.TomadaTipoC;

/**
 * Interface que define o comportamento do façade de conexão entre plugues e tomadas concretos.
 * Padrão de projeto: <b><i>Facade</i></b>.
 *
 * @see padroesgof.modelo.plugues.Plugue
 * @see padroesgof.modelo.tomadas.Tomada
 */
public interface FacadeConexao {

    /**
     * Método responsável por conectar um plugue do tipo {@link PlugueTipoA}
     * a uma tomada do tipo {@link  TomadaTipoA}.
     *
     * @param plugA   Plugue do tipo A.
     * @param tomadaA Tomada do tipo A.
     */
    void conectarPlugueATomadaA(PlugueTipoA plugA, TomadaTipoA tomadaA);

    /**
     * Método responsável por conectar um plugue do tipo {@link PlugueTipoA}
     * a uma tomada do tipo {@link  TomadaTipoB}.
     *
     * @param plugA   Plugue do tipo A.
     * @param tomadaB Tomada do tipo B.
     */
    void conectarPlugueATomadaB(PlugueTipoA plugA, TomadaTipoB tomadaB);

    /**
     * Método responsável por conectar um plugue do tipo {@link PlugueTipoA}
     * a uma tomada do tipo {@link  TomadaTipoC}.
     *
     * @param plugA   Plugue do tipo A.
     * @param tomadaC Tomada do tipo C.
     */
    void conectarPlugueATomadaC(PlugueTipoA plugA, TomadaTipoC tomadaC);

}
