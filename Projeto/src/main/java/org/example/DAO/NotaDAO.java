package org.example.DAO;

// importação necessária para acessar o objeto "Aluno"
import org.example.MODEL.Nota;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

public class NotaDAO extends ConnectionDAO implements Calculos{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertNota(Nota nota) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO nota(nota_obtida, Alunos_matricula, Alunos_curso," +
                "Materia_idMateria, Materia_Professor_idProfessor)" +
                " values(?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala Nota

            // inserção de dados no bd
            pst.setInt(1, nota.getNotaObtida());
            pst.setInt(2, nota.getAlunoMatricula());
            pst.setString(3, nota.getAlunoCurso());
            pst.setString(4, nota.getIdMateria());
            pst.setInt(5, nota.getIdProfessor());
            pst.execute();

            sucesso = true;     // define como sucesso a inserção de dados

        } catch (SQLException exc) {        // mostra o erro que ocorreu, caso ele aconteça
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {    // mostra o erro que ocorreu, caso ele aconteça
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;     // retorna se deu certo a ação no BD
    }

    // UPDATE -> atualização de dados no BD
    public boolean updateNota(int nota,int matricula, String curso, String materia) {
        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
        // porque são as chaves primarias da tabela 'Nota'

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE nota SET nota_obtida=? where Alunos_matricula=? and " +
                "Alunos_curso=? and Materia_idMateria = ?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala aluno

            // inserção de dados no bd
            pst.setInt(1, nota);
            pst.setInt(2, matricula);
            pst.setString(3, curso);
            pst.setString(4, materia);
            pst.execute();

            sucesso = true;     // define como sucesso a atualização de dados

        } catch (SQLException ex) {     // mostra o erro que ocorreu, caso ele aconteça
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {        // mostra o erro que ocorreu, caso ele aconteça
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;     // retorna se deu certo a ação no BD
    }

    // DELETE -> Ação de deletar dados no BD
    public boolean deleteNota(int matricula, String curso, String idMateria) {
        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
        // porque são as chaves primarias da tabela 'Nota'

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM nota where Alunos_matricula=? and Alunos_curso=? and Materia_idMateria=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala nota

            // inserção de dados no bd
            pst.setInt(1, matricula);
            pst.setString(2, curso);
            pst.setString(3, idMateria);
            pst.execute();

            sucesso = true;     // define como sucesso a deleta de dados

        } catch (SQLException ex) {     // mostra o erro que ocorreu, caso ele aconteça
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {    // mostra o erro que ocorreu, caso ele aconteça
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;     // retorna se deu certo a ação no BD
    }

    // SELECT -> retorna uma ArrayList com os dados da tabela
    public ArrayList<Nota> selectNota() {
        ArrayList<Nota> notas = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM nota";

        try {
            st = con.createStatement();        // faz a preparação para selecionar dados na tebala nota

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de notas: ");
            while (rs.next()) {
                Nota notaAux = new Nota(rs.getInt("nota_obtida"),
                        rs.getInt("Alunos_matricula"), rs.getString("Alunos_curso"),
                        rs.getString("Materia_idMateria"),
                                rs.getInt("Materia_Professor_idProfessor"));
                System.out.println("\tNota = " + notaAux.getNotaObtida());
                System.out.println("\tMatricula = " + notaAux.getAlunoMatricula());
                System.out.println("\tCurso = " + notaAux.getAlunoCurso());
                System.out.println("\tMateria = " + notaAux.getIdMateria());
                System.out.println("-----------------------------------------------");
                notas.add(notaAux);
            }

            sucesso = true;     // define como sucesso a seleção de dados

        } catch (SQLException e) {     // mostra o erro que ocorreu, caso ele aconteça
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {     // mostra o erro que ocorreu, caso ele aconteça
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return notas;      // Retorna a ArrayList de notas
    }

    // METEDO QUE CALCULA A MEDIA DE UMA MATERIA COM BASE NAS NOTAS
    @Override
    public float CalcularMediaMateria(String idMateria) {
        // var aux
        float resultado = 0;        // guarda o resultado que sera retornado

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "Select AVG(nota_obtida) as \"Média das notas\" from nota where Materia_idMateria=?";

        try {
            pst = con.prepareStatement(sql); // faz a preparação para selecionar dados da tabela nota

            // inserção de dados na condição do select
            pst.setString(1, idMateria);

            rs = pst.executeQuery();    // Executa a consulta e obtém o resultado

            while (rs.next()) {
                // System.out.println(rs.getFloat("Média das notas"));
                resultado = rs.getFloat("Média das notas");
            }

            sucesso = true;     // define como sucesso a conta da media de dados das notas

        } catch (SQLException ex) {     // mostra o erro que ocorreu, caso ele aconteça
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {    // mostra o erro que ocorreu, caso ele aconteça
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return resultado;
    }
}
