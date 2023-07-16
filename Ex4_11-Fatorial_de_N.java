//Escreva um programa para calcular N! (fatorial de N). N! = N x (N-1) x (N-2) x ... x 2 x 1.
//Contudo, o valor a ser mostrado deve estar limitado a 1 milhão (por conta de restrição de memória do hardware em que o programa será usado). 

//A entrada do programa é um inteiro N e a saída do programa deverá ser:
//"O fatorial de N eh X.", com N e X inteiros e caso X seja até 1 milhão. 
//Caso contrário a saída será: "Impossivel calcular com as restricoes de hardware.".

//Lembre-se que o fatorial de zero é 1 e caso um número negativo seja inserido o seu programa não deve retornar nada.

import java.util.Scanner;
  public class Programa {
    public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n =0;
    int m = 1;
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    if (n == 0) {
      System.out.print("O fatorial de 0 eh 1.");  
    
    } else if (n > 0) {
      for (double i = 1; i <= n; i++) {
        m *= i;
    
      }
      if (m > 1000000) {
        System.out.print("Impossivel calcular com as restricoes de hardware.");

      } else {
        System.out.print("O fatorial de "+n+" eh "+m+".");
      }
    }
  }
}
