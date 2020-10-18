package templatemethod;

import java.util.Map;

public abstract class Conversor<T> {
    protected abstract T converter(Map<String, Object> dados);

    public T converterObjeto(Map<String, Object> dados) {
        if (dados == null) {
            throw new NullPointerException("Dados não recebidos");
        }

        if (dados.isEmpty()) {
            throw new IllegalArgumentException("Nenhum dado encontrado");
        }

        return converter(dados);
    }
}
