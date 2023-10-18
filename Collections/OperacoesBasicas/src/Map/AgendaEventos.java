import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    AgendaEventos() {
        agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agenda.put(data, new Evento(nome, atracao));
    }

    public void Exibir() {
        Map <LocalDate, Evento> eventoTree = new TreeMap<>(agenda);
        System.out.println(eventoTree);
    }

    public void proximoEvento() {
        // Set<LocalDate> datas = agenda.keySet();
        // Collection<Evento> eventos = agenda.values();

        LocalDate hoje = LocalDate.now();

        Map <LocalDate, Evento> eventoTree = new TreeMap<>(agenda);
        
        for (Map.Entry<LocalDate, Evento> dado : agenda.entrySet()) 
            if (dado.getKey().isEqual(hoje) || dado.getKey().isAfter(hoje)) {
                System.out.println(dado.getKey() + ", " + dado.getValue());
                break;
            }
    }
}
