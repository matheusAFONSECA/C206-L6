package org.example;

public class Estudante {
    // atributos
    String nome;    // nome do estudante
    int idade;      // idade do estudante
    String ano;     // ano de escolaridae que o aluno esta

    // construtor
    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    // metodos
    public void mostraInfo(){   // mostra as informções do estudante

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano: " + this.ano);

    }

}
