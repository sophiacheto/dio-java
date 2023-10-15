import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List <Livro> lista;

    CatalogoLivros () {
        lista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        lista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List pesquisarPorAutor(String autor) {
        List <Livro> livros = new ArrayList<>();

        for (Livro livro : lista)
            if (livro.getAutor().equalsIgnoreCase(autor))
                livros.add(livro);

        return livros;
    }

    public List pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List <Livro> livros = new ArrayList<>();
        
        for (Livro livro : lista)
            if (livro.getAno() <= anoFinal && livro.getAno() >= anoInicial)
                livros.add(livro);

        return livros;
    }

    public Livro pesquisarPorTitulo (String titulo) {        
        for (Livro livro : lista)
            if (livro.getTitulo().equalsIgnoreCase(titulo))
                return livro;
        
        Livro liv = null;
        return liv;
            
    }

}
