package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.FormatoTipoD;

/**
 * Classe concreta que representa o plugue de Tipo D.
 */
public class PlugueTipoD extends PlugueAbstrato<FormatoTipoD> {

    public PlugueTipoD() {
        super(new FormatoTipoD());
    }

}
