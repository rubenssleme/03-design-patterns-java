package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.FormatoTipoC;

/**
 * Classe concreta que representa o plugue de Tipo C.
 */
public class PlugueTipoC extends PlugueAbstrato<FormatoTipoC> {

    public PlugueTipoC() {
        super(new FormatoTipoC());
    }

}
