public class Livro {
    String titulo;
    String autor;
    int ano;

    Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }
    
    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

}
