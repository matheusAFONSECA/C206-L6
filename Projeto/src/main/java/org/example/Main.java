package org.example;

import org.example.DAO.*;
import org.example.MODEL.*;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo AlunoHasProfessorDAO
        AlunoHasProfessorDAO alunoHasProfessorDAO = new AlunoHasProfessorDAO();

        // definindo AlunoHasProfessorDAO
        AlunoHasProfessor alunoHasProfessor = new AlunoHasProfessor(1, "GEA", 1);

        // inserindo o dado da aluno_has_professor no BD
        alunoHasProfessorDAO.insertAlunoHasPofessor(alunoHasProfessor);

        // atualizando o dado da aluno_has_professor no BD
        // alunoHasProfessorDAO.updateAlunoHasProfessor(1, "GEA", 2);

        // deletando algum dado da aluno_has_professor no BD
        // alunoHasProfessorDAO.deleteAlunoHasProfessor(1, "GEA");

        // vendo os dados da tabela aluno_has_professor
        alunoHasProfessorDAO.selectAlunoHasProfessor();

    }
}