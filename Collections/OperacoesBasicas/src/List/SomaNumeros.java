import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List <Integer> numeros;

    SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for (int n : numeros) 
            soma += n;
        
        return soma;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;

        for (Integer n : numeros) 
            if (n < menor)
                menor = n;

        return menor;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;

        for (Integer n : numeros) 
            if (n > maior)
                maior = n;

        return maior;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }
}
