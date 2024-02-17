package aula02;

import java.util.Scanner;

public class SubstituirLetra {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);

        System.out.println(" Digite uma frase : ");

        String frase = sc.nextLine();

        String novaFrase = frase.replace("a", "e");  // o replace troca uma palavra  ou letra por outra depois da virgula. ou seja trocaremos a letra a por e
        String novaFrase1 = frase.replace("i", "u");  // replace troca agora a letra i pela letra u
    
        System.out.println("Frase modificada : " + novaFrase + novaFrase1);


        sc.close();


    }
}
