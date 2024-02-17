public class Tabuada3a {// primeira tentativa coloca 0 em tudo pq o if tá no contador e não no resultado
   public static void main(String[] args) {

      for (int i = 1; i <= 10; i++) {
         if (i <= 9) {
            System.out.println(i + "|" + "0" + 2 * i + "|" + "0" + 3 * i + "|" + "0" + 4 * i + "|" + "0" + 5 * i + "|"
                  + "0" + 6 * i + "|" + "0" + 7 * i + "|" + "0" + 8 * i + "|" + "0" + 9 * i);
         } else {
            System.out.println(i + "|" + 2 * i + "|" + 3 * i + "|" + 4 * i + "|" + 5 * i + "|" + 6 * i + "|" + 7 * i
                  + "|" + 8 * i + "|" + 9 * i + "|" + 10 * i + "|");
         }

      }

   }
}