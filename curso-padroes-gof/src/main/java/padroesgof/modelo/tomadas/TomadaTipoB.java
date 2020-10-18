package padroesgof.modelo.tomadas;

import padroesgof.modelo.formatos.FormatoTipoB;

/**
 * Classe concreta que representa a tomada de Tipo B.
 */
public class TomadaTipoB extends TomadaAbstrata<FormatoTipoB> {

    public TomadaTipoB() {
        super(new FormatoTipoB());
    }

}
