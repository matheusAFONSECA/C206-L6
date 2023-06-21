package org.example.MODEL;

// -> classe que representa as correlação de notas em cada materia
public class NotaHasMateria {
    private int Nota_idNotas;                   // id da nota
    private String Materia_idMateria;           // id da materia
    private int Materia_Professor_idProfessor;  // id do professor

    // construtor
    public NotaHasMateria(int nota_idNotas, String materia_idMateria, int materia_Professor_idProfessor) {
        Nota_idNotas = nota_idNotas;
        Materia_idMateria = materia_idMateria;
        Materia_Professor_idProfessor = materia_Professor_idProfessor;
    }

    // getter e setter
    public int getNota_idNotas() {
        return Nota_idNotas;
    }

    public void setNota_idNotas(int nota_idNotas) {
        Nota_idNotas = nota_idNotas;
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
