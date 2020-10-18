package padroesgof.modelo.plugues;

import padroesgof.modelo.formatos.FormatoTipoB;

/**
 * Classe concreta que representa o plugue de Tipo B.
 */
public class PlugueTipoB extends PlugueAbstrato<FormatoTipoB> {

    public PlugueTipoB() {
        super(new FormatoTipoB());
    }

}
