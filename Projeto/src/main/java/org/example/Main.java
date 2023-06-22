package org.example;

import org.example.DAO.*;
import org.example.MODEL.*;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // testes de inserção, atualização, seleção e deletar dados
        // definindo NotaHasMateria
        NotaHasMateriaDAO notaHasMateriaDAO = new NotaHasMateriaDAO();

        // definindo NotaHasMateria
        NotaHasMateria notaHasMateria = new NotaHasMateria(1, "C206", 1);

        // inserindo o dado da nota_has_materia no BD
        notaHasMateriaDAO.insertNotaHasMateria(notaHasMateria);

        // atualizando o dado da nota_has_materia no BD
        // notaHasMateriaDAO.updateNotaHasMateria(1, "C206", "E202");

        // deletando algum dado da nota_has_materia no BD
        //notaHasMateriaDAO.deleteNotasHasMateria(1, "C206");

        // vendo os dados da tabela nota_has_materia
        notaHasMateriaDAO.selectNotaHasMateria();

    }
}