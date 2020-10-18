package padroesgof.proxy;

import padroesgof.facade.FacadeConexao;
import padroesgof.modelo.plugues.PlugueTipoA;
import padroesgof.modelo.tomadas.TomadaTipoA;
import padroesgof.modelo.tomadas.TomadaTipoB;
import padroesgof.modelo.tomadas.TomadaTipoC;

/**
 * Implementação de um proxy para intermediar a interação entre um cliente e um objeto de {@link FacadeConexao}.
 * Padrão de projeto: <b><i>Proxy</i></b>.
 */
public class FacadeConexaoProxy implements FacadeConexao {

    private FacadeConexao facade;

    private FacadeConexaoProxy() throws Exception {
        conectar();
    }

    /**
     * Método responsável por instanciar um objeto de {@link FacadeConexao}.
     *
     * @throws Exception Caso não for possível criar uma nova instância.
     */
    private void conectar() throws Exception {
        try {
            facade = (FacadeConexao) Class.forName("padroesgof.facade.FacadeConexaoImpl")
                    .getConstructor().newInstance();
        } catch (Exception e) {
            throw new Exception("Não foi possível conectar com o Facade.\n" +
                    "Erro: " + e.getMessage());
        }
    }

    /**
     * Método responsável por retornar uma instância de {@link FacadeConexao} no formato de proxy.
     *
     * @return Proxy de instância de {@link FacadeConexao}.
     * @throws Exception Caso não seja possível conectar com um {@link FacadeConexao}.
     */
    public static FacadeConexao getFacade() throws Exception {
        return new FacadeConexaoProxy();
    }

    public void conectarPlugueATomadaA(PlugueTipoA plugA, TomadaTipoA tomadaA) {
        facade.conectarPlugueATomadaA(plugA, tomadaA);
    }

    public void conectarPlugueATomadaB(PlugueTipoA plugA, TomadaTipoB tomadaB) {
        facade.conectarPlugueATomadaB(plugA, tomadaB);
    }

    public void conectarPlugueATomadaC(PlugueTipoA plugA, TomadaTipoC tomadaC) {
        facade.conectarPlugueATomadaC(plugA, tomadaC);
    }
}
