import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List <Integer> lista;

    OrdenacaoNumeros() {
        lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(lista);
    }

    public void ordenarDescendente() {
        lista.sort(Collections.reverseOrder());
    }

    public String toString() {
        return lista.toString();
    }


    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        System.out.println(numeros);

        numeros.ordenarAscendente();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros);

        numeros.ordenarDescendente();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros);
    
      }
}
