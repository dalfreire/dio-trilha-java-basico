package desafiosLogica;

import java.util.Scanner;
import java.util.Locale;

public class Desafio {
	
	
	public static void main(String[] args) {
		//Lê os valores de entrada
		Scanner leitorDeEntradas = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário: ");
		float valorSalario = leitorDeEntradas.useLocale(Locale.US).nextFloat();
		System.out.println("Informe o valor dos benefícios: ");
		float valorBeneficios = leitorDeEntradas.useLocale(Locale.US).nextFloat();
		
		//Calcula o valor do imposto de acordo com a faixa salarial
		float valorImposto = 0;
		if(valorSalario >= 0 && valorSalario <= 1100.00) {
			//Atribuiu a aliquota de 5% mediante o salário
			valorImposto = 0.05f * valorSalario;
		}
		else if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
			//Atribuiu a aliquota de 10% mediante o salário
			valorImposto = 0.10f * valorSalario;
		}
		else {
			//Atribuiu a aliquota de 15% mediante o salário
			valorImposto = 0.15f * valorSalario;
		}
		
		
		//Calcule e imprima a Saída (com 2 casas decimais)
		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println(String.format("O valor a receber será R$ %.2f", saida));
	}
	}