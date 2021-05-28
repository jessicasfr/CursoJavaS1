package exercicios;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont,soma,numero;
              
        soma = 0;
        cont = 1;
        numero = 1;

        while ( numero != 0) {
            System.out.printf("Digite o %dº numero:", cont);
            numero = teclado.nextInt();
            soma = soma + numero;
            cont++;
        }
            System.out.printf("A soma dos valores é:" + soma);

            teclado.close();
        }

    }
    

