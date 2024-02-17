package aula04;

public class teststring {
    public static void main (String [] args){

       
       
        String nome = "Jose Manuel";
        String sobrenome = "silva";
        String fruta = "ABACATE";
        String frase = " eu gosto de abacate";
       

        System.out.println(nome);                      // retorna nome
        System.out.println(nome.length());             // retorna o tamanho da variavel
        System.out.println(nome.charAt(5));      // retorna a posição desejada
        System.out.println(sobrenome.toUpperCase());   // retorna letra minuscula em maiuscula
        System.out.println(fruta.toLowerCase());       // retorna letra maiuscula em minuscula
        System.out.println(frase.substring(6, 12));   // parte da string "entre". ordem crescente

        String legume = "   cenoura e batata   ";
        System.out.println(legume.length());      // retorna o tamanho total da string
        String legumeNovo = legume.trim();        //trim elimina os espaços em branco
        System.out.println(legumeNovo.length()); 
        System.out.println(legume.replace("batata", "beterraba"));    // substitui/ troca uma palavra pela outra. ou conteudo por outro dentro de uma string

        String x=" ";
        int a = 11;
        long b = 222;
        float c = 3333;
        double d = 4.4444;
        x=x + String.valueOf(a) + " - ";
        x=x + String.valueOf(b) + " - ";
        x=x + String.valueOf(c) + " - ";
        x=x + String.valueOf(d) ;
        System.out.println("Valores convertidos");
        System.out.println(x);
    // o VALUEOF transforma uma serie de variaveis numericas de String


     String frase2 = "eu gosto de lasanha com frango";
     System.out.println(frase2.indexOf("frango"));
     // indexOf retorna a posição inicial








    }
    

}
