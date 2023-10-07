package desafio_herança_bancaria;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DesafioHerançaBancaria {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    String titular = scanner.next();
    int numeroConta = scanner.nextInt();
    double saldo = scanner.useLocale(Locale.US).nextDouble();
    double taxaJuros = scanner.useLocale(Locale.US).nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
  }
}

class ContaBancaria {
  protected int numero;
  protected String titular;
  protected double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void exibirInformacoes() {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    System.out.println(titular);
    System.out.println(numero);
    System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    
  }
}

class ContaPoupanca extends ContaBancaria {
  
	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
		
	}

	private double taxaJuros;

  public void ContaPoupanca() {
	  
    //TODO: Implementar adequadamente esta sobrecarga de construtores.
  }

  public void exibirInformacoes() {
    super.exibirInformacoes();
    //System.out.println("Taxa de Juros: " + taxaJuros);
    System.out.println("Taxa de juros: " + taxaJuros+"%");
    //TODO: Complementar as informações com a taxa de juros.
  }
}