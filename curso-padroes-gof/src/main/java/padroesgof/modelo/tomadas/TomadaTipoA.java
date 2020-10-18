package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.FormatoTipoA;

/**
 * Classe concreta que representa a tomada de Tipo A.
 */
public class TomadaTipoA extends TomadaAbstrata<FormatoTipoA> {

    public TomadaTipoA() {
        super(new FormatoTipoA());
    }

}
