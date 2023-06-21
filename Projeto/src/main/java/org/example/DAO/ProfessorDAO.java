package org.example.DAO;

// importação necessária para acessar o objeto "Professor"
import org.example.MODEL.Professor;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

// classe que ira fazer a inserção de dados do aluno no BD
public class ProfessorDAO extends ConnectionDAO{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertProfessor(Professor professor) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO professor (idProfessor,nome) values(?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala aluno

            // inserção de dados no bd
            pst.setInt(1, professor.getIdProfessor());
            pst.setString(2, professor.getNome());
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
    public boolean updateProfessor(int idProfessor, Professor professor) {
        // -> é necessário a chave primário da tabela professor, que no caso é a idProfessor

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE professor SET idProfessor=?, nome=? where idProfessor=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala professor

            // inserção de dados no bd
            pst.setInt(1, professor.getIdProfessor());
            pst.setString(2, professor.getNome());
            pst.setInt(3, idProfessor);
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
    public boolean deleteProfessor(int idProfessor) {
        // -> é necessário a chave primário da tabela professor, que no caso é a idProfessor

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM professor where idProfessor=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para deletar dados na tebala professor

            // inserção de dados no bd
            pst.setInt(1, idProfessor);
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
    public ArrayList<Professor> selectProfessor() {
        ArrayList<Professor> professores = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM professor";

        try {
            st = con.createStatement();        // faz a preparação para selecionar dados na tebala aluno

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de Professores: ");
            while (rs.next()) {
                Professor professorAux = new Professor(rs.getInt("idProfessor"), rs.getString("nome"));
                System.out.println("\tNome = " + professorAux.getNome());
                System.out.println("\tidProfessor = " + professorAux.getIdProfessor());
                System.out.println("-----------------------------------------------");
                professores.add(professorAux);
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

        return professores;      // Retorna a ArrayList de Aluno
    }
}
