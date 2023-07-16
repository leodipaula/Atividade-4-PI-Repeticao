//Escreva um programa para cadastrar e calcular a média de idade de N adolescentes que participarão de uma pesquisa científica.
//Nesse caso, considera-se adolescente como uma pessoa com idade entre 12 anos completos e 18 anos incompletos.

//O programa deve primeiramente receber o valor de N (maior que 2).
// Depois, deve pedir os dados das idades até que o número de adolescentes estipulado seja atingido.
//Observe que o usuário pode digitar valores idades que não são de adolescentes.
//Portanto, o  programa pode precisar ler um número de idades maior que N, pois a leitura deve finalizar somente quando tiverem sido obtidas N idades de adolescentes.
//Quando a quantidade N de idades de adolescentes for atingida, o programa deve calcular a média das idades (somente dos N adolescentes).
//Caso o usuário entre com N menor ou igual a 2 uma mensagem de erro deve aparecer: "Poucos participantes para a pesquisa.".

import java.util.Scanner;
  public class Programa {
    public static void main(String[] args) {
      
    // ENTRADA DE DADOS
    Scanner teclado1 = new Scanner(System.in);
    int n =0;
    double soma = 0;
    double media = 0;
    double idades = 0;
    // PROCESSAMENTO DOS DADOS
    n = teclado1.nextInt();
    
    if (n > 2) {
        
    for (int i = 1; i <= n; i++) {
    idades = teclado1.nextInt();
        while (!(idades >= 12 && idades < 18)) {
            idades = teclado1.nextInt();
        }
        soma += idades;
     }
    media = soma/n;
    System.out.print("A idade media dos "+n+" adolescentes é " +media+" anos.");
    } else {
        System.out.print("Poucos participantes para a pesquisa.");
    }
  }
}
