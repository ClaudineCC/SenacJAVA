public class Tabuada_ifPraCaralho {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print("0" + i + "|");
            } else {
                System.out.print(i + "|");
            }

            // Verificar se 2*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (2 * i < 10) {
                System.out.print("0" + 2 * i + "|");
            } else {
                System.out.print(2 * i + "|");
            }
            // Verificar se 3*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (3 * i < 10) {
                System.out.print("0" + 3 * i + "|");
            } else {
                System.out.print(3 * i + "|");
            }
            // Verificar se 4*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (4 * i < 10) {
                System.out.print("0" + 4 * i + "|");
            } else {
                System.out.print(4 * i + "|");
            }

            // Verificar se 5*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (5 * i < 10) {
                System.out.print("0" + 5 * i + "|");
            } else {
                System.out.print(5 * i + "|");
            }

            // Verificar se 6*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (6 * i < 10) {
                System.out.print("0" + 6 * i + "|");
            } else {
                System.out.print(6 * i + "|");
            }

            // Verificar se 7*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (7 * i < 10) {
                System.out.print("0" + 7 * i + "|");
            } else {
                System.out.print(7 * i + "|");
            }

            // Verificar se 8*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (8 * i < 10) {
                System.out.print("0" + 8 * i + "|");
            } else {
                System.out.print(8 * i + "|");
            }

            // Verificar se 9*i tem menos de dois dígitos e, nesse caso, adicionar um zero à esquerda
            if (9 * i < 10) {
                System.out.print("0" + 9 * i + "|");
            } else {
                System.out.print(9 * i + "|");
            }

           
            // Usar o método System.out.println() para pular uma linha a cada passada do for
            System.out.println();

        }

    }

}