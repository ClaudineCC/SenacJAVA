package aula02;

import java.util.Scanner;

public class CalculadoraDelta {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print ( "Digite o valor de A :" );
        double a = sc.nextDouble();

        System.out.print(" Digite o valor de B : ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C = ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) -4 *a*c;   // pow = calcula exponenciação de um numero, "2" , elevando ao quadrado

        System.out.println(" O valor de delta é " + Math.round(delta));  // round arredonda o valor

        sc.close();


    }
    
   

}
