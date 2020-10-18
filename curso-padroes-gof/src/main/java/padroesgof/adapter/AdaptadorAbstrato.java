package padroesgof.adapter;

import padroesgof.modelo.formatos.Formato;
import padroesgof.modelo.plugues.Plugue;
import padroesgof.modelo.tomadas.Tomada;

/**
 * Adaptador abstrato que provê adaptação para conexão de plugue de formato {@link T} para tomada de formato {@link U}.
 * Padrão de projeto: <b><i>Adapter</i></b>.
 *
 * @param <T> Tipo de plugue a ser adaptado.
 * @param <U> Tipo da tomada adaptada.
 */
public abstract class AdaptadorAbstrato<T extends Formato, U extends Formato> implements Adaptador<T, U> {

    private final T formatoPlug;
    private final Tomada<U> tomada;

    public AdaptadorAbstrato(T formatoPlug, Tomada<U> tomada) {
        this.formatoPlug = formatoPlug;
        this.tomada = tomada;
    }

    public T getFormato() {
        return formatoPlug;
    }

    public String obtemEletricidade(Tomada<U> tomada) {
        return " conectado a " + tomada.getNomeRede();
    }

    public String conecta(Plugue<T> plugue) {
        String s1 = plugue.obtemEletricidade(this);
        String s2 = tomada.conecta(this);

        return s1 + s2;
    }

    public String getFormatoPlug() {
        return String.format("Formato do plug tipo %s: %s", formatoPlug.getTipo(), formatoPlug.getDescricao());
    }

    public String getFormatoTomada() {
        return String.format("Formato da tomada tipo %s: encaixe para %s", tomada.getFormato().getTipo(), tomada.getFormato().getDescricao());
    }

    public String getFormatoAdaptador() {
        return getNomeRede() + " {\n" +
                "   " + getFormatoPlug() + "\n" +
                "   " + getFormatoTomada() + "\n" +
                "}";
    }

    public String getNomeRede() {
        return String.format("adaptador %s->%s", formatoPlug.getTipo(), tomada.getFormato().getTipo());
    }

}
