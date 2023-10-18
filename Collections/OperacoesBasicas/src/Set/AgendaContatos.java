import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set <Contato> agenda;

    AgendaContatos() {
        agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultados = new HashSet<>();

        for (Contato pessoa : agenda)
            if (pessoa.getNome().startsWith(nome))
                resultados.add(pessoa);

        return resultados;
    }

    public void atualizarNumeroContato(String nome, int novonumero) {
        for (Contato pessoa : agenda) 
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                pessoa.setNumero(novonumero);
                break;
            }
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }
}
