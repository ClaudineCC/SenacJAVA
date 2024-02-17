package aula02;


import java.util.Scanner;

public class SubstituirLetra2 {

    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    String frase = sc.nextLine();

    String novaFrase = "";


    for (int i=0; i< frase.length(); i++){
        char letra = frase.charAt(i);

        if(letra == 'a'){
            novaFrase += 'e';}
            else if (letra == 'A'){
                novaFrase += 'E';
            }
        


        //if (letra == 'a' || letra == 'A'){   //  o pipe pipe significa "ou" .
          //  novaFrase += 'e';
       // }
          else {
        novaFrase += letra;
    }

}
        System.out.println("Frase modificada = "  + novaFrase);

    

    sc.close();
    
    
    }

}