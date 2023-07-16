//Considere um algoritmo para ler 10 notas válidas, entre 0 e 10, escrevendo no final a média nas notas válidas lidas.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
      
    // ENTRADA DE DADOS e PROCESSAMENTO
    float acumulador = 0, nota, media;
    int contador = 0;
    Scanner teclado1 = new Scanner(System.in);
    
    System.out.println("Entre com 10 notas válidas");
    while (contador<10) {
      do {
          nota = teclado1.nextFloat();
      } while (nota < 0 || nota > 10 );
      acumulador += nota;
      contador++;
    }
    media = acumulador/contador;
    // SAÍDA
    System.out.print("A média das " + contador + " notas é " + media);
  }
}
