package padroesgof;

import padroesgof.facade.FacadeConexao;
import padroesgof.singleton.FacadeConexaoSingleton;

import static padroesgof.Logger.log;

public class ClienteSingleton {

    public static void main(String[] args) {
        FacadeConexao facade = null;
        for (int i = 0; i < 5; i++) {
            facade = FacadeConexaoSingleton.getInstance();
            log(facade);
        }

        ClienteFacade.executar(facade);
    }
}
