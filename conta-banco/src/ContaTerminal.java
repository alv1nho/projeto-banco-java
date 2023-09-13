import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Exibir as mensagens para nosso usuário;
        //Obter pelo Scanner os valores digitados no terminal;
        //Exibir a mensagem "conta criada";
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o sobrenome do Cliente: ");
        String sobrenomeCliente = sc.next();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f já está disponível" +
                " para saque.",nomeCliente, sobrenomeCliente, agencia, numero, saldo);


    }
}