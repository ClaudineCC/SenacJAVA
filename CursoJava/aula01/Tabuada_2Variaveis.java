public class Tabuada_2Variaveis {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            // Usar if para adicionar um zero à esquerda se i for menor que 10
            if (i < 10) {
                System.out.print("0" + i + "|");
            } else {
                System.out.print(i + "|");
            }
            // Usar um loop for para imprimir os valores das multiplicações de 2 a 10
            for (int j = 2; j <= 10; j++) {
                // Usar if para adicionar um zero à esquerda se o produto for menor que 10
                if (i * j < 10) {
                    System.out.print("0" + i * j + "|");
                } else {
                    System.out.print(i * j + "|");
                }
            }
            // Usar o método System.out.println() para mudar de linha após cada iteração
            System.out.println();
        }

    }
} // Fechar a classe com uma chave