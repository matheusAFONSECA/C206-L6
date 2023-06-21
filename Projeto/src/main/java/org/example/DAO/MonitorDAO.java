package org.example.DAO;

// importação necessária para acessar o objeto "Monitor"
import org.example.MODEL.Monitor;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

public class MonitorDAO extends ConnectionDAO{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertMonitor(Monitor monitor) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO monitor (Aluno_matricula,Aluno_curso,Materia_idMateria,Materia_Professor_idProfessor)" +
                " values(?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala monitor

            // inserção de dados no bd
            pst.setInt(1, monitor.getAluno_matricula());
            pst.setString(2, monitor.getAluno_curso());
            pst.setString(3, monitor.getMateria_idMateria());
            pst.setInt(4, monitor.getMateria_Professor_idProfessor());
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
    public boolean updateMonitor(int matricula, String curso, String materia, Monitor monitor) {
        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
        // porque são as chaves primarias da tabela 'Aluno'

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE monitor SET Aluno_matricula=?, Aluno_curso=?, Materia_idMateria=?, " +
                "Materia_Professor_idProfessor=? where Aluno_matricula=? and Aluno_curso=? and Materia_idMateria=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala monitor

            // inserção de dados no bd
            pst.setInt(1, monitor.getAluno_matricula());
            pst.setString(2, monitor.getAluno_curso());
            pst.setString(3, monitor.getMateria_idMateria());
            pst.setInt(4, monitor.getMateria_Professor_idProfessor());
            pst.setInt(5,matricula);
            pst.setString(6,curso);
            pst.setString(7,materia);
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
    public boolean deleteMonitor(int matricula, String curso) {
        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
        // porque são as chaves primarias da tabela 'Aluno'

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM monitor where Aluno_matricula=? and Aluno_curso=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala monitor

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
    public ArrayList<Monitor> selectMonitor() {
        ArrayList<Monitor> monitores = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM monitor";

        try {
            st = con.createStatement();        // faz a preparação para deletar dados na tebala monitor

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de monitores: ");
            while (rs.next()) {
                Monitor monitorAux = new Monitor(rs.getInt("Aluno_matricula"),rs.getString("Aluno_curso"),
                        rs.getString("Materia_idMateria"), rs.getInt("Materia_Professor_idProfessor"));
                System.out.println("\tMatricula = " + monitorAux.getAluno_matricula());
                System.out.println("\tCurso = " + monitorAux.getAluno_curso());
                System.out.println("\tMateria = " + monitorAux.getMateria_idMateria());
                System.out.println("\tProfessor = " + monitorAux.getMateria_Professor_idProfessor());
                System.out.println("-----------------------------------------------");
                monitores.add(monitorAux);
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

        return monitores;      // Retorna a ArrayList de Aluno
    }
}
