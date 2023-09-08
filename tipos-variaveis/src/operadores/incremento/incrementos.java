package operadores.incremento;

public class incrementos{

    public static void main(String[] args) {
        int numero = 5;
        //x repetições
        //a expressão numero = numero +1 é igual a numero++

        System.out.println(numero);

        numero++;

        System.out.println(numero);
        System.out.println(numero ++); //imprime a variável e incrementa após a impressão
        System.out.println(numero); //ao imprimir a variável novamente ela está incrementada
        System.out.println(++ numero); //primeiro incrementa e depois imprime o número
        System.out.println(numero --);
        System.out.println(numero);
        System.out.println(-- numero);

        boolean variavel = true;

        System.out.println(!variavel); //Em memória o valor da variável é true, mas antes de imprimi eu fiz uma negação
        System.out.println(variavel);

        variavel = !variavel; //Quando faço nova atribuição eu altero o valor da variável na memória
        System.out.println(variavel);


    }
}