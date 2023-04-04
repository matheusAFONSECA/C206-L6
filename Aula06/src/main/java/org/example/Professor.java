package org.example;

public class Professor {
    // atributos
    String nome;        // nome do professor
    int idade;          // idade do professor
    double salario;     // salario do professor

    // metodos
    public void mostraInfo(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Idade do professor: " + idade);
        System.out.println("Salário do professor: " + salario);
    }
}
