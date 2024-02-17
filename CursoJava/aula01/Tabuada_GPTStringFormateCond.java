public class Tabuada_GPTStringFormateCond {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {

      System.out.println(String.format("%02d", i) + "|" + String.format("%02d", 2 * i) + "|"
          + String.format("%02d", 3 * i) + "|" + String.format("%02d", 4 * i) + "|" + String.format("%02d", 5 * i) + "|"
          + String.format("%02d", 6 * i) + "|" + String.format("%02d", 7 * i) + "|" + String.format("%02d", 8 * i) + "|"
          + String.format("%02d", 9 * i));

    }
    System.out.println();

    for (int i = 1; i <= 10; i++) {

      System.out.println(
          (i < 10 ? "0" + i : i) + "|" + (2 * i < 10 ? "0" + 2 * i : 2 * i) + "|" + (3 * i < 10 ? "0" + 3 * i : 3 * i)
              + "|" + (4 * i < 10 ? "0" + 4 * i : 4 * i) + "|" + (5 * i < 10 ? "0" + 5 * i : 5 * i) + "|"
              + (6 * i < 10 ? "0" + 6 * i : 6 * i) + "|" + (7 * i < 10 ? "0" + 7 * i : 7 * i) + "|"
              + (8 * i < 10 ? "0" + 8 * i : 8 * i) + "|" + (9 * i < 10 ? "0" + 9 * i : 9 * i));

    }

  }
}
// método String.format(). Esse método permite especificar o formato de cada
// valor usando uma sequência de caracteres chamada de especificador de formato.
// Por exemplo, o especificador de formato "%02d" significa que o valor deve ser
// um número inteiro (d) com dois dígitos (02) e que se o valor tiver menos de
// dois dígitos, ele deve ser preenchido com zeros à esquerda (0).