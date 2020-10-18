package padroesgof.modelo.formatos;

/**
 * Definição dos formatos padrões dos plugues e tomadas.
 * Referência: <a href="https://www.iec.ch/worldplugs/">https://www.iec.ch/worldplugs/</a>
 */
public enum FormatosPadraoEnum implements Formato {
    TIPO_A("A", "dois pinos chatos paralelos"),
    TIPO_B("B", "dois pinos chatos paralelos e um pino redondo"),
    TIPO_C("C", "dois pinos redondos"),
    TIPO_D("D", "três pinos redondos largos em formato triangular")
    // demais tipos ignorados por razão de exemplo
    ;

    private final String tipo;
    private final String descricao;

    FormatosPadraoEnum(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

}
