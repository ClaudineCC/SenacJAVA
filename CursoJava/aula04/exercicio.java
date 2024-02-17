package aula04;

 //fomos contratados por uma empresa de assistencia medica para automatizar o processo de atendimento eletronico.
    // as opções serão:
    // 1 - marcação de consultas/exames;
     //a- Marcar consulta 
     //b- Marcar exame
     //c- Cancelar consulta
     //d- Cancelar exame

    // 2- financeiro;
    // a- Segunda via
    // b- Atualizar cadastro;

    // 3- cancelamento;
    // a- Cancelar plano

    // 4- rede autorizada;
    // a- Presquisa por região
    // b- Pesquisa por especialidade
    // c- Pesquisa por médico

    // 5- outros assuntos
    // a- Reclamações
    // b- Elogios

    import java.util.Scanner;

    public class exercicio {

      public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        System.out.println( "1 -para marcação de consultas, 2- para financeiro, 3- para cancelamento; 4- rede autorizada; 5- outros assuntos" );
        

        int x = sc.nextInt( );     // nextint analisa a entrada transformando em inst
        String opcao;
        

        if (x == 1) {                // não esquecer que  na comparação o sinal de igual é: ==
            opcao = "marcacao de consultas/exames";         // aqui não estamos comparando e sim atribuiindo um valor a uma variavel
        }   else if (x == 2) {        // por isso que tem  um sinal = (igaul) unico
            opcao = "financeiro" ;
        }   else if (x == 3) {
            opcao = "cancelamento" ;
        }   else if (x == 4) {
            opcao = "rede autorizada" ;
        }   else if (x == 5) {
            opcao = "outros assuntos" ;
        } else {                    // o else é a ultima condição. quando não existe outra escolha
           opcao = "valor invalido";

           System.out.println(" Você digitou : " + opcao);

           System.out.println(" Você digitou : " + opcao);

            String opcao2; 

            switch (opcao2) {              // no switch case é obrigatorio inserir o comando break, sen nao usar vai assumir o valor abaixo, ate encontrar o proximo break ou default
            case a:
            opcao2 = "Marcar Consulta";
            break;
            case b:
            opcao2 = "Marcar exame";
            break;
            case c:
            opcao2 = "Cancelar consulta";
            break;
            case d:
            opcao2 = "Cancelar exame";
            break;
            default :
            opcao2 = "valor inválido";
            break;
        }

        String opcao3; 

            switch (opcao3) {              // no switch case é obrigatorio inserir o comando break, sen nao usar vai assumir o valor abaixo, ate encontrar o proximo break ou default
            case a:
            opcao3 = "Segunda via";
            break;
            case b:
            opcao3 = "Atualizar cadastro";
            break;
            default :
            opcao3= "valor inválido";
            break;
        }

        String opcao4; 

            switch (opcao4) {              // no switch case é obrigatorio inserir o comando break, sen nao usar vai assumir o valor abaixo, ate encontrar o proximo break ou default
            case a:
            opcao4 = "Pesquisa por região";
            break;
            case b:
            opcao4 = "Pesquisa por especialidade";
            break;
            case c:
            opcao4 = "Pesquisa por medico";
            break;
            default :
            opcao4= "valor inválido";
            break;
        }


        String opcao5; 

            switch (opcao5) {              // no switch case é obrigatorio inserir o comando break, sen nao usar vai assumir o valor abaixo, ate encontrar o proximo break ou default
            case a:
            opcao5 = "Reclamações";
            break;
            case b:
            opcao5 = "Elogios";
            break;
            default :
            opcao4= "valor inválido";
            break;
        }


      System.out.println("Voce digitou : " + );



        sc.close();


    }

}


