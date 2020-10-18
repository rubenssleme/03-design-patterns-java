package padroesgof.facade;

import padroesgof.adapter.AdaptadorTipoAB;
import padroesgof.adapter.AdaptadorTipoBC;
import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.tomadas.TomadaTipoA;
import padroesgof.modelo.tomadas.TomadaTipoB;
import padroesgof.modelo.tomadas.TomadaTipoC;

import static padroesgof.Logger.log;

/**
 * Classe que implementa a interface {@link FacadeConexao}.
 */
public class FacadeConexaoImpl implements FacadeConexao {

    public void conectarPlugueATomadaA(PlugueTipoA plugA, TomadaTipoA tomadaA) {
        log(tomadaA.conecta(plugA));
    }

    public void conectarPlugueATomadaB(PlugueTipoA plugA, TomadaTipoB tomadaB) {
        // adaptador para conectar plug A na tomada B
        AdaptadorTipoAB adaptadorAB = new AdaptadorTipoAB(tomadaB);
        log(adaptadorAB.getFormatoAdaptador());

        // conecta o plug A na tomada B
        log(adaptadorAB.conecta(plugA));
    }

    public void conectarPlugueATomadaC(PlugueTipoA plugA, TomadaTipoC tomadaC) {
        // conecta o adaptador B->C na tomada C e conecta o adaptador A->B no adaptador B->C.
        AdaptadorTipoAB adaptadorAB = new AdaptadorTipoAB(new AdaptadorTipoBC(tomadaC));

        // conecta o plug A no adaptador A->B
        log(adaptadorAB.conecta(plugA));
    }

}
