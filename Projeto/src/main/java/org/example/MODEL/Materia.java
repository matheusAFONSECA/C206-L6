package org.example.MODEL;

// -> classe que representa a materia que os alunos fazem
public class Materia {
    // atributos
    private String idMateria;               // id da materia
    private String nome;                    // nome da materia
    private int Professor_idProfessor;      // id do professor responsavel da materia

    // construtor
    public Materia(String idMateria, String nome, int professor_idProfessor) {
        this.idMateria = idMateria;
        this.nome = nome;
        Professor_idProfessor = professor_idProfessor;
    }

    // getter e setter
    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProfessor_idProfessor() {
        return Professor_idProfessor;
    }

    public void setProfessor_idProfessor(int professor_idProfessor) {
        Professor_idProfessor = professor_idProfessor;
    }

}
