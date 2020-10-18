package padroesgof;

import padroesgof.adapter.AdaptadorTipoAB;
import padroesgof.adapter.AdaptadorTipoBA;
import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.plugues.PlugueTipoB;
import padroesgof.modelo.tomadas.TomadaTipoA;
import padroesgof.modelo.tomadas.TomadaTipoB;

import static padroesgof.Logger.log;

public class ClienteAdapter {

    public static void main(String[] args) {
        // tomada A
        TomadaTipoA tomadaA = new TomadaTipoA();
        log(tomadaA.getFormatoTomada());

        // plug A
        PlugueTipoA plugA = new PlugueTipoA();
        log(plugA.getFormatoPlug());

        // conecta o plug A na tomada A
        log(tomadaA.conecta(plugA));

        // tomada B
        TomadaTipoB tomadaB = new TomadaTipoB();
        log(tomadaB.getFormatoTomada());

        // plug B
        PlugueTipoB plugB = new PlugueTipoB();
        log(plugB.getFormatoPlug());

        // adaptador para conectar plug A na tomada B
        AdaptadorTipoAB adaptadorAB = new AdaptadorTipoAB(tomadaB);
        log(adaptadorAB.getFormatoAdaptador());

        // conecta o plug A na tomada B
        log(adaptadorAB.conecta(plugA));

        // adaptador para conectar plug B na tomada A
        AdaptadorTipoBA adaptadorBA = new AdaptadorTipoBA(tomadaA);
        log(adaptadorBA.getFormatoAdaptador());

        // conecta o plug B na tomada A
        log(adaptadorBA.conecta(plugB));
    }

}
