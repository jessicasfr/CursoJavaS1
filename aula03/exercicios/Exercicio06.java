package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10; // CONSTANTE, NÃO PODE ALTERAR
        int numero, pares = 0;
        double media = 0;

        for (int cont = 1; cont <= TOTAL_NUMEROS; cont++) {
            System.out.printf("Digite %dº, o numero: ", cont);
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
                media = media + numero;

            }
        }
            System.out.println("O total de pares é " + pares);
            System.out.printf("O total de impares é: %.2f %% " , ((double) TOTAL_NUMEROS - pares / TOTAL_NUMEROS * 100));
            teclado.close();
            }
}
