package org.example;


import java.util.Collections;

// Exercicio sobre coleções
public class Main {
    public static void main(String[] args) {
        // Criando quatro produtos
        Produto p1 = new Produto("Sucrillhos", 20);
        Produto p2 = new Produto("Molho de tomate", 15);
        Produto p3 = new Produto("Cerveja SKOL", 40);
        Produto p4 = new Produto("Macarrão", 13);

        // Criando um carrinho
        Carrinho carrinho = new Carrinho();

        // adicionando os produtos no carrinho
        carrinho.addProduto(p1);
        carrinho.addProduto(p2);
        carrinho.addProduto(p3);
        carrinho.addProduto(p4);

        // ordenando os produtos de ordem crescente do carrinho por meio do preco do produto
        // lembrando que temos que colocar a interface "Comparable<Produto>" na classe produto
        Collections.sort(carrinho.getProdutos());
        System.out.println("INFORMAÇÕES DO CARRINHO ORDENADOS POR PREÇO: ");
        for (int i = 0; i < carrinho.getProdutos().size(); i++){
            System.out.println("\tPRODUTO " + i + ":");
            System.out.println("\t\tPRECO: " + carrinho.getProdutos().get(i).getPreco());
            System.out.println("\t\tNOME: " + carrinho.getProdutos().get(i).getNome());
        }
    }
}