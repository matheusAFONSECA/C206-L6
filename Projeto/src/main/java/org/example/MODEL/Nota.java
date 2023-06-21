package org.example.MODEL;

// -> classe para passarmos a notas dos alunos para o BD
public class Nota {
    private int idNota;             // id da nota
    private int notaObtida;         // nota obtida pelo aluno
    private int alunoMatricula;     // matricula do aluno
    private String alunoCurso;      // curso do aluno
    private int idMonitor;          // Id do monitor do aluno

    // construtor
    public Nota(int idNota, int notaObtida, int alunoMatricula, String alunoCurso, int idMonitor) {
        this.idNota = idNota;
        this.notaObtida = notaObtida;
        this.alunoMatricula = alunoMatricula;
        this.alunoCurso = alunoCurso;
        this.idMonitor = idMonitor;
    }

    // getter e setter
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

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }
}
