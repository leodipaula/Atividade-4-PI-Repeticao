//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
//Faça um programa para coletar dados sobre o salário e idade de cada habitante, até que um salário negativo seja informado (indicará o fim da leitura de dados).
//Após as leituras, o programa deve informar: a) Média de salário da população. b) Média de idade. c) Percentual de pessoas com salário menor que R$ 800,00.

//A saída padronizada deverá ser: "O salario medio da populacao eh R$ S e a idade media eh I anos. O percentual da populacao com salario menor que R$ 800,00 eh X.".
//S, I e X devem aparecer com duas casas decimais. 
//Você deve prever um tratamento de dados para evitar divisões por zero e nesse caso o programa não imprime nada.

import java.util.Scanner;
  public class Programa {
    public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    double idade =0;
    double salario = 0;
    double media = 0;
    double cont = 0;
    double soma_sal = 0;
    double soma_idade = 0;
    double media_sal =0;
    double media_idade = 0;
    double sal_menor = 0;
    double perc_sal = 0;
    double cont2 = 0;
      
    // PROCESSAMENTO DOS DADOS
    do {
        salario = teclado1.nextDouble();
        
        if (salario > 0) {
        idade = teclado1.nextDouble();
        
        soma_sal += salario;
        soma_idade += idade;
        
        cont++;
        
            if (salario < 800) {
            
            sal_menor += salario;
            cont2++;
            }
      }
    } while (salario > 0);
    
    if (soma_sal != 0 && soma_idade != 0) {
    media_sal = soma_sal/cont;
    media_idade = soma_idade/cont;
    perc_sal = (cont2/cont)*100;
    
    System.out.printf("O salario medio da populacao eh R$ %.2f",media_sal);
    System.out.printf(" e a idade media eh %.2f", media_idade);
    System.out.printf(" anos. O percentual da populacao com salario menor que R$ 800,00 eh %.2f", perc_sal);
    System.out.print(".");
    }
  }
}
