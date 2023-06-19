package org.example.MODEL;

// -> classe responsavel por corelacionar os alunos aos professores
public class AlunoHasProfessor {
    // atributos
    private int Alunos_matricula;           // matricula do aluno
    private String curso;                   // curso do aluno
    private int Professor_idProfessor;      // id do aluno

    // construtor
    public AlunoHasProfessor(int alunos_matricula, String curso, int professor_idProfessor) {
        Alunos_matricula = alunos_matricula;
        this.curso = curso;
        Professor_idProfessor = professor_idProfessor;
    }

    // getter e setter
    public int getAlunos_matricula() {
        return Alunos_matricula;
    }

    public void setAlunos_matricula(int alunos_matricula) {
        Alunos_matricula = alunos_matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getProfessor_idProfessor() {
        return Professor_idProfessor;
    }

    public void setProfessor_idProfessor(int professor_idProfessor) {
        Professor_idProfessor = professor_idProfessor;
    }
}
