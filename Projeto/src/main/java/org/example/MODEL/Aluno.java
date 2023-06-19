package org.example.MODEL;

// -> classe que representa o aluno
public class Aluno {
    // atributos
    private int matricula;      // matricula do aluno
    private String nome;        // nome do aluno
    private String curso;       // curso do aluno

    // construtor
    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    // getter e setter
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
