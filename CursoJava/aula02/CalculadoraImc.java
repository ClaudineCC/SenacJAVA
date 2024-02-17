package aula02;

import java.util.Scanner;



public class CalculadoraImc {

   
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print ( "Digite o peso em Quilograma :" );
        double peso = sc.nextDouble();

        System.out.print ( "Digite a altura em metros : " );
        double altura = sc.nextDouble();


        double imc = peso / (altura * altura);

        System.out.println (" O IMC é : " + imc) ;  // trara numero infinito depois da virgula

        System.out.println (" O IMC é : " + Math.round (imc)) ;  // conta matematica para arrendondar a divisão

       
        sc.close();



    }


}
