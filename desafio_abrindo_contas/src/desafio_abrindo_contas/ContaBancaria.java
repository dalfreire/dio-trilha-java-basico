package desafio_abrindo_contas;

import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {

  int numero;
  String titular;
  double saldo;

  public void ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
  
	  public static void main(String[] args) {
	    // Lendo os dados de Entrada:
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Informe o nome do titular: ");  
		String nomeTitular = scanner.nextLine();
	    
		System.out.println("Informe o número da conta: ");  
	    int numeroConta = scanner.nextInt();
	    
		System.out.println("Informe o saldo da conta: ");  
		scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
	    
	    double saldo = scanner.useLocale(Locale.US).nextDouble();

	    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
	    
	    ContaBancaria conta = new ContaBancaria();
	    
	    conta.numero = numeroConta;
	    conta.titular = nomeTitular;
	    conta.saldo = saldo;
	    
	    System.out.println("Informacoes:");
	    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
	    
	    System.out.println("Conta: " + conta.numero);
	    System.out.println("Titular: " + conta.titular);
	    System.out.println(String.format("Saldo: R$ %.2f", conta.saldo));
  
	  }
	}
  
  


