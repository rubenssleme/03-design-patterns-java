package padroesgof.adapter;

import padroesgof.modelo.formatos.FormatoTipoA;
import padroesgof.modelo.formatos.FormatoTipoB;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Adaptador concreto que provê adaptação entre plugues de formato {@link FormatoTipoA}
 * e tomadas de formato {@link FormatoTipoB}.
 */
public class AdaptadorTipoAB extends AdaptadorAbstrato<FormatoTipoA, FormatoTipoB> {

    public AdaptadorTipoAB(Tomada<FormatoTipoB> tomada) {
        super(new FormatoTipoA(), tomada);
    }

}
