package org.example;

import org.example.DAO.AlunoDAO;
import org.example.DAO.MateriaDAO;
import org.example.DAO.MonitorDAO;
import org.example.DAO.ProfessorDAO;
import org.example.MODEL.Aluno;
import org.example.MODEL.Materia;
import org.example.MODEL.Monitor;
import org.example.MODEL.Professor;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo MonitorDAO
        MonitorDAO monitorDAO = new MonitorDAO();

        // definindo Monitor
        Monitor monitor = new Monitor(1, "GEA", "E202", 2);

        // inserindo o dado do Monitor no BD
        monitorDAO.insertMonitor(monitor);

        // atualizando o dado do Monitor no BD
        // monitorDAO.updateMonitor(1, "GEA", "C206", monitor);

        // deletando algum dado da tabela no BD
        // monitorDAO.deleteMonitor(1, "GEA");

        // vendo os dados da tabela Materia
        monitorDAO.selectMonitor();

    }
}