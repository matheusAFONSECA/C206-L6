package org.example;

import java.util.Scanner;

public class Main2 {

    // Usando correlação entre uma Array e uma classe
    public static void main(String[] args) {
        // Array de uma classe
        Biblioteca b1 = new Biblioteca();   // biblioteca que irá guardar os livros
        b1.nome = "Bilac Pinto";            // nome da biblioteca

        // Scanner de entrada de dados
        Scanner in = new Scanner(System.in);

        // flag de controle de entrada de dados
        boolean flag = true;

        while (flag){   // enquanto a flag == true esse código vai rodar

            System.out.println("BEM VINDO AO MENU DA BIBLIOTECA: " + b1.nome);
            System.out.println("1 - Cadatrar um novo livro");
            System.out.println("2 - Mostrar informações de um novo livro");
            System.out.println("3 - Sair do menu");

            int op;     // operador que determina o que será feito
            op = in.nextInt();

            switch (op){

                case 1:     // adicionar livro à biblioteca
                    System.out.println("CADASTRE UM NOVO LIVRO: ");
                    in.nextLine();

                    System.out.println("Entre com o nome do livro: ");
                    String nomeLivro = in.nextLine();

                    System.out.println("Entre com a quantidade de paginas: ");
                    int qtpag = in.nextInt();

                    Livro l = new Livro(nomeLivro, qtpag);
                    b1.addLivro(l);
                    break;


                case 2:     // mostrar informações
                    b1.mostraInfo();
                    break;

                case 3:     // sair do processo
                    flag = false;
                    break;

                default:
                    System.out.println("Entre com um número válido!!");
                    break;

            }

        }
    }
}
