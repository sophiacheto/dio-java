import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Long cod;
    private double preco;
    private int quantidade;

    Produto(String nome, Long cod, double preco, int quantidade) {
        this.cod = cod;
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        return true;
    }

    public String toString() {
        return "(" + nome + ", " + preco + ", " + cod + ", " + quantidade + ")";
    }

    @Override
    public int compareTo(Produto p) {
       return nome.compareToIgnoreCase(p.getNome());
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco()); 
    }


}
