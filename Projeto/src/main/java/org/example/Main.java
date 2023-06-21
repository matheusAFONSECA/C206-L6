package org.example;

import org.example.DAO.AlunoDAO;
import org.example.DAO.ProfessorDAO;
import org.example.MODEL.Aluno;
import org.example.MODEL.Professor;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo ProfessorDAO
        ProfessorDAO professorDAO = new ProfessorDAO();

        // definindo Professor
        Professor professor = new Professor(1, "Vivi");

        // inserindo o dado do professor no BD
        //professorDAO.insertProfessor(professor);

        // atualizando o dado do professor no BD
        //professorDAO.updateProfessor(1, professor);

        // deletando algum dado da tabela no BD
        professorDAO.deleteProfessor(1);

        // vendo os dados da tabela professor
        professorDAO.selectProfessor();

    }
}