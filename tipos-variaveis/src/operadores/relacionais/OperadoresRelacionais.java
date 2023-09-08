package operadores.relacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("número Um é igual a número Dois?  " +  simNao   );

        simNao = numero1 != numero2;

        System.out.println("número Um é diferente a número Dois?  " +  simNao   ); 
        
        simNao = numero1 > numero2;

        System.out.println("número Um é maior que número Dois?  " +  simNao   );

        String nomeUm = "DANIEL";
        String nomeDois = "DANIEL";

        System.out.println(nomeUm == nomeDois);

        nomeDois = new String("DANIEL");
        System.out.println(nomeUm.equals(nomeDois));

        //Para números usamos operadores relacionais, mas para objetos deve-se utilizar o método equals


        
    }
}
