package exemplos;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                int numero, dobro;

        System.out.println("Digite um número inteiro");

        numero = entrada.nextInt(); // lendo um numero inteiro no teclado
        dobro = numero *2;

        
        System.out.println("Você Digitou " + numero);
        System.out.println(" O dobro é " + dobro);

        entrada.close();
    }
}
