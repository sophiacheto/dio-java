public class Evento {
    private String nome;
    private String atracao;

    Evento(String nome, String atracao) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public String getNome() {
        return nome;
    }
}
