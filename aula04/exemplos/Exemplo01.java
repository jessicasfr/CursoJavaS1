package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 
{
public static void main(String[] args) {
    linha();
    System.out.println("Aplicação v1");
    linha();
    System.out.println("Menu");
    linha2(4);
    int tam = 10;
    linha2(tam);
    linha3(10, '*');
    linha3(20, '_');

    static Void (){
    System.out.println("-----------------");
}
    static void linha2(int tam) {
        for (int i = 1; i <= tam; i++) {
            System.out.println("-");            
        }
        System.out.println();
    }

    static void linha3 (int tam, char simbolo) {
        for (int i = 0; i <=tamanho; i++) {
            System.out.println(simbolo);
            
        }
        System.out.println();
    }
}