package aula04;

import java.util.Scanner;

public class condicaocase {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o numero do dia: ");
        int x = sc.nextInt( );     // nextint analisa a entrada transformando em inst

        String dia;

        switch (x) {              // no switch case é obrigatorio inserir o comando break, sen nao usar vai assumir o valor abaixo, ate encontrar o proximo break ou default
            case 1:
            dia = "domingo";
            break;
            case 2:
            dia = "segunda";
            break;
            case 3:
            dia = "terça";
            break;
            case 4:
            dia = "quarta";
            break;
            case 5:
            dia = "quinta";
            break;
            case 6:
            dia = "sexta";
            break;
            case 7:
            dia = "sabado";
            break;
            default :
            dia = "valor inválido";
            break;
        }

        System.out.println( "Dia da semana:" + dia);
        sc.close();
        
    }
    

}
