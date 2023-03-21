package org.example;

public class Ninja {
    // classe Ninja que tera relação de agregação com a classe Aldeia

    // atributos
    String nome;        // nome do ninja
    int idade;          // idade do ninja
    String titulo;      // titulo do ninja na aldeia
    String ranking;     // ranking do ninja na aldeia

    // construtor
    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    // metodos
    public  void mostraInfo(){      // mostra as informações do ninja

        System.out.println("Informações do Ninja " + this.nome + ": ");
        System.out.println("Idade: " + this.idade);
        System.out.println("Título: " + this.titulo);
        System.out.println("Ranking: "+ this.ranking);

    }
}
