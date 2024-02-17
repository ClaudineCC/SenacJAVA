import java.text.NumberFormat;
import java.util.Locale;

public class Tabuada_GPTNumberFormat {
    public static void main(String[] args) {

        // Criar um objeto Locale para o Brasil
        Locale localeBR = new Locale("pt", "BR");
        // Criar um objeto NumberFormat para formatar os números com dois dígitos
        NumberFormat nf = NumberFormat.getNumberInstance(localeBR);
        // Definir o formato como #,##
        nf.setMinimumIntegerDigits(2);
        nf.setMinimumFractionDigits(0);

        for (int i = 1; i <= 10; i++) {
            // Usar o método format para formatar os números e imprimir na tela
            System.out.print(nf.format(i) + "|");
            System.out.print(nf.format(2 * i) + "|");
            System.out.print(nf.format(3 * i) + "|");
            System.out.print(nf.format(4 * i) + "|");
            System.out.print(nf.format(5 * i) + "|");
            System.out.print(nf.format(6 * i) + "|");
            System.out.print(nf.format(7 * i) + "|");
            System.out.print(nf.format(8 * i) + "|");
            System.out.print(nf.format(9 * i) + "|");
            System.out.print(nf.format(10 * i) + "|");
            // Pular uma linha a cada passada do for
            System.out.println();
        }

    }
}
 //GUI interace grafica - PACOTES/BIBLIOTECA : componentes: JFrame,Jlabel, JtextField, JButton, JChekBox, JComboBox, JList, JPanel
 // PACOTE - CONJUNTO DE COMPONENTES
 //FRAMEWORK =  AUXILIA O PROGRAMADOR = REACT - FRONT E NODE - BACK (.TRABALHA DENTRO). SPRINGBOOT 