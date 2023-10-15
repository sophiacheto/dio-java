import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List <Item> lista;

    CarrinhoDeCompras() {
        lista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        lista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome) {
        List <Item> paraRemover = new ArrayList<>();
        
        for (Item item : lista) 
            if (item.getNome().equalsIgnoreCase(nome))
                paraRemover.add(item);
        
        lista.removeAll(paraRemover);
    }

    public int calcularValorTotal() {
        int valor = 0;

        for (Item item : lista) 
            valor += item.getPreco();

        return valor;
    }

    public void exibirItens() {
        for (Item item : lista)
            System.out.println(item);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
