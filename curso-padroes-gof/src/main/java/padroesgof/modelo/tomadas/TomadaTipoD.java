package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.FormatoTipoD;

/**
 * Classe concreta que representa a tomada de Tipo D.
 */
public class TomadaTipoD extends TomadaAbstrata<FormatoTipoD> {

    public TomadaTipoD() {
        super(new FormatoTipoD());
    }

}
