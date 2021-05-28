package exemplos.exemplos03;

public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Jessica", 1234);
        Pessoa p2 = new Pessoa( "Victor", 54321);

        //p.nome = "Jessica";
        //p.telefone = 12345;
        p.apresentar();
        System.out.println("Meu telefone é: " +p.obterTelefone());

        p2.nome = "Victor";
        p2.telefone = 54321;
        p2.apresentar();
        System.out.println("Meu telefone é: " +p2.obterTelefone());
    }
    
}
