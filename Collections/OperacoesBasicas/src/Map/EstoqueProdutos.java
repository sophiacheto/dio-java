import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Prod> estoque; 
    

    EstoqueProdutos() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Prod(nome, preco, quantidade));
    }

    public double valorTotalEstoque() {
        double valor = 0d;
        for (Prod p : estoque.values())
            valor += p.getPreco() * p.getQuantidade();
        return valor;
    }

    public Prod maisCaro() {
        double maior = Double.MAX_VALUE;
        Prod produtoCaro = null;

        for (Prod p : estoque.values()) 
            if (p.getPreco() > maior) {
                produtoCaro = p;
                maior = p.getPreco();
        }

        return produtoCaro;
    }

}


