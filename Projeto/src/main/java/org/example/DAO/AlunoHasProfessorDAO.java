package org.example.DAO;

// importação necessária para acessar o objeto "Aluno"
import org.example.MODEL.AlunoHasProfessor;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

// -> A tabela "AlunoHasProfessor" é uma tabela auxilixar que pode ser usada
// pela instituição para corelacionar os alunos a seus respectivos orientadores de
// iniciação cientifica, TCC, mestrado, entre outras coisas.
public class AlunoHasProfessorDAO extends ConnectionDAO{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertAlunoHasPofessor(AlunoHasProfessor alunoHasProfessor) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO alunos_has_professor values(?,?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala aluno_has_professor

            // inserção de dados no bd
            pst.setInt(1, alunoHasProfessor.getAlunos_matricula());
            pst.setString(2, alunoHasProfessor.getCurso());
            pst.setInt(3, alunoHasProfessor.getProfessor_idProfessor());
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
    public boolean updateAlunoHasProfessor(int matricula, String curso, int novoIdProfessor) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE alunos_has_professor SET Professor_idProfessor=? " +
                "where Alunos_matricula=? and Alunos_curso=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala aluno_has_professor

            // inserção de dados no bd
            pst.setInt(1, novoIdProfessor);
            pst.setInt(2, matricula);
            pst.setString(3, curso);
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
    public boolean deleteAlunoHasProfessor(int matricula, String curso) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM alunos_has_professor where Alunos_matricula=? and Alunos_curso=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala aluno_has_professor

            // inserção de dados no bd
            pst.setInt(1, matricula);
            pst.setString(2, curso);
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
    public ArrayList<AlunoHasProfessor> selectAlunoHasProfessor() {
        ArrayList<AlunoHasProfessor> alunos = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM alunos_has_professor";

        try {
            st = con.createStatement();        // faz a preparação para deletar dados na tebala aluno

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de alunos orientados: ");
            while (rs.next()) {
                AlunoHasProfessor alunoAux = new AlunoHasProfessor(rs.getInt("Alunos_matricula"),
                        rs.getString("Alunos_curso"), rs.getInt("Professor_idProfessor"));
                System.out.println("\tOrietador = " + alunoAux.getProfessor_idProfessor());
                System.out.println("\tMatricula = " + alunoAux.getAlunos_matricula());
                System.out.println("\tCurso = " + alunoAux.getCurso());
                System.out.println("-----------------------------------------------");
                alunos.add(alunoAux);
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

        return alunos;      // Retorna a ArrayList de Aluno
    }
}
