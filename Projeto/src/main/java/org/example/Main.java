package org.example;

import org.example.DAO.*;
import org.example.MODEL.*;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo NotaDAO
        NotaDAO notaDAO = new NotaDAO();

        // definindo Monitor
        Nota nota = new Nota(1, 50, 1, "GEC", 1);

        // inserindo o dado da nota no BD
        notaDAO.insertNota(nota);

        // atualizando o dado da nota no BD
        // notaDAO.updateNota(60, 1, "GEC");

        // deletando algum dado da nota no BD
        // notaDAO.deleteNota(1, "GEC", 1);

        // vendo os dados da tabela nota
        notaDAO.selectNota();

    }
}