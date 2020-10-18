package composite;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoComposto implements Produto {

    private final String descricao;
    private final List<Produto> produtos;
    private final double porcentagemDeDesconto;

    public ProdutoComposto(String descricao, List<Produto> produtos, double porcentagemDeDesconto) {
        this.descricao = descricao;
        this.produtos = produtos;
        this.porcentagemDeDesconto = porcentagemDeDesconto;
    }

    @Override
    public String getDescricao() {
        return new StringBuilder()
                .append(this.descricao).append("\n")
                .append(produtos.stream().map(produto -> "\t - " + produto.getDescricao()).collect(Collectors.joining("\n")))
                .append("\n")
                .toString();
    }

    @Override
    public double getPreco() {
        double total = 0.0D;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total - (total * this.porcentagemDeDesconto);
    }

}
