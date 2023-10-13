package collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, ProdutoMap> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(
            Long cod,
            String nome,
            double preco,
            int quantidade) {
        estoqueProdutosMap.put(cod, new ProdutoMap(nome, preco, quantidade));
    }

    public void exibirTodosProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotal() {
        double valorTotal = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (ProdutoMap produto : estoqueProdutosMap.values()) {
                valorTotal = produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotal;
    }

    public ProdutoMap obterProdutoMaisCaro() {
        ProdutoMap produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (ProdutoMap p : estoqueProdutosMap.values()) {
            if (!estoqueProdutosMap.isEmpty()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirTodosProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10d, 10);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 15d, 10);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 20d, 10);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 30d, 10);

        System.out.println("Valor total do estoque: " + estoqueProdutos.calculaValorTotal());
        System.out.println("Produto mais Caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }

}