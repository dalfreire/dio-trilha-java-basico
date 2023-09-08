package operadores;

import java.sql.Date;

public class Operadores{
    public static void main(String[] args) {
        
    //classe Operadores.java

    //Atrbiução
    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    //Date dataNascimento = new Date(); --> criação de um objeto

    //Aritiméticos
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    //Concatenção
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);
		
    //qual o resultado das expressoes abaixo?
    String concatenacao ="?"; 

    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);

  
}

    


    }
