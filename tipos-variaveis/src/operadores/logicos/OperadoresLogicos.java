package operadores.logicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdeira");
        }
        if(condicao1 && (10 > 8)){
            System.out.println("As 2 condições são verdaeiras");
        }

        System.out.println("Fim");
    }
}
