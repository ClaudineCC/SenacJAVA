package aula04;


//shift + alt + f = auto-identação, ou seja tudo


import java.lang.Math;

public class testmath {

    public static void main (String [] args){


        double a = 4.3;
        double b = 10;
    
        System.out.println(Math.PI); //constante de PI
        System.out.println(Math.E); // constante de Euler

        System.out.println(Math.ceil(a));          //arredonda para cima
        System.out.println(Math.floor(a));         //arredonda para baixo
        System.out.println(Math.max(a ,b));        //mostra o numero maior entre dois
        System.out.println(Math.min (a, b));       // mostra o numero menor entre dois
        System.out.println(Math.sqrt (4));       //mostra a raiz quadrada
        System.out.println(Math.pow (5, 2));   //potenciação   
        System.out.println(Math.round(Math.random( ) * 100));  //round arredonda e random pega um numero aleatorio numa faixa.
        

        




    }
}


