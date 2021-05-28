package exercicios;

import java.util.Scanner;


public class Exercicoos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int lado1, lado2, lado3;
        boolean ehtriangulo;

        System.out.println("Insira os três lado: " );
        lado1 = entrada.nextInt();       
        lado2 = entrada.nextInt();
        lado3 = entrada.nextInt();
        
        ehtriangulo = lado1 <= (lado2 + lado3) && lado2 <= (lado1 + lado3) && lado3 <= (lado2 + lado1);

        if (ehtriangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilatero");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Escaleno");
                }
            }
        } else {
            System.out.println("Não é triangulo");
        }
            
        entrada.close();
    }
}
