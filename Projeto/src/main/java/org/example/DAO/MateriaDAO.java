package org.example.DAO;

// importação necessária para acessar o objeto "Materia"
import org.example.MODEL.Materia;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

public class MateriaDAO extends ConnectionDAO{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertMateria(Materia materia) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO materia (idMateria,nome,Professor_idProfessor) values(?,?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala materia

            // inserção de dados no bd
            pst.setString(1, materia.getIdMateria());
            pst.setString(2, materia.getNome());
            pst.setInt(3, materia.getProfessor_idProfessor());
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
    public boolean updateMateria(String idMateria, int idProfessor, Materia materia) {
        // -> idMateria é a chave primaria da tabela Materia e idProfessor é referente ao id do professor da materia(FK)
        // -> FK é chave estrangeira

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE materia SET idMateria=?, nome=?, Professor_idProfessor=? " +
                "where idMateria=? and Professor_idProfessor=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala materia

            // inserção de dados no bd
            pst.setString(1, materia.getIdMateria());
            pst.setString(2, materia.getNome());
            pst.setInt(3, materia.getProfessor_idProfessor());
            pst.setString(4, idMateria);
            pst.setInt(5,idProfessor);
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
    public boolean deleteMateria(String idMateria, int idProfessor) {
        // -> idMateria é a chave primaria da tabela Materia e idProfessor é referente ao id do professor da materia(FK)
        // -> FK é chave estrangeira

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM materia where idMateria=? and Professor_idProfessor=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala materia

            // inserção de dados no bd
            pst.setString(1, idMateria);
            pst.setInt(2, idProfessor);
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
    public ArrayList<Materia> selectMateria() {
        ArrayList<Materia> materias = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM materia";

        try {
            st = con.createStatement();        // faz a preparação para deletar dados na tebala aluno

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de materias: ");
            while (rs.next()) {
                Materia materiaAux = new Materia(rs.getString("idMateria"),rs.getString("nome"),
                        rs.getInt("Professor_idProfessor"));
                System.out.println("\tSigla = " + materiaAux.getIdMateria());
                System.out.println("\tNome = " + materiaAux.getNome());
                System.out.println("\tProfessor = " + materiaAux.getProfessor_idProfessor());
                System.out.println("-----------------------------------------------");
                materias.add(materiaAux);
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

        return materias;      // Retorna a ArrayList de Aluno
    }

}
