//Escreva um programa que leia um número inteiro positivo N e em seguida imprima N linhas do chamado triângulo de Floyd.

//Por exemplo, para N=6, o seguinte triângulo é formado:
//1
//2    3
//4    5    6
//7    8    9    10
//11    12    13    14    15
//16    17    18    19    20    21

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n;
    int num = 1;
    
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j<=i; j++) {
            System.out.print(num+ "    ");
            num++;
        }
    System.out.println();
    }
  }
}
