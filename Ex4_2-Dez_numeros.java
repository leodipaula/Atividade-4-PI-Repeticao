//Implemente um algoritmo que leia 10 números e imprima na tela  quantos estão entre 0 e 10, 11 e 20 e maiores de 21.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS e PROCESSAMENTO
    Scanner teclado1 = new Scanner(System.in);
    int valores;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 =0;
    
    for (int i = 0; i <= 9; i++) {
       valores = teclado1.nextInt();
       if (valores <= 10) {
           cont1++;
       } else if (valores >= 11 && valores <= 20) {
           cont2++;
       } else {
           cont3++;
       }
    }
    System.out.println(">=0 e <=10: " +cont1);
    System.out.println(">=11 e <=20: " +cont2);
    System.out.println(">=21: " +cont3);
  }
}
