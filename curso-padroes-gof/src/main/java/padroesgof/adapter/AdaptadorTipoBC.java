package padroesgof.adapter;

import padroesgof.modelo.formatos.FormatoTipoA;
import padroesgof.modelo.formatos.FormatoTipoB;
import padroesgof.modelo.formatos.FormatoTipoC;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Adaptador concreto que provê adaptação entre plugues de formato {@link FormatoTipoB}
 * e tomadas de formato {@link FormatoTipoC}.
 */
public class AdaptadorTipoBC extends AdaptadorAbstrato<FormatoTipoB, FormatoTipoC> {

    public AdaptadorTipoBC(Tomada<FormatoTipoC> tomada) {
        super(new FormatoTipoB(), tomada);
    }

}
