//Implemente um algoritmo que peça dois números inteiros positivos, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. 
//Não utilize a função de potência do Java (Math.pow).

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n;
    int n2;
    int mult = 1;
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    n2 = teclado1.nextInt();
    
    for (int i = 0; i <= n2-1; i++) {
        mult*=n;
    }
    System.out.print(mult);

  }
}
