import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
}


class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
