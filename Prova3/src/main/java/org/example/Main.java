package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instanciando um Arquivo
        Arquivo arq = new Arquivo();

        // instanciando um jogo
        Produto p = new Produto();

        // criando um Scanner
        Scanner in = new Scanner(System.in);

        boolean flag = true;            // var de controle do menu


        while (flag) {
            // ArrayLista aux de Produtos para ler os dados do arquivo
            ArrayList<Produto> produtos = arq.ler();

            System.out.println("BEM VINDO AO SISTEMA DE PRODUTOS: ");
            System.out.println("1 - Cadastrar um novo Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Listar Produtos por ordem decrescente de preço");
            System.out.println("4 - Listar a quantidade de Tipos de Produtos");
            System.out.println("5 - SAIR");

            int op = in.nextInt();      // inteiro que controla o menu
            in.nextLine();              // necessário para poder adicionar

            switch (op){
                case 1:     // registra um novo Produto
                    System.out.println("Cadastrar Produto: ");
                    System.out.print("NOME: ");
                    p.setNome(in.nextLine());
                    System.out.print("TIPO: ");
                    try{        // tenta adicionar um tipo de produto
                        String tipo = in.nextLine();

                        if(tipo.equals("Comida") || tipo.equals("Higiene") || tipo.equals("Decoração")){
                            p.setTipo(tipo);
                        }
                        else {              // caso seja um tipo de produto inválido
                            throw new InfoInvalidaException(tipo);
                        }

                    } catch (InfoInvalidaException e){
                        break;              // para porque percebeu um tipo inválido
                    }
                    System.out.print("PREÇO: ");
                    try{        // tenta adicionar um preço
                        double valor = in.nextDouble();

                        if(valor <= 0){      // caso seja um numero negativo
                            throw new InfoInvalidaException(valor);
                        }
                        else {              // salva o preço do produto
                            p.setPreco(valor);
                        }

                    } catch (InfoInvalidaException e){
                        break;              // para porque percebeu um número negativo
                    }
                    arq.escrever(p);       // escreve o dados no arquivo
                    break;

                case 2:     // mostra as informações do arquivo Prdouto.txt

                    System.out.println("LISTA DE PRODUTOS: ");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("INFORMACOES DO PRODUTO "+ (i+1) + ":");
                        System.out.println("\t" + produtos.get(i).getNome());
                        System.out.println("\t" + produtos.get(i).getTipo());
                        System.out.println("\t" + produtos.get(i).getPreco());

                    }
                    break;

                case 3:     // mostra as informações do arquivo Produto.txt -> ordem decrescente de preço

                    // ordenando a ArrayList de forma decrescente
                    Collections.sort(produtos, Collections.reverseOrder());

                    System.out.println("PRODUTOS ORDENADOS DE FORMA CRESCENTE");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("INFORMACOES DO PRODUTO "+ (i+1) + ":");
                        System.out.println("\t" + produtos.get(i).getNome());
                        System.out.println("\t" + produtos.get(i).getTipo());
                        System.out.println("\t" + produtos.get(i).getPreco());

                    }
                    break;

                case 4:
                    int comida = 0;         // var aux para a contagem de produtos de comida
                    int higiene = 0;        // var aux para a contagem de produtos de higiene
                    int decoracao = 0;      // var aux para a contagem de produtos de decoracao

                    System.out.println("QUANTIDADE DE PRODUTOS DE CADA TIPO:");
                    for (int i = 0; i < produtos.size(); i++) {

                        if(produtos.get(i).getTipo().equals("Comida")){
                            comida++;           // incrementa a quantidade de produtos do tipo comida
                        }
                        if (produtos.get(i).getTipo().equals("Higiene")){
                            higiene++;          // incrementa a quantidade de produtos do tipo higiene
                        }
                        if (produtos.get(i).getTipo().equals("Decoração")){
                            decoracao++;        // incrementa a quantidade de produtos do tipo decoracao
                        }

                    }
                    System.out.println("\tCOMIDA:" + comida);
                    System.out.println("\tHIGIENE:" + higiene);
                    System.out.println("\tDECORAÇÃO:" + decoracao);

                    break;

                case 5:     // sai do menu de opções
                    flag = false;
                    break;

            }

        }

    }
}