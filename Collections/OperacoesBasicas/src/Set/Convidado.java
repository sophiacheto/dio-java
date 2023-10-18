public class Convidado {
    private String nome;
    private int codigo;

    Convidado(String nome, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "(" + nome + ", " + codigo + ")";
    }
}
