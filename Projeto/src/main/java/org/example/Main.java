package org.example;

import org.example.DAO.AlunoDAO;
import org.example.MODEL.Aluno;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo AlunoDAO
        AlunoDAO alunoDAO = new AlunoDAO();

        // definindo Aluno
        Aluno aluno = new Aluno(1, "Marco", "GEC");

        // inserindo o dado do aluno no BD
        alunoDAO.insertAluno(aluno);

        // atualizando o dado do aluno no BD
        //alunoDAO.updateAluno(1, "GEC", aluno);

        // deletando algum dado da tabela no BD
        //alunoDAO.deleteAlno(1, "GEC");

        // vendo os dados da tabela aluno
        alunoDAO.selectAluno();

    }
}