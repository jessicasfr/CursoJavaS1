package exercicios;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double SalarioBruto, ValorPrestacao, limite;

//entrada de dados
        System.out.println("Digite SalarioBruto");
        SalarioBruto = entrada.nextDouble();

        System.out.println("Digite Valor Prestacao");
        ValorPrestacao = entrada.nextDouble();
 // processamento
 limite = SalarioBruto *0.30;
        if (ValorPrestacao <=limite) {
            System.out.println("Emprestimo liberado");
        } else {
            System.out.println("Emprestimo negado");
            System.out.println( " O limite é de " + limite);
        }
        entrada.close();
    }
    
}
