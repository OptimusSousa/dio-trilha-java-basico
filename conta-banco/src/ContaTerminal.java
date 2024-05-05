import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // To do: Conhecer e imprimir a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Olá!");

        System.out.println("Por favor, digite o número da sua Conta bancária:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.next();

        System.out.println("Informe o seu saldo bancário:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da sua conta é " + conta + " e o seu saldo é de R$ " + saldo + ". Este saldo já está disponível para saque.");
    }
}
