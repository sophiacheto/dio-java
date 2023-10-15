import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List <Tarefa> lista;

    ListaTarefas() {
        this.lista = new ArrayList <>();
    }


    public void adicionarTarefa(String descricao) {
        lista.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao) {
        List <Tarefa> paraRemover = new ArrayList<>();

        for (Tarefa tarefa : lista) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                paraRemover.add(tarefa);
        }

        lista.removeAll(paraRemover);
    }


    public int obterNumeroTotalTarefas() {
        return lista.size();
    }


    public void obterDescricoesTarefas() {
        System.out.println(lista);
    }


    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefas listaTarefa = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
    
        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");
    
        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
      }
}
