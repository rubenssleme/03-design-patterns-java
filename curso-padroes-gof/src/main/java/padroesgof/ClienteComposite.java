package padroesgof;

import padroesgof.adapter.AdaptadorTipoAB;
import padroesgof.adapter.AdaptadorTipoBC;
import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.tomadas.TomadaTipoC;

import static padroesgof.Logger.log;

public class ClienteComposite {

    public static void main(String[] args) {
        // plug A
        PlugueTipoA plugA = new PlugueTipoA();
        log(plugA.getFormatoPlug());

        // tomada C
        TomadaTipoC tomadaC = new TomadaTipoC();
        log(tomadaC.getFormatoTomada());

        // conecta o adaptador B->C na tomada C e conecta o adaptador A->B no adaptador B->C.
        AdaptadorTipoAB adaptadorAB = new AdaptadorTipoAB(new AdaptadorTipoBC(tomadaC));

        // conecta o plug A no adaptador A->B
        log(adaptadorAB.conecta(plugA));
    }

}
