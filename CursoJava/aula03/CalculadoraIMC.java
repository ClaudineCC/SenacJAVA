package aula03;


// Dados de entrada = peso e altura
// Dados de processamento = Calculo : imc = peso / (altura * altura)
// Dados de saida = exibir os resultados


import javax.swing.JOptionPane;


public class CalculadoraIMC {

       public static void main (String [] args){

        
        int peso;
        double altura;
        double imc;
        
   


       peso = Integer.parseInt(JOptionPane.showInputDialog(  "Digite o peso em Quilogramas :" ));
        
       altura =Double.parseDouble(JOptionPane.showInputDialog ("Digite a altura em metros : " ));


       
       imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, " Resultado numero inteiro");
        JOptionPane.showMessageDialog(null, " O IMC é : " + Math.round ( imc) ) ;  // trara numero inteiro
        

        JOptionPane.showMessageDialog(null, " Resultado numero infinito apos a virgula");
        JOptionPane.showMessageDialog(null, " O IMC é : " +  imc) ;  // trara numero infinito depois da virgula
        


        if ( imc < 20 ){        
            JOptionPane.showMessageDialog(null, " Abaixo do peso");
            }
            else if  ( imc > 20 && imc < 25 ) {
               JOptionPane.showMessageDialog(null, " Peso Ideal");
            }               
                else if  (imc > 25 && imc < 30) {                  
                JOptionPane.showMessageDialog(null, " Sobrepeso");
            }
            else if  (imc > 30 && imc < 35) {                  
                JOptionPane.showMessageDialog(null, " Obesidade Moderada");
            }
            else if  (imc > 35 && imc < 40) {                  
                JOptionPane.showMessageDialog(null, " Obesidade Severa");
            }
            else if  (imc > 40 && imc < 45) {                  
                JOptionPane.showMessageDialog(null, " Obsedidade Morbida");
            }
            else   {                  
                JOptionPane.showMessageDialog(null, " Super Obsidade");
            }


        }

    }

        


    // <20 - Abaixo do Peso
    // 20 a 25 - Peso Ideal
    // 25 a 30 - SobrePeso
    // 30 a 35 - Obesidade Moderada
    // 35 a 40 - Obesidade Severa
    // 40 a 50 - Obesidade Mórbida
    // >50 - Super Obesidade
        
        
        

              


        
    