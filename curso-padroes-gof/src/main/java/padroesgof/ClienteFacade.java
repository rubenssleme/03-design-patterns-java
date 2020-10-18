package padroesgof;

import padroesgof.facade.FacadeConexao;
import padroesgof.facade.FacadeConexaoImpl;
import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.tomadas.TomadaTipoA;
import padroesgof.modelo.tomadas.TomadaTipoB;
import padroesgof.modelo.tomadas.TomadaTipoC;

import static padroesgof.Logger.log;

public class ClienteFacade {

    public static void main(String[] args) {
        FacadeConexao facade = new FacadeConexaoImpl();
        executar(facade);
    }

    public static void executar(FacadeConexao facade) {
        // plug A
        PlugueTipoA plugA = new PlugueTipoA();
        log(plugA.getFormatoPlug());

        // tomada A
        TomadaTipoA tomadaA = new TomadaTipoA();
        log(tomadaA.getFormatoTomada());

        facade.conectarPlugueATomadaA(plugA, tomadaA);

        // tomada B
        TomadaTipoB tomadaB = new TomadaTipoB();
        log(tomadaB.getFormatoTomada());

        facade.conectarPlugueATomadaB(plugA, tomadaB);

        // tomada C
        TomadaTipoC tomadaC = new TomadaTipoC();
        log(tomadaC.getFormatoTomada());

        facade.conectarPlugueATomadaC(plugA, tomadaC);
    }
}
