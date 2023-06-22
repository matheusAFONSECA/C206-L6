package org.example.DAO;

// importação necessária para acessar o objeto "Aluno"
import org.example.MODEL.NotaHasMateria;

// importação de bibliotecas necessárias para trabalhar com o BD
import java.sql.SQLException;
import java.util.ArrayList;

// -> a tabela "NotaHasMateria" corelaciona as notas dos alunos com
// uma determinada materia, lembrando que foco aqui é deixar com que
// os monitores assumam a responsabilidade de soltar as notas dos alunos
public class NotaHasMateriaDAO extends ConnectionDAO{
    // DAO - Data Access Object
    boolean sucesso = false; // Para saber se funcionou a ação no BD

    // metodos para realizar funções específicas no BD

    // INSERT ->  inserção de dados no BD
    public boolean insertNotaHasMateria(NotaHasMateria notaHasMateria) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "INSERT INTO nota_has_materia values(?,?,?)";

        try {
            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala notas_has_materia

            // inserção de dados no bd
            pst.setInt(1, notaHasMateria.getNota_idNotas());
            pst.setString(2, notaHasMateria.getMateria_idMateria());
            pst.setInt(3, notaHasMateria.getMateria_Professor_idProfessor());
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
    public boolean updateNotaHasMateria(int idNota, String idMateria, String outraMateria) {
        // -> será somente necessária o id da nota e o nome da materia para realizar a mudança

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "UPDATE nota_has_materia SET Materia_idMateria=? WHERE Nota_idNotas=? and Materia_idMateria=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala notas_has_materia

            // inserção de dados no bd
            pst.setString(1, outraMateria);
            pst.setInt(2, idNota);
            pst.setString(3, idMateria);
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
    public boolean deleteNotasHasMateria(int idNota, String idMateria) {

        connectToDB();      // função para conectar no BD

        // String de comando que vai ser realizada no BD
        String sql = "DELETE FROM nota_has_materia WHERE Nota_idNotas=? and Materia_idMateria=?";

        try {
            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala nota_has_materia

            // inserção de dados no bd
            pst.setInt(1, idNota);
            pst.setString(2, idMateria);
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
    public ArrayList<NotaHasMateria> selectNotaHasMateria() {
        ArrayList<NotaHasMateria> notaHasMaterias = new ArrayList<>();    // ArrayList Aux

        connectToDB();      // função para conectar com o BD

        // String de comando que vai ser realizada no BD
        String sql = "SELECT * FROM nota_has_materia";

        try {
            st = con.createStatement();        // faz a preparação para deletar dados na tebala nota_has_materia

            // Faz a query no BD
            rs = st.executeQuery(sql);
            System.out.println("Lista de notas: ");
            while (rs.next()) {
                NotaHasMateria notaHasMateriaAUX = new NotaHasMateria(rs.getInt("Nota_idNotas"),
                        rs.getString("Materia_idMateria"), rs.getInt("Materia_Professor_idProfessor"));
                System.out.println("\tidNota = " + notaHasMateriaAUX.getNota_idNotas());
                System.out.println("\tSigla = " + notaHasMateriaAUX.getMateria_idMateria());
                System.out.println("\tProfessor = " + notaHasMateriaAUX.getMateria_Professor_idProfessor());
                System.out.println("-----------------------------------------------");
                notaHasMaterias.add(notaHasMateriaAUX);
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

        return notaHasMaterias;      // Retorna a ArrayList de Aluno
    }
}
