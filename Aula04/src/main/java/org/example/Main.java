package org.example;

public class Main {
    /*
    * Aula sobre o uso de Arrays em java
    */
    public static void main(String[] args) {
        // declaração de array
//      int[] arrayInt = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//
//      System.out.println(arrayInt[2]);

        // Array de uma classe
        Livro[] livros = new Livro[10];
        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilac Pinto";

        // existem duas formas de inserir dados em uma array de uma classe
        Livro l1 = new Livro("Diário de um banana", 100);
        livros[0] = l1;

        livros[1] = new Livro("Jogos vorazes", 400);

        // mostrando os elementos da array
        for (int i = 0; i < livros.length; i++){

            // motrando informações na mais usando um método da classe Livro
            if (livros[i] != null) {
                livros[i].mostraInfo();
            }

            // mostrando informações na main usando um if
//          if (livros[i] != null) {
//              System.out.println(livros[i].nome);
//              System.out.println(livros[i].numpags);
//          }

                // System.out.println(livros[i]);
        }
    }
}