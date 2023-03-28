package org.example;

public class Joaninha {
    // atributos do objeto da classe Joaninha
    int idade;      // idade da joaninha
    String cor;     // cor da joaninha

    // atributos da classe Joaninha
    public static int qtdJoana = 0;

    // construtor
    public Joaninha(int idade, String cor) {
        qtdJoana++;
        this.idade = idade;
        this.cor = cor;
    }

}
