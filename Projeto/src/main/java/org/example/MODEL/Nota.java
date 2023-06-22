package org.example.MODEL;

// -> classe para passarmos a notas dos alunos para o BD
public class Nota {
    private int idNota;             // id da nota
    private int notaObtida;         // nota obtida pelo aluno
    private int alunoMatricula;     // matricula do aluno
    private String alunoCurso;      // curso do aluno
    private String idMateria;       // materia do aluno que ele recebe a nota
    private int idProfessor;     // id do professor que soltou a nota

    // construtor
    public Nota(int notaObtida, int alunoMatricula, String alunoCurso, String idMateria, int idProfessor) {
        this.notaObtida = notaObtida;
        this.alunoMatricula = alunoMatricula;
        this.alunoCurso = alunoCurso;
        this.idMateria = idMateria;
        this.idProfessor = idProfessor;
    }

    // getter e setter
    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNotaObtida() {
        return notaObtida;
    }

    public void setNotaObtida(int notaObtida) {
        this.notaObtida = notaObtida;
    }

    public int getAlunoMatricula() {
        return alunoMatricula;
    }

    public void setAlunoMatricula(int alunoMatricula) {
        this.alunoMatricula = alunoMatricula;
    }

    public String getAlunoCurso() {
        return alunoCurso;
    }

    public void setAlunoCurso(String alunoCurso) {
        this.alunoCurso = alunoCurso;
    }

}
