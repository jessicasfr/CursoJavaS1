package uri;

import java.util.Scanner;

public class Uri1010{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NumeroUnidades1, NumeroUnidades2,Codpproduto1,Codpproduto2;
        double PrecoProd1, PrecoProd2, ValorPagar;

        Codpproduto1 = entrada.nextInt();
        NumeroUnidades1 = entrada.nextInt();
        PrecoProd1 = entrada.nextDouble();
        Codpproduto2= entrada.nextInt();
        NumeroUnidades2 = entrada.nextInt();
        PrecoProd2 = entrada.nextDouble();

        ValorPagar = (NumeroUnidades1 * PrecoProd1) + (NumeroUnidades2 * PrecoProd2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ValorPagar);

        entrada.close();
       }
    
}
