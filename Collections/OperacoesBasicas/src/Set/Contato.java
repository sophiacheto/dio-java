public class Contato {
    private String nome;
    private int numero;

    Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "(" + nome + ", " + numero + ")";
    }

    public void setNumero(int novonumero) {
        this.numero = novonumero;
    }
}
