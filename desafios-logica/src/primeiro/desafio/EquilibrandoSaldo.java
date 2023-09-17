package primeiro.desafio;

import java.util.Scanner;
import java.util.Locale;

public class EquilibrandoSaldo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu saldo atual: ");
		double saldoAtual = scanner.useLocale(Locale.US).nextDouble();
		System.out.println("Informe o valor que deseja depositar: ");
		double valorDeposito = scanner.useLocale(Locale.US).nextDouble();
		System.out.println("Informe o valor que deseja retirar: ");
		double valorRetirada = scanner.useLocale(Locale.US).nextDouble();
		
		//TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
		double saldoAtualizado = (saldoAtual + valorDeposito) - valorRetirada;
		if(valorRetirada > saldoAtual + valorDeposito) {
			System.out.println("Saldo insuficiente");
		}
		else {
			
			System.out.println(String.format("saldo atualizado na conta: %.1f" , saldoAtualizado));
			
		}
	}
}