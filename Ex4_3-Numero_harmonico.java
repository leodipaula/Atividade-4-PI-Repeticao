//Em matemática, o número harmônico designado por Hn define-se como o enésimo termo da série harmônica. 
// Ou seja: Hn=1+1/2+1/3+1/4+...+1n

//Implemente um algoritmo que calcule o valor de qualquer Hn.
//PS: O Hn deve ser arredondado para UMA casa decimal.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n =0;
    double soma = 0;
    double h = 0;
    
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    
    for (double i = 1; i <= n; i++) {
    soma = 1/i;
    h += soma;
    }
    System.out.printf("%.1f", +h);
  }
}
