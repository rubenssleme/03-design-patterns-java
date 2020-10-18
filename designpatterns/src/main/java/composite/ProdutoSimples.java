package composite;

public class ProdutoSimples implements Produto {

    private final String descricao;
    private final double preco;

    public ProdutoSimples(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

}
