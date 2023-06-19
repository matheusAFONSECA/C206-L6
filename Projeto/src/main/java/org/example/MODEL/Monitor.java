package org.example.MODEL;

public class Monitor {
    // atributos
    private int aluno_matricula;                // matricula do monitor
    private String aluno_curso;                 // curso do monitor
    private String Materia_idMateria;           // id da materia que o aluno da monitoria
    private int Materia_Professor_idProfessor;  // id do professor responsavel pela materia

    // construtor
    public Monitor(int aluno_matricula, String aluno_curso, String materia_idMateria, int materia_Professor_idProfessor) {
        this.aluno_matricula = aluno_matricula;
        this.aluno_curso = aluno_curso;
        Materia_idMateria = materia_idMateria;
        Materia_Professor_idProfessor = materia_Professor_idProfessor;
    }

    // getter e setter
    public int getAluno_matricula() {
        return aluno_matricula;
    }

    public void setAluno_matricula(int aluno_matricula) {
        this.aluno_matricula = aluno_matricula;
    }

    public String getAluno_curso() {
        return aluno_curso;
    }

    public void setAluno_curso(String aluno_curso) {
        this.aluno_curso = aluno_curso;
    }

    public String getMateria_idMateria() {
        return Materia_idMateria;
    }

    public void setMateria_idMateria(String materia_idMateria) {
        Materia_idMateria = materia_idMateria;
    }

    public int getMateria_Professor_idProfessor() {
        return Materia_Professor_idProfessor;
    }

    public void setMateria_Professor_idProfessor(int materia_Professor_idProfessor) {
        Materia_Professor_idProfessor = materia_Professor_idProfessor;
    }
}
