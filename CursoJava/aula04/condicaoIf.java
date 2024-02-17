package aula04;


//shift + alt + f = auto-identação, ou seja tudo


import java.util.Scanner;

public class condicaoIf{

    public static void main (String [] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite  o número do dia: ");
        int x =sc.nextInt();               // analisa e converte o input para integer
        String dia;

        if (x == 1) {                // não esquecer que  na comparação o sinal de igual é: ==
            dia = "domingo";         // aqui não estamos comparando e sim atribuiindo um valor a uma variavel
        }   else if (x == 2) {        // por isso que tem  um sinal = (igaul) unico
            dia = "segunda" ;
        }   else if (x == 3) {
            dia = "terça" ;
        }   else if (x == 4) {
            dia = "quarta" ;
        }   else if (x == 5) {
            dia = "quinta" ;
        }   else if (x == 6) {
            dia = "sexta" ;
        }   else if (x == 7) {
            dia = "sabado" ;
        } else {                    // o else é a ultima condição. quando não existe outra escolha
            dia = "valor invalido";
        }
         

        System.out.println( "Dia da semana:" + dia);

        sc.close();           // nunca esquecer de fechar o scanner


        


    }
}

