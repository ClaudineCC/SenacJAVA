package aula02;

import java.util.Scanner;

public class ExibirLetras {


    public static void main (String [] args){


        Scanner sc = new Scanner (System.in);
        System.out.println(" Digite uma palavra :");
        String palavra = sc.nextLine();  // no caso da string, usa -se Line


        for(int i=0; i <  palavra.length(); i++) {      //lenght retorna o tamanho do conteudo da string

            char letra = palavra.charAt(i);      // charAt captura uma letra em alguma posição


            System.out.println(letra);

            
        }

        System.out.println(" A palavra " + palavra + " tem " +palavra.length() + " letras.");

        sc.close();
    }

    
}
