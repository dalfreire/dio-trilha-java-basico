package desafio_cofres_seguros;

import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
    
    }
    
  }


class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }
  public void pedirSenha(int senha) {
	  this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
	  if(this.senha != confirmacaoSenha) {
		  imprimirInformacoes();
		  System.out.println("Senha incorreta!");
	  } else { 
		  imprimirInformacoes();
		  System.out.println("Cofre aberto!");}
	  return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class DesafioCofre {
  public static void main(String[] args) {
	  
	  CofreFisico cf = new CofreFisico();
	  CofreDigital cd = new CofreDigital(0);
	  
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
    	cd.pedirSenha(scanner.nextInt());
    	cd.validarSenha(scanner.nextInt());
    	
    	
    }
    else {
    	cf.imprimirInformacoes();
    }
}
}