package operadores.ternario;

public class OperadorTernario{
    public static void main(String[] args) {
        
        // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

        
        int a, b;

        a = 6;
        b = 6;
        String resultado =  ""; 

// EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);


    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        resultado = (a==b) ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }

}