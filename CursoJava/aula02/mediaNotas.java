package aula02;

import java.util.Scanner;          //  importa biblioteca que permite digitar uma variavel


public class mediaNotas{

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);         // declara o componente do imput

        
        System.out.print(" Digite a primeira nota ");    // 
        double nota1 = scanner.nextDouble();

        System.out.print(" Digite a segunda nota ");
        double nota2 = scanner.nextDouble();

        System.out.print(" Digite a terceira nota ");
        double nota3 = scanner.nextDouble();


        double mediaNotas = (nota1 + nota2 + nota3) / 3;    // soma das medias e divide por 3


        System.out.println("A media das notas é : " + mediaNotas) ;  // concatenar com a variavel para fazer o calculo

        scanner. close();           // obrigatorio fechar o scanner


        }


}
