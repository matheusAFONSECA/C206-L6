package org.example;

public class Biblioteca {
    // atributos que podem ser adicionados nessa classe
    String nome;                        // nome da biblioteca
    Livro[] livros = new Livro[10];     // livros que a biblioteca suporta

    // metodos
    public void mostraInfo(){   // mostra os livros da biblioteca

        System.out.println("Nome da biblioteca: " + nome);
        System.out.println("----------------------------------");

        for (int i = 0; i < livros.length; i++){
            if (livros[i] != null){
                livros[i].mostraInfo();
            }
        }
    }

    public void addLivro(Livro livro){      // adiciona um livro na biblioteca
        for (int i = 0; i < livros.length; i++){
            if (livros[i] == null){
                livros[i] = livro;
                System.out.println("Livro adicionado com sucesso!!");
                break;
            }
        }
    }
}
