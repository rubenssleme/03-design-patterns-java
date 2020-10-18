package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.FormatoTipoC;

/**
 * Classe concreta que representa a tomada de Tipo C.
 */
public class TomadaTipoC extends TomadaAbstrata<FormatoTipoC> {

    public TomadaTipoC() {
        super(new FormatoTipoC());
    }

}
