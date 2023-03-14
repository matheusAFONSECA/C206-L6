package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de Scanner
        Scanner in = new Scanner(System.in);

        // declaração do obejto escola e adicionando informações na mesma
        Escola e1 = new Escola();
        e1.nome = "Paulo Silveira";
        e1.email = "PauloSilveira@gmail.com";
        e1.endereco = "Santa Rita";
        e1.numTelefone = 999999999;

        // flag de controle de entrada de dados
        boolean flag = true;

        while (flag){   // enquanto a flag == true esse código vai rodar

            System.out.println("BEM VINDO AO MENU DA ESCOLA: " + e1.nome);
            System.out.println("1 - Matricular um novo aluno");
            System.out.println("2 - Mostrar informações dos alunos");
            System.out.println("3 - Mostrar quantos alunos em cada ano");
            System.out.println("4 - Sair do menu");

            int op;     // operador que determina o que será feito
            op = in.nextInt();

            switch (op){

                case 1:     // matricular um aluno
                    System.out.println("MATRICULE O NOVO ALUNO(A)");
                    in.nextLine();

                    System.out.println("Entre com o nome do aluno: ");  // adiciona o nome do estudante
                    String nomeEstudante = in.nextLine();

                    System.out.println("Entre com a idade do(a) " + nomeEstudante + ": ");  // adiciona a idade
                    int idadeEstudante = in.nextInt();

                    in.nextLine();
                    System.out.println("Entre com o ano letivo do(a) " + nomeEstudante + ": ");   // adiciona o ano letivo
                    String anoLetivo = in.nextLine();

                    // instanciando o Estudante
                    Estudante est = new Estudante(nomeEstudante, idadeEstudante, anoLetivo);
                    e1.addEstudante(est);     // adiciona o estudante na escola
                    break;


                case 2:     // mostrar informações
                    e1.mostraInfo();
                    break;

                case 3:    // mostra os alunos separados por ano letivo
                    e1.QtdEstudantesPorAno();
                    break;

                case 4:     // sair do processo
                    flag = false;
                    break;

                default:
                    System.out.println("Entre com um número válido do menu!!!!");
                    break;

            }

        }

    }
}