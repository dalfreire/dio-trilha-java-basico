public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                //break //interrompe a iteração
                continue; //continue a iteração saltando a condição if
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ? R.: 1, 2 no break e 1, 2, 4 e 5 no continue
    }
}
