//Escreva um programa que desenhe um retângulo composto de x (x > 2) linhas e y colunas (y > 2).
//O perímetro é composto por um símbolo "+".

//Como exemplo, se x = 3 e y = 7, seu programa deve desenhar o seguinte:
//+++++++
//+     +
//+++++++

import java.util.Scanner;
  public class Programa {
    public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int linhas = 0;
    int colunas = 0;
    
    // PROCESSAMENTO DOS DADOS
    linhas = teclado1.nextInt();
    colunas = teclado1.nextInt();
    
     if (linhas > 2 && colunas > 2) {
        for (int i = 0; i < colunas; i++) {
        System.out.print("+");
    }
        System.out.println();

        for (int i = 0; i < linhas - 2; i++) {

        System.out.print("+");

        for (int j = 0; j < colunas - 2; j++) {
        System.out.print(" ");
    }

        System.out.println("+");
    }

        for (int i = 0; i < colunas; i++) {
    System.out.print("+");
    }

        System.out.println();
    } else {
        System.out.print("Dimensoes fora das especificacoes.");
    }
  }
}
