package exercicios;

import java.util.Scanner;

public class exercicios01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        //double metade;

        System.out.println("Digite o numero");
        numero = entrada.nextInt();

        if (numero > 20) {
            System.out.println("metade = " + ((double) numero / 2));
            // System.out.printf( "metade = %\n" , metade);
        }
        entrada.close();

    }
}
