public abstract class MaquinaDeMensagens {

    /**
     * Método responsável pela entrega da mensagem.
     * Implementação do padrão de projeto: <b><i>Template Method</i></b>.
     *
     * @return Mensagem
     */
    public abstract Mensagem entregaMensagem();

    /**
     * Método responsável por recuperar a instância da máquina de mensagens concreta pela classe.
     *
     * @param classeMaquinaDeMensagens Classe concreta da Máquina de mensagens.
     * @return Instância da máquina de mensagens.
     */
    private static MaquinaDeMensagens getMaquinaDeMensagensConcreta(Class classeMaquinaDeMensagens) {
        return MaquinaDeMensagemSingleton.getInstancia(classeMaquinaDeMensagens);
    }

    /**
     * Método responsável por devolver a classe concreta da máquina de mensagens
     * de acordo com o {@code criterio}.
     *
     * @param criterio Critério de seleção da classe concreta.
     * @return Classe concreta da máquina de mensagens.
     */
    private static Class getClasseMaquinaDeMensagem(String criterio) {
        if (criterio.equals("aviso"))
            return MaquinaDeMensagemDeAviso.class;
        else if (criterio.equals("erro"))
            return MaquinaDeMensagemDeErro.class;
        return MaquinaDeMensagemNull.class;
    }

    /**
     * Método responsável por devolver a classe concreta da máquina de mensagens
     * de acordo com o {@code criterio}.
     * Implementação do padrão de projeto: <b><i>Strategy</i></b>.
     *
     * @param criterio Critério de seleção da classe concreta.
     * @return Classe concreta da máquina de mensagens.
     */
    private static Class getClasseMaquinaDeMensagem(CriterioStrategy criterio) {
        if (criterio != null) {
            return criterio.getClasseMaquinaMensagem();
        }
        return MaquinaDeMensagemNull.class;
    }

    /**
     * Método responsável por entregar a mensagem de acordo com o {@code criterio}.
     *
     * @param criterio Critério para criação da mensagem.
     * @return Mensagem para exibição.
     */
    public static Mensagem exibeMensagem(String criterio) {
        Class classeMaquinaDeMensagem = getClasseMaquinaDeMensagem(criterio);
        MaquinaDeMensagens maquinaDeMensagens = getMaquinaDeMensagensConcreta(classeMaquinaDeMensagem);
        return maquinaDeMensagens.entregaMensagem();
    }

    /**
     * Método responsável por entregar a mensagem de acordo com o {@code criterio}.
     * Implementação do padrão de projeto: <b><i>Strategy</i></b>.
     *
     * @param criterio Critério para criação da mensagem.
     * @return Mensagem para exibição.
     */
    public static Mensagem exibeMensagem(CriterioStrategy criterio) {
        Class classeMaquinaDeMensagem = getClasseMaquinaDeMensagem(criterio);
        MaquinaDeMensagens maquinaDeMensagens = getMaquinaDeMensagensConcreta(classeMaquinaDeMensagem);
        return maquinaDeMensagens.entregaMensagem();
    }
}
