package org.example;

import org.example.DAO.*;
import org.example.MODEL.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// -> nessa classe vamos fazer o menu que vai rodar no termial e fazer todas as funcionalidades do código
public class Main {
    public static void main(String[] args) {
        // -> Sera um usado um menu oara fazer toda a inserção de dados no BD
        // -> Aqui é como se fosse o sistema de administração geral da escola

        // criando um Scanner
        Scanner in = new Scanner(System.in);

        boolean flag = true;            // var de controle do menu

        System.out.println("BEM VINDO AO SISTEMA DA ESCOLA!!!! ");

        while (flag) {
            System.out.println("Qual ação deseja realizar??");
            System.out.println("1 - Cadastrar um novo Aluno, Professor ou Monitor");
            System.out.println("2 - Listagem de Alunos, Professores, Monitores e Materias");
            System.out.println("3 - Cadastrar materia");
            System.out.println("4 - Publicar ou corrigir Nota");
            System.out.println("5 - Calculo da media das notas de alguma materia especifica");
            System.out.println("6 - Excluir resgistro de Aluno, Professor, Monitor, Materia ou Nota...");
            System.out.println("7 - SAIR");

            int op = in.nextInt();      // inteiro que controla o menu
            in.nextLine();              // necessário para poder adicionar Strings após um Int

            switch (op){
                case 1:     // cadastro de aluno, professor ou monitor
                    System.out.println("QUAL TIPO DE CADASTRO DESEJA FAZER:");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Monitor");

                    int opAUX = in.nextInt();       // inteiro que controla o sub menu
                    in.nextLine();                  // necessário para poder adicionar Strings após um Int

                    switch (opAUX){
                        case 1:         // cadastrar um Aluno
                            // instanciando um AlunoDAO
                            AlunoDAO alunoDAOcadastro = new AlunoDAO();

                            // var aux
                            int matricula;          // matricula do aluno
                            String nomeAluno;       // nome do aluno
                            String cursoAluno;      // curso do aluno

                            System.out.println("CADASTRANDO UM NOVO ALUNO:");
                            System.out.print("NOME: ");
                            nomeAluno = in.nextLine();

                            System.out.print("CURSO: ");
                            cursoAluno = in.nextLine();

                            System.out.print("MATRICULA: ");
                            matricula = in.nextInt();

                            // instanciando um Aluno
                            Aluno alunoCadastro = new Aluno(matricula, nomeAluno, cursoAluno);

                            // inserindo os dados do aluno no BD
                            alunoDAOcadastro.insertAluno(alunoCadastro);

                            break;

                        case 2:         // cadastrar um Professor
                            // instanciando um ProfessorDAO
                            ProfessorDAO professorDAOcadastro = new ProfessorDAO();

                            // var aux
                            int idProfessorCadastro;    // id do professor
                            String nomeProfessor;           // nome do aluno

                            System.out.println("CADASTRANDO UM NOVO PROFESSOR:");
                            System.out.print("NOME: ");
                            nomeProfessor = in.nextLine();

                            System.out.print("ID: ");
                            idProfessorCadastro = in.nextInt();

                            // instanciando um Professor
                            Professor professorCadastro = new Professor(idProfessorCadastro, nomeProfessor);

                            // inserindo os dados do professor no BD
                            professorDAOcadastro.insertProfessor(professorCadastro);

                            break;

                        case 3:         // cadastrar um Monitor
                            // instanciando um MonitorDAO
                            MonitorDAO monitorDAOcadastro = new MonitorDAO();

                            // var aux
                            int matriculaMonitor;           // matricula do monitor
                            String cursoMonitor;            // curso do monitor
                            String materiaMonitor;          // materia do monitor
                            int professorResponsavel;       // id do porfessor responsavel pelo monitor

                            System.out.println("CADASTRANDO UM NOVO MONITOR:");
                            System.out.print("MATRICULA: ");
                            matriculaMonitor = in.nextInt();

                            in.nextLine();      // necessário para poder adicionar Strings após um Int

                            System.out.print("CURSO: ");
                            cursoMonitor = in.nextLine();

                            System.out.print("MATERIA: ");
                            materiaMonitor = in.nextLine();

                            System.out.print("ID DO PROFESSOR RESPONSAVEL: ");
                            professorResponsavel = in.nextInt();

                            // instanciando um Monitor
                            Monitor monitorCadastro = new Monitor(matriculaMonitor, cursoMonitor,
                                    materiaMonitor, professorResponsavel);

                            // inserindo os dados do Monitor no BD
                            monitorDAOcadastro.insertMonitor(monitorCadastro);

                            break;

                        default:        // caso tenha colocado uma opção errada
                            System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA PARA CADASTRAR!!");
                            break;
                    }

                    break;

                case 2:     // listagem de alunos, professor e monitores
                    System.out.println("DESEJA FAZER LISTAGEM DE:");
                    System.out.println("1 - Alunos");
                    System.out.println("2 - Professores");
                    System.out.println("3 - Monitores");
                    System.out.println("4 - Materias");

                    int opAUX2 = in.nextInt();       // inteiro que controla o sub menu
                    in.nextLine();                   // necessário para poder adicionar Strings após um Int

                    switch (opAUX2){
                        case 1:     // listar os alunos

                            // instanciando um AlunoDAO para fazer a listagem de alunos do BD
                            AlunoDAO alunoDAOlista = new AlunoDAO();
                            alunoDAOlista.selectAluno();

                            break;

                        case 2:     // listar os professores

                            // instanciando um ProfessorDAO para fazer a listagem de professores do BD
                            ProfessorDAO professorDAOlista = new ProfessorDAO();
                            professorDAOlista.selectProfessor();

                            break;

                        case 3:     // listar os monitores

                            // instanciando um MonitorDAO para fazer a listagem de monitores do BD
                            MonitorDAO monitorDAOlista = new MonitorDAO();
                            monitorDAOlista.selectMonitor();

                            break;

                        case 4:     // listar as materias

                            // instanciando uma MateriaDAO para fazer a listagem de materias do BD
                            MateriaDAO materiaDAOlista = new MateriaDAO();
                            materiaDAOlista.selectMateria();

                            break;

                        default:        // caso tenha colocado uma opção errada
                            System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA PARA LISTAGEM!!");
                            break;
                    }

                    break;

                case 3:     // cadastrar uma nova materia

                    // instanciando um MateriaDAO
                    MateriaDAO materiaDAOcadastro = new MateriaDAO();

                    // var aux
                    String sigla;           // sigla da materia
                    String nomeMateria;     // nome da materia
                    int idProfessorMat;     // professor da materia

                    System.out.println("CADASTRANDO UMA NOVA MATERIA: ");
                    System.out.print("SIGLA: ");
                    sigla = in.nextLine();

                    System.out.print("NOME DA MATERIA: ");
                    nomeMateria = in.nextLine();

                    System.out.print("ID DO PROFESSOR RESPONSAVEL: ");
                    idProfessorMat = in.nextInt();

                    // instanciando uma Materia
                    Materia materiaCadastro = new Materia(sigla, nomeMateria, idProfessorMat);

                    materiaDAOcadastro.insertMateria(materiaCadastro);

                    break;

                case 4:

                    System.out.println("O QUE DESEJA FAZER:");
                    System.out.println("1 - Publicar nota");
                    System.out.println("2 - Corigir nota");

                    int opAUX3 = in.nextInt();       // inteiro que controla o sub menu
                    in.nextLine();                   // necessário para poder adicionar Strings após um Int

                    switch (opAUX3){
                        case 1:     // publicar nota

                            // instanciando um NotaDAO
                            NotaDAO notaDAOpublicar = new NotaDAO();

                            // var aux
                            int nota;           // nota do aluno
                            int matriculaNota;      // matricula do aluno
                            String cursoNota;       // curso do aluno
                            String materiaNota;     // materia do aluno
                            int idProfessorNota;    // id do professor do aluno

                            System.out.println("PUBLICAÇÃO DA NOTA:");

                            System.out.print("NOTA OBTIDA: ");
                            nota = in.nextInt();

                            System.out.print("MATRICULA DO ALUNO: ");
                            matriculaNota = in.nextInt();
                            in.nextLine();

                            System.out.print("CURSO DO ALUNO: ");
                            cursoNota = in.nextLine();

                            System.out.print("MATERIA: ");
                            materiaNota = in.nextLine();

                            System.out.print("ID DO PROFESSOR: ");
                            idProfessorNota = in.nextInt();

                            // instanciando uma Nota
                            Nota notaPublicar = new Nota(nota, matriculaNota, cursoNota, materiaNota, idProfessorNota);

                            notaDAOpublicar.insertNota(notaPublicar);

                            break;

                        case 2:

                            // instanciando uma NotaDAO
                            NotaDAO notaDAOupdate = new NotaDAO();

                            // var aux
                            int matriculaUpdateNota;        // matricula do aluno que vai ter a nota atualizada
                            String cursoUpdateNota;         // curso do aluno que vai ter a nota atualizada
                            String materiaUpdateNota;       // materia em que a nota vai ser atualizada
                            int notaAtualizada;             // nota atualizada

                            System.out.println("CORRIGINDO NOTA: ");

                            System.out.print("Matricula: ");
                            matriculaUpdateNota = in.nextInt();
                            in.nextLine();

                            System.out.print("Curso: ");
                            cursoUpdateNota = in.nextLine();

                            System.out.print("Materia: ");
                            materiaUpdateNota = in.nextLine();

                            System.out.print("Nota Atualizada: ");
                            notaAtualizada = in.nextInt();

                            // atualizando a nota
                            notaDAOupdate.updateNota(notaAtualizada, matriculaUpdateNota, cursoUpdateNota, materiaUpdateNota);

                            break;

                        default:        // caso tenha colocado uma opção errada
                            System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!!!");
                            break;
                    }

                    break;

                case 5:

                    break;

                case 6:     // deletar algo no BD

                    System.out.println("DESEJA EXLUIR REGISTRO DE:");
                    System.out.println("1 - Alunos");
                    System.out.println("2 - Professores");
                    System.out.println("3 - Monitores");
                    System.out.println("4 - Materias");
                    System.out.println("5 - Notas");

                    int opAUX4 = in.nextInt();       // inteiro que controla o sub menu
                    in.nextLine();                   // necessário para poder adicionar Strings após um Int

                    switch (opAUX4){
                        case 1:     // exclui um aluno do BD

                            // instanciando um alunoDAO
                            AlunoDAO alunoDAOdelete = new AlunoDAO();

                            // var aux
                            int matriculaDelete;        // matricula do aluno que sera deletado do BD
                            String cursoDelete;               // curso do aluno que sera deletado do BD

                            System.out.println("EXCLUINDO REGISTRO DE ALUNO: ");

                            System.out.print("MATRICULA: ");
                            matriculaDelete = in.nextInt();
                            in.nextLine();

                            System.out.print("CURSO: ");
                            cursoDelete = in.nextLine();

                            //excluindo aluno do BD
                            alunoDAOdelete.deleteAluno(matriculaDelete, cursoDelete);

                            break;

                        case 2:     // exclui um professor do BD

                            // instanciando um ProfessorDAO
                            ProfessorDAO professorDAOdelete = new ProfessorDAO();

                            // var aux
                            int idProfessorDelete;      // id do professor que sera excluido do BD

                            System.out.println("EXCLUINDO RESGISTRO DO PROFESSOR:");

                            System.out.print("ID DO PROFESSOR: ");
                            idProfessorDelete = in.nextInt();

                            // excluindo professor do BD
                            professorDAOdelete.deleteProfessor(idProfessorDelete);

                            break;

                        case 3:     // exclui um Monitor

                            // instanciando um MonitorDAO
                            MonitorDAO monitorDAOdelete = new MonitorDAO();

                            // var aux
                            int monitorDelete;          // matricula do monitor que será excluido do BD
                            String monitorDelete2;      // curso do monitor que sera excluido do BD

                            System.out.println("EXCLUINDO REGISTRO DO MONITOR:");

                            System.out.print("CURSO: ");
                            monitorDelete2 = in.nextLine();

                            System.out.print("MATRICULA: ");
                            monitorDelete = in.nextInt();

                            // excluindo monitor do BD
                            monitorDAOdelete.deleteMonitor(monitorDelete, monitorDelete2);

                            break;

                        case 4:     // exclui uma materia

                            // instanciando uma MtaeriaDAO
                            MateriaDAO materiaDAOdelete = new MateriaDAO();

                            // var aux
                            int idProfessorResponsavel;     // id do professor responsavel pela materia
                            String siglaDelete;             // sigla da materia que sera excluida dos resgistros

                            System.out.println("EXCLUINDO REGISTRO DA MATERIA:");

                            System.out.print("SIGLA: ");
                            siglaDelete = in.nextLine();

                            System.out.print("ID DO PROFESSOR RESPONSAVEL: ");
                            idProfessorResponsavel = in.nextInt();

                            // excluindo registro do BD
                            materiaDAOdelete.deleteMateria(siglaDelete, idProfessorResponsavel);

                            break;

                        case 5:     // exclui uma nota

                            // instanciando uma NotaDAO
                            NotaDAO notaDAOdelete = new NotaDAO();

                            // var aux
                            int notaDeleteMat;              // id da matricula que tera a nota excluida do registro
                            String notaDeleteCur;           // curso da nota excluida do registro
                            String notaDeleteMate;          // materia da nota excluida do registro

                            System.out.println("EXCLUINDO REGISTRO DE NOTA: ");

                            System.out.print("MATRICULA");
                            notaDeleteMat = in.nextInt();
                            in.nextLine();

                            System.out.print("CURSO: ");
                            notaDeleteCur = in.nextLine();

                            System.out.print("MATERIA: ");
                            notaDeleteMate = in.nextLine();

                            // excluindo registro da nota do BD
                            notaDAOdelete.deleteNota(notaDeleteMat, notaDeleteCur, notaDeleteMate);

                            break;

                        default:        // caso tenha colocado uma opção errada
                            System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!!!");
                            break;
                    }

                    break;

                case 7:     // sai do menu de opções
                    flag = false;
                    break;

                default:    // caso tenha colocado uma opção errada
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA PARA USAR O MENU!!");
                    break;
            }

        }
        System.out.println("Obrigado por utilizar o sistema!!!");

        // fechando o Scanner
        in.close();

    }

}