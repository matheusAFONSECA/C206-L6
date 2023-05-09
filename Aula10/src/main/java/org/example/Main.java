package org.example;

import Exercicio1.Funcionarios;
import Exercicio1.Arquivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instanciando um funcionario
        Funcionarios f1 = new Funcionarios();

        // instanciando um Arquivo
        Arquivo arq = new Arquivo();

        // criando um Scanner
        Scanner in = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("BEM VINDO AO MENU: ");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listas funcionarios");
            System.out.println("3 - SAIR");
            int op = in.nextInt();
            in.nextLine();

            switch (op){
                case 1:     // registra um novo funcionario
                    System.out.println("Cadastrar funcionário: ");
                    System.out.println("NOME: ");
                    f1.setNomeFunc(in.nextLine());
                    System.out.println("CPF: ");
                    f1.setCpfFunc(in.nextLine());
                    System.out.println("IDADE: ");
                    f1.setIdadeFunc(in.nextInt());
                    arq.escrever(f1);
                    break;

                case 2:     // mostra uma lista de funcionários
                    ArrayList <Funcionarios> funcionarios = arq.ler();

                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println("INFORMACOES DO FUNCIONARIO");
                        System.out.println(funcionarios.get(i).getNomeFunc());
                        System.out.println(funcionarios.get(i).getIdadeFunc());
                        System.out.println(funcionarios.get(i).getCpfFunc());

                    }
                    break;

                case 3:     // sai do menu de opções
                    flag =false;
                    break;

            }

        }
    }
}