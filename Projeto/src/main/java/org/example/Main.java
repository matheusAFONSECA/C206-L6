package org.example;

import org.example.DAO.AlunoDAO;
import org.example.DAO.MateriaDAO;
import org.example.DAO.ProfessorDAO;
import org.example.MODEL.Aluno;
import org.example.MODEL.Materia;
import org.example.MODEL.Professor;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo MateriaDAO
        MateriaDAO materiaDAO = new MateriaDAO();

        // definindo Materia
        Materia materia = new Materia("C206", "POO", 1);

        // inserindo o dado do Materia no BD
        materiaDAO.insertMateria(materia);

        // atualizando o dado do Materia no BD
        // materiaDAO.updateMateria("A201", 1, materia);

        // deletando algum dado da tabela no BD
        // materiaDAO.deleteMateria("C206", 1);

        // vendo os dados da tabela Materia
        materiaDAO.selectMateria();

    }
}