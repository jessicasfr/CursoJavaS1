package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada, cont;

        System.out.println("Digite o número");
        tabuada = teclado.nextInt();

        cont = 0; // inicio
        while (cont <= 10) {
            System.out.println(tabuada + "x" + cont + "=" + (tabuada * cont));
            cont++;
            //System.out.prinf("%2d X %2d\n" tabuada + "x" + cont + "=" + (tabuada * cont)); exemplo colocando espaços/digitos
            cont++;
        }

        teclado.close();
    }
}
