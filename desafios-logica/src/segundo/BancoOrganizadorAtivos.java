package segundo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    ArrayList < String > ativos = new ArrayList < > (quantidadeAtivos);

    // Entrada dos códigos dos ativos
    for (int i = 0; i<= quantidadeAtivos; i++) {
      //System.out.println("Ativo " + i+1 + ": ");
      ativos.add(scanner.nextLine());
    }
    scanner.close();

    //TODO: Ordenar os ativos em ordem alfabética.
    Collections.sort(ativos);
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for(String codigoAtivo : ativos){
      System.out.println(codigoAtivo);
    }
  }
}
