package exercicios;

import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Salario;
        // entrada de dados
        System.out.println("Digite Salario");
        Salario = entrada.nextDouble();

        if (Salario <= 600) {
            System.out.println("ISENTO");
        } else {
            if (Salario <= 1200) {
                System.out.println("20%");
            } else {
                if (Salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30");
                }
            }
        }
        entrada.close();

    }
}
