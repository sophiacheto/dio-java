import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set <Produto> lista;

    CadastroProdutos() {
        lista = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        lista.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set <Produto> nomes = new TreeSet<>(lista);
        return nomes;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set <Produto> precos = new TreeSet<>(new ComparatorPorPreco());
    
        precos.addAll(lista);
        return precos;
    }   



}
