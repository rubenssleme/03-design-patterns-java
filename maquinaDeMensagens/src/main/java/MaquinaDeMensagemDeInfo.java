public class MaquinaDeMensagemDeInfo extends MaquinaDeMensagens {

    public Mensagem entregaMensagem() {
        return new MensagemInfo();
    }
}
