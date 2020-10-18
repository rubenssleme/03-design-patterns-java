import java.util.HashMap;
import java.util.Map;

public class MaquinaDeMensagemSingleton {

    private static final Map<Class<MaquinaDeMensagens>, MaquinaDeMensagens> instancias = new HashMap<>();

    /**
     * Método responsável por devolver uma instância da classe {@code classeMaquina}.
     * Implementação do padrão de projetos: <b><i>Singleton</i></b>.
     *
     * @param classeMaquinaDeMensagem Classe concreta da máquina de mensagens.
     * @return Instância para a classe {@code classeMaquina}.
     */
    public static MaquinaDeMensagens getInstancia(Class<MaquinaDeMensagens> classeMaquinaDeMensagem) {
        if (!instancias.containsKey(classeMaquinaDeMensagem)) {
            try {
                instancias.put(classeMaquinaDeMensagem, classeMaquinaDeMensagem.newInstance());
                System.out.printf("Singleton -> Nova instância criada para a classe: %s.%n", classeMaquinaDeMensagem.getSimpleName());
            } catch (InstantiationException | IllegalAccessException e) {
                String mensagem = "Singleton -> Não foi possível criar uma nova instância para a classe: %s.";
                throw new RuntimeException(String.format(mensagem, classeMaquinaDeMensagem.getSimpleName()));
            }
        }
        return instancias.get(classeMaquinaDeMensagem);
    }
}
