package quarto;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");        
   
        double valorInicial = scanner.nextDouble(); 
        double taxaJuros = (scanner.nextDouble());
        
        int periodo = scanner.nextInt();
        System.out.println(" taxa de juros : " + taxaJuros);
        double valorFinal = valorInicial * Math.pow( 1 + taxaJuros, periodo) ;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        //scanner.close();
    }
}
