package org.example;

public class Livro {
    // atributos que podem ser adicionados nessa classe
    String nome;    // nome do livro
    int numpags;    // numero de paginas do livro

    // metodos
    public Livro(String nome, int numpags) {
        this.nome = nome;
        this.numpags = numpags;
    }

    // metodo
    public void mostraInfo(){   // mostra a informação do livro

        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Numero de paginas: " + this.numpags);
        System.out.println("------------------------------------");

    }
}
