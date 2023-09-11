import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 900;
        double valorSolicitado = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seu saldo atual é de R$: " + saldo);

        System.out.println("Digite o valor do saque: ");
        valorSolicitado = scanner.nextDouble();


        if(valorSolicitado <= saldo){ //mais de uma estrutura/linha para uma condição deve inserir o bloco {}

            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é de R$ " + saldo);

        }else
            System.out.println("Saldo Insuficiente");
        

            
        
            
        
        
        
        
        
        



    }
}
