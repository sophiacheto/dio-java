import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List <Pessoa> lista;

    public void adicionarPessoa(String nome, int idade, double altura) {
        lista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List <Pessoa> pessoasPorIdade = new ArrayList<>(lista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List <Pessoa> pessoasPorAltura = new ArrayList<>(lista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
