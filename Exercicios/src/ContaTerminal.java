import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o número da sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o seu saldo atual");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " reais já está disponível para saque.");
    }
}
