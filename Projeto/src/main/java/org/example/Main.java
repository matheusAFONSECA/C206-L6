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
            System.out.println("2 - Listagem de Alunos, Professores ou Monitores");
            System.out.println("3 - Cadastrar nova materia");
            System.out.println("4 - Publicar ou corrigir Nota");
            System.out.println("5 - Calculo da media das notas de alguma materia especifica");
            System.out.println("6 - SAIR");

            int op = in.nextInt();      // inteiro que controla o menu
            in.nextLine();              // necessário para poder adicionar

            switch (op){
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:     // sai do menu de opções
                    flag = false;
                    break;

                default:
                    System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA PARA USAR O MENU!!");
                    break;
            }

        }

    }

}