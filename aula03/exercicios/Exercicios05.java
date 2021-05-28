package exercicios;

import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_NUMEROS = 4; // CONSTANTE, NÃO PODE ALTERAR
        int numero, pares = 0, impares = 0;
        double media;

        // cont = 1;
        // numero = 10;

        for (int cont = 1; cont <= TOTAL_NUMEROS; cont++) {
            System.out.printf("Digite %dº, o numero:", cont);
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
                media = media + numero;
                        }
        }
        media = media / pares;
        System.out.println("A média de pares " + media);
        System.out.println("Porcentagem de impares " + (TOTAL_NUMEROS - pares/ TOTAL_NUMEROS));

        teclado.close();
    }
}
