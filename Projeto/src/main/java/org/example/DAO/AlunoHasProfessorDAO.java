//package org.example.DAO;
//
//// importação necessária para acessar o objeto "Aluno"
//import org.example.MODEL.AlunoHasProfessor;
//
//// importação de bibliotecas necessárias para trabalhar com o BD
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//// -> A tabela "AlunoHasProfessor" é uma tabela auxilixar que pode ser usada
//// pela instituição para corelacionar os alunos a seus respectivos orientadores de
//// iniciação cientifica, TCC, mestrado, entre outras coisas.
//public class AlunoHasProfessorDAO extends ConnectionDAO{
//    // DAO - Data Access Object
//    boolean sucesso = false; // Para saber se funcionou a ação no BD
//
//    // metodos para realizar funções específicas no BD
//
//    // INSERT ->  inserção de dados no BD
//    public boolean insertAluno(Aluno aluno) {
//
//        connectToDB();      // função para conectar no BD
//
//        // String de comando que vai ser realizada no BD
//        String sql = "INSERT INTO aluno (matricula,curso,nome) values(?,?,?)";
//
//        try {
//            pst = con.prepareStatement(sql);    // faz a preparação para iserção de dados na tebala aluno
//
//            // inserção de dados no bd
//            pst.setInt(1, aluno.getMatricula());
//            pst.setString(2, aluno.getCurso());
//            pst.setString(3, aluno.getNome());
//            pst.execute();
//
//            sucesso = true;     // define como sucesso a inserção de dados
//
//        } catch (SQLException exc) {        // mostra o erro que ocorreu, caso ele aconteça
//            System.out.println("Erro: " + exc.getMessage());
//            sucesso = false;
//        } finally {
//            try {
//                con.close();
//                pst.close();
//            } catch (SQLException exc) {    // mostra o erro que ocorreu, caso ele aconteça
//                System.out.println("Erro: " + exc.getMessage());
//            }
//        }
//
//        return sucesso;     // retorna se deu certo a ação no BD
//    }
//
//    // UPDATE -> atualização de dados no BD
//    public boolean updateAluno(int matricula, String curso, Aluno aluno) {
//        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
//        // porque são as chaves primarias da tabela 'Aluno'
//
//        connectToDB();      // função para conectar no BD
//
//        // String de comando que vai ser realizada no BD
//        String sql = "UPDATE aluno SET matricula=?, curso=?, nome=? where matricula=? and curso=?";
//
//        try {
//            pst = con.prepareStatement(sql);        // faz a preparação para atualização de dados na tebala aluno
//
//            // inserção de dados no bd
//            pst.setInt(1, aluno.getMatricula());
//            pst.setString(2, aluno.getCurso());
//            pst.setString(3, aluno.getNome());
//            pst.setInt(4, matricula);
//            pst.setString(5,curso);
//            pst.execute();
//
//            sucesso = true;     // define como sucesso a atualização de dados
//
//        } catch (SQLException ex) {     // mostra o erro que ocorreu, caso ele aconteça
//            System.out.println("Erro = " + ex.getMessage());
//            sucesso = false;
//        } finally {
//            try {
//                con.close();
//                pst.close();
//            } catch (SQLException exc) {        // mostra o erro que ocorreu, caso ele aconteça
//                System.out.println("Erro: " + exc.getMessage());
//            }
//        }
//
//        return sucesso;     // retorna se deu certo a ação no BD
//    }
//
//    // DELETE -> Ação de deletar dados no BD
//    public boolean deleteAluno(int matricula, String curso) {
//        // -> matricula e curso do aluno são necessários para conseguir fazer a atualização no BD
//        // porque são as chaves primarias da tabela 'Aluno'
//
//        connectToDB();      // função para conectar no BD
//
//        // String de comando que vai ser realizada no BD
//        String sql = "DELETE FROM aluno where matricula=? and curso=?";
//
//        try {
//            pst = con.prepareStatement(sql);        // faz a preparação para selecionar dados na tebala aluno
//
//            // inserção de dados no bd
//            pst.setInt(1, matricula);
//            pst.setString(2, curso);
//            pst.execute();
//
//            sucesso = true;     // define como sucesso a deleta de dados
//
//        } catch (SQLException ex) {     // mostra o erro que ocorreu, caso ele aconteça
//            System.out.println("Erro = " + ex.getMessage());
//            sucesso = false;
//        } finally {
//            try {
//                con.close();
//                pst.close();
//            } catch (SQLException exc) {    // mostra o erro que ocorreu, caso ele aconteça
//                System.out.println("Erro: " + exc.getMessage());
//            }
//        }
//        return sucesso;     // retorna se deu certo a ação no BD
//    }
//
//    // SELECT -> retorna uma ArrayList com os dados da tabela
//    public ArrayList<Aluno> selectAluno() {
//        ArrayList<Aluno> alunos = new ArrayList<>();    // ArrayList Aux
//
//        connectToDB();      // função para conectar com o BD
//
//        // String de comando que vai ser realizada no BD
//        String sql = "SELECT * FROM aluno";
//
//        try {
//            st = con.createStatement();        // faz a preparação para deletar dados na tebala aluno
//
//            // Faz a query no BD
//            rs = st.executeQuery(sql);
//            System.out.println("Lista de alunos: ");
//            while (rs.next()) {
//                Aluno alunoAux = new Aluno(rs.getInt("matricula"),rs.getString("curso"), rs.getString("nome"));
//                System.out.println("\tNome = " + alunoAux.getCurso());
//                System.out.println("\tMatricula = " + alunoAux.getMatricula());
//                System.out.println("\tCurso = " + alunoAux.getNome());
//                System.out.println("-----------------------------------------------");
//                alunos.add(alunoAux);
//            }
//
//            sucesso = true;     // define como sucesso a seleção de dados
//
//        } catch (SQLException e) {     // mostra o erro que ocorreu, caso ele aconteça
//            System.out.println("Erro: " + e.getMessage());
//            sucesso = false;
//        } finally {
//            try {
//                con.close();
//                st.close();
//            } catch (SQLException e) {     // mostra o erro que ocorreu, caso ele aconteça
//                System.out.println("Erro: " + e.getMessage());
//            }
//        }
//
//        return alunos;      // Retorna a ArrayList de Aluno
//    }
//}
