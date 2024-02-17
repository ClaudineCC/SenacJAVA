package aula03;

import javax.swing.JOptionPane;  // importa biblioteda de interface grafica

public class Tabjswing {

 public static void main(String[] args) {

    int numero = 1;
    int y = 0;
    int resultado = 0;
    String mostrar1= " ";

    while(numero <=10){  // vamos fazer a tabuada de 01 a 10
        while(y<10){     // esse laço efetuara a tabuada  do numero que eu escolher
            y=y+1;
            resultado = numero*y; // Multiplicamos
            mostrar1= mostrar1 + "\n" + numero + " X " + y + " = " + resultado;

        }

        JOptionPane.showMessageDialog(null, "Tabuada do " + numero + mostrar1);  // exibe a tela de interface com o usuario.
        mostrar1="";
        y=0;
        numero = numero+1;





    }


    
 }


    
}
