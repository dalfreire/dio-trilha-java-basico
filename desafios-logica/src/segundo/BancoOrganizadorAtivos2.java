package segundo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de nomes
        System.out.print("Quantos nomes deseja inserir? ");
        int quantidadeNomes = scanner.nextInt();

        // Cria uma lista para armazenar os nomes
        ArrayList<String> nomes = new ArrayList<>(quantidadeNomes);

        // Lê os nomes do usuário
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println("Nome " + (i + 1) + ": ");
            nomes.add(scanner.next());
        }

        // Ordena os nomes em ordem alfabética
        Collections.sort(nomes);

        // Imprime os nomes em ordem alfabética
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
