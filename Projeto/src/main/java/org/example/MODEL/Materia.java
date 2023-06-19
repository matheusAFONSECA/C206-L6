package org.example.MODEL;

// -> classe que representa a materia que os alunos fazem
public class Materia {
    // atributos
    private String idMateria;               // id da materia
    private String nome;                    // nome da materia
    private int Professor_idProfessor;      // id do professor responsavel da materia
    private int Notas_idNotas;              // id da nota

    // construtor
    public Materia(String idMateria, String nome, int professor_idProfessor, int notas_idNotas) {
        this.idMateria = idMateria;
        this.nome = nome;
        Professor_idProfessor = professor_idProfessor;
        Notas_idNotas = notas_idNotas;
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

    public int getNotas_idNotas() {
        return Notas_idNotas;
    }

    public void setNotas_idNotas(int notas_idNotas) {
        Notas_idNotas = notas_idNotas;
    }
}
