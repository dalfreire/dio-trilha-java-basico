package desafio_ultima_transaçao;

import java.util.Scanner;

public class Desafio {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.

    System.out.println("Por favor, insira a data, hora, descrição e valor da transação, separados por vírgulas");
    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    // Verificando se o usuário forneceu todas as informações necessárias
    
    if(partes.length < 4) {
    	System.out.println("Por favor, forneça todas as informações necessárias para a transação");
    }else {
    	String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);
        
        Transacao transacao = new Transacao(data, hora, descricao, valor);
        
        transacao.imprimir();
    }
    return;
   
    }
    
  }

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  
  public String getData() {
	return data;
}


public void setData(String data) {
	this.data = data;
}


public String getHora() {
	return hora;
}


public void setHora(String hora) {
	this.hora = hora;
}


public String getDescricao() {
	return descricao;
}


public void setDescricao(String descricao) {
	this.descricao = descricao;
}


public double getValor() {
	return valor;
}


public void setValor(double valor) {
	this.valor = valor;
}


public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}