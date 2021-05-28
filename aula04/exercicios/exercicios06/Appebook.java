package exercicios.exercicios06;

public class Appebook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook ("Narnia", "C.S.L", 300);

        livro1.exibirCapa();
        livro1.avancarPagina();
        System.out.println("Pagina atual " + livro1.exibirPagina());
        livro1.retrocederPagina();
        livro1.retrocederPagina();
        livro1.retrocederPagina();
        livro1.retrocederPagina();
        System.out.println("Pagina atual " + livro1.exibirPagina());
        livro1.irParaPagina(150);
        System.out.println("Pagina atual " + livro1.exibirPagina())

    }
    
}
