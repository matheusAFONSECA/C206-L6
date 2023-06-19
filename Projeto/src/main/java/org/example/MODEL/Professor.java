package org.example.MODEL;

// -> classe que representa o professor
public class Professor {
    // atributos
    private int idProfessor;        // id do professor
    private String nome;            // nome do professor

    // construtor
    public Professor(int idProfessor, String nome) {
        this.idProfessor = idProfessor;
        this.nome = nome;
    }

    // getters e setters
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
