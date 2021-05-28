package exercicios.exercicios06;

public class Ebook {
    // Atributos
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    Ebook (String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (totalPaginas >0) {
        this.totalPaginas = totalPaginas;
        ]
        paginaAtual = 0
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }
    public void irParaPagina (int pagina) {
        if(pagina >=0 && pagina <=totalPaginas)
    }
    public void retrocederPagina (int pagina) {
        if(paginaAtual > 0) }
        paginaAtual--;
}
}
