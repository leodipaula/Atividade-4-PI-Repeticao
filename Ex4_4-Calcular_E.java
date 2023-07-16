//Implemente um algoritmo que LEIA um valor inteiro e positivo N, calcule o mostre o valor E, conforme a fórmula a seguir: E = 1/1!+1/2!+1/3!+...+1/N!
//PS: O E deve ser arredondado para UMA casa decimal.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n =0;
    double soma = 0;
    double h = 0;
    double mult = 1;
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    
    for (double i = 1; i <= n; i++) {
    mult *= i;
    soma = 1/mult;
    h += soma;
    }
    System.out.printf("%.1f", +h);
  }
}
