package exemplos.exemplos03;

public class Pessoa {
    //atributos primeira parte (declarado na classe)
    String nome;
    int telefone;

    //metodos segunda parte
    Pessoa (String n,int t) { //construtor
        nome = n;
        telefone = t;

    }
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterTelefone () {
        return telefone;
    }
}
