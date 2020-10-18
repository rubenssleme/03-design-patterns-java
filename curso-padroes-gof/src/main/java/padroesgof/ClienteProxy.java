package padroesgof;

import padroesgof.facade.FacadeConexao;
import padroesgof.proxy.FacadeConexaoProxy;

public class ClienteProxy {

    public static void main(String[] args) {
        try {
            FacadeConexao facade = FacadeConexaoProxy.getFacade();
            ClienteFacade.executar(facade);
        } catch (Exception e) {
            Logger.log(e.getMessage());
        }
    }
}
