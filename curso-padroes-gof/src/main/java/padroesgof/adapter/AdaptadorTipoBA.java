package padroesgof.adapter;

import padroesgof.modelo.formatos.FormatoTipoA;
import padroesgof.modelo.formatos.FormatoTipoB;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Adaptador concreto que provê adaptação entre plugues de formato {@link FormatoTipoB}
 * e tomadas de formato {@link FormatoTipoA}.
 */
public class AdaptadorTipoBA extends AdaptadorAbstrato<FormatoTipoB, FormatoTipoA> {

    public AdaptadorTipoBA(Tomada<FormatoTipoA> tomada) {
        super(new FormatoTipoB(), tomada);
    }

}
