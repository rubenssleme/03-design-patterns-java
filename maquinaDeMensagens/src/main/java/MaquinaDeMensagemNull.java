public class MaquinaDeMensagemNull extends MaquinaDeMensagens {

    public Mensagem entregaMensagem() {
        return new MensagemNull();
    }
}
