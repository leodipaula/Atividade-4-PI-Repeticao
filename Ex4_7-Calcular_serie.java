//Faça um programa que leia n e mostre o valor S que é calculado da seguinte forma: S = 1/1+2/3+3/5+4/7+5/9+...+n/m
//PS: O S deve ser arredondado para DUAS casas decimais.

import java.util.Scanner;
  public class Programa {
    public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n =0;
    double soma = 0;
    double h = 0;
    double m = -1;
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    
    for (double i = 1; i <= n; i++) {
    m+=2;
    soma = i/m;
    h += soma;
    }
    System.out.printf("%.2f", +h);
  }
}
