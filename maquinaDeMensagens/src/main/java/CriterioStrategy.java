public enum CriterioStrategy {
    AVISO(MaquinaDeMensagemDeAviso.class),
    INFO(MaquinaDeMensagemDeInfo.class),
    ERRO(MaquinaDeMensagemDeErro.class);

    public final Class classeMaquinaMensagem;

    CriterioStrategy(Class classeMaquinaMensagem) {
        this.classeMaquinaMensagem = classeMaquinaMensagem;
    }

    public Class getClasseMaquinaMensagem() {
        return this.classeMaquinaMensagem;
    }
}
