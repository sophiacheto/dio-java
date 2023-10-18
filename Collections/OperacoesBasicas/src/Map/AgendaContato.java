import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaMap;

    public AgendaContato() {
        agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        agendaMap.remove(nome);
    }

    public void Exibir() {
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome) {
        return agendaMap.get(nome);
    }
}
