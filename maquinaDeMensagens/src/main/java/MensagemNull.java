/**
 * Classe com implementação neutra utilizando o padrão <b><i>Null Object</i></b>
 * para eliminar checagens e evitar {@link NullPointerException}.
 */
public class MensagemNull implements Mensagem {
    public void mensagem() {
        System.out.println("Mensagem não encontrada.");
    }
}
