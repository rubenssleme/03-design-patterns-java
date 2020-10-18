package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.FormatoTipoA;

/**
 * Classe concreta que representa o plugue de Tipo A.
 */
public class PlugueTipoA extends PlugueAbstrato<FormatoTipoA> {

    public PlugueTipoA() {
        super(new FormatoTipoA());
    }

}
