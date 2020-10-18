package composite;

import java.util.Arrays;
import java.util.List;

public class Composite {

    public static void main(String[] args) {
        Produto camisa = new ProdutoSimples("Camisa", 30.0);
        Produto calca = new ProdutoSimples("Calça", 50.0);

        List<Produto> calcaCamisa = Arrays.asList(camisa, calca);

        Produto conjunto = new ProdutoComposto("Conjunto Calça e Camisa", calcaCamisa, 0.15);

        Produto kit = new ProdutoComposto("Kit de produtos", Arrays.asList(camisa, calca, conjunto), 0.20);

        List<Produto> produtos = Arrays.asList(camisa, calca, conjunto, kit);

        System.out.println("Lista de Produtos:");
        produtos.forEach(p -> System.out.printf("%-25s R$ %6.2f\n", p.getDescricao(), p.getPreco()));
    }

}
