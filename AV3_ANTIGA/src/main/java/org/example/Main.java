package org.example;

// imports necessários
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciando um Arquivo
        Arquivo arq = new Arquivo();

        // instanciando um jogo
        Jogo j1 = new Jogo();

        // criando um Scanner
        Scanner in = new Scanner(System.in);

        boolean flag = true;            // var de controle do menu

        while (flag) {
            System.out.println("BEM VINDO AO SISTEMA DE JOGOS: ");
            System.out.println("1 - Cadastrar um novo Jogo");
            System.out.println("2 - Listar Jogos");
            System.out.println("3 - Listar Jogos por ordem crescente de preço");
            System.out.println("4 - Listar Jogos por ordem decrescente de preço");
            System.out.println("5 - SAIR");

            int op = in.nextInt();      // inteiro que controla o menu
            in.nextLine();              // necessário para poder adicionar

            switch (op){
                case 1:     // registra um novo Jogo
                    System.out.println("Cadastrar JOGO: ");
                    System.out.print("NOME: ");
                    j1.setNome(in.nextLine());
                    System.out.print("GÊNERO: ");
                    j1.setGenero(in.nextLine());
                    System.out.print("PREÇO: ");
                    try{        // tenta adicionar um preço
                        double valor = in.nextDouble();

                        if(valor < 0){      // caso seja um numero negativo
                            throw new PrecoNegativoException(valor);
                        }
                        else {              // salva o preço do jogo
                            j1.setPreco(valor);
                        }

                    } catch (PrecoNegativoException e){
                        break;              // para porque percebeu um número negativo
                    }
                    arq.escrever(j1);       // escreve o dados no arquivo
                    break;

                case 2:     // mostra as informações do arquivo Jogo.txt
                    ArrayList <Jogo> jogos = arq.ler();

                    System.out.println("LISTA DE JOGOS: ");
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO "+ (i+1) + ":");
                        System.out.println("\t" + jogos.get(i).getNome());
                        System.out.println("\t" + jogos.get(i).getGenero());
                        System.out.println("\t" + jogos.get(i).getPreco());

                    }
                    break;

                case 3:     // mostra as informações do arquivo Jogo.txt -> ordem crescente de preço
                    ArrayList <Jogo> jogos1 = arq.ler();

                    // ordenando a ArrayList de forma crescente
                    Collections.sort(jogos1);

                    System.out.println("JOGOS ORDENADOS DE FORMA CRESCENTE");
                    for (int i = 0; i < jogos1.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO "+ (i+1) + ":");
                        System.out.println("\t" + jogos1.get(i).getNome());
                        System.out.println("\t" + jogos1.get(i).getGenero());
                        System.out.println("\t" + jogos1.get(i).getPreco());

                    }
                    break;

                case 4:     // mostra as informações do arquivo Jogo.txt -> ordem decrescente de preço
                    ArrayList <Jogo> jogos2 = arq.ler();

                    // ordenando a ArrayList de forma decrescente
                    Collections.sort(jogos2, Collections.reverseOrder());

                    System.out.println("JOGOS ORDENADOS DE FORMA DECRESCENTE");

                    for (int i = 0; i < jogos2.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO "+ (i+1) + ":");
                        System.out.println("\t" + jogos2.get(i).getNome());
                        System.out.println("\t" + jogos2.get(i).getGenero());
                        System.out.println("\t" + jogos2.get(i).getPreco());

                    }
                    break;

                case 5:     // sai do menu de opções
                    flag = false;
                    break;

            }

        }

    }
}