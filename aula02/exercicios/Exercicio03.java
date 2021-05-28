package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        //entrada
        System.out.println("Digite numero1");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();

      if (numero1 > numero2) {
          System.out.println(numero1 + "," + numero2);
      } else {
          System.out.printf("%.2f, %.2f\n", numero2, numero1);
      }
entrada.close();
      }

    }


