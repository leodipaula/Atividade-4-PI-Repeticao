//Escreva o método qtdDigitosImpares que recebe um valor inteiro n. O método deverá retornar a quantidade de dígitos ímpares no número n.
//Por exemplo, o número 12345 possui três dígitos ímpares (1, 3 e 5). Neste caso, o método deveria retornar o valor 3.

public static int qtdDigitosImpares(int n) {
    // digite o codigo do metodo aqui
    int impares = 0;
    int resto = 0;
    
    for (int i = 0; n > 0; n = n/10) {
        resto = n % 10;
    
        if (resto%2==1) {
         impares++;
        }
    }
    return impares;
}
