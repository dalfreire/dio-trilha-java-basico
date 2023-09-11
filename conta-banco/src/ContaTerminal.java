import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            double saldo = 237.48;

            System.out.println("Por favor, digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Por favor, digite o seu sobrenome: ");
            String sobrenome = scanner.next();
 
            System.out.println("Por favor, digite o número da sua Agência: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua Conta: ");
            int conta = scanner.nextInt();

            System.out.println("Olá " + nome + " " + sobrenome + "!, obrigado por criar uma conta em nosso banco." );
            System.out.println("O número de sua agência é " + agencia + ", da sua conta é " + conta);
            System.out.println("e seu saldo de  R$ " + saldo + " já está de disponivel para saque.");






    }
}
