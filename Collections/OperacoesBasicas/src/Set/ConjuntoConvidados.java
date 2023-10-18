import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> lista;

    ConjuntoConvidados() {
        lista = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        lista.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo) {
        for (Convidado pessoa : lista)
            if (pessoa.getCodigo() == codigo) {
                lista.remove(pessoa);
                break;
            }

    }

    public int contarConvidados() {
        return lista.size();
    }

    public void exibirConvidados() {
        System.out.println(lista);
    }
    
    public static void main(String[] args) {
        System.out.println('o');
    }
}
