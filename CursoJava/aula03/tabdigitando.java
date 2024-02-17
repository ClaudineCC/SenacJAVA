package aula03;

import javax.swing.JOptionPane;

public class tabdigitando {

    public static void main(String[] args) {
        String resultado ;  // aqui sera o resultado da tabuada
        String numero;      // o numero a ser informado
        int cont;       // contador de 01 a 10
        int n;           // aqui convertemos para int o que foi digitado na variavel numero

        try{ 
            numero = JOptionPane.showInputDialog("Digite o numero ao qual sera feito a tabuada:  ");  // INPUT - ENTRADA digitamos o numero que queremos efetuar a tabuada
            n= Integer.parseInt(numero);  // PROCESSAMENTO - converte o string em int, para poder operar com ele
            resultado = " ";        // SAIDA iniciamos a variavel Resultado como vazia, pois iremos concatenando os resultados a medida que forem calculados
                                    
            for (cont = +1; cont <=10; cont ++){  
                resultado += "\n" + cont + "x" + n + " = " + cont * n;

            }

            JOptionPane.showMessageDialog(null, "Tabuada do " + n + resultado); // mostramos a mensagem com a tabuado no dialogo
            resultado = " ";

        }
        catch (Exception e ) {           // se algum erro acontecer no try, o catch ira executar
            JOptionPane.showMessageDialog(null, " Digite so o numero inteiro");  // mostramos essa msg se o usuario digitar algo diferente de numero inteiro
            JOptionPane.showMessageDialog(null, "Erro!  Tente novamente. ");   // podemos exibir alerta apos alerta, como nesse exemplo
            JOptionPane.showMessageDialog(null, " Mais uma vez !");

        }

        
    }
    
}
