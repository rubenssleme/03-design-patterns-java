package padroesgof.singleton;

import padroesgof.facade.FacadeConexao;
import padroesgof.facade.FacadeConexaoImpl;

/**
 * Implementação concreta de {@link FacadeConexao}
 * de maneira que exista somente uma instância de {@link FacadeConexao} em tempo de execução.
 * Padrão de projeto: <b><i>Singleton</i></b>.
 */
public class FacadeConexaoSingleton {

    private static FacadeConexao instance;

    private FacadeConexaoSingleton() {
    }

    /**
     * Método responsável por retornar uma instância única de {@link FacadeConexao}.
     *
     * @return Instância única de {@link FacadeConexao}.
     */
    public static FacadeConexao getInstance() {
        if (instance == null) {
            instance = new FacadeConexaoImpl();
        }
        return instance;
    }
}
