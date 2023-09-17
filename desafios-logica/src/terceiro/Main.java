package terceiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Informe o saldo total: ");
    int saldoTotal = scanner.nextInt();
    //System.out.println("Informe o valor do saque: ");
    int valorSaque = scanner.nextInt();

    int saldo = saldoTotal - valorSaque;


    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    if(saldoTotal >= valorSaque){
        saldo = saldoTotal - valorSaque;
        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
    }else{
        System.out.println("Saldo insuficiente. Saque não realizado!");
    }
    
    }
}
