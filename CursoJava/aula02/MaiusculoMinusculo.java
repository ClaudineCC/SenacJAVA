package aula02;

import java.util.Scanner;

public class MaiusculoMinusculo {

    public static void main(String[] args) {
        

    Scanner sc = new Scanner (System.in);


    System.out.println("Digite uma frase: " ) ;
    String frase = sc.nextLine();

    String fraseMinuscula = frase.toLowerCase();  // metodo equaliza maiusculas e minusculas na frase. aqui a variavel é para minusculo
    
    System.out.println( "Frase minuscula " + fraseMinuscula);


    String fraseMaiuscula = frase.toLowerCase();  // metodo equaliza maiusculas e minusculas na frase. aqui a variavel é para minusculo
    
    System.out.println( "Frase maiuscula " + fraseMaiuscula);

    sc.close();


    }
    
}
