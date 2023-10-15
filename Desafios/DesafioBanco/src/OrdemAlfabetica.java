import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdemAlfabetica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < String > ();

    // System.out.println("Quantos ativos?");
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();

    // Entrada dos códigos dos ativos
    for (int i = 1; i <= quantidadeAtivos; i++) {
        // System.out.println("Nome do ativo?");
        String nome = scanner.nextLine();
        ativos.add(nome);
    }

    // TODO: Ordenar os ativos em ordem alfabética.
    Collections.sort(ativos); 
    

    // TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (String ativo:ativos)
      System.out.println(ativo);
  }
}
