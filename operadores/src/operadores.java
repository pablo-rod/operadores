import java.util.Date;

import javax.xml.crypto.Data;

public class operadores {
    public static void main(String[] args)  {
        
        // // Atribuição
        // String name = "Pablo";
        // int idade = 26;
        // double peso = 93.9;
        // char sexo = 'M';
        // // o tipo char só permite um único caracter em aspas simples
        // boolean doador = false;
        // Date datadeNascimento = new Date(); 

        // // Aritméticos
        // double soma = 10.5 + 10.7;
        // int subtracao = 113 - 25;
        // int multiplicacao = 3 * 3;
        // int divisao = 15 / 3;
        // int modulo = 18 % 3;
        // // resto

        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // int numero = 5;
        // numero = - numero;
        // System.out.println(numero);
        // numero = - numero;
        // System.out.println(numero);

        // int a, b;
        // a = 6;
        // b = 6;

        // String resultado = a==b ? "Verdadeiro" : "Falso";

        // ao invés de usar o seguinte bloco de código

        // if (a==b) 
        //     resultado = "Verdadeiro";
        // else 
        //     resultado = "Falso";

        // System.out.println(resultado);

        boolean cond1 = true;
        boolean cond2 = false;
        
        if (cond1 && (7 > 4)) {
            System.out.println("Condição verdadeira");
        } 
        else if (cond1 || cond2) {
            System.out.println("Condição verdadeira");
        }

        System.out.print("Fim");
    }
}
